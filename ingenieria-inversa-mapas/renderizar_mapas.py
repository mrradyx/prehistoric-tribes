import json, struct, random, os
from PIL import Image
arr=json.load(open('/home/claude/pd0_lens.json'))
d=open('/home/claude/jar/pd0','rb').read(); p=1
B=[]; J=[]
for i in range(11):
    n=arr[i]; B.append([struct.unpack('>H',d[p+2*k:p+2*k+2])[0] for k in range(n)]); p+=2*n
for i in range(25):
    n=arr[11+i]; J.append([x-256 if x>127 else x for x in d[p:p+n]]); p+=n
assert p==len(d),(p,len(d))
imgs=[Image.open(f'/home/claude/assets/pi0/{i:02d}.png').convert('RGBA') for i in range(27)]
def sprite(canvas,sid,x,y):
    if sid==0: return
    im=J[20][sid]&31
    if im>=27: return
    sx=J[21][sid]&127; sy=J[22][sid]&255; w=J[23][sid]&255; h=J[24][sid]&255
    if w==0 or h==0: return
    src=imgs[im]
    if sx+w>src.width or sy+h>src.height: 
        w=min(w,src.width-sx); h=min(h,src.height-sy)
        if w<=0 or h<=0: return
    crop=src.crop((sx,sy,sx+w,sy+h))
    canvas.alpha_composite(crop,(x+11,y+8)) if x+11>=0 and y+8>=0 else None
def tile(canvas,t,x,y,depth=0):
    if depth>4 or t>=len(B[9]): return
    v=B[9][t]; start=v&8191; under=(v>>14)&3
    if under: sprite(canvas,(under-1)*3+1,x,y)
    cnt=J[16][t]&63
    for k in range(start,start+cnt):
        e=B[10][k]; sid=e&8191; xo=((e&0xC000)>>14)<<7
        if ((e&8192)>>13)==0: sprite(canvas,sid,x+J[18][k]+xo,y+J[19][k])
        else: tile(canvas,sid,x+J[18][k]+xo,y+J[19][k],depth+1)
if __name__=='__main__':
    M=json.load(open('/home/claude/maps_raw.json'))
    names={'7':'gran_lago','8':'el_paso','9':'el_bosque','10':'carniceria','11':'el_terreno'}
    os.makedirs('/home/claude/pack/mapas',exist_ok=True)
    rnd=random.Random(1)
    for q,n in names.items():
        m=M[q]; w,h,g=m['w'],m['h'],m['tiles']
        canvas=Image.new('RGBA',(w*22+44,h*16+44),(0,0,0,255))
        for y in range(h):
            for x in range(w-1,-1,-1):
                t=g[y][x]
                if t<=8: t+=rnd.randrange(3)
                tile(canvas,t,x*22,y*16)
        canvas.save(f'/home/claude/pack/mapas/mapa_{q}_{n}.png'); print(q,n,canvas.size)
        json.dump({'ancho':w,'alto':h,'casillas':g},open(f'/home/claude/pack/mapas/mapa_{q}_{n}.json','w'))
