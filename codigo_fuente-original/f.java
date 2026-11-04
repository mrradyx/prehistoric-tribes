import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class f extends Canvas implements Runnable {
   static int a = -6;
   static int b = -7;
   boolean a = true;
   tribes a;
   b a;
   c a;
   boolean b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j = 120;
   int k = 1;
   boolean c;
   static byte a;
   String a;
   boolean d;
   byte b;
   byte c;
   byte d;
   int l = 1;
   byte[] a;
   short[] a;
   short[] b;
   short[] c;
   byte e;
   static byte f;
   static byte g;
   byte[] b;
   a a;
   byte h;
   int m;
   boolean e;
   boolean f;
   boolean g;
   boolean h;
   boolean i;
   boolean j;
   boolean k;
   byte i;
   static boolean l;
   static boolean m;
   byte j;
   int n;
   int o;
   int p;
   boolean n;
   boolean o;
   boolean p;
   byte k;
   byte l;
   boolean q;
   int q;
   int r;
   int s;
   int t;
   int u;
   boolean r;
   int v;
   int w;
   int x;
   int y;
   int z;
   byte m;
   byte n;
   byte o;
   boolean s;
   byte p;
   byte q;
   byte r;
   byte s;
   byte t;
   byte u;
   byte v;
   short a;
   short b;
   int A;
   int[][] a;
   byte w;
   byte x;
   byte y;
   byte z;
   byte A;
   byte B;
   byte C;
   byte D;
   int B;
   int C;
   int D;
   int E;
   boolean t;
   boolean u;
   byte E;
   int F;
   int G;
   int H;
   byte F;
   byte G;
   byte[][] a;
   boolean v;
   boolean w;
   int I;
   byte H;
   int J;
   int K;
   int L;
   int M;
   byte I;
   byte J;
   byte K;
   byte L;
   int N;
   int O;
   int P;
   int Q;
   int R;
   int S;
   int T;
   int[] a;
   int[] b;
   int[] c;
   int[] d;
   byte[] c;
   byte[] d;
   static final Image[] a = new Image[4];
   static final Graphics[] a = new Graphics[4];
   static byte M = 0;
   byte N;
   short c;
   short d;
   short e;
   short f;
   byte O;
   byte P;
   byte[][] b;
   byte[][] c;
   int[][][] a;
   boolean[][] a;
   short[][] a;
   byte[] e;
   byte[][] d;
   boolean x;
   int[] e;
   byte[] f;
   byte[] g;
   byte[] h;
   byte[] i;
   byte[][] e;
   byte[][][] a;
   byte[][] f;
   byte[][][] b;
   byte[][][] c;
   int U;
   int V;
   byte[][] g;
   byte[][] h;
   byte[][] i;
   Image[][] a;
   short[][] b;
   byte[][] j;
   int W;
   int X;
   int[][] b;
   int Y;
   byte Q;
   byte R;
   byte S;
   int Z;
   int aa;
   int ab;
   byte T;
   byte U;
   byte V;
   boolean y;
   byte W;
   int ac;
   boolean z;
   int ad;
   int ae;
   boolean A;
   boolean B;
   boolean C;
   int af;
   int ag;
   int ah;
   int ai;
   int aj;
   int ak;
   int al;
   int am;
   boolean D;
   byte X;
   int an;
   int ao;
   int ap;
   int aq;
   int ar;
   int as;
   int at;
   byte Y;
   int au;
   int av;
   int aw;
   int ax;
   int ay;
   int az;
   int aA;
   int aB;
   byte Z;
   byte aa;
   byte ab;
   byte ac;
   int aC;
   boolean E;
   byte ad;
   boolean[] a;
   boolean[] b;
   boolean[] c;
   boolean[] d;
   boolean F;
   byte[] j;
   byte[] k;
   short[] d;
   int aD;
   int aE;
   int aF;
   int aG;
   int aH;
   int aI;
   int aJ;
   int aK;
   byte ae;
   boolean G;
   static byte af;
   int[] f;
   byte[] l;
   byte[] m;
   byte[] n;
   byte[] o;
   static byte ag = 40;
   static byte ah = 60;
   int aL;
   int aM;
   int aN;
   int aO;
   boolean H;
   boolean I;
   int aP;
   int aQ;
   byte ai;
   int aR;
   byte aj;
   byte ak;
   byte al;
   byte am;
   byte an;
   int aS;
   byte[] p;
   int aT;
   byte ao;
   boolean J;
   boolean K;
   byte ap;
   boolean L;
   boolean M;
   boolean N;
   boolean O;
   byte aq;
   byte[] q;
   boolean P;
   boolean Q;
   boolean R;
   byte ar;
   byte as;
   static int aU;
   static int aV;
   int aW;
   int aX;
   int aY;
   int aZ;
   byte at;
   byte au;
   byte av;
   boolean S;
   byte[] r;
   byte[] s;
   boolean T;
   boolean U;
   boolean V;
   byte aw;
   byte[] t;
   int ba;
   int bb;
   byte ax;
   byte[] u;
   byte[][] k;
   int[] g;
   byte ay;
   int[] h;
   byte[] v;
   int bc;
   int bd;
   int be;
   int bf;
   String b;
   boolean W;
   boolean X;
   Random a;
   boolean Y;
   boolean Z;
   boolean aa;
   boolean ab;
   boolean ac;
   boolean ad;
   static short[] e;
   static short[] f;
   static byte[] w;
   int[] i;
   int[] j;
   boolean ae;
   boolean af;
   boolean ag;

   public f(tribes var1) {
      String[] var10000 = new String[]{"en", "fr", "it", "de", "es"};
      this.v = -1;
      this.w = -1;
      this.s = -1;
      this.t = -1;
      this.v = 4;
      this.t = false;
      this.u = false;
      this.v = false;
      this.w = false;
      this.N = 1;
      this.c = 96;
      this.d = 96;
      this.e = 96;
      this.f = 96;
      this.g = new byte[11];
      this.h = new byte[11];
      this.i = new byte[11];
      this.U = 5;
      this.V = 4;
      this.ac = 1000;
      this.an = -1;
      this.a = new boolean[20];
      this.b = new boolean[20];
      this.c = new boolean[9];
      this.d = new boolean[9];
      this.j = new byte[8];
      this.f = new int[]{0, 5251341, 16704820, 16033043, 12010496};
      this.l = new byte[]{0, 1, 1, 1, 1};
      this.m = new byte[]{0, 1, 1, 2, 3};
      this.n = new byte[]{100, 98, 0, 0, 0};
      this.o = new byte[]{5, 3, 1, 1, 1};
      this.p = new byte[40];
      this.aq = 2;
      this.q = new byte[2];
      this.as = 3;
      this.aw = 2;
      this.u = new byte[10];
      this.k = new byte[3][10];
      this.g = new int[10];
      this.b = "t";
      this.a = new Random(1L);
      this.Y = false;
      this.Z = false;
      this.aa = false;
      this.setFullScreenMode(true);
      this.a = var10000[this.v];
   }

   public final void a() {
      new Thread(this).start();
   }

   public final void b() {
      this.b = false;
      this.z = false;
      this.aR();
      this.a.notifyDestroyed();
   }

   private void f() {
      this.a = new b();
      System.gc();
      Thread.yield();
      new e(this);
      af = 98;
      this.a(0);
      this.a.a.setCurrent(this);
      this.y = true;
   }

   private void g() {
      System.gc();
      Thread.yield();
      this.g = new byte[this.P + 3][this.O];
      this.h = new byte[13][101];
      this.i = new byte[13][101];
      this.a = new int[2][3][96];
      this.a = new boolean[this.P + 3][this.O];
      System.gc();
      Thread.yield();
      this.a = new byte[5][50];
      this.a = new short[2][26];
      this.d = new byte[7][40];
      this.e = new int[]{14680064, 14999808, 55808, 55808};
      this.f = new byte[12];
      this.e = new byte[3][30];
      this.a = new byte[2][10][12];
      this.f = new byte[4][30];
      this.b = new byte[2][5][30];
      this.c = new byte[2][5][5];
      System.gc();
      Thread.yield();
      this.b = new int[][]{
         {7250486, 11637795, 2652080, 2454300, 3881776, 4605510, 16766976, 14352640, 10966528, 16750080, 7406848, -1},
         {5276696, 8810262, 678290, 480512, 1907986, 2631720, 16766976, -1, -1, 16750080, 5439488, -1}
      };
      this.k = new byte[107];
      this.d = new short[107];
      this.r = new byte[50];
      this.s = new byte[100];
      System.gc();
      Thread.yield();
      this.a.a = new byte[2][101][80];
      this.a.b = new byte[2][22][5];
      this.a.c = new byte[5][6][6];
      this.a.a = new byte[5][50];
      this.a.c = new byte[2];
      this.a.d = new byte[6];
      this.a.e = new byte[3];
      this.a.f = new byte[3];
      this.a.d = new byte[3][2][96];
      this.a.g = new byte[3];
      this.a.e = new byte[2][3][10];
      this.a.h = new byte[10];
      this.a.c = new byte[6][10];
      this.a.a = new boolean[3];
      this.a.d = new byte[2][50];
      this.a.d = new short[6];
      this.a.i = new byte[8];
      this.a.e = new byte[4][8];
      this.a.f = new byte[2][10];
      this.a.g = new byte[3][20];
      this.a.j = new byte[50];
      this.a.k = new byte[4];
      this.i = new int[6];
      this.j = new int[]{56, 55, 51, 57, 49};
      this.t = new byte[3];
   }

   public final void run() {
      try {
         this.f();
         this.g();
         this.a.a(this);
         if (!this.d(0)) {
            //this.d(1);
            //this.d(2);
         }

         this.Q = 14;
         this.v = 0;
         this.H = true;
         this.R = this.U;
         this.v = 59;
         this.c = -1;
         this.k[55] = -1;
         this.a[0][3] = -1000;
         this.aa = true;
         this.b = true;
         this.i();

         while (true) {
            if (!this.b) {
               return;
            }

            long var1 = a();
            this.aS();
            this.h();
            if (!this.b) {
               break;
            }

            this.m();
            this.l();

            while (this.z && !this.Z) {
               Thread.yield();
            }

            if (this.ad != 0 || this.ae != 0) {
               this.ad = this.ae = 0;
               tribes.a(this.i / 2);
               this.l();

               while (this.z && !this.Z) {
                  Thread.yield();
               }
            }

            long var5 = a() - var1;
            if ((var5 = this.i - var5) < 0L || var5 > this.i) {
               var5 = 0L;
            }

            tribes.a((int)var5);
         }
      } catch (Exception var8) {
      }
   }

   private void h() {
      this.i = this.c ? 50 : this.j;
      this.k = this.j / this.i;
      this.e++;
      if (this.e >= 6) {
         this.E = false;
         this.q = false;
      }

      if (this.e >= 8) {
         this.e = 0;
      }

      Thread.yield();
      if (this.v == 0) {
         this.ak();
         this.o = false;
      } else if (this.v == 1) {
         if (this.i == 0) {
            this.i = -1;
            if (this.w != 3 && !this.a[6] && !this.a[8] && !this.a[7]) {
               if (this.a[0]) {
                  this.m = 0;
               } else if (this.a[4]) {
                  this.m = 1;
                  if (this.a[this.a[296] + this.a.g] == 3) {
                     this.a.J = (byte)(120 - this.a[this.a[298] + this.a.g]);
                  }
               }

               this.v = 0;
               this.l(this.a[this.a[305] + this.a[this.a[306] + this.m] + 0]);
               this.Q = 25;
               this.R = 28;
               this.Z = 0;
               this.H = true;
               this.z = this.y;
               this.B = this.A;
               this.J = this.I;
               this.L = this.K;
            }
         } else if (this.w != 2 && this.w != 4) {
            this.V();
            this.o = false;
            this.k();
         } else {
            this.ae();
            this.o = false;
         }

         if (this.v == 1) {
            this.d++;
            if (this.d > 5) {
               this.d = 0;
               this.a((byte)100, (byte)0, (byte)0, (byte)0);
            }

            if (this.E <= 4) {
               this.E++;
            } else if (this.E >= 0) {
               this.n = 0;
            }

            this.j++;
            this.j();
         }
      }

      this.g++;
      this.f++;
      if (this.f >= 120) {
         this.f = 0;
      }

      if (this.o < 3) {
         this.o++;
         this.n = true;
      } else if (this.o == 3) {
         this.o++;
         this.i();
         this.n = false;
      }

      if (this.k) {
         this.k = false;
         this.s = 0;
         this.l(-1);
         this.P = false;
         this.a(true, true, false, false);
         this.F = false;
         this.w = 0;
         this.k = 0;
         this.q = 0;
         this.B = this.C = this.D = this.E = 0;
         this.F = -1;
         this.aI();
         this.u = false;
         this.t = false;
         this.i();
      }

      if (this.p) {
         this.p = false;
         this.i();
      }

      this.p++;
   }

   private void i() {
      m = false;
      l = false;
      this.e = this.f = this.g = this.h = false;
      this.i = this.v = false;
      this.E = 4;
      this.w = false;
      this.i = -1;
      this.t = false;
      this.n = 0;
   }

   private void j() {
      try {
         this.a.g();
         this.a.e();
         this.a.h();
         this.a.i();
      } catch (Exception var3) {
      }

      this.c++;
      this.h++;
      if (this.h >= 100) {
         int var1;
         if ((var1 = this.h - 100) >= this.d - 1) {
            this.h = 0;
         }

         for (int var2 = 0; var2 < this.c; var2++) {
            if (this.c[var1][var2] <= -114 && this.c[var1][var2] > -117) {
               this.c[var1][var2] = 0;
               this.c(var2, var1, 1, 1);
            }
         }
      }

      if (this.P && this.w != 4 && this.w != 3) {
         this.Z();
      }

      this.P = false;
      if (this.u > 0 && this.v == 1) {
         this.u++;
         if (this.u == 41 || this.u == 90) {
            this.v = 0;
            this.Q = 24;
            this.H = true;
            this.v = 56 + 41 / this.u;
            this.o = (byte)(11 - 41 / this.u);
            this.o = 0;
         }
      }
   }

   private void k() {
      int var1 = this.I + this.y;
      int var2 = this.K + this.A;

      try {
         byte var3 = this.c[var2][var1];
         if (this.u || var3 <= -1 && var3 >= -30) {
            this.W = 0;
            return;
         }

         boolean var4 = false;
         if ((var3 < 51 || this.w != 1) && (var3 < 1 || var3 > 50)) {
            for (int var9 = -1; var9 <= 1; var9++) {
               for (int var10 = -1; var10 <= 1; var10++) {
                  if (var1 + var10 >= 0
                     && var2 + var9 >= 0
                     && var1 + var10 < this.c
                     && var2 + var9 < this.d
                     && ((var3 = this.c[var2 + var9][var1 + var10]) >= 51 && this.w == 1 || var3 >= 1 && var3 <= 50)) {
                     int var7 = this.e[202 + var3];
                     int var8 = this.e[303 + var3];
                     var8 = var9 < 0 ? 16 - var8 : (var9 == 0 ? 0 : 16 + var8);
                     byte var13;
                     var7 = (var13 = (byte)(var10 < 0 ? 22 - var7 : (var10 == 0 ? 0 : 22 + var7))) * var13;
                     int var16;
                     int var6 = ((var16 = var8 * var8) + var7) / 2;
                     if (this.W == var3 && (var6 < 13 || var3 <= 50)) {
                        this.ac = var6;
                        var4 = true;
                     }

                     if (var6 < this.ac && (var6 < 13 || var3 <= 50)) {
                        this.ac = var6;
                        this.W = var3;
                        var4 = true;
                     }
                  }
               }
            }

            if (!var4) {
               this.W = 0;
               this.ac = 1000;
            }
         } else {
            this.W = var3;
         }

         if (this.W < 50 && this.w == 1) {
            this.W = 0;
         }
      } catch (Exception var11) {
      }
   }

   private void l() {
      this.z = true;
      this.repaint();
      Thread.yield();
   }

   protected final void paint(Graphics var1) {
      if (this.v == 1) {
         byte var2;
         if (this.ad == 0 && this.ae == 0) {
            var2 = this.c[1];
         } else {
            var2 = 3;
         }

         a(var1, a[var2], 0, 0, 262, this.A, this.a - 11 + this.ad, this.b - 8 + this.bb - this.ax + this.ae + 0, 0);

         for (byte var3 = 0; var3 < 20; var3++) {
            if (this.a[var3]) {
               a(
                  var1,
                  a[this.c[this.a[this.a[195] + 0 + var3]]],
                  0,
                  this.c[this.a[this.a[195] + 0 + var3]],
                  this.a[this.a[this.a[195] + 0 + var3]] + 11,
                  this.b[this.a[this.a[195] + 0 + var3]],
                  this.a - 11,
                  this.b + this.d[this.a[this.a[195] + 0 + var3]] + 0,
                  0
               );
               if (var3 == 8 || var3 == 7) {
                  this.a(
                     var1,
                     556,
                     this.a + this.a[this.a[this.a[195] + 0 + var3]] - 68,
                     this.b + this.b[this.a[this.a[195] + 0 + var3]] - 55 + this.bb + this.d[this.a[this.a[195] + 0 + var3]] + 0 + 5
                  );
               }

               if (this.a[this.a[195] + 20 + var3] == 1) {
                  this.a(var1, 524, this.a, this.b + this.bb + 0);
               } else if (this.a[this.a[195] + 20 + var3] == 2) {
                  this.a(var1, 528, this.a, this.b + 320 - this.ba + 0);
               }
            }
         }
      } else {
         a(var1, a[M], 0, 0, 251, 328, this.a - 11, this.b - 8 + 0, 0);
         if (this.s && !this.J && this.aP < 0) {
            var1.setColor(0);
            a(var1, this.a - 11, this.b - 8 + 0, 240, 16 + -this.aP);
            a(var1, this.a - 11, this.b - 8 + 16 + 320 - -this.aP + 0, 240, -this.aP);
         }
      }

      this.z = false;
   }

   private void m() {
      if (this.v == 1) {
         this.N = this.c[1];
         this.n();
         this.w();
         this.u();
         a[3].drawImage(a[this.c[1]], 0, 0, 0);
         this.N = 3;
         this.c(this.y * 22 - this.ad, this.A * 16 - this.ae);
         this.N = this.c[1];
         this.c(this.y * 22, this.A * 16);
         this.S = false;

         for (byte var1 = 0; var1 < 20; var1++) {
            if (this.a[var1]) {
               this.a(var1, 0, this.c[this.a[this.a[195] + 0 + var1]] - 8);
               this.N = this.c[1];
               if (this.a[this.a[195] + 20 + var1] == 1) {
                  this.a(524, 0, this.ax);
               } else if (this.a[this.a[195] + 20 + var1] == 2) {
                  this.a(528, 0, 320 - this.bb - this.ba + this.ax);
               }
            }
         }
      } else {
         if (this.v == 0) {
            this.F();
         }
      }
   }

   private void n() {
      try {
         if (this.ag != 0 && this.af != 0) {
            this.A = true;
         }

         this.aj = 0;
         this.ak = 0;
         if (this.A) {
            this.A = false;
            this.C = false;
            this.al = this.O - 1;
            this.am = this.P - 1;
            this.af = this.ag = 0;
            this.o();
         } else {
            this.ai = 0;
            this.am = -1;
            if (this.af != 0) {
               this.aj = -this.af * 22;
            } else if (this.ag != 0) {
               this.ak = -this.ag * 16;
            }

            a(a[this.c[1]], a[this.c[0]], 0, 0, 264, this.A, this.aj, this.ak, 0);
            if (this.af != 0) {
               this.aj = ((this.af - 2) / 2 + 1) * (this.O - 1);
               this.al = this.aj;
               this.ak = 0;
               this.am = this.P - 1;
               this.af = 0;
               this.o();
            }

            if (this.ag != 0) {
               this.ak = ((this.ag - 2) / 2 + 1) * (this.P - 1);
               this.am = this.ak;
               this.aj = 0;
               this.al = this.O - 1;
               this.ag = 0;
               this.o();
            }

            if (this.C) {
               this.C = false;
               this.aj = 0;
               this.al = this.O - 1;
               this.ak = this.P - 1 - 3;
               this.am = this.P - 1;
               this.o();
            }

            if (this.B) {
               this.B = false;
               this.aj = 0;
               this.al = this.O - 1;
               this.ak = 0;
               this.am = this.P - 1;
               this.D = true;
               this.o();
               this.D = false;
            }
         }

         if (this.am != -1 && !this.s) {
            a(a[this.c[0]], a[this.c[1]], 0, 0, 264, this.A, 0, 0, 0);
         }
      } catch (Exception var2) {
      }
   }

   private void o() {
      for (this.ai = this.ak; this.ai <= this.am; this.ai++) {
         for (this.ah = this.aj; this.ah <= this.al; this.ah++) {
            if (this.D) {
               if (!this.a[this.ai][this.ah]) {
                  continue;
               }

               this.a[this.ai][this.ah] = false;
            }

            if (!this.s || this.b(this.ah + this.I, this.ai + this.K)) {
               int var1;
               if ((var1 = this.b[this.ai + this.K][this.ah + this.I] & 255) < 175) {
                  this.a(var1, this.ah * 22, this.ai * 16);
               } else {
                  this.a((int)var1, (byte)0);
               }

               byte var2;
               if ((var2 = this.c[this.ai + this.K][this.ah + this.I]) < 0 && var2 >= -123) {
                  this.a((int)var2, (byte)0);
               }
            }
         }
      }
   }

   private void a(int var1, byte var2) {
      int var3 = -var1;
      int var4 = 0;
      byte var5 = 0;
      byte var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = this.ah * 22;
      int var11 = this.ai * 16;
      if (b(var1) != 2) {
         var4 = this.e[8749 + var3];
         var5 = this.a[this.a[138] + 104 + var4];
         var7 = this.e[9115 + var3];
         var8 = this.ah + this.I - this.e[8383 + var3];
         var9 = this.ai + this.K - this.e[8444 + var3];
         var10 -= var8 * 22;
         var11 -= var9 * 16;
         this.N = this.b[0][var4 + 1];
         this.O = this.j[0][var4 + 1];
         if (var2 == 0) {
            int var13 = 0;
            int var12 = var5 * var9 + var8;

            while (true) {
               if ((this.j[3][this.N] & 255) >> 6 == 0) {
                  if (var13 == var12) {
                     break;
                  }

                  var13++;
               }

               if ((this.j[3][this.N] & 7) != 0) {
                  break;
               }

               this.N++;
               this.O--;
            }
         } else {
            for (byte var15 = this.e[8993 + var3]; var15 > 0; var15 = this.e[4545 + var15]) {
               this.g[this.e[4646 + var15]] = (byte)var15;
            }
         }
      } else if (c(var1)) {
         var3 -= 61;
         var4 = this.e[9833 + var3];
         var7 = this.e[9933 + var3];
         this.N = this.b[0][var4 + 27 - 1];
         this.O = this.j[0][var4 + 27 - 1];
      } else if (c(var1) != 2) {
         if (c(var1) != 3) {
            this.g[0] = this.c[this.K + this.ai][this.I + this.ah];
            if (c((int)this.g[0]) != 2) {
               if (c((int)this.g[0]) == 1) {
                  var2 = -1;
               }

               var4 = 20 - (this.g[0] + 111);
               var7 = 1;
            } else if (c((int)this.e[4545 + this.g[0]]) != 2) {
               var4 = 20 - (this.e[4545 + this.g[0]] + 111);
               var7 = 2;
            }

            while (var4 > 22) {
               var4 -= 3;
            }
         } else {
            var4 = 23;
            var7 = 0;
         }

         this.N = this.b[0][var4 + 1];
         this.O = this.j[0][var4 + 1];
         var3 = 0;
      } else if (var1 >= 1000) {
         var10 = this.S;
         var11 = this.T;
         var4 = var1 - 1000;
         this.N = this.b[0][var4];
         this.O = this.j[0][var4];
         if (this.v == 0) {
            this.g[0] = 1;
            this.g[1] = 2;
            this.g[2] = 3;
            this.e[2930] = 39;
            this.e[2931] = 42;
            this.e[2932] = 42;
            this.e[607] = 1;
            this.e[608] = 0;
            this.e[609] = 6;
            this.e[1415] = 25;
            this.e[1416] = 45;
            this.e[1417] = 70;
            this.e[3031] = (byte)(this.f % 8);
            this.e[3032] = (byte)(this.f % 8);
            this.e[3033] = (byte)(this.f % 10);
            this.e[5152] = 8;
            this.e[6566] = 9;
            this.e[5153] = 5;
            this.e[6567] = 2;
            this.e[5154] = 10;
            this.e[6568] = 0;
            this.e[1314] = this.e[1315] = this.e[1316] = 0;
            this.e[6465] = this.e[6466] = this.e[6467] = 0;
         }

         var7 = 0;
         var3 = 0;
      } else if (var1 >= 175) {
         var4 = var1 - 180 + 34;
         this.N = this.b[0][var4];
         this.O = this.j[0][var4];
         var11 += this.aQ;
         var7 = 0;
         var3 = 0;
      }

      if (var2 == 0) {
         do {
            this.P = (this.j[3][this.N] & 255) >> 6;
            if (this.P <= var7) {
               this.a(this.b[1][this.N] & 4095, (this.ah - var8) * 22 + this.j[1][this.N], (this.ai - var9) * 16 + this.j[2][this.N]);
            }

            this.N++;
         } while ((this.j[3][this.N] & 7) == 0 && (this.j[3][this.N] & 255) >> 6 != 0);
      } else {
         this.a(var3, var7, (byte)var4, var10, var11, var2);
      }

      for (byte var16 = 0; var16 < 8; var16++) {
         this.g[var16] = this.h[var16] = this.i[var16] = 0;
      }
   }

   private void a(int var1, byte var2, byte var3, int var4, int var5, byte var6) {
      int var9 = 0;
      int var10 = this.f;
      byte var11 = 0;
      this.U = 0;

      try {
         for (int var15 = 0; var15 < this.O; var15++) {
            int var8 = this.j[3][this.N] & 7;
            var11 = (byte)((this.j[3][this.N] & 63) >> 3);
            this.P = (this.j[3][this.N] & 255) >> 6;
            this.X = this.g[var11];
            boolean var12 = false;
            int var14 = (this.b[1][this.N] & '쀀') >> 14 << 7;
            if (var8 == 0 && var6 == 2 && this.P == var2) {
               this.a(this.b[1][this.N] & 4095, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N]);
            } else if (var8 == 1 && this.P <= var2) {
               if (var3 == 6 && this.U < 5) {
                  this.a[0][this.a[this.a[142]]] = (byte)(this.a[0][5] + this.a[0][8] + this.a[0][5] + this.a[0][9] + this.a[0][10]);
                  if (this.a[0][this.a[this.a[142] + this.U]] > 0 || var1 >= 31) {
                     this.V = this.a[0][this.a[this.a[142] + this.U]] / 7 / (this.U == 0 ? 1 : 10);
                     if (this.V >= 5 || var1 >= 31) {
                        this.V = 4;
                     }

                     this.a((this.b[1][this.N] & 4095) + this.V, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N]);
                  }

                  this.U++;
               } else if (var3 == 4 && this.U < 1) {
                  if (var1 >= 31) {
                     this.a((this.b[1][this.N] & 4095) + 2, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N]);
                  } else if (this.a[0][0] >= 5) {
                     this.V = this.a[0][0] > 35 ? 2 : (this.a[0][0] - 5) / 15;
                     this.a((this.b[1][this.N] & 4095) + this.V, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N]);
                  }

                  this.U++;
               } else {
                  this.a(this.b[1][this.N] & 4095, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N]);
               }
            } else if ((var8 == 2 || var8 == 4 || var8 == 6) && var6 != 2) {
               if (this.P == 0 || this.P <= var2) {
                  int var7 = this.N;
                  var9 = this.b[1][this.N] & 4095;
                  if (var8 == 6) {
                     var10 += this.K + this.ai + this.N * 2;

                     while (var10 >= 120) {
                        var10 -= 120;
                     }

                     if (var11 == 1 || var11 == 2 && (this.e[8627 + var1] == 1 || this.e[8627 + var1] == 2)) {
                        if (var1 >= 31) {
                           var9++;
                        }

                        var12 = true;
                     } else if (var11 != 2) {
                        var12 = true;
                     }
                  } else if (this.q == 3 && var1 == 31 && var11 == 0) {
                     if (var9 == 116 && var8 == 4) {
                        var12 = true;
                        var10 = 0;
                     }
                  } else if (var8 == 2 && (this.e[1313 + this.X] <= 0 || this.e[1313 + this.X] >= 50)) {
                     var12 = true;
                     if (this.e[1313 + this.X] == 51) {
                        this.i[var11] = 1;
                     }
                  } else if (var8 == 4 && this.i[var11] == 0 && this.e[1313 + this.X] >= 1 && this.e[1313 + this.X] != 50) {
                     var9 = this.b[1][this.N + this.e[1313 + this.X] - 1] & 4095;
                     var10 = this.e[3030 + this.X];
                     var12 = true;
                     this.i[var11] = 1;
                     if (this.e[8749 + var1] == 2 && this.e[1313 + this.X] == 2) {
                        this.d(90, var4 + this.j[1][var7] + var14, var5 + this.j[2][var7], this.f);
                     }
                  }

                  if (var12) {
                     this.d(var9, var4 + this.j[1][var7] + var14, var5 + this.j[2][var7], var10);
                  }
               }
            } else if ((var8 == 3 || var8 == 5 || var8 == 7) && this.h[var11] == 0 && this.X > 0 && var6 != 2) {
               byte var13 = 0;
               if (var1 < 31 || (this.e[9176 + var1] & 3) >= 2) {
                  if (var8 == 7 && this.e[1313 + this.X] == 50) {
                     var12 = true;
                  } else if (var8 == 3 && this.e[1313 + this.X] >= 1 && this.e[1313 + this.X] != 50) {
                     switch (var13 = this.a[this.a[139] + this.a[this.a[140] + var3] + var11]) {
                        case -1:
                           var13 = this.e[606 + this.X];
                        default:
                           var12 = true;
                     }
                  } else if (var8 == 5 && this.e[1313 + this.X] <= 0) {
                     var12 = true;
                     if ((this.e[3535 + this.X] != 0 || this.e[6565 + this.X] == 1) && var3 != 10 && var3 != 11) {
                        this.x = true;
                     }

                     if (this.v == 0) {
                        var13 = this.e[606 + this.X];
                     }
                  }
               }

               if (var12) {
                  this.a(this.X, var4 + this.j[1][this.N] + var14, var5 + this.j[2][this.N], var13, (byte)29);
                  this.h[var11] = 1;
               }
            }

            this.N++;
         }
      } catch (Exception var16) {
      }

      this.X = 0;
   }

   private void a(int var1, int var2, int var3, int var4, byte var5) {
      try {
         this.aq = var1;
         this.ar = var2;
         this.as = var3;
         this.at = var4;
         this.Y = var5;
         this.av = this.e[this.b[this.Y] + this.aq] & 255;
         int var6 = 0;
         if (this.at >= 0) {
            this.at = this.a[this.a[99] + ((this.b[3][this.av] >> 14 & 3) << 3) + this.at];
            var6 = (this.b[2][this.av] & 4095) + this.at * this.j[4][this.av] + this.e[this.b[this.Y + 1] + this.aq];
            this.au = this.b[4][var6];
            this.ar = this.ar + this.j[7][var6];
            this.as = this.as + this.j[8][var6] + this.aQ;
            if (this.x) {
               if (this.av != 124) {
                  this.au += 48;
                  this.av = 1;
               }

               this.x = false;
            }

            if (this.av == 141 || this.av == 142 || this.av == 143 || this.av == 144) {
               this.ar = this.ar + 22 * this.a[this.a[1] + this.e[606 + this.aq]];
            }
         } else {
            this.av = -this.at;
            if (this.e[1414 + this.aq] < 12) {
               this.av = 14;
               this.as -= 6;
            }

            this.au = this.b[4][(this.b[2][this.av] & 4095) + 2];
         }

         this.aw = (this.b[2][this.av] & '\uf000') >> 14;
         this.p();
         if (this.v != 0) {
            this.q();
         }
      } catch (Exception var7) {
      }
   }

   private void p() {
      this.aA = this.b[8][this.au];
      this.ao = -1;
      this.ap = -1;

      for (this.aB = 0; this.aB < this.j[15][this.au]; this.aB++) {
         this.az = this.aA + this.aB;
         if (this.b[7][this.az] != 0) {
            this.ax = 0;
            this.ay = this.j[14][this.az] & 15;
            if (this.Y == 29) {
               if (!this.a()) {
                  continue;
               }

               if (this.e[1414 + this.aq] >= 12) {
                  if (this.aq >= 51) {
                     this.an = 4;
                  }

                  if (!this.b()) {
                     continue;
                  }
               } else {
                  if (this.ay == 7 && this.e[1515 + this.aq] == 0) {
                     continue;
                  }

                  if (this.ay == 0) {
                     this.ap = this.az;
                     if (this.aq >= 51) {
                        this.ax++;
                     }
                  } else if (this.ay == 9) {
                     this.ao = this.az;
                     this.ax = this.e[5151 + this.aq] & 1;
                  } else if (this.ay == 5) {
                     continue;
                  }
               }

               if (this.b[7][this.az] == 1) {
                  continue;
               }
            } else if (this.ay == 0) {
               this.ao = this.ap = this.az;
            }

            if ((this.j[14][this.az] & 255) >> 7 == 0) {
               this.b(this.b[7][this.az] + this.ax, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
            } else {
               this.a(this.b[7][this.az] + this.ax, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
            }

            this.an = -1;
         }
      }
   }

   private boolean a() {
      if (this.ay == 10 && !this.s && this.v == 1 && this.at > -1) {
         if ((this.e[909 + this.aq] == 0 || this.e[909 + this.aq] != this.F) && (this.F != -1 || this.k != this.aq)) {
            if (this.W == this.aq) {
               this.ax = 1;
               if (this.W >= 51) {
                  this.ax = 3;
               }
            }
         } else {
            this.a(599, this.ar + this.j[12][this.az], this.as + this.j[13][this.az]);
         }

         this.aC = 0;

         for (int var1 = this.C + 1; var1 <= this.C + this.E; var1++) {
            for (int var2 = this.B + 1; var2 <= this.B + this.D; var2++) {
               byte var3;
               if ((var3 = this.c[var1][var2]) >= 1 && var3 <= 50 && this.e[1919 + var3] > 0) {
                  this.aC++;
                  if (var3 == this.aq) {
                     this.ax = 1;
                  }
               }
            }
         }
      }

      return true;
   }

   private boolean b() {
      if (this.ay == 0) {
         this.ap = this.az;
         this.ax = 0;
         this.ax = this.e[5151 + this.aq] >> 2 & 3;
         if (this.ax > 1) {
            this.ax -= 2;
            this.an = 0;
         }

         this.ax *= 72;
         if (this.aq >= 51) {
            this.ax += 36;
         }

         this.ax = this.ax + this.e[1515 + this.aq] * 18;
      } else if (this.ay == 9) {
         this.ao = this.az;
         this.ax = 0;
         this.ax = this.e[5151 + this.aq] & 3;
         if (this.aq >= 51) {
            this.an = 3;
         } else if (this.ax > 0) {
            this.an = this.ax;
         }

         this.ax = this.e[1515 + this.aq] == 1 ? 1 : (this.e[1414 + this.aq] < 30 ? 3 : (this.e[1414 + this.aq] < 50 ? 2 : 0));
         this.ax *= 12;
      } else if (this.ay == 7) {
         if (this.aq == this.a[0][17]) {
            this.ax += 2;
         } else {
            if (this.a[this.a[42] + this.a[this.a[41] + this.e[6464 + this.aq]]] == 0) {
               return false;
            }

            this.ax = this.ax + (this.a[this.a[42] + this.a[this.a[41] + this.e[6464 + this.aq]]] - 1);
         }
      } else if (this.aw == 0 && this.ay >= 5 && this.ay <= 8) {
         if (this.at < 0 && this.e[6565 + this.aq] == 1) {
            return false;
         }

         if ((this.ay != 5 || this.e[6565 + this.aq] != 4) && (this.ay != 6 || this.e[6565 + this.aq] != 5)) {
            if (this.a[this.a[145] + this.e[6565 + this.aq]] != this.ay) {
               return false;
            }
         } else {
            this.ax = 1;
         }
      } else if (this.aw == 2) {
         if (this.e[3535 + this.aq] != 0) {
            if (this.ay != 4 || this.e[3636 + this.aq] <= 0 && this.av != 113 && this.av != 114 && this.av != 115 && this.av != 116) {
               if (this.ay == 5) {
                  if (this.e[6565 + this.aq] == 9) {
                     return false;
                  }

                  this.ax = this.ax + this.e[6565 + this.aq];
               } else if (this.ay == 8) {
                  return false;
               }
            } else {
               this.ax = this.ax + this.e[3535 + this.aq];
            }
         } else if (this.e[3535 + this.aq] == 0) {
            if (this.ay == 4) {
               return false;
            }

            if (this.ay == 5) {
               if (this.e[6565 + this.aq] == 1) {
                  return false;
               }

               if (this.e[6565 + this.aq] == 9) {
                  return false;
               }

               this.ax = this.ax + this.e[6565 + this.aq];
            } else if (this.ay == 8 && this.e[6565 + this.aq] != 1) {
               return false;
            }
         }
      } else if (this.aw == 1 && this.ay == 5) {
         if (this.e[6565 + this.aq] == 9) {
            return false;
         }

         this.ax = this.ax + this.e[6565 + this.aq];
      }

      return true;
   }

   private void q() {
      if (!this.s && this.ao >= 0 && this.ap >= 0 && this.v == 1) {
         this.a.a(this.Y == 29 ? this.aq : 101 + this.aq, this.ar + this.j[12][this.ao] + 4, this.as + this.j[13][this.ao]);
         if (this.Y == 29 && this.at > -1) {
            for (int var1 = 0; var1 < 30; var1++) {
               if (this.b[0][2][var1] == this.aq && this.b[0][1][var1] != 3) {
                  this.d(65 + (1 - this.b[0][4][var1]) * 5 + this.b[0][1][var1], this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
                  break;
               }
            }

            if (this.e[4646 + this.aq] == 1 && this.e[2828 + this.aq] == 51 && this.e[1313 + this.aq] > 0) {
               this.d(65, this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
            }

            if (this.e[3333 + this.aq] > -1) {
               this.d(77 + this.e[3333 + this.aq], this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao], (this.c - (this.aq & 7)) % 15);
            }

            if (this.e[4646 + this.aq] < -1) {
               this.d(-this.e[4646 + this.aq], this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.e[3030 + this.aq]);
            }

            if ((this.e[7979 + this.aq] & 4) == 4) {
               this.d(73, this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao], this.f + this.aq);
            }

            if ((this.e[7979 + this.aq] & 8) == 8) {
               this.d(69, this.ar + this.j[12][this.ap], this.as + this.j[13][this.ap], this.f);
            }

            if (this.aq <= 50) {
               if (this.aq == 0
                  || this.aq == 1
                     && (
                        this.aq == this.k
                           || this.aq == this.W
                           || this.e[909 + this.aq] == this.F
                           || this.aq == this.c[this.K + this.A][this.I + this.y]
                           || this.X != 0 && -this.c[this.K + this.A][this.I + this.y] == this.e[4444 + this.aq]
                     )) {
                  this.a(577 + this.e[2222 + this.aq], this.ar + this.j[12][this.ao], this.as + this.j[13][this.ao]);
               }

               if (!this.F
                  && this.e[1919 + this.aq] > 0
                  && (
                     this.aq == this.k
                        || this.aq == this.W
                        || this.e[909 + this.aq] == this.F
                        || this.aq == this.c[this.K + this.A][this.I + this.y]
                        || this.e[6767 + this.aq] / 3 * 2 > this.e[1919 + this.aq]
                        || this.X != 0 && -this.c[this.K + this.A][this.I + this.y] == this.e[4444 + this.aq]
                  )) {
                  int var3 = this.e[6767 + this.aq] / 20;
                  byte var2 = 0;
                  if (this.e[1616 + this.aq] >= 5 || this.e[1717 + this.aq] >= 5 || this.e[7575 + this.aq] > 5) {
                     var2 = 2;
                     this.a(
                        602
                           + (
                              this.e[1616 + this.aq] > this.e[1717 + this.aq]
                                 ? (
                                    this.e[1616 + this.aq] > this.e[7575 + this.aq]
                                       ? this.e[1616 + this.aq]
                                       : (this.e[1717 + this.aq] >= this.e[7575 + this.aq] ? this.e[1717 + this.aq] : this.e[7575 + this.aq] - 1)
                                 )
                                 : (this.e[1717 + this.aq] >= this.e[7575 + this.aq] ? this.e[1717 + this.aq] : this.e[7575 + this.aq] - 1)
                           )
                           - 5,
                        this.ar + this.j[12][this.ao] + 2 - var3 + 2 - 10,
                        this.as + this.j[13][this.ao]
                     );
                  }

                  this.a(607 + var3, this.ar + this.j[12][this.ao] + var2, this.as + this.j[13][this.ao]);
                  a[this.N].setColor(this.e[(this.e[1919 + this.aq] - 1) * 3 / this.e[6767 + this.aq]]);
                  a(
                     a[this.N],
                     this.ar + this.j[12][this.ao] + 2 - var3 + var2,
                     this.as + this.j[13][this.ao] - 4,
                     this.a[this.a[128] + var3] * this.e[1919 + this.aq] / this.e[6767 + this.aq],
                     2
                  );
               }
            }

            if ((this.F || this.V) && this.aq == this.l) {
               this.d(41, this.ar + this.j[12][this.ap] - 1, this.as + this.j[13][this.ap] - 16 - 5, this.e);
            }
         }
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 40; var5++) {
         if (this.d[0][var5] == 0) {
            this.d[1][var5] = 0;
            this.d[0][var5] = (byte)var4;
            this.d[2][var5] = (byte)var3;
            this.d[6][var5] = (byte)var2;
            this.d[5][var5] = (byte)var1;
            return;
         }
      }
   }

   private void r() {
      boolean var1 = false;
      int var2 = 0;
      int var3 = 0;
      byte var4 = 0;
      int var5 = 0;
      short var6 = 0;
      int var7 = 0;
      short var8 = 0;
      this.aq = -1;

      try {
         for (int var12 = 0; var12 < 40; var12++) {
            if (this.d[0][var12] > 0) {
               byte var9 = 29;
               this.aq = this.d[5][var12];
               if (this.d[6][var12] == 1) {
                  var2 = this.e[0 + this.aq];
                  var3 = this.e[101 + this.aq];
               } else if (this.d[6][var12] == 2) {
                  var2 = this.e[9359 + this.aq];
                  var3 = this.e[9381 + this.aq];
                  var9 = 108;
                  this.d[2][var12] = 0;
               } else {
                  var2 = this.e[8383 + this.aq] + (this.d[2][var12] & 15);
                  var3 = this.e[8444 + this.aq] + (this.d[2][var12] >> 4 & 15);
               }

               if (!this.a(var2, (int)var3) || this.a(var2, (int)var3) != 0 || this.e[1919 + this.aq] <= 0 && this.d[6][var12] == 1) {
                  this.d[0][var12] = 0;
                  return;
               }

               var2 = (var2 - this.I) * 22;
               var3 = (var3 - this.K) * 16;
               if (this.d[6][var12] == 1 || this.d[6][var12] == 2) {
                  var4 = this.e[606 + this.aq];
                  var4 = this.a[this.a[99] + (this.b[3][this.e[this.b[var9] + this.aq] & 0xFF] >> 14 & 3) * 8 + var4];
                  var5 = (this.b[2][this.e[this.b[var9] + this.aq] & 0xFF] & 4095)
                     + var4 * this.j[4][this.e[this.b[var9] + this.aq] & 0xFF]
                     + this.e[this.b[var9 + 1] + this.aq];
                  var6 = this.b[4][var5];
                  var7 = 0;
                  var8 = this.b[8][this.b[4][var5]];

                  for (short var10 = 0; var10 < this.j[15][var6]; var10++) {
                     var7 = var8 + var10;
                     if ((this.j[14][var7] & 15) == this.d[2][var12]) {
                        break;
                     }
                  }

                  if (this.d[6][var12] == 1) {
                     var2 += this.e[202 + this.aq] + this.j[12][var7];
                     var3 += this.e[303 + this.aq] + this.j[13][var7];
                  } else if (this.d[6][var12] == 2) {
                     var2 += this.e[9403 + this.aq] + this.j[12][var7];
                     var3 += this.e[9425 + this.aq] + this.j[13][var7];
                  }
               }

               this.d(this.d[0][var12], var2, var3, this.d[1][var12]);
               this.d[1][var12]++;
               if (this.d[1][var12] >= this.j[9][this.d[0][var12]]) {
                  this.d[0][var12] = 0;
               }
            }
         }
      } catch (Exception var11) {
      }
   }

   final void a(int var1, int var2) {
      for (int var3 = 0; var3 < 30; var3++) {
         if (this.e[0][var3] == 0) {
            this.e[1][var3] = 0;
            this.e[2][var3] = (byte)var2;
            this.e[0][var3] = (byte)var1;
            return;
         }
      }
   }

   private void s() {
      for (int var6 = 0; var6 < 30; var6++) {
         if (this.e[0][var6] != 0) {
            byte var1 = this.e[0][var6];
            byte var2 = this.e[8383 + var1];
            int var3 = this.e[8444 + var1] - 1;
            byte var4 = this.a[this.a[138] + 104 + this.e[8749 + var1]];
            byte var5 = this.a[this.a[138] + 130 + this.e[8749 + var1]];
            if (this.e[1][var6] >= 20) {
               this.e[0][var6] = 0;
               if (this.e[2][var6] == 3) {
                  this.c(var1, false);
                  this.e[8627 + var1] = 3;
               }

               this.c(var2, var3 + 1, var4, var5);
               this.d((int)var1);
            } else {
               for (byte var7 = 0; var7 < var5 + 1; var7 += 2) {
                  for (byte var8 = 0; var8 < var4; var8 += 2) {
                     if (this.a(var2 + var8, (int)(var3 + var7))) {
                        this.d(74, (var2 + var8 - this.I) * 22, (var3 + var7 - this.K) * 16, (var8 * 2 + var7) * 2 + this.e[1][var6] - 1);
                     }
                  }
               }
            }

            this.e[1][var6]++;
         }
      }
   }

   private boolean a(int var1, int var2) {
      return var1 >= this.I && var1 < this.I + this.O && var2 >= this.K && var2 < this.K + this.P;
   }

   private void t() {
      for (byte var1 = 0; var1 < 40; var1++) {
         this.d[0][var1] = 0;
      }
   }

   private void d(int var1, int var2, int var3, int var4) {
      int var5 = this.b[5][var1] + var4 % this.j[9][var1];
      this.a(this.b[6][var5], var2 + this.j[10][var5], var3 + this.j[11][var5]);
   }

   final void a(int var1, int var2, int var3) {
      int var4 = this.b[9][var1] & 8191;
      int var5;
      if ((var5 = (this.b[9][var1] & '\uffff') >> 14 & 3) != 0) {
         this.b((var5 - 1) * 3 + 1, var2, var3);
      }

      for (int var8 = var4; var8 < var4 + (this.j[16][var1] & 63); var8++) {
         int var6 = this.b[10][var8] & 8191;
         int var7 = (this.b[10][var8] & '쀀') >> 14 << 7;
         if ((this.b[10][var8] & 8192) >> 13 == 0) {
            this.b(var6, var2 + this.j[18][var8] + var7, var3 + this.j[19][var8]);
         } else {
            this.a(var6, var2 + this.j[18][var8] + var7, var3 + this.j[19][var8]);
         }
      }
   }

   private void b(int var1, int var2, int var3) {
      if (var1 != 0) {
         int var4 = this.j[20][var1] & 31;
         var2 += 11;
         var3 += 8;
         if (var4 < 27) {
            boolean var5 = false;
            if (this.an > -1) {
               if (this.an == 0) {
                  if (var4 == 5) {
                     var4 = this.an;
                     var5 = true;
                  }
               } else if (this.an == 4) {
                  if (var4 == 14) {
                     var4 = 4;
                     var5 = true;
                  } else if (var4 == 15) {
                     var4 = 5;
                     var5 = true;
                  }
               } else if (var4 == 9) {
                  var4 = this.an;
                  var5 = true;
               }
            }

            if (!var5) {
               a(a[this.N], this.a[0][var4], this.j[21][var1] & 127, this.j[22][var1], this.j[23][var1], this.j[24][var1], var2, var3, 20);
               return;
            }

            if (a(a[this.N], this.a[1][var4], this.j[21][var1] & 127, this.j[22][var1], this.j[23][var1], this.j[24][var1], var2, var3, 20)) {
               return;
            }
         } else {
            int var8 = (this.j[20][var1] & 255) >> 5 | (this.j[21][var1] & 128) >> 4;
            a[this.N].setColor(this.j[17][var8 * 3 + 0] & 255, this.j[17][var8 * 3 + 1] & 255, this.j[17][var8 * 3 + 2] & 255);
            if (var4 == 27) {
               d(a[this.N], var2 + (this.j[21][var1] & 127), var3 + this.j[22][var1], var2 + this.j[23][var1], var3 + this.j[24][var1]);
               return;
            }

            if (var4 == 28) {
               b(a[this.N], var2 + (this.j[21][var1] & 127), var3 + this.j[22][var1], this.j[23][var1], this.j[24][var1]);
               return;
            }

            if (var4 == 29) {
               a(a[this.N], var2 + (this.j[21][var1] & 127) - 11, var3 + this.j[22][var1] - 8, this.j[23][var1], this.j[24][var1]);
               return;
            }

            if (var4 == 30) {
               a(a[this.N], var2 + (this.j[21][var1] & 127) * 4 - 11, var3 + this.j[22][var1] * 4 - 8, this.j[23][var1] * 4, this.j[24][var1] * 4);
            }
         }
      }
   }

   private void a(Graphics var1, int var2, int var3, int var4) {
      int var5;
      for (int var8 = var5 = this.b[9][var2] & 8191; var8 < var5 + (this.j[16][var2] & 63); var8++) {
         int var6 = this.b[10][var8] & 8191;
         int var7 = (this.b[10][var8] & '쀀') >> 14 << 7;
         if ((this.b[10][var8] & 8192) >> 13 == 0) {
            this.b(var1, var6, var3 + this.j[18][var8] + var7, var4 + this.j[19][var8]);
         } else {
            this.a(var1, var6, var3 + this.j[18][var8] + var7, var4 + this.j[19][var8]);
         }
      }
   }

   private void b(Graphics var1, int var2, int var3, int var4) {
      if (var2 != 0) {
         int var5 = this.j[20][var2] & 31;

         try {
            if (var5 == 27) {
               var1.setColor(0);
               d(var1, var3 + (this.j[21][var2] & 127), var4 + this.j[22][var2], var3 + this.j[23][var2], var4 + this.j[24][var2]);
            } else if (var5 == 28) {
               var1.setColor(0);
               b(var1, var3 + (this.j[21][var2] & 127), var4 + this.j[22][var2], this.j[23][var2], this.j[24][var2]);
            } else if (var5 == 29) {
               var1.setColor(0);
               a(var1, var3 + (this.j[21][var2] & 127) - 11, var4 + this.j[22][var2] - 8, this.j[23][var2], this.j[24][var2]);
            } else {
               if (var5 != 30) {
                  a(var1, this.a[0][var5], this.j[21][var2] & 127, this.j[22][var2], this.j[23][var2], this.j[24][var2], var3, var4, 20);
                  return;
               }

               var1.setColor(0);
               a(var1, var3 + (this.j[21][var2] & 127) * 4 - 11, var4 + this.j[22][var2] * 4 - 8, this.j[23][var2] * 4, this.j[24][var2] * 4);
            }
         } catch (Exception var8) {
         }
      }
   }

   private void i(int var1) {
      byte var4 = 0;
      byte var5 = 0;
      int var6 = 0;
      int var7 = 0;
      boolean var8 = true;

      try {
         do {
            if (!var8) {
               var1 = this.e[6060 + var1];
            }

            var8 = false;
            var4 = this.e[7676 + var1];
            var6 = 0 + (this.e[5252 + var1] - this.I) * 22 + 11 + this.e[5454 + var1];
            var7 = 0 + (this.e[5353 + var1] - this.K) * 16 + 8 + this.e[5555 + var1] - this.h[this.e[5858 + var1]][var1] - 10;
            if ((var5 = this.e[6565 + var1]) == 1 || var5 == 2 || var5 == 5) {
               this.a(
                  292
                     + this.a[this.a[190 + this.a[this.a[77] + var5]] + var4 * this.a[this.a[193] + 6 + var5] + this.i[this.e[5858 + var1]][var1]]
                     + this.a[this.a[193] + var5],
                  var6,
                  var7
               );
            }
         } while (this.e[6060 + var1] != 0);
      } catch (Exception var10) {
      }
   }

   private void u() {
      int var1 = 0;
      byte var2 = -16;
      byte var4 = 0;
      int var5 = 0;

      try {
         this.v();

         for (this.ai = -1; this.ai < this.P + 3; this.ai++) {
            int var7;
            if ((var7 = this.ai + this.K) < this.d) {
               for (this.ah = this.O - 1 + 1; this.ah >= -1; this.ah--) {
                  int var8 = this.ah + this.I;
                  if (var7 >= 0 && var7 < this.d && var8 >= 0 && var8 < this.c) {
                     var1 = this.ah * 22;
                     byte var3 = this.a(var8, (int)var7);
                     if (this.s && !this.J) {
                        var3 = 0;
                     }

                     var4 = this.c[var7][var8];
                     var5 = this.b[var7][var8] & 255;
                     if (var4 != 0) {
                        if (var3 >= 2 || (var5 < 180 || var5 > 231) && var5 != 243) {
                           if (var3 < 1 && var4 >= 1 && var4 <= 100 && (!this.s || this.ao != 9)) {
                              if (c((int)this.e[4545 + var4]) != 2) {
                                 this.a((int)this.e[4545 + var4], (byte)1);
                              }

                              if (c((int)this.e[4545 + var4]) == 2 || this.e[2929 + var4] <= 14) {
                                 if (this.ai >= 0
                                    && this.ah - 1 >= 0
                                    && this.e[9833 + (this.c[var7][var8 - 1] + 61) * -1] == 5
                                    && c((int)this.c[var7][var8 - 1])) {
                                    if (this.ah < this.O) {
                                       this.g[this.ai][this.ah] = 0;
                                    }

                                    this.ah--;
                                    var8 = this.ah + this.I;
                                    this.a((int)this.c[var7][var8], (byte)1);
                                 }

                                 if (a((int)var4) == 0 || (this.e[7979 + var4] & 2) == 0) {
                                    this.a(var4, var1 + this.e[202 + var4], var2 + this.e[303 + var4], this.e[606 + var4], (byte)29);
                                 }
                              }
                           } else if (var4 <= -1 && var4 >= -60 && (var3 < 2 || this.e[9176 + -var4] > 0)) {
                              if ((this.e[9176 + -var4] & 4) != 0) {
                                 switch (var3) {
                                    case 0:
                                       this.e[9176 + -var4] = 6;
                                       break;
                                    case 1:
                                       this.e[9176 + -var4] = 5;
                                 }
                              }

                              switch (this.e[9176 + -var4] & 3) {
                                 case 1:
                                    var3 = 1;
                                    break;
                                 case 2:
                                    var3 = 0;
                              }

                              if ((this.e[8871 + -var4] & 1) == 0) {
                                 this.a((int)var4, (byte)1);
                                 this.e[8871 + -var4] = (byte)(this.e[8871 + -var4] | 1);
                                 byte var9 = this.e[8749 + -var4];
                                 byte var10 = this.a[this.a[138] + 104 + var9];
                                 byte var11 = this.a[this.a[138] + 130 + var9];
                                 if ((this.e[9176 + -var4] & 4) == 0) {
                                    this.a.S = 0;
                                    this.a.a(this.e[8383 + -var4], this.e[8444 + -var4], var10, var11);
                                    this.a.S = 1;
                                    this.e[9176 + -var4] = 4;
                                 }

                                 if (!this.s && var9 < 22) {
                                    if ((this.a[this.a[138] + 156 + var9] != -1 || this.e[8627 + -var4] == 1 || this.e[8627 + -var4] == 2)
                                       && this.e[8810 + -var4] == 0
                                       && b((int)var4) == 0) {
                                       this.d(
                                          40,
                                          (this.e[8383 + -var4] - this.I) * 22 + var10 * 11 - 11,
                                          (this.e[8444 + -var4] - this.K) * 16 + var11 * 8 - 8,
                                          this.e
                                       );
                                    }

                                    if ((
                                          this.e[8505 + -var4] > 0
                                                && (var4 == this.c[this.K + this.A][this.I + this.y] || this.e[8566 + -var4] / 2 > this.e[8505 + -var4])
                                             || this.e[8627 + -var4] == 1
                                             || this.e[8627 + -var4] == 2
                                             || var9 >= 12
                                       )
                                       && b((int)var4) == 0) {
                                       int var12 = this.e[8566 + -var4] / 80 + 6;
                                       int var13 = (this.e[8383 + -var4] - this.I) * 22 + var10 * 11 - 11;
                                       int var14 = var2 - this.a[this.a[138] + 520 + var9] * 8 - 5;
                                       this.a(607 + var12, var13, var14);
                                       a[this.N].setColor(this.e[(this.e[8505 + -var4] - 1) * 3 / this.e[8566 + -var4]]);
                                       a(a[this.N], var13 + 1, var14 + 1, this.a[this.a[128] + var12] * this.e[8505 + -var4] / this.e[8566 + -var4], 2);
                                       if (var4 == this.c[this.K + this.A][this.I + this.y]) {
                                          byte var15;
                                          int var16 = (var15 = this.a.a(-var4)) >> 4 & 15;
                                          int var17 = var15 & 15;
                                          int var18;
                                          if ((var18 = var16 + var17) > 0) {
                                             var13 = var13 + 1 + this.a[this.a[128] + var12] / 2 - 4 * var18 / 2 + 1;
                                             var14 += 6;
                                             a[this.N].setColor(0);
                                             a(a[this.N], var13 - 0, var14 - 1, var18 * 4 - 1, 4);
                                             a(a[this.N], var13 - 1, var14 - 0, var18 * 4 + 1, 2);

                                             for (byte var22 = 0; var22 < var18; var22++) {
                                                a[this.N].setColor(var22 < var17 ? 16164864 : 4207389);
                                                a(a[this.N], var13 + var22 * 4, var14, 3, 2);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (var3 < 1 && b((int)var4)) {
                              int var6 = var4 - 101;
                              this.a(var6, var1 + this.e[9403 + var6], var2 + this.e[9425 + var6], this.e[9491 + var6], (byte)108);
                           } else if (var3 >= 2 || !c((int)var4) && c((int)var4) != 3) {
                              if (var3 == 0 && var4 <= -114 && var4 > -117) {
                                 if (this.h >= 94 + var7 && this.h <= 100 + var7) {
                                    this.d(75, var1, var2, this.h - (100 + var7) + 6);
                                 } else if ((this.h + this.ah + this.ai) % 10 < 5) {
                                    this.a(this.b[var7][var8] & 255, var1, var2);
                                 }
                              }
                           } else {
                              this.a((int)var4, (byte)1);
                           }
                        } else {
                           this.a((int)var5, (byte)1);
                        }
                     }

                     if (this.ah >= 0 && this.ah < this.O && this.ai >= 0 && this.g[this.ai][this.ah] > 0) {
                        this.i(this.g[this.ai][this.ah]);
                        this.g[this.ai][this.ah] = 0;
                     }

                     if (var3 == 1) {
                        this.b(12, var1 - 2, var2 - 4);
                     } else if (var3 == 2) {
                        a[this.c[1]].setColor(0);
                        if (var8 != 0
                           && var8 != this.c - 1
                           && var7 != 0
                           && var7 != this.d - 1
                           && this.a(var8 - 1, (int)var7) == 2
                           && this.a(var8 + 1, (int)var7) == 2
                           && this.a(var8, (int)(var7 - 1)) == 2
                           && this.a(var8, (int)(var7 + 1)) == 2) {
                           a(a[this.c[1]], var1, var2, 22, 16);
                        } else {
                           this.b(11, var1 - 3, var2 - 2);
                        }
                     }

                     if (this.ai == this.A && this.ah == this.y) {
                        this.Z = var3;
                     }
                  }
               }

               if ((this.L || this.N) && this.q[1] - this.K == this.ai) {
                  this.d(105, (this.q[0] - this.I) * 22, var2, this.f);
               }

               var2 += 16;
            }
         }

         this.r();
         this.s();
         if (this.ad == 0 && this.ae == 0) {
            if (this.N) {
               this.d(30, 218, 11, this.f);
               return;
            }

            if (this.L) {
               this.d(31, 218, 11, this.f);
            }
         }
      } catch (Exception var23) {
      }
   }

   private void v() {
      for (int var1 = 1; var1 <= 60; var1++) {
         this.e[8871 + var1] = (byte)(this.e[8871 + var1] & 254);
         if (this.e[9176 + var1] > 0) {
            this.e[9176 + var1] = 5;
         }
      }

      byte var5 = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         if (this.c[var5][var2][2] >= 0
            && this.c[var5][var2][3] == 1
            && this.c[var5][var2][0] >= this.I - 1
            && this.c[var5][var2][0] <= this.I + this.O + 1
            && this.c[var5][var2][1] >= this.K - 1
            && this.c[var5][var2][1] <= this.K + this.P + 1) {
            for (int var3 = 0; var3 < 9; var3++) {
               if (this.a(this.c[var5][var2][0] + this.a[this.a[141] + 0 + var3], (int)(this.c[var5][var2][1] + this.a[this.a[141] + 9 + var3])) == 0) {
                  this.d(
                     68,
                     (this.c[var5][var2][0] - this.I + this.a[this.a[141] + 0 + var3]) * 22,
                     (this.c[var5][var2][1] - this.K + this.a[this.a[141] + 9 + var3]) * 16,
                     this.f
                  );
               }
            }
         }

         if (var2 == 4 && var5 == 0) {
            var2 = 0;
            var5 = 1;
         }
      }

      for (int var6 = 0; var6 < 30; var6++) {
         byte var7 = this.b[0][2][var6];
         byte var4 = this.b[0][3][var6];
         if (this.b[0][1][var6] == 3
            && this.b[0][0][var6] != 0
            && var7 >= this.I - 1
            && var7 <= this.I + this.O + 1
            && var4 >= this.K - 1
            && var4 <= this.K + this.P + 1
            && this.a((int)var7, (int)var4) == 0) {
            this.d(68 + (1 - this.b[0][4][var6]) * 5, (var7 - this.I - 0) * 22, (var4 - this.K - 0) * 16, this.f);
         }
      }
   }

   private void w() {
      if (this.u) {
         this.Q = this.G - this.I <= this.y ? this.G - this.I : this.y;
         this.B = this.Q + this.I - 1;
         this.R = this.H - this.K <= this.A ? this.H - this.K : this.A;
         this.C = this.R + this.K - 1;
         this.Q *= 22;
         this.R *= 16;
         int var1 = this.I + this.y - this.G;
         int var2 = this.K + this.A - this.H;
         if (var1 < 0) {
            var1 *= -1;
         }

         this.D = var1 + 1;
         if (var2 < 0) {
            var2 *= -1;
         }

         this.E = var2 + 1;
         var1 = (var1 + 1) * 22;
         var2 = (var2 + 1) * 16;
         a[this.c[1]].setColor(0);
         b(a[this.c[1]], 11 + this.Q + 1, 8 + this.R + 1, var1, var2);
         a[this.c[1]].setColor(1105252);
         b(a[this.c[1]], 11 + this.Q, 8 + this.R, var1, var2);
      }

      byte var8;
      if (b((int)(var8 = this.c[this.K + this.A][this.I + this.y])) == 0) {
         int var10 = (this.e[8383 + -var8] - this.I) * 22;
         int var3 = (this.e[8444 + -var8] - this.K) * 16;
         int var4 = this.a[this.a[138] + 104 + this.e[8749 + -var8]] * 22;
         int var5 = this.a[this.a[138] + 130 + this.e[8749 + -var8]] * 16;
         this.d(6, var10, var3, this.e);
         this.d(7, var10 + var4, var3, this.e);
         this.d(8, var10, var3 + var5, this.e);
         this.d(9, var10 + var4, var3 + var5, this.e);
      }
   }

   private void c(int var1, int var2) {
      if (this.aa != 0) {
         this.d(34 + this.aa, (this.ab - this.I) * 22, (this.ac - this.K) * 16, this.e);
         if (this.e == 5) {
            this.aa = 0;
         }
      }

      byte var4 = this.c[this.K + this.A][this.I + this.y];
      if (this.w != 2) {
         byte var5 = -1;
         byte var3 = 32;
         if (this.w == 1) {
            if (this.k != 0) {
               var5 = 1;
            } else if (this.F != -1) {
               var5 = 0;

               for (int var9 = 0; var9 < 50; var9++) {
                  if (this.a[this.F][var9] != 0) {
                     var5++;
                  }
               }
            }

            var3 = (byte)(this.Z != 0 || b((int)var4) != 1 && !b((int)var4) && (a((int)var4) != 1 || (this.e[7979 + var4] & 2) != 0) ? 33 : 34);
         } else if (this.w == 3) {
            byte var10000;
            if (this.s == 100) {
               this.r = true;
               var10000 = 105;
            } else if (this.s >= 0 && this.s > 3) {
               byte var6 = this.a[this.a[138] + 104 + this.s];
               byte var7 = this.a[this.a[138] + 130 + this.s];
               this.t = this.y - var6 / 2;
               this.u = this.A - var7 / 2;
               this.S = var1 - var6 / 2 * 22;
               this.T = var2 - var7 / 2 * 16 - 5 + this.e;
               this.a((int)(1000 + this.s + 1), (byte)2);
               this.r = this.a(this.s, this.I + this.t, this.K + this.u, true);
               var10000 = (byte)(this.r ? 41 : 40);
            } else if ((a((int)var4) != 0 || this.e[1414 + var4] < 12) && (a((int)this.W) != 0 || this.e[1414 + this.W] < 12)) {
               if (this.s == 3) {
                  this.r = true;
                  var10000 = 33;
               } else {
                  this.r = false;
                  var10000 = 32;
               }
            } else {
               this.r = this.W;
               this.t = this.e[0 + this.r];
               this.u = this.e[101 + this.r];
               this.r = true;
               var10000 = 33;
            }

            var3 = var10000;
         }

         if (this.E && this.e < 2 && var3 <= 34) {
            var3 = (byte)(var3 + 5);
         }

         this.d(var3, var1, var2, this.e);
         if (var5 > 0) {
            this.a.a(var1 + 22, var2 + 8, 0, "" + var5, 1);
            this.a.a(a[this.N]);
         }

         if (this.aC > 0) {
            this.a.a(var1 + 22, var2 + 8, 0, "" + this.aC, 1);
            this.a.a(a[this.N]);
         }

         if (this.w == 3) {
            if (this.s < 0) {
               this.a(659 - this.s - 1, var1 + 11 + 5, var2 + 8 + 5);
            } else if (this.s <= 3) {
               this.d(this.s + 48, var1, var2, this.e);
            }
         }
      }

      byte var8 = 0;
      if (this.w == 1) {
         if (this.q && this.aa != 0) {
            var8 = 47;
            this.Z = 0;
         } else if (var4 == -124) {
            var8 = 44;
         } else if (var4 == -125) {
            var8 = 45;
         } else if (b((int)var4) == 0 && this.e[8749 + -var4] != 10) {
            var8 = 41;
         } else if (c((int)var4)) {
            var8 = (byte)(this.e[9833 + (var4 + 61) * -1] == 7 ? 46 : 43);
         } else if (b((int)var4) && this.Z == 0) {
            var8 = 43;
         }

         if (var8 != 0 && this.Z != 2) {
            this.d(var8, var1, var2, this.e);
         }
      }
   }

   private void a(byte var1, int var2, int var3) {
      this.aD = var1;

      try {
         boolean var4 = this.c();
         if (this.b[var1]) {
            this.b[17] = true;
            this.ae = 0;
         } else if (var4) {
            this.ae = 1;
         } else {
            if (this.a[this.a[195] + 80 + var1] != 1) {
               return;
            }

            this.ae = 2;
         }

         this.N = this.c[this.a[this.a[195] + 0 + var1]];
         this.aE = this.a[this.a[195] + 60 + var1];
         byte var5 = this.a[this.a[195] + 40 + var1];
         boolean var6 = false;

         for (int var7 = this.b[0][var5]; var7 < this.b[0][var5] + this.j[0][var5]; var7++) {
            int var8 = (this.j[3][var7] & 255) >> 6;
            int var9 = this.j[3][var7] & 7;
            this.aI = this.b[1][var7] & 4095;
            if (var8 >= this.ae || var6) {
               this.aF = 0;
               if (var6) {
                  var6 = false;
                  if (this.k[this.aE] == 0 && this.ae > 0 || this.k[this.aE] < 0) {
                     this.aE++;
                     continue;
                  }

                  this.aF = this.d[this.aE];
                  this.k[this.aE] = 0;
                  this.aE++;
               } else if (var8 == 1) {
                  var6 = true;
                  if (this.k[this.aE] == 0 && this.ae > 0 || this.aI == 0 || var8 < this.ae || this.k[this.aE] < 0) {
                     continue;
                  }
               } else if (var8 == 2 && this.k[this.aE] < 0) {
                  continue;
               }

               int var10 = (this.b[1][var7] >> 14 & 3) << 7;
               int var11 = (this.b[1][var7] >> 12 & 3) << 7;
               this.aJ = this.j[1][var7];
               this.aK = this.j[2][var7];
               if (var1 >= 13 && var1 <= 16) {
                  this.aJ += 120;
                  this.aK += 110;
               } else {
                  this.aJ += var2;
                  this.aK += var3;
               }

               this.aJ += var10;
               this.aK += var11;
               if (var7 == 1011) {
                  this.aI = this.b[1][1007] & 4095;
                  this.aF = this.d[3];
                  this.d(var9, 1007);
                  this.aI = 0;
               }

               if (var7 == 1010) {
                  this.a(var7, this.ae, this.aK);
               } else if (var7 == 1137) {
                  this.c(var7, this.aJ, this.aK);
               } else if (var9 == 0 && (this.j[3][var7] & 255) >> 6 == 3) {
                  a[this.N].setColor(0);
                  byte var12 = 99;
                  if (var7 == 1030) {
                     var12 = this.e[6767 + this.l];
                  }

                  if (this.aF >= 0) {
                     int var13 = this.j[23][this.aI] * this.aF / var12;
                     a(a[this.N], this.j[1][var7] + var13 + 1, this.aK, this.j[23][this.aI] - var13 + var11, 4);
                  }
               } else if (var9 == 3 && this.aI >= 3 && this.aI <= 4) {
                  if (this.v != -1) {
                     if (this.b[var1] || this.v != this.w) {
                        this.a
                           .b(
                              this.aG,
                              this.aH,
                              this.j[23][this.b[1][var7 - 1] & 4095] * 4,
                              this.j[24][this.b[1][var7 - 1] & 4095] * 4,
                              this.v,
                              (this.j[3][var7] & 255) >> 6,
                              this.aI - 3
                           );
                     }

                     if (this.w != this.v) {
                        this.w = this.v;
                        this.y = 0;
                     }

                     this.z = this.y;
                     this.a.a(a[this.N], this.y);
                  }
               } else if (this.aI != 0) {
                  this.d(var9, var7);
               }
            } else if (var8 == 1) {
               var6 = true;
            }
         }

         this.a.a(a[this.N]);
         this.b[var1] = false;
      } catch (Exception var14) {
      }
   }

   private void d(int var1, int var2) {
      if (var1 == 0) {
         this.b(this.aI, this.aJ, this.aK);
         this.aG = this.aJ;
         this.aH = this.aK;
      } else if (var1 == 1) {
         this.j(var2);
      } else if (var1 == 2) {
         if ((!this.Q || this.aI != 4 && this.aI != 94) && (!this.R || this.aI != 5 && this.aI != 95) && (this.T || this.aI != 1) && (this.U || this.aI != 2)) {
            if (var2 - 1 == 1201) {
               a[M].setColor(1105252);
               b(a[M], 11 + this.aJ + (this.I - this.W) * 5, 8 + this.aK + (this.K - this.X + this.aL) * 4, this.O * 5 - 1, this.P * 4 - 1);
               this.d(this.aI, this.aJ + (this.y + this.I - this.W) * 5 - 11, this.aK + (this.A + this.K - this.X + this.aL) * 4 - 8, this.f / this.k);
            } else {
               this.d(this.aI, this.aJ, this.aK, this.f / this.k);
            }

            this.S = true;
         }
      } else if (var1 == 3 && this.aI == 11) {
         a(a[M], a[this.c[1]], 0, 0, this.j[23][this.b[1][1181] & 4095] * 4, this.j[24][this.b[1][1181] & 4095] * 4, 11 + this.aJ, 8 + this.aK, 0);
      } else if (var1 == 3 && this.aI == 10) {
         try {
            this.c(this.o);
            a[M].drawImage(this.a[2][0], (11 + this.aJ) * 1, (8 + this.aK) * 1, 3);
         } catch (Exception var4) {
         }
      } else if (var1 == 3 && this.aI <= 2) {
         this.k(var2);
      } else if (var1 == 3 && this.aI <= 6) {
         if (var2 - 1 == 1128 && (this.u[0] == 3 || this.u[0] == 1)) {
            this.a
               .a(
                  this.aJ,
                  this.aK,
                  (this.j[3][var2] & 255) >> 6,
                  108 + this.e[6868 + this.k[2][0]],
                  this.aF + (this.e[1515 + this.k[2][0]] == 0 ? 0 : 1),
                  -1,
                  this.aI - 5
               );
         } else {
            this.a.a(this.aJ, this.aK, (this.j[3][var2] & 255) >> 6, this.aF, this.aI - 5);
         }
      } else {
         if (var1 == 4) {
            if (this.aI != 1) {
               int var3 = this.aI;
               this.bc = 11 + this.aJ + (this.j[21][var3] & 127);
               this.bd = 8 + this.aK + this.j[22][var3];
               this.be = this.j[23][var3];
               this.bf = this.j[24][var3];
               c(a[this.N], this.bc, this.bd, this.be, this.bf);
               return;
            }

            this.bc = 0;
            this.bd = 0;
            this.be = 528;
            this.bf = 704;
            c(a[this.N], this.bc, this.bd, this.be, this.bf);
         }
      }
   }

   private void j(int var1) {
      if (var1 - 1 == 1118) {
         byte var7 = this.r[this.as];
         if (this.ad != 6) {
            var7 = (byte)(var7 == 16 ? this.e[8749 + this.q] : var7 + -6 + 20);
         }

         byte var8 = this.a[this.a[138] + 468 + var7];
         int var9 = 0;

         for (int var6 = 0; var6 < 3; var6++) {
            if (this.a[this.a[138] + (10 + var6) * 26 + var7] != 0) {
               int var10 = this.aK - this.a[this.a[283] + 2] * (var8 - 1) / 2 + (this.a[this.a[283] + 2] + 2) * var9;
               var9++;
               this.a(627 + var6, this.aJ - 10 + 3, var10);
               this.a.a(this.aJ + 19, var10, (this.j[3][var1] & 255) >> 6, String.valueOf(this.a[this.a[138] + (10 + var6) * 26 + var7]), 0);
            }
         }
      } else if (var1 - 1 == 1107) {
         int var2 = this.r[this.as] + 12;
         int var3 = 0;

         for (int var5 = 0; var5 < 3; var5++) {
            if (this.a[this.a[138] + (10 + var5) * 26 + var2] != 0) {
               int var4 = this.aJ - 34 * (this.a[this.a[138] + 468 + var2] - 1) / 2 + 30 * var3;
               var3++;
               this.a(627 + var5, var4 - 2 - 4, this.aK);
               this.a.a(var4 + 15, this.aK, (this.j[3][var1] & 255) >> 6, String.valueOf(this.a[this.a[138] + (10 + var5) * 26 + var2]), 0);
            }
         }

         this.d[8] = 0;
         if (this.e[8749 + this.q] == 6 && this.r[this.as] != 1) {
            this.d[8] = -20;
         }
      } else {
         switch (var1 - 1) {
            case 1073:
               this.aF /= 21;
            default:
               this.a(this.aI + this.aF, this.aJ, this.aK);
         }
      }
   }

   private void k(int var1) {
      switch (var1 - 1) {
         case 1043:
         case 1047:
         case 1051:
         case 1059:
         case 1063:
            if (this.aF < 0 || this.a[this.a[126] + this.aF] == -1) {
               return;
            }

            this.aF = this.e[this.b[this.a[this.a[126] + this.aF]] + this.l] + this.a[this.a[127] + this.aF];
         case 1044:
         case 1045:
         case 1046:
         case 1048:
         case 1049:
         case 1050:
         case 1052:
         case 1053:
         case 1054:
         case 1056:
         case 1057:
         case 1058:
         case 1060:
         case 1061:
         case 1062:
         case 1064:
         case 1065:
         case 1066:
         default:
            break;
         case 1055:
            this.aF = (9 - this.aF) * 2 + 1;
            break;
         case 1067:
            if (this.aF == 0 || this.e[3535 + this.l] == 0 || this.e[3535 + this.l] == 15) {
               return;
            }
      }

      switch (var1 - 1) {
         case 1015:
            this.a.a(this.aJ, this.aK, (this.j[3][var1] & 255) >> 6, this.aF + "/" + this.a[0][16], this.aI - 1);
            return;
         default:
            this.a.a(this.aJ, this.aK, (this.j[3][var1] & 255) >> 6, String.valueOf(this.aF), this.aI - 1);
      }
   }

   private boolean c() {
      this.G = false;
      if (this.aD == 0) {
         for (int var1 = 0; var1 < 5; var1++) {
            if (this.a[0][this.a[this.a[146] + var1]] != this.d[this.a[this.a[195] + 60 + 0] + var1]) {
               this.G = true;
               this.d[this.a[this.a[195] + 60 + 0] + var1] = this.a[0][this.a[this.a[146] + var1]];
               this.k[this.a[this.a[195] + 60 + 0] + var1] = 1;
            }
         }
      } else if (this.aD == 1 || this.aD == 9) {
         this.x();
      } else if (this.aD == 2 || this.aD == 5) {
         this.z();
      } else if (this.aD == 4) {
         this.y();
      } else if (this.aD == 6) {
         this.A();
      } else if (this.aD == 7 || this.aD == 8) {
         if (this.d[46] != this.r[this.as] || this.b[this.aD]) {
            this.d[46] = this.r[this.as];
            this.G = true;
            if (this.r[this.as] < 10) {
               this.d[this.a[this.a[195] + 60 + this.aD]] = this.r[this.as];
               this.d[this.a[this.a[195] + 60 + this.aD] + 1] = this.a[this.a[138] + 338 + this.r[this.as] + 12];
               this.d[this.a[this.a[195] + 60 + this.aD] + 2] = this.a[this.a[138] + 364 + this.r[this.as] + 12];
            }
         }
      } else if (this.aD == 10) {
         if (this.Q == 16 && this.z != this.y) {
            this.k[53] = 1;
         }
      } else if (this.aD == 15) {
         this.d[73] = (short)(98 + this.m);
         if (this.z != this.y) {
            this.k[72] = 1;
            this.G = true;
         }
      } else if (this.aD == 12) {
         if (this.am >= 51 && this.q <= 2) {
            this.am = 51;
         }

         this.d[57] = this.a[0][17] == this.am ? 104 : (short)(108 + this.e[6868 + this.am]);
         if (this.Q == 17 && this.al == 3 && (this.ai == 35 || this.ai == 50 || this.ai == 54)) {
            this.d[57] = 105;
         }

         this.d[58] = this.e[2727 + this.am];
         if (this.z != this.y) {
            this.k[56] = 1;
            this.G = true;
         }
      } else if (this.aD == 13) {
         this.d[62] = (short)(82 + (this.q == 7 ? 21 : this.a[this.a[248] + this.q]));
         this.d[63] = this.ak;
         if (this.z != this.y) {
            this.k[61] = 1;
            this.G = true;
         }
      } else if (this.aD == 14) {
         this.T = this.W != 0;
         this.U = this.W + ag < this.c;
         this.Q = this.X == 0;
         this.R = this.X + ah >= this.d;
         if (this.d[66] != this.W || this.d[71] != this.X) {
            this.d[66] = (short)this.W;
            this.d[71] = (short)this.X;
            this.D();
         }

         this.k[66] = 1;
         this.af = this.ag = 0;
      } else if (this.aD == 17) {
         this.B();
      } else if (this.aD == 16) {
         if (this.z != this.y) {
            this.k[76] = 1;
            this.G = true;
         }
      } else if (this.aD == 18 || this.aD == 19) {
         for (int var2 = 0; var2 < this.a[this.a[307] + this.m]; var2++) {
            this.k[this.a[this.a[195] + 60 + this.aD] + var2] = (byte)(var2 == this.Z ? 1 : 0);
         }
      }

      return this.G;
   }

   private void x() {
      this.k[47] = this.ay;

      for (int var1 = 0; var1 < 2; var1++) {
         this.k[48 + var1] = (byte)(this.F == 2 + var1 ? 2 : (this.a[2 + var1][0] > 0 ? 1 : 0));
      }

      this.k[50] = (byte)(41 + this.u[0]);
      this.k[51] = this.a[this.a[304] + this.u[0]];

      for (int var2 = this.a[this.a[195] + 60 + 9]; var2 < this.a[this.a[195] + 60 + 9] + 5; var2++) {
         if (this.k[var2] != -1) {
            if (this.d[var2] != this.k[var2]) {
               this.d[var2] = this.k[var2];
               this.k[var2] = 1;
               this.G = true;
            } else {
               this.k[var2] = 0;
            }
         }
      }
   }

   private void y() {
      for (int var1 = 0; var1 < 23; var1++) {
         if (this.e[this.b[this.a[this.a[147] + var1]] + this.l] != this.d[this.a[this.a[195] + 60 + 4] + var1]) {
            this.G = true;
            this.d[this.a[this.a[195] + 60 + 4] + var1] = this.e[this.b[this.a[this.a[147] + var1]] + this.l];
            this.k[this.a[this.a[195] + 60 + 4] + var1] = 1;
         }
      }

      if (this.k[11] == 1 || this.k[12] == 1) {
         this.k[11] = this.k[12] = 1;
      }

      if (this.e[3636 + this.l] == 0) {
         this.d[29] = 0;
      }

      this.d[14] = (short)(108 + this.e[6868 + this.l]);
   }

   private void z() {
      if (this.d[4] > 0) {
         this.v = this.d[4];
         this.k[5] = this.k[3] = -1;
         this.G = true;
      } else {
         if (this.d[5] != this.r[this.as] || this.b[this.aD]) {
            this.d[5] = this.r[this.as];
            this.k[5] = this.k[3] = 1;
            this.d[3] = this.r[this.as] >= 10
               ? (short)(21 + this.r[this.as] - 10)
               : (
                  this.r[this.as] >= 0
                     ? (short)(12 + this.r[this.as])
                     : (this.K ? 41 : (!this.F && this.V ? 29 : (short)(108 + this.e[6868 + -this.r[this.as]])))
               );
            this.k[4] = -1;
            this.G = true;
         }
      }
   }

   private void A() {
      if (this.d[36] != this.r[this.as] || this.b[this.aD]) {
         this.v = 0 + this.r[this.as];
         this.d[36] = this.r[this.as];
         this.k[36] = this.k[38] = this.k[34] = 1;
         this.k[35] = this.k[37] = 1;
         this.G = true;
      }

      if (this.z != this.y) {
         this.k[38] = 1;
         this.G = true;
      }

      this.d[34] = (short)(0 + this.r[this.as]);
   }

   private void B() {
      if (this.v == 1) {
         this.k[this.a[this.a[195] + 60 + this.aD]] = (byte)(this.w != 3
               && this.Y != 4
               && (this.q <= 0 || this.e[8749 + this.q] != 0 || this.r[this.as] < 0 || this.r[this.as] > 5)
            ? (this.w != 4 && this.w != 2 ? 1 : 0)
            : 2);
         this.k[this.a[this.a[195] + 60 + this.aD] + 1] = (byte)(this.K ? 2 : (this.w != 1 && this.F == -1 && (this.ad == 1 || this.ad == 9) ? 1 : 0));
      } else if (this.Q == 32) {
         this.k[this.a[this.a[195] + 60 + this.aD]] = 2;
         this.k[this.a[this.a[195] + 60 + this.aD] + 1] = 3;
      } else {
         this.k[this.a[this.a[195] + 60 + this.aD]] = this.a[this.a[153] + 116 + this.Q];
         this.k[this.a[this.a[195] + 60 + this.aD] + 1] = this.a[this.a[153] + 145 + this.Q];
      }

      for (int var1 = this.a[this.a[195] + 60 + 17]; var1 < this.a[this.a[195] + 60 + 17] + 2; var1++) {
         if (this.d[var1] != this.k[var1]) {
            this.d[var1] = this.k[var1];
            this.k[var1] = 1;
            this.G = true;
         } else {
            this.k[var1] = 0;
         }
      }
   }

   private void a(int var1, byte var2, int var3) {
      boolean var4 = false;

      for (int var10 = 0; var10 < this.aW; var10++) {
         this.N = var1;
         int var7 = aV * var10;
         byte var5 = 1;
         if (this.aX + var10 == this.as) {
            var5 = 0;
         } else if (var2 == 2) {
            continue;
         }

         this.b(this.b[1][var1] & 4095, this.aY + var7, var3 - 1);
         this.a(548 + var5, this.aY + var7, var3);
         byte var6;
         f var10000;
         byte var10001;
         int var10002;
         int var10003;
         int var10004;
         if ((var6 = this.r[this.aX + var10]) < 0) {
            this.a(-var6, this.aY + var7 - -1, var3 + 8 + 2 + 3, -8, (byte)29);
            if (!this.V || this.F || this.aX + var10 != this.as) {
               continue;
            }

            var10000 = this;
            var10001 = 18;
            var10002 = this.aY + var7;
            var10003 = var3;
            var10004 = this.f;
         } else {
            if (var6 <= 8) {
               this.a(659 + var6, this.aY + var7, var3);
               byte var8 = 0;
               byte var9 = 0;
               if (this.e[8749 + this.q] == 6) {
                  var8 = -1;
                  var9 = 6;
               }

               this.a.a(this.aY + var7 + 19 + var8 + 6, var3 + 5 + var9 + 2, 1, String.valueOf(this.s[var10 + this.aX]), 0);
               if (this.e[8749 + this.q] != 6 && this.aX + var10 < this.av && this.aX + var10 == this.as) {
                  this.d(3, this.aY + var7 + 6, var3 + 2 + 2, this.f);
                  this.S = true;
               }
               continue;
            }

            var10000 = this;
            var10001 = var6;
            var10002 = this.aY + var7;
            var10003 = var3;
            var10004 = this.aX + var10 == this.as ? this.f : 0;
         }

         var10000.d(var10001, var10002, var10003, var10004);
      }

      if (this.T) {
         this.d(1, this.aY - 9, var3 + 8, this.e);
      }

      if (this.U) {
         this.d(2, this.aY + this.aZ - 9 + 9, var3 + 8, this.e);
      }
   }

   private void c(int var1, int var2, int var3) {
      int var6 = this.a[this.a[283] + 2] + 6;
      int var7 = 0;
      this.ab = this.a[this.a[152] + this.Q + 1] - this.a[this.a[152] + this.Q];
      int var4 = var2 + this.j[23][this.b[1][var1] & 4095] / 2 * 4;
      int var5 = var3 - this.ab * var6 / 2 + var6 / 2;

      for (int var8 = 0; var8 < this.ab; var8++) {
         if (var8 == this.Z) {
            var7 = var5;
         }

         this.b(this.b[1][var1] & 4095, var2, var5);
         this.a.a(var4, var5, 1, 57 + this.a[this.a[151] + this.a[this.a[152] + this.Q] + var8], 0);
         var5 += var6;
      }

      this.a.a(a[this.N]);
      this.d(2, var4 - 50 - 20, var7 + 4, this.e);
      this.d(1, var4 + 49 + 20, var7 + 4, this.e);
   }

   final void a(int var1) {
      af = (byte)(af + var1);
      if (af > 98) {
         af = 98;
      }

      this.n[2] = this.n[3] = this.n[4] = af;

      for (int var2 = 0; var2 < 5; var2++) {
         a[M].setColor(this.f[var2]);
         a(a[M], 70 + this.l[var2], 312 + this.m[var2], this.n[var2], this.o[var2]);
      }

      if (!this.y) {
         this.a.a.a();
         Thread.yield();
      } else {
         this.l();
      }
   }

   private void c(byte var1) {
      boolean var5 = false;

      try {
         System.gc();
         Thread.yield();
         DataInputStream var8 = new DataInputStream(this.getClass().getResourceAsStream("/pi8"));

         byte var4;
         for (byte var10 = 0; var10 < 12 && (var4 = (byte)(var8.readByte() & 0xFF)) != 255; var10++) {
            short var6;
            byte[] var7 = new byte[var6 = (short)(var4 << 8 | var8.readByte() & 0xFF)];
            var8.read(var7, 0, var6);
            if (var10 == var1) {
               this.a[2][0] = Image.createImage(var7, 0, var6);
               break;
            }
         }

         var8.close();
      } catch (Exception var9) {
      }
   }

   private void C() {
      this.aM = this.c > ag ? ag : this.c;
      this.aN = this.d > ah ? ah : this.d;
      this.N = 1;
      this.b(this.b[1][1181] & 4095, -11, -8);
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;

      for (int var6 = 0; var6 < this.aN; var6++) {
         int var2 = 0;
         int var1 = -1;

         for (int var7 = 0; var7 <= this.aM; var7++) {
            if (var7 == this.aM) {
               var5 = true;
            } else {
               this.e(this.W + var7, this.X + var6);
            }

            if (!var5 && this.aO == var1) {
               var4++;
            } else {
               if (var4 > 0) {
                  a[this.N].setColor(var1);
                  a(a[this.N], var2 * 5 - 11, (this.aL + var3) * 4 - 8, var4 * 5, 4);
                  var4 = 0;
               }

               if (var5) {
                  var5 = false;
               } else {
                  var1 = this.aO;
                  var2 = var7;
                  var3 = var6;
                  var4 = 1;
               }
            }
         }
      }
   }

   private void D() {
      this.N = M;
      int var1 = (this.b[1][1181] >> 12 & 3) << 7;
      this.b(this.b[1][1181] & 4095, 120 + this.j[1][1181] + 11, 160 + this.j[2][1181] + 8 + var1);
      a(
         a[M],
         a[this.c[1]],
         (this.af + 1) / 2 * 5,
         (this.ag + 1) / 2 * 4,
         this.j[23][this.b[1][1181] & 4095] * 5 - 5 * this.a[this.a[148] + this.af + 1] - 44,
         this.j[24][this.b[1][1181] & 4095] * 5 - 4 * this.a[this.a[148] + this.ag + 1] - 32,
         131 + this.j[1][1181] + (-this.af + 1) / 2 * 5,
         168 + this.j[2][1181] + (-this.ag + 1) / 2 * 4 + var1,
         0
      );
      a[this.c[1]].drawImage(a[this.c[0]], -(120 + this.j[1][1181] + 11) * 1, -(160 + this.j[2][1181] + 8 + var1) * 1, 0);
      int var2 = (this.af + 1 >> 1) * (this.aM - 1);
      int var3 = (this.ag + 1 >> 1) * (this.aN - 1);
      this.N = 1;
      if (this.ag == 0) {
         a[this.N].setColor(11180356);
         a(a[this.N], var2 * 5 - 11, var3 - 8, 5, ah * 4);

         for (int var5 = 0; var5 < this.aN; var5++) {
            this.e(this.W + var2, this.X + var5);
            a[this.N].setColor(this.aO);
            a(a[this.N], var2 * 5 - 11, (this.aL + var5) * 4 - 8, 5, 4);
         }
      } else if (this.af == 0) {
         for (int var4 = 0; var4 < this.aM; var4++) {
            this.e(this.W + var4, this.X + var3);
            a[this.N].setColor(this.aO);
            a(a[this.N], var4 * 5 - 11, (this.aL + var3) * 4 - 8, 5, 4);
         }
      }
   }

   private void e(int var1, int var2) {
      this.aO = -1;
      byte var3;
      if ((var3 = this.a(var1, (int)var2)) != 2) {
         if (this.c[var2][var1] <= 0) {
            if (this.c[var2][var1] < 0) {
               this.aO = this.b[var3][b((int)this.c[var2][var1]) + 9];
            }
         } else {
            this.aO = a((int)this.c[var2][var1]) == 1 && (this.e[7979 + this.c[var2][var1]] & 2) != 0 ? -1 : this.b[var3][a((int)this.c[var2][var1]) + 6];
         }

         if (this.aO == -1) {
            this.aO = this.b[var3][this.a[this.a[194] + (this.b[var2][var1] & 255)]];
            return;
         }
      } else {
         this.aO = 6049325;
      }
   }

   private void E() {
      this.W = this.I - ag / 2 + (this.O >> 1);
      this.W = this.W < 0 ? 0 : (this.W + ag >= this.c ? this.c - ag : this.W);
      if (ah > this.d) {
         this.aL = ah - this.d >> 1;
      } else {
         this.X = this.K - ah / 2 + (this.P >> 1);
         this.X = this.X < 0 ? 0 : (this.X + ah >= this.d ? this.d - ah : this.X);
      }
   }

   private void F() {
      if (this.c == -1 && this.a[this.a[153] + 0 + this.Q] == 1) {
         this.G();
      } else if (this.a[this.a[153] + 0 + this.Q] == 1) {
         this.H();
      } else if (this.Q == 23) {
         this.I();
      } else if (this.Q == 15) {
         this.J();
      } else if (this.Q == 17) {
         this.P();
      } else if (this.Q == 20) {
         this.K();
      } else if (this.Q == 18) {
         if (this.H) {
            this.H = false;
            this.b[13] = true;
            this.b[11] = true;
            this.a((byte)11, 0, 0);
            this.a((byte)17, 0, 320);
         }

         this.a((byte)13, 0, 0);
      } else if (this.Q == 19) {
         this.L();
      } else if (this.Q == 24) {
         if (this.H) {
            this.H = false;
            this.b[11] = this.b[16] = true;
            this.a((byte)11, 0, 0);
            this.a((byte)16, 0, 0);
            this.a((byte)17, 0, 320);
         }
      } else if (this.Q == 25) {
         this.M();
      } else if (this.Q == 27) {
         this.N();
      } else if (this.Q == 32 && this.H) {
         this.H = false;

         try {
            a[M].drawImage(Image.createImage("/l3"), 11, 8, 20);
         } catch (Exception var2) {
         }

         this.b[17] = true;
         this.a((byte)17, 0, 320);
      }

      this.N = this.c[1];
   }

   private void G() {
      if (this.H) {
         this.H = false;
         this.N = this.c[1];
         a[this.N].setColor(9422847);
         a(a[this.N], 0, -8, this.a[this.N], this.b[this.N]);
         a[this.N].setColor(940839);
         a(a[this.N], 0, -8 + this.b[this.N] - 64, this.a[this.N], 64);
         this.S = 0;
         this.T = 248;
         this.a((int)1118, (byte)2);
         if (this.Q == this.U || this.Q == 3 || this.Q == 12 || this.Q == 13 || this.Q == 2 || this.Q == this.V || this.Q == 9 || this.Q == 14) {
            this.k[53] = -1;
            this.k[54] = 1;
         } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
            this.k[53] = 1;
            this.k[54] = -1;
         }

         this.k[52] = -1;
      }

      this.N = M;
      a[this.N].drawImage(a[this.c[1]], 0, 328, 36);
      a[this.N].setColor(9422847);
      a(a[this.N], 0, 0, this.a[this.N], 80);

      for (int var1 = 0; var1 < 4; var1++) {
         if (this.a[0][var1] > 240 || this.a[0][3] == -1000) {
            this.a[0][var1] = -88 - this.a(65535, (int)60);
            this.a[1][var1] = this.a(65535, (int)48);
            this.a[2][var1] = this.a(255, (int)4);
         }

         this.a(
            1667 + this.a[2][var1],
            this.a[0][var1] = this.a[0][var1] + (this.a[2][var1] + 2 >> 1),
            this.a[1][var1] = this.a[1][var1] + (this.a(255, (int)5) == 0 ? this.a(255, (int)3) - 1 : 0)
         );
      }

      if (this.Q == this.U || this.Q == 12 || this.Q == 13 || this.Q == 2 || this.Q == this.V || this.Q == 9 || this.Q == 14) {
         this.k[53] = -1;
         this.k[54] = 1;
      } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
         this.k[53] = 1;
         this.k[54] = -1;
      }

      this.k[52] = -1;
      this.b[10] = true;
      this.a(1665, 120, 0);
      this.S = 0;
      this.T = 272;
      this.a((int)1118, (byte)1);
      this.a((byte)10, 25, 64);
      this.b[17] = true;
      this.a((byte)17, 0, 320);
   }

   private void H() {
      if (this.H) {
         this.H = false;
         this.O();
         if (this.Q == 10 || this.Q == 11 || this.Q == 12 || this.Q == 13) {
            this.k[53] = -1;
            this.k[54] = 1;
         } else if (this.Q == 16 || this.Q == 21 || this.Q == 22) {
            this.k[53] = 1;
            this.k[54] = -1;
         }

         this.k[52] = -1;
         this.b[10] = true;
      }

      this.a((byte)10, 25, 64);
      this.a((byte)17, 0, 320);
   }

   private void I() {
      if (this.H) {
         this.H = false;
         this.b[11] = true;
         this.v = 69;
         this.k[55] = 1;
         this.a((byte)11, 0, 0);
         this.k[55] = -1;
      }
   }

   private void J() {
      if (this.H) {
         this.H = false;
         this.b[11] = this.b[15] = true;
         this.a((byte)11, 0, 0);
         this.a((byte)17, 0, 320);
      }

      this.a((byte)15, 0, 0);
   }

   private void K() {
      if (this.H) {
         this.H = false;
         this.A = true;
         this.n();
         this.u();
         this.O();
         this.b[12] = true;
      }

      this.a((byte)12, 0, 0);
      this.a((byte)17, 0, 320);
   }

   private void L() {
      if (this.H) {
         this.H = false;
         this.b[11] = true;
         this.a((byte)11, 0, 0);
         this.b[14] = true;
         this.C();
      }

      this.a((byte)14, 120, 160);
      this.b[17] = true;
      this.a((byte)17, 0, 320);
   }

   private void M() {
      this.H = false;
      if (!this.I) {
         this.O();
         a[1].drawImage(a[0], 0, 0, 0);
      }

      this.b[2] = true;
      a(a[0], a[1], 0, 0, 264, 301, 0, 0, 0);
      this.a((byte)(18 + this.m), 0, 0);
      this.a((byte)2, 0, this.d[this.a[this.a[195] + 0 + 2]]);
      this.a((byte)17, 0, 320);
      this.I = true;
   }

   private void N() {
      if (this.ab) {
         this.ab = false;
         this.x = this.v;
         this.v = 61;
         this.b[11] = true;
         this.k[55] = 1;
         this.a((byte)11, 0, 0);
         this.k[55] = -1;
         this.a((byte)17, 0, 320);
      }
   }

   private void O() {
      this.c[9] = this.c[8] = 0;
      a(a[this.c[0]], a[this.c[1]], 0, 0, 264, this.A, 0, this.bb - this.ax, 0);

      for (byte var1 = 0; var1 < 20; var1++) {
         if (this.a[var1]) {
            this.b[var1] = true;
            this.a(var1, 0, this.d[this.a[this.a[195] + 0 + var1]]);
            this.N = this.c[0];
            if (this.a[this.a[195] + 20 + var1] == 1 && this.Q != 20) {
               this.a(524, 0, 0 + this.bb);
            } else if (this.a[this.a[195] + 20 + var1] == 2) {
               this.a(528, 0, 320 - this.ba);
            }
         }
      }

      this.c[9] = this.c[8] = 2;
   }

   private void P() {
      if (this.aP > 0 && !this.J) {
         this.aP += 4;
         a[M].setColor(0);
         a(a[M], 0, 0, 240, 16 + this.aP);
         a(a[M], 0, 336 - this.aP, 240, this.aP);
         this.c = true;
         if (this.aP - 4 <= 160) {
            return;
         }

         this.aP = -this.aP;
         this.c = false;
         this.i();
      }

      if (this.H && !this.J) {
         this.b[12] = true;
         a[M].setColor(0);
         a(a[M], 0, 0, 240, 112);
         a(a[M], 0, 240, 240, 96);
      }

      if (this.a[this.a[155] + 0 + this.aS] == 1) {
         if (this.aR >= 0) {
            if (this.aR >= this.a[this.a[155] + 84 + this.aS] && this.am == 0) {
               if (this.am == 0 && this.aS != 0) {
                  this.aR = -1;
                  this.j = true;
                  return;
               }
            } else {
               this.N = 0;
               a[M].setColor(0);
               a(a[M], 0, 112, 240, 128);
               this.d(98 + this.a[this.a[155] + 28 + this.aS], 120, 176, this.am == 0 ? this.aR : this.f);
               this.d(104, 120, 176, this.f);
               this.aR = this.am == 0 ? this.aR + 1 : this.aR;
            }
         }
      } else if (this.a[this.a[155] + 0 + this.aS] >= 2 || this.a[this.a[155] + 0 + this.ao] >= 2) {
         this.Q();
         this.R();
      }

      this.H = false;
      if (this.aP < 0) {
         this.aP += 4;
         this.c = true;
         if (this.aP >= -48) {
            this.aP = 0;
            this.c = false;
            this.i();
         }
      }

      if (this.aP == 0 && this.al != 0) {
         this.a((byte)12, 0, 0);
         this.a((byte)17, 0, 320);
      }
   }

   private void Q() {
      if (this.aS > 0 && this.aR >= 0 && (this.aP == 0 || this.H)) {
         if (this.aR == 0 && this.a[this.a[155] + 28 + this.aS] > 0) {
            for (int var2 = 0; var2 < this.p.length; var2++) {
               if (this.p[var2] != 0) {
                  byte var1 = (byte)(var2 > 6 ? 6 : var2);
                  if (this.a[this.a[196] + var1 * 33 + 0 + this.a[this.a[155] + 28 + this.aS] * 3] != 0) {
                     this.e[2929 + this.p[var2]] = this.a[this.a[196] + var1 * 33 + 0 + this.a[this.a[155] + 28 + this.aS] * 3];
                     this.e[1313 + this.p[var2]] = this.a[this.a[196] + var1 * 33 + 2 + this.a[this.a[155] + 28 + this.aS] * 3];
                     this.e[2828 + this.p[var2]] = 105;
                  }

                  if (this.a[this.a[196] + var1 * 33 + 1 + this.a[this.a[155] + 28 + this.aS] * 3] != 0) {
                     this.e[606 + this.p[var2]] = (byte)(-10 + this.a[this.a[196] + var1 * 33 + 1 + this.a[this.a[155] + 28 + this.aS] * 3]);
                     this.e[808 + this.p[var2]] = 0;
                  }

                  this.e[3030 + this.p[var2]] = 0;
               }
            }
         }

         if (this.aR >= this.a[this.a[155] + 84 + this.aS]) {
            this.aR = -2;
            if (this.al == 0) {
               this.j = true;
               return;
            }
         }

         this.aR++;
         if (this.aR > 0) {
            this.j();
         }
      }
   }

   private void R() {
      if (this.an != 0 || this.a[this.a[155] + 84 + this.ao] >= -1 || this.aR > 0) {
         if (this.H) {
            this.A = true;
            this.N = 1;
            this.n();
         }

         if (this.J) {
            if (this.H) {
               this.H = false;
               this.A = true;
               this.n();
               this.u();
               this.O();
               this.b[12] = true;
               return;
            }
         } else if (this.aP == 0 || this.H) {
            this.aQ = 0;
            if (this.aS == 24) {
               this.aQ = this.a(255, (int)8);
            }

            a(a[this.c[0]], a[this.c[1]], 0, 120, 264, 128 - this.aQ, 0, 120 + this.aQ, 0);
            if (this.aS == 24) {
               a[M].setColor(0);
               a(a[M], 0, 96, 240, 16);
               a(a[M], 0, 240, 240, 16);
            }

            this.N = 0;
            this.bc = 0;
            this.bd = 120;
            this.be = 264;
            this.bf = 128;
            c(a[this.N], this.bc, this.bd, this.be, this.bf);
            this.u();
            this.bc = 0;
            this.bd = 0;
            this.be = 528;
            this.bf = 704;
            c(a[this.N], this.bc, this.bd, this.be, this.bf);
         }
      }
   }

   final void b(int var1) {
      this.i();
      if (var1 >= 0) {
         this.ai = (byte)var1;
         this.S();
         this.T();
      } else {
         if (this.ak == this.aj - 1) {
            this.U();
            return;
         }

         this.ak++;
      }

      this.o = 0;
      this.v = 71 + this.ak;
      this.o = (byte)(this.a[this.a[154] + this.q] + this.ak);
      this.aS = this.a[this.a[311] + 229 + this.aT + this.ak];
      this.aR = this.a[this.a[155] + 84 + this.aS] < 0 ? -1 : 0;
      this.al = this.a[this.a[311] + 0 + this.aT + this.ak];
      this.am = this.p[this.al];
      this.an = this.a[this.a[311] + 458 + this.aT + this.ak];
      if (this.an > 100) {
         this.f(this.an, -2);
      } else if (this.an == 99) {
         this.am = this.p[0];
         this.f(this.am, -2);
      } else if (this.an > 0) {
         this.f(this.p[this.an], -2);
      } else if (this.an == -100) {
         if (this.ai == 51) {
            this.I = 8;
            this.K = 67;
         }

         this.f(-100, -2);
      } else if (this.an < 0) {
         this.f(this.an, -3);
         if (this.ai == 36 || this.ai == 38) {
            this.I = (byte)(this.I + 4);
            this.K--;
         }
      }

      this.H = true;
   }

   private void S() {
      this.aJ();
      this.t();
      this.ak = 0;
      this.Z = 0;
      this.a.a(this.ai);
      this.aT = this.a[this.a[310] + 0 + this.ai] & 255;
      this.ao = this.a[this.a[311] + 229 + this.aT];
      if (this.ai == 4 || this.ao == 0) {
         this.a[this.a[311] + 229 + this.aT] = this.ao = 27;
      }

      this.aj = (byte)((this.a[this.a[310] + 0 + this.ai + 1] & 255) - this.aT);
      this.J = this.ao >= 27;
      this.v = 0;
      this.R = this.Q;
      this.Q = 17;
      this.aP = this.a[this.a[155] + 56 + this.ao];
      if (this.aP == 1) {
         this.O();
      }

      if (this.ao != 9 && !this.J && this.aP != 1) {
         this.K--;
      }

      this.d = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
      this.a(true, true, false, false);
      this.s = true;
      byte var1 = this.a[this.a[310] + 71 + this.ai];
      System.arraycopy(this.a, this.a[156] + this.a[this.a[157] + var1], this.p, 0, this.a[this.a[157] + var1 + 1] - this.a[this.a[157] + var1]);
   }

   private void T() {
      if (this.ai == 3) {
         this.d(5, 20, 2);
         this.e[6161 + this.p[2]] = 3;
         this.e[2828 + this.p[2]] = 105;
         this.e[6262 + this.p[2]] = 5;
         this.e[6363 + this.p[2]] = 10;
         this.e[1313 + this.p[2]] = 3;
         this.e[5050 + this.p[2]] = -1;
      } else if (this.ai == 37) {
         this.a.l();
         this.aw = 1;
         this.a.a(4, 46, 9, (byte)0, (byte)9);
         this.a((byte)0, (byte)48, (byte)9, (byte)3, (byte)0);
         this.e[2934] = 14;
         this.e[611] = 2;
         this.aw = 2;
         this.a.a(1, 44, 9, (byte)1, (byte)2);
         this.a.a(1, 45, 11, (byte)1, (byte)2);
         this.e[658] = 7;
         this.a.a(1, 48, 11, (byte)1, (byte)2);
         this.e[659] = 5;
         this.a.a(2, 48, 9, (byte)1, (byte)2);
         this.a[0][17] = 0;
      } else if (this.ai == 38) {
         this.a.l();
         this.a((byte)0, 2, 52, 18, 2, true, -1);
         this.a((byte)0, 2, 54, 16, 2, true, -1);
         this.a((byte)0, 2, 55, 19, 2, true, -1);
         this.a((byte)0, 2, 58, 19, 2, true, -1);
         this.aw = 0;
         this.a.a(5, 60, 12, (byte)0, (byte)0);
         this.aw = 2;
         this.d(57, 17, 1);
         this.a.a();
      } else if (this.ai == 43) {
         this.b(52, 7);
      } else if (this.ai == 45) {
         this.a.m();
         this.b(57, 30);
         this.b(1, 54, 30, 5);
         this.b(1, 54, 31, 5);
         this.b(1, 55, 31, 5);
         this.b(1, 55, 32, 5);
      } else {
         if (this.ai == 48) {
            this.q = 2;
            this.aM();
            this.a.f = 6;
            this.aN();
            this.q = 3;
            this.a((byte)0, 24, 18, 67, 2, true, -1);
            this.a((byte)0, 25, 19, 69, 2, true, -1);
            this.a((byte)0, 25, 21, 71, 2, true, -1);
            this.a[0][12] = 0;
            this.a((byte)0, (byte)26, (byte)69, (byte)60, (byte)0);
            this.a[0][17] = 1;
            this.a.a(7, 26, 69, (byte)0, (byte)2);
            this.d(23, 69, 1);
            this.a.a(2, 1, 69, (byte)1, (byte)3);
            this.a((byte)1, (byte)21, (byte)69, (byte)60, (byte)0);
            this.e[659] = 0;
            this.e[2982] = 42;
            this.f(53, -2);
            this.e[657] = 0;
         }
      }
   }

   private void U() {
      this.a.d();
      if (this.ai == 26) {
         this.s = false;
         this.c();
         this.s = true;
      }

      if (this.ao == 9) {
         this.a.f();
      } else if (this.ai == 28) {
         this.d(5, 11, 0);
         this.a.I = (byte)(this.a.I & 254);
         this.a.d[this.a[this.a[292] + 4]] = 0;
      } else if (this.ai == 34) {
         this.d(48, 15, 5);
         this.a.I = 0;
      } else if (this.ai == 38) {
         this.d(65, 18, 1);
         this.u = 1;
      } else if (this.ai == 44) {
         for (int var1 = 0; var1 < 10; var1++) {
            this.e[9601 + var1] = this.am;
         }

         this.d(53, 5, 0);
         this.f(this.am, -2);
         this.a.a();
      } else if (this.ai == 48) {
         this.u = 1;
         this.d(45, 69, 6);
      }

      for (int var2 = 0; var2 < this.p.length; var2++) {
         if (this.e[2828 + this.p[var2]] == 105) {
            if (this.e[4646 + this.p[var2]] < 0) {
               this.e[2828 + this.p[var2]] = 69;
            } else {
               this.e[2828 + this.p[var2]] = 57;
            }
         }

         this.p[var2] = 0;
      }

      if (this.a.f >= 50) {
         this.a.F = this.ai == 15 ? 1000000 : this.c;
         this.a.f = (byte)(this.a.f - 49);
         this.a.g = this.a[this.a[294] + this.a.f - 1];
         this.a.J = 0;
      }

      if (this.ao != 9) {
         this.J = this.I;
         this.L = this.K = this.J && !this.d[3] ? this.K : (byte)(this.K + 1);
      } else {
         this.I = this.J;
         this.K = this.L;
      }

      this.s = false;
      this.aK();
      this.J = this.I;
      this.L = this.K;
      if (this.ai != 0
         && this.ai != 1
         && (this.ai != 2 || this.p == 0)
         && this.ai != 32
         && this.ai != 36
         && this.ai != 37
         && this.ai != 39
         && this.ai != 46
         && this.ai != 47
         && this.ai != 49
         && this.ai != 55) {
         if (this.ai != 59) {
            this.v = 1;
         }

         this.A = true;
         this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
         this.Q = this.R;
      } else {
         this.ai++;
         this.Q = 28;
         this.b((int)this.ai);
         if (this.ai == 47) {
            this.Q = 18;
            this.o = this.a[this.a[154] + 8];
         }
      }
   }

   private void d(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.p.length; var4++) {
         if (var4 == var3 || var4 >= 6) {
            this.e(var1, var2, this.p[var4]);
         }
      }
   }

   private void e(int var1, int var2, int var3) {
      this.e[2828 + var3] = 69;
      this.e[3131 + var3] = (byte)var1;
      this.e[3232 + var3] = (byte)var2;
      this.e[6161 + var3] = 2;
      this.e[4747 + var3] = 0;
      this.e[7979 + var3] = (byte)(this.e[7979 + var3] & 191);
   }

   final void c() {
      this.c = this.e;
      this.d = this.f;
      this.q++;
      this.aP();
      this.a.G = this.a[219] + this.q * 4;
   }

   final void a(byte var1, byte var2, byte var3) {
      if (var1 >= 18 || this.l != 0 && this.Q != 17 && (var1 == 18 || !this.K) && this.u <= 0) {
         this.Z = 0;
         this.o = 0;
         this.i();
         this.ap = var1;
         this.v = 0;
         this.Q = 20;
         this.H = true;
         this.v = 12 + var1;
         this.am = var2;
         this.an = var3;
         this.d = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
         this.a(this.a[0], true, false, this.a[4]);
         this.A = true;
         if (var1 != 4 && var1 != 5 && var1 != 14 && var1 != 15) {
            this.a[this.a[153] + 145 + 20] = 2;
         } else {
            this.a[this.a[153] + 145 + 20] = 0;
         }
      }
   }

   protected final void keyPressed(int var1) {
      if (!this.n) {
         if (!this.o) {
            this.o = true;
            if (a(var1)) {
               this.j = 0;
               if (var1 == a || var1 == -a || var1 == 42) {
                  l = true;
               } else if (var1 != b && var1 != -b && var1 != 35) {
                  switch (var1) {
                     case 35:
                     case 36:
                     case 37:
                     case 38:
                     case 39:
                     case 40:
                     case 41:
                     case 42:
                     case 43:
                     case 44:
                     case 45:
                     case 46:
                     case 47:
                     case 50:
                     case 52:
                     case 53:
                     case 54:
                     case 56:
                     default:
                        break;
                     case 48:
                        this.i = 0;
                        break;
                     case 49:
                        this.i = 1;
                        this.w = true;
                        break;
                     case 51:
                        this.i = 3;
                        this.w = true;
                        break;
                     case 55:
                        this.i = 7;
                        this.w = true;
                        break;
                     case 57:
                        this.i = 9;
                        this.w = true;
                  }

                  if (this.a && this.y) {
                     this.m(var1);
                  }

                  try {
                     this.m = this.getGameAction(var1);
                  } catch (Exception var3) {
                     this.m = 666;
                  }

                  if (this.m != 8 && var1 != 53) {
                     if (this.m == 1 || var1 == 50) {
                        this.e = true;
                        return;
                     }

                     if (this.m == 6 || var1 == 56) {
                        this.f = true;
                        return;
                     }

                     if (this.m == 2 || var1 == 52) {
                        this.g = true;
                        return;
                     }

                     if (this.m == 5 || var1 == 54) {
                        this.h = true;
                     }
                  } else {
                     this.i = true;
                     this.t = true;
                     this.n++;
                     if (!this.u) {
                        this.E = 0;
                        return;
                     }
                  }
               } else {
                  m = true;
               }
            }
         }
      }
   }

   protected final void keyReleased(int var1) {
      if (!this.n) {
         if (a(var1)) {
            this.j = 0;
            switch (var1) {
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 48:
               case 50:
               case 52:
               case 53:
               case 54:
               case 56:
               default:
                  break;
               case 49:
                  this.w = false;
                  break;
               case 51:
                  this.w = false;
                  break;
               case 55:
                  this.w = false;
                  break;
               case 57:
                  this.w = false;
            }

            try {
               this.m = this.getGameAction(var1);
            } catch (Exception var3) {
               this.m = 666;
            }

            if (var1 == 53 || this.m == 8) {
               this.t = false;
               if (this.E < 4) {
                  this.v = true;
               }
            }

            if (this.o) {
               this.p = true;
            } else if (var1 == 50 || this.m == 1) {
               this.e = false;
            } else if (var1 == 56 || this.m == 6) {
               this.f = false;
            } else if (var1 != 52 && this.m != 2) {
               if (var1 == 54 || this.m == 5) {
                  this.h = false;
               }
            } else {
               this.g = false;
            }
         }
      }
   }

   private static boolean a(int var0) {
      return var0 != -10;
   }

   private void V() {
      this.W();
      if (this.u && this.i) {
         this.i = false;
         this.aF();
      } else if (this.t && this.w != 3) {
         this.i = false;
         this.aE();
      } else {
         this.F = 0;
      }

      if (this.I >= 4 && this.w == 1) {
         this.aG();
      } else if (this.I > 0 && this.I < 4 && !this.w) {
         this.aH();
      }

      if (this.v) {
         this.v = false;
         this.E = 4;
         this.i = false;
         byte var1 = this.c[this.K + this.A][this.I + this.y];
         if (this.w == 1 && this.W >= 51 && this.W <= 100) {
            this.y = (byte)(this.e[0 + this.W] - this.I);
            this.A = (byte)(this.e[101 + this.W] - this.K);
            this.e(this.W);
         } else if (this.w == 1 && a((int)var1) != 0) {
            this.e(var1);
         } else if (this.w == 3) {
            this.X();
         } else if (a((int)var1) == 0) {
            this.d(var1);
         } else if (this.w == 0 && b((int)var1) == 0) {
            this.f((byte)(-var1));
         } else if (a((int)this.W) == 0) {
            this.d(this.W);
            this.y = (byte)(this.e[0 + this.W] - this.I);
            this.A = (byte)(this.e[101 + this.W] - this.K);
         }

         this.E = true;
         this.e = 0;
      }

      this.aL();
      if (this.af == 0 && this.ag == 0 && !this.C) {
         this.Y();
         this.ad = this.af * 11;
         this.ae = this.ag * 8;
      }
   }

   private void W() {
      if (l) {
         l = false;
         if (this.w != 3) {
            this.a(true, false, false, false, true, false, false, false, false);
            this.w = 2;
            this.Z();
         }
      } else if (m) {
         m = false;
         if (this.w != 3) {
            if (this.w != 1 && this.F == -1) {
               this.v = 0;
               this.Q = (byte)(this.q < 7 ? (this.t > -1 ? 10 : 11) : (this.W ? 10 : 11));
               this.R = 28;
               this.Z = 0;
               this.H = true;
               this.X = false;
               this.z = this.y;
               this.B = this.A;
               this.J = this.I;
               this.L = this.K;
               return;
            }

            this.k = true;
            return;
         }

         this.s = 0;
         this.l(-1);
      }

      if (this.i == 1) {
         this.i = -1;
         if (this.ay == 1) {
            this.ay = 0;
            this.y = this.C;
            this.I = (byte)(this.k[0][0] - this.y);
            this.A = this.D;
            this.K = (byte)(this.k[1][0] - this.A);
            this.aK();
            this.A = true;
         }
      } else if (this.i == 3) {
         this.i = -1;
         if (this.q == 3) {
            this.a((byte)20, (byte)1, (byte)0);
         } else {
            this.v = 0;
            this.Q = 19;
            this.H = true;
            this.v = -1;
            this.Q = this.R = true;
            this.c = true;
            this.z = this.y;
            this.B = this.A;
            this.J = this.I;
            this.L = this.K;
            this.E();
            this.i();
         }
      }
   }

   private void X() {
      if (this.r) {
         if (this.s == 100) {
            if (this.O) {
               this.N = this.O;
               this.L = this.M = false;
               this.a.b();
            } else if (this.M) {
               this.L = this.M;
               this.a.b();
            }

            this.q[0] = (byte)(this.I + this.y);
            this.q[1] = (byte)(this.K + this.A);
            this.l(-1);
            return;
         }

         if (this.s < 0) {
            this.e[3131 + this.r] = this.e[8383 + this.q];
            this.e[3232 + this.r] = this.e[8444 + this.q];
            this.e[2828 + this.r] = (byte)(44 + -this.s - 1);
            this.e[6161 + this.r] = 3;
            return;
         }

         if (this.s <= 3) {
            this.n = 0;

            while (this.n < 29 && this.b[0][0][this.n] != 0) {
               this.n++;
            }

            this.b[0][1][this.n] = (byte)this.s;
            if (this.b[0][1][this.n] == 3) {
               this.b[0][0][this.n] = (byte)this.q;
               this.b[0][2][this.n] = (byte)(this.I + this.y);
               this.b[0][3][this.n] = (byte)(this.K + this.A);
               this.l(-1);
               return;
            }

            if (a(this.r) == 0) {
               this.b[0][0][this.n] = (byte)this.q;
               this.b[0][2][this.n] = (byte)this.r;
               return;
            }
         } else if (this.b(this.I + this.t, this.K + this.u) && this.a((byte)0, this.s, this.I + this.t, this.K + this.u, 1, false, -1) > 0) {
            this.l(-1);
            this.w = 2;
         }
      }
   }

   private void d(byte var1) {
      if (this.n > 1) {
         this.n = 0;
         this.B = this.I - 1;
         this.C = this.K - 1;
         this.D = this.O;
         this.E = this.P;
         this.u = true;
         this.t = true;
         this.aF();
         this.a(true, true, false, false);
         this.k = this.l = 0;
      } else {
         if (this.e[1919 + var1] > 0) {
            this.a(false, true, false, true);
            this.w = 1;
            this.k = this.l = var1;
            this.F = -1;
         }
      }
   }

   private void e(byte var1) {
      if (this.F != -1) {
         for (int var2 = 0; var2 < 50; var2++) {
            if (this.a[this.F][var2] > 0) {
               this.a(this.a[this.F][var2], var1);
            }
         }
      } else {
         this.a(this.k, var1);
      }

      this.n = 0;
   }

   private void a(byte var1, byte var2) {
      if (this.e[505 + var1] >= 10 || this.N || this.L && (this.e[7979 + var1] & 64) != 0) {
         if (b((int)var2) == 0 && this.e[8749 + -var2] == 6) {
            this.a(true, false, true, false);
            this.q = -var2;
            this.w = 2;
            this.Z();
         } else {
            if (this.n > 1 || this.e[3131 + var1] == this.y + this.I && this.e[3232 + var1] == this.A + this.K) {
               this.q = true;
               if (this.e[7777 + var1] == 0) {
                  this.e[7777 + var1] = 3;
                  this.a.b((int)var1);
                  if (this.e[7777 + var1] > 0) {
                     this.e[1111 + var1] = (byte)(
                        (this.e[1111 + var1] & 240)
                           + this.a[this.a[129 + (this.e[606 + var1] & 1) * 2]
                              + this.a[this.a[129 + (this.e[606 + var1] & 1) * 2 + 1] + this.e[1010 + var1] - 5]
                              + (this.e[1111 + var1] & 15)]
                     );
                  }
               }
            } else if (this.e[7777 + var1] > 0) {
               this.e[1111 + var1] = (byte)(
                  (this.e[1111 + var1] & 240)
                     + this.a[this.a[133 + (this.e[606 + var1] & 1) * 2]
                        + this.a[this.a[133 + (this.e[606 + var1] & 1) * 2 + 1] + this.e[1010 + var1] - 5]
                        + (this.e[1111 + var1] & 15)]
               );
               this.e[7777 + var1] = 0;
            }

            this.e[3131 + var1] = (byte)(this.y + this.I);
            this.e[3232 + var1] = (byte)(this.A + this.K);
            this.e[7979 + var1] = (byte)(this.e[7979 + var1] & 223);
            this.e[6161 + var1] = 2;
            this.e[4747 + var1] = var2;
            this.ab = (byte)(this.y + this.I);
            this.ac = (byte)(this.A + this.K);
            this.aa = (byte)((a((int)var2) == 1 || b((int)var2) == 1 || b((int)var2)) && this.a(this.y + this.I, (int)(this.A + this.K)) == 0 ? 2 : 1);
         }
      } else {
         this.a.a((byte)12, var1, 0);
      }
   }

   final void c(int var1) {
      for (int var2 = (var1 - 1) / 50 * 30 + 1; var2 <= (var1 - 1) / 50 * 30 + 30; var2++) {
         if (this.e[8810 + var2] == var1 && (this.e[8749 + var2] != 2 || this.e[8627 + var2] != 0)) {
            this.a(var2, false);
            this.e[8810 + var2] = 0;
            this.e[9298 + var2] = 0;
            return;
         }

         if ((this.e[8627 + var2] == 2 || this.e[8627 + var2] == 1) && this.e[9237 + var2] == var1) {
            this.e[9237 + var2] = 0;
         }
      }
   }

   final void a(int var1, boolean var2) {
      for (byte var3 = this.e[8993 + var1]; var3 > 0; var3 = this.e[4545 + var3]) {
         if ((this.e[4646 + var3] != 0 || var2)
            && (this.e[8749 + var1] != 11 || this.e[8627 + var1] != 0 || this.a[this.a[18] + this.e[6565 + var3]] == 0)
            && this.e[2929 + var3] != -108
            && this.e[2929 + var3] != this.a[this.a[173] + this.a[this.a[174] + this.e[8749 + var1]] + this.e[4646 + var3]]
            && this.e[2929 + var3] != this.a[this.a[176] + this.a[this.a[177] + this.e[8749 + var1]] + this.e[4646 + var3]]) {
            this.a(var3, var1, false, false);
         }
      }
   }

   private void f(byte var1) {
      if (this.e[8749 + var1] == 3 && this.e[4444 + this.a[0][17]] != var1) {
         this.r[0] = this.as = 0;
         this.l(4);
      } else {
         this.a(true, false, true, false);
         this.q = var1;
         this.w = 2;
         this.k = 0;
         this.Z();
      }
   }

   private void Y() {
      if (!this.B) {
         if (this.g) {
            if (this.y > this.C) {
               this.y--;
               return;
            }

            if (this.I > 0) {
               this.I--;
               this.af = -1;
               return;
            }

            if (this.y > 0) {
               this.y--;
               return;
            }
         } else if (this.h) {
            if (this.y < this.C) {
               this.y++;
               return;
            }

            if (this.I < this.c - this.O) {
               this.I++;
               this.af = 1;
               return;
            }

            if (this.I + this.y < this.c - 1 - 0) {
               this.y++;
               return;
            }
         } else if (this.e) {
            if (this.A > this.D) {
               this.A--;
               return;
            }

            if (this.K > 0 && !this.a[4] || this.K > 1 && this.a[4]) {
               this.K--;
               this.ag = -1;
               return;
            }

            if (this.A > 0) {
               this.A--;
               return;
            }
         } else if (this.f) {
            if (this.A < this.D) {
               this.A++;
               return;
            }

            if (this.K < this.d - this.P - 1 - (this.ba >> 5)) {
               this.K++;
               this.ag = 1;
               return;
            }

            if (this.K + this.A < this.d - 2 - 0 - (this.ba >> 5)) {
               this.A++;
            }
         }
      }
   }

   private void Z() {
      try {
         if (this.a[2] || this.a[5] || this.a[6]) {
            this.ar = 0;

            for (byte var1 = 0; var1 < this.r.length; var1++) {
               this.r[var1] = 0;
            }

            this.at = 99;
            if (this.a[2]) {
               this.aa();
               this.ab();
               this.ac();
            } else if (this.a[5]) {
               this.ad();
            } else {
               if (!this.a[6]) {
                  this.ah();
                  return;
               }

               int var4 = this.q > 1 ? 11 : (this.ai < 18 ? 3 : 6);

               for (byte var2 = 0; var2 < var4; var2++) {
                  this.r[var2] = this.a[this.a[137] + var2];
                  this.ar++;
               }
            }

            if (this.P) {
               for (; this.aX + this.aW > this.ar && this.as != 0; this.as--) {
                  if (this.aX > 0) {
                     this.aX--;
                  }
               }
            } else {
               this.as = 0;
               this.aX = 0;
               this.l = 0;
            }

            this.b[this.ad] = true;
            this.aW = aU;
            if (this.ar < this.aW) {
               this.aW = this.ar;
            }

            this.aZ = aV * this.aW;
            this.aY = (240 - this.aZ + 9) / 2;
            this.ai();
         }
      } catch (Exception var3) {
      }
   }

   private void aa() {
      if (this.e[8749 + this.q] == 0) {
         this.au = 0;

         while (this.a[0][this.au][11] != this.q) {
            this.au++;
         }

         this.av = -1;
         int var5 = this.e[9115 + this.q] - 1;

         for (byte var2 = this.a[this.a[144] + var5]; var2 < this.a[this.a[144] + var5 + 1]; var2++) {
            if (0 + this.a[this.a[143] + var2] >= 6 && this.av == -1) {
               this.av = (byte)(var2 - this.a[this.a[144] + var5]);
            }

            this.r[this.ar] = this.a[this.a[143] + var2];
            this.s[var2 - this.a[this.a[144] + var5]] = this.a[0][this.au][this.a[this.a[143] + var2]];
            this.ar++;
         }

         this.at = 9;
      } else if (this.e[8749 + this.q] == 6) {
         if (this.k > 0) {
            if (this.e[3636 + this.k] > 0) {
               this.r[this.ar] = 29;
               this.ar++;
            }
         } else if (this.F != -1) {
            for (byte var3 = 0; this.a[this.F][var3] != 0; var3++) {
               if (this.e[3636 + this.a[this.F][var3]] > 0) {
                  this.r[this.ar] = 29;
                  this.ar++;
                  break;
               }
            }
         }

         this.a[0][6] = (short)(this.a[0][3] / 5);
         if (this.a[0][6] > this.at) {
            this.a[0][6] = this.at;
         }

         for (byte var4 = 0; var4 < 6; var4++) {
            if (this.a[0][5 + var4] > 0) {
               this.r[this.ar] = var4;
               this.s[this.ar] = (byte)this.a[0][5 + var4];
               this.ar++;
            }
         }
      } else {
         if (this.e[8749 + this.q] == 8) {
            for (byte var1 = 0; var1 < this.e[9115 + this.q] * 2; var1++) {
               this.r[this.ar] = (byte)(19 + var1);
               this.ar++;
            }
         }
      }
   }

   private void ab() {
      for (byte var1 = 0; var1 < 8; var1++) {
         this.j[var1] = 0;
      }

      byte var5 = 0;
      int var2 = 0;
      if (this.e[8810 + this.q] > 0 && (this.e[8749 + this.q] != 2 || this.e[8627 + this.q] != 0)) {
         this.j[0] = this.e[8810 + this.q];
         var2++;
         var5 = 1;
      }

      for (byte var3 = this.e[8993 + this.q]; var3 > 0; var3 = this.e[4545 + var3]) {
         if (this.e[1313 + var3] > 0 && (this.e[8810 + this.q] != var3 || this.e[8749 + this.q] == 2 && this.e[8627 + this.q] == 0)) {
            this.j[var5 + this.e[4646 + var3]] = var3;
            var2++;
         }
      }

      byte var6 = 0;

      for (byte var4 = 0; var4 < var2; var4++) {
         while (this.j[var6] == 0) {
            var6++;
         }

         this.r[this.ar] = (byte)(-this.j[var6]);
         this.ar++;
         var6++;
      }
   }

   private void ac() {
      if (this.e[8627 + this.q] == 2) {
         this.r[this.ar] = 28;
         this.ar++;
      } else if (this.e[8627 + this.q] != 1 && this.e[8749 + this.q] < 12 && this.e[9115 + this.q] < this.f[this.e[8749 + this.q]]) {
         this.r[this.ar] = 16;
         this.ar++;
      }

      if (this.e[8627 + this.q] == 1) {
         this.r[this.ar] = 27;
         this.ar++;
      } else if (this.e[8505 + this.q] < this.e[8566 + this.q] && this.e[8749 + this.q] < 12) {
         this.r[this.ar] = 26;
         this.ar++;
      }

      this.r[this.ar] = 17;
      this.ar++;
   }

   private void ad() {
      if (!this.F) {
         if (this.q != 3) {
            this.r[this.ar] = 10;
            this.ar++;
         }

         this.r[this.ar] = (byte)(this.N ? 15 : 12);
         this.ar++;
         if (!this.N) {
            this.r[this.ar] = (byte)(this.L ? 14 : 11);
            this.ar++;
         }

         this.r[this.ar] = 13;
         this.ar++;
         this.r[this.ar] = (byte)(this.aq + 23);
         this.ar++;
      } else {
         for (this.aq = 1; this.aq <= 50; this.aq++) {
            if (this.e[1919 + this.aq] > 0 && this.e[1414 + this.aq] >= 12) {
               this.r[this.ar] = (byte)(-this.aq);
               this.ar++;
            }
         }

         if (!this.K) {
            for (this.aq = 1; this.aq <= 50; this.aq++) {
               if (this.e[1919 + this.aq] > 0 && this.e[1414 + this.aq] < 12) {
                  this.r[this.ar] = (byte)(-this.aq);
                  this.ar++;
               }
            }
         }

         this.a(false, false, false, true, true, false, false, false, false);
      }
   }

   private void ae() {
      if (this.n > 1) {
         this.n = 0;
      } else {
         if (this.g && this.j != 1) {
            if (this.as >= 0) {
               if (this.as > 0) {
                  this.as--;
               }

               if (this.as < this.aX) {
                  this.aX--;
               }

               this.V = false;
               this.ai();
               return;
            }
         } else if (this.h && this.j != 1) {
            if (this.as < this.ar - 1) {
               if (this.as >= this.aW - 1 && this.as - this.aX == this.aW - 1) {
                  this.aX++;
               }

               this.as++;
               this.V = false;
               this.ai();
               return;
            }
         } else if (this.e && this.S) {
            if (this.a[6]) {
               if (!this.Q) {
                  this.y--;
                  return;
               }
            } else if (this.s[this.as] < this.at) {
               this.s[this.as]++;
               this.a[0][this.au][this.r[this.as]] = this.s[this.as];
               return;
            }
         } else if (this.f && this.S) {
            if (this.a[6]) {
               if (!this.R) {
                  this.y++;
                  return;
               }
            } else if (this.s[this.as] > 0) {
               this.s[this.as]--;
               this.a[0][this.au][this.r[this.as]] = this.s[this.as];
               return;
            }
         } else {
            if (this.i || l) {
               this.i = false;
               l = false;
               this.v = false;
               this.E = 4;
               if (this.w == 4 && this.Y == 3) {
                  this.l(-2);
                  return;
               }

               if (this.Y == 4) {
                  return;
               }

               this.af();
               return;
            }

            if (m) {
               m = false;
               this.ah();
               return;
            }
         }
      }
   }

   private void af() {
      if (this.r[this.as] == 13) {
         this.aj();
      } else if (this.r[this.as] < 0) {
         if (this.F) {
            if (this.k == this.l) {
               if (this.c[this.e[101 + this.k]][this.e[0 + this.k]] != this.k) {
                  this.a(this.k, this.e[4444 + this.k], true, true);
               }

               if (this.K) {
                  this.a[0][17] = this.k;
                  this.K = false;
                  this.a.b((int)this.k);
               }

               this.d(this.k);
               this.F = false;
            }

            this.k = this.l;
         } else if (this.V) {
            this.a(this.l, this.q, true, true);
            this.V = false;
         } else {
            this.V = true;
            this.P = true;
         }

         this.f(this.e[4646 + this.l] >= 0 && this.e[2828 + this.l] != 92 && this.e[2828 + this.l] != 106 ? -this.e[4444 + this.l] : this.l, 0);
      } else if (this.a[6]) {
         this.aJ();
         this.l(0);
         this.s = this.a[this.a[138] + 416 + this.r[this.as]];
      } else if (this.r[this.as] == 17) {
         this.l(3);
      } else if (this.r[this.as] == 16 || this.r[this.as] == 26) {
         this.b(this.q, this.r[this.as] == 16);
         this.a(true, true, false, false);
         this.w = 0;
      } else if (this.r[this.as] == 27) {
         this.e[8566 + this.q] = this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]];
         if (this.e[8505 + this.q] > this.e[8566 + this.q]) {
            this.e[8505 + this.q] = this.e[8566 + this.q];
         }

         if (this.e[8505 + this.q] > this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]]) {
            this.e[8505 + this.q] = this.a[this.a[138] + (7 + this.e[9115 + this.q] - 1) * 26 + this.e[8749 + this.q]];
         }

         this.e[9054 + this.q] = (byte)(this.e[9054 + this.q] | 1);
         this.P = true;
      } else if (this.r[this.as] == 28) {
         this.e[9054 + this.q] = (byte)(this.e[9054 + this.q] | 1);
         this.P = true;
      } else if (this.r[this.as] == 10) {
         this.a(true, false, false, false, false, true, false, false, false);
         this.P = true;
      } else if (this.r[this.as] == 11) {
         this.M = true;
         this.l(2);
         this.s = 100;
         this.aJ();
      } else if (this.r[this.as] == 14) {
         this.L = false;
         this.M = false;
         this.a.c();
         this.P = true;
      } else if (this.r[this.as] == 12) {
         this.O = true;
         this.l(2);
         this.s = 100;
         this.aJ();
      } else if (this.r[this.as] == 15) {
         this.N = false;
         this.O = false;
         this.a.c();
         this.P = true;
      } else if (this.r[this.as] >= 23 && this.r[this.as] <= 25) {
         this.aq++;
         if (this.aq > 2) {
            this.aq = 0;
         }

         this.P = true;
      } else if (this.r[this.as] >= 6 && this.r[this.as] <= 8) {
         this.l(2);
         this.s = 20 + this.r[this.as] - 6;
      } else if (this.r[this.as] >= 6 && this.r[this.as] != 29) {
         if (this.r[this.as] >= 19 && this.w != 3) {
            this.l(this.r[this.as] == 22 ? 2 : 1);
            this.s = (byte)(this.r[this.as] - 19);
         }
      } else {
         this.ag();
      }
   }

   private void ag() {
      if (this.e[8749 + this.q] == 6) {
         byte var1 = 3;
         if (this.r[this.as] == 29) {
            var1 = 2;
         }

         if (this.k > 0) {
            this.e[3131 + this.k] = (byte)(this.y + this.I);
            this.e[3232 + this.k] = (byte)(this.A + this.K);
            this.e[2828 + this.k] = (byte)(44 + this.r[this.as]);
            this.e[6161 + this.k] = var1;
            this.a(false, true, false, true);
            this.w = 1;
         } else if (this.F == -1) {
            this.l(1);
            this.s = -this.r[this.as] - 1;
         } else {
            for (int var2 = 0; this.a[this.F][var2] > 0; var2++) {
               this.e[3131 + this.a[this.F][var2]] = (byte)(this.y + this.I);
               this.e[3232 + this.a[this.F][var2]] = (byte)(this.A + this.K);
               this.e[2828 + this.a[this.F][var2]] = (byte)(44 + this.r[this.as]);
               this.e[6161 + this.a[this.F][var2]] = var1;
            }

            this.a(true, true, false, false);
            this.w = 1;
         }

         this.l = this.k;
      }
   }

   private void ah() {
      if (!this.K) {
         this.P = false;
         if (this.w == 4) {
            this.l(-1);
         } else {
            if (this.k != 0) {
               this.w = 1;
               this.l = this.k;
               this.a(false, true, false, true);
            } else if (this.F != -1) {
               this.w = 1;
               this.a(true, true, false, false);
            } else {
               this.w = 0;
               this.a(true, true, false, false);
            }

            this.q = 0;
            this.F = false;
            this.i();
            this.V = false;
         }
      }
   }

   private void ai() {
      this.b[2] = true;
      if (this.ad == 6) {
         this.T = this.as > 0;
         this.U = this.as < this.ar - 1;
      } else {
         this.T = this.aX > 0;
         this.U = this.aX + this.aW < this.ar;
      }

      if (this.r[this.as] < 0) {
         this.l = (byte)(-this.r[this.as]);
         this.a(false, false, this.a[2], true, this.a[5], false, false, false, false);
      } else if (this.a[4]) {
         this.l = 0;
         this.a(true, false, true, false);
      }

      this.a[8] = false;
      this.a[7] = false;
      if (this.ad != 6 && (this.r[this.as] < 6 || this.r[this.as] > 8) && this.r[this.as] != 16) {
         if (this.r[this.as] >= 0 && this.r[this.as] < 6) {
            this.a[7] = this.b[7] = true;
         }
      } else {
         this.a[8] = this.b[8] = true;
      }
   }

   private void aj() {
      this.F = true;
      this.aX = this.as = 0;
      this.k = 0;

      while (this.e[1919 + this.l] <= 0) {
         this.l++;
      }

      this.P = true;
   }

   private void l(int var1) {
      this.Y = var1;
      if (this.Y > -1) {
         this.d[4] = (short)(33 + this.Y);
         this.k[4] = 1;
         this.x = this.w;
         this.c = new boolean[]{this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]};
         if (this.Y <= 5) {
            this.a(true, false, true, false);
         } else {
            this.a(this.a[0], false, true, this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]);
         }

         this.w = (byte)(this.Y >= 3 ? 4 : 3);
         this.b[2] = true;
      } else if (this.Y == -2) {
         this.c(this.q, true);
         this.d[4] = 0;
      } else {
         this.w = this.x;
         this.a(this.c[0], this.c[1], this.c[2], this.c[3], this.c[4], this.c[5], this.c[6], this.c[7], this.c[8]);
         this.d[4] = 0;
         if (this.s == 100) {
            this.ah();
         } else {
            this.P = true;
         }

         this.O = this.M = false;
      }

      this.s = 0;
   }

   final void d(int var1) {
      if (this.w == 2 && var1 == this.q) {
         this.P = true;
      }
   }

   final void b(int var1, boolean var2) {
      this.a.b((byte)var1);

      for (byte var3 = this.e[8993 + var1]; var3 > 0; var3 = this.e[4545 + var3]) {
         this.a(var3, var1, false, false);
      }

      this.e[8627 + var1] = (byte)(var2 ? 1 : 2);
      if (var2) {
         this.e[8566 + var1] = this.a[this.a[138] + (7 + this.e[9115 + var1]) * 26 + this.e[8749 + var1]];
      }
   }

   private void ak() {
      try {
         this.al();
         if (this.Q == 22 || this.Q == 23) {
            this.am();
         } else if (m) {
            m = false;
            this.an();
         } else if ((this.i || l || this.j) && this.aR <= 0 && this.aP == 0 && (this.Q < 28 || this.Q == 32)) {
            this.i = this.j = false;
            l = false;
            this.v = false;
            this.E = 4;
            if (this.Q == 32) {
               return;
            }

            this.ao();
         } else if (this.e) {
            this.aB();
         } else if (this.f) {
            this.aC();
         }

         this.aD();
      } catch (Exception var2) {
      }
   }

   private void al() {
      if (this.Q == 27 && (this.i || l)) {
         this.i = false;
         l = false;
         this.v = false;
         this.E = 4;
         this.i();
         this.Q = this.R;
         this.R = this.S;
         this.H = true;
         this.v = this.x;
         if (this.e > 0) {
            this.aQ();
         }
      }
   }

   private void am() {
      if (true) { this.T = 2; return; } 
      this.Q = this.R;
      this.H = true;
      if (this.T == 0) {
         this.g(this.q);
         if (this.Q == 18) {
            this.a(true, true, false, false);
            this.m = 0;
            this.Q = 28;
            this.b((int)this.a[this.a[303] + this.q]);
            this.Q = 18;
         }
      } else if (this.T == 1) {
         if (this.u > 0 && this.u < 41) {
            this.t++;
         }

         if (!this.e(this.q < 7 ? 1 : 2)) {
            if (this.q < 7) {
               this.t = -1;
            } else {
               this.W = false;
            }

            this.v = 66;
         } else {
            this.v = 67;
            this.e(0);
         }

         this.R = (byte)(this.q < 7 ? (this.t > -1 ? 10 : 11) : (this.W ? 10 : 11));
         this.A = true;
         this.v = 1;
         this.n();
         this.u();
         this.v = 0;
      } else {
         if (this.T == 2 && !this.d(this.q < 7 ? 1 : 2)) {
            this.R = this.Q;
            this.T = 0;
            this.Q = 23;
         }
      }
   }

   private void an() {
      if (this.Q == 32) {
         this.Q = this.U;
         this.H = true;
      } else {
         if (this.a[this.a[153] + 29 + this.Q] == 1) {
            if (this.Q == 25) {
               this.l(-1);
               this.P = false;
               this.I = false;
            }

            this.Q = 28;
         } else if (this.Q == this.U) {
            this.R = this.Q;
            this.Q = 30;
         } else if (this.Q == 20) {
            if (this.a[this.a[153] + 145 + 20] == 0) {
               this.z = this.y;
               this.B = this.A;
               this.J = this.I;
               this.L = this.K;
               this.Q = 28;
               this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
            }
         } else if (this.Q == 16 && this.v == 60) {
            this.T = 0;
            this.Q = 22;
            this.v = 69;
            this.R = 18;
         } else if (this.Q == 2) {
            this.Q = this.U;
            this.Z = 0;
         } else if (this.Q == this.V || this.Q == 9) {
            this.Q = 13;
            this.Z = 1;
         } else if (this.Q == 14) {
            this.b();
         } else if (this.a[this.a[153] + 58 + this.Q] == 1) {
            if (this.Q == 12) {
               this.e(0);
            }

            this.Q = this.R;
            this.R = this.S;
            this.Z = this.aa;
            this.m = 0;
            this.ac = true;
         } else if (this.a[this.a[153] + 58 + this.Q] > 1) {
            this.Q = this.a[this.a[153] + 58 + this.Q];
            this.R = this.S;
            this.Z = this.aa;
            this.m = 0;
         }

         this.H = true;
      }
   }

   private void ao() {
      byte var1 = this.a[this.a[151] + this.a[this.a[152] + this.Q] + this.Z];
      if (this.af) {
         this.V = 8;
         this.r = 4;
      }

      if (this.a[this.a[153] + 87 + this.Q] == 1) {
         this.Q = this.R;
      } else if (this.Q == 19) {
         this.z = this.y;
         this.B = this.A;
         this.J = this.I;
         this.L = this.K;
         this.Q = 28;
      } else if (this.Q == 20) {
         this.ap();
      } else if (this.Q == 18 || this.Q == 17) {
         this.b(-1);
      } else if (this.Q == 15) {
         this.aq();
      } else if (this.Q == 16) {
         this.ar();
      } else if (this.Q == 12) {
         this.as();
      } else if (this.Q == 13) {
         this.at();
      } else if (this.Q == this.V) {
         this.au();
      } else if (this.Q == 9) {
         this.q = this.a[this.a[249] + var1 - 25];
         this.T = 0;
         this.Q = 22;
         this.v = 69;
         this.R = 29;
      } else if (this.Q == 24) {
         this.av();
      } else if (this.Q == 25) {
         this.Z++;
         if (this.Z >= this.a[this.a[307] + this.m]) {
            this.Z = 0;
         }

         this.d[4] = (short)(33 + this.a[this.a[305] + this.a[this.a[306] + this.m] + this.Z]);
         this.b[2] = true;
      } else if (this.Q == 14) {
         a = (byte)this.Z;
         this.a.b(0);
         this.a.b(1);
         this.Q = 16;
      } else if (var1 == 6) {
         this.Q = 28;
      } else if (var1 == 0) {
         this.R = this.Q;
         this.Q = 2;
         this.aa = this.Z;
      } else if (var1 == 12) {
         this.q = 0;
         this.R = this.Q;
         if (this.s > -1) {
            this.Q = 3;
         } else {
            this.Q = 13;
            this.Z = 1;
         }

         this.aa = 0;
      } else if (var1 == 13) {
         this.aw();
      } else if (var1 == 10) {
         this.ax();
      } else if (var1 == 11) {
         this.Q = 31;
      } else if (var1 == 9) {
         this.ay();
      } else if (var1 == 5) {
         this.R = this.Q;
         this.Q = 30;
         this.aa = this.Z;
      } else if (var1 == 1) {
         this.az();
         this.a[this.a[153] + 116 + this.Q] = 4;
         this.m = 1;
         this.a.a(70);
      } else if (var1 == 3) {
         this.az();
         this.a[this.a[153] + 116 + this.Q] = 2;
         this.m = 0;
         this.a.a(74);
      } else if (var1 == 2) {
         this.R = this.Q;
         this.Q = 12;
         this.aa = this.Z;
         this.Z = 1;
         this.a[this.a[151] + this.a[this.a[152] + 12] + 1] = (byte)(17 + this.e / 2);
         this.a[this.a[151] + this.a[this.a[152] + 12] + 3] = (byte)(17 + this.l);
      } else if (var1 == 4) {
         this.Q = 32;
      } else if (var1 == 7) {
         this.aA();
      } else if (var1 == 8) {
         this.R = this.Q;
         this.Q = 16;
         this.aa = this.Z;
         this.v = 63;
      }

      this.H = true;
   }

   private void ap() {
      if (this.a[this.a[153] + 145 + 20] == 0) {
         if (this.ap != 14 && this.ap != 15) {
            this.f(this.an, 0);
         } else {
            this.e((int)this.am);
            this.f((int)this.am);
            this.a.v = this.am;
            this.a.u = 0;
            if (this.a.a(this.ap == 14 ? 4 : 2)) {
               this.e[6161 + this.am] = 2;
            }
         }

         this.aJ();
         if (this.w == 3) {
            this.l(-1);
            this.ah();
         } else {
            this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
         }
      } else {
         this.a(this.d[0], this.d[1], this.d[2], this.d[3], this.d[4], this.d[5], this.d[6], this.d[7], this.d[8]);
      }

      this.z = this.y;
      this.B = this.A;
      this.J = this.I;
      this.L = this.K;
      this.Q = 28;
      if (this.K) {
         this.o = 0;
         this.aJ();
         this.l(-1);
         this.P = false;
         this.a(true, false, false, false, true, false, false, false, false);
         this.w = 2;
         this.b[4] = true;
         this.Z();
         this.aj();
      }
   }

   private void aq() {
      if (this.m < 4) {
         if (this.m > 0) {
            if (this.m == 3) {
               this.a[this.a[153] + 116 + this.Q] = 2;
            }

            this.a.a(70 + this.m);
            this.v = 71;
            this.m++;
         } else {
            if (this.m == -1) {
               if (this.u == 41) {
                  this.aM();
                  if (this.q < 5) {
                     this.q++;
                     this.T = 0;
                     this.Q = 23;
                     this.v = 69;
                     this.R = 18;
                     this.s = this.a[this.a[248] + this.q];
                     if (this.r < this.s) {
                        this.r = this.s;
                     }

                     this.V = (byte)(4 + this.r);
                     this.e(0);
                  } else if (this.q == 6) {
                     this.c = -1;
                     this.Q = this.U;
                     this.b(59);
                     this.q++;
                     this.Q = 18;
                  } else {
                     this.c = -1;
                     this.Q = this.U;
                  }

                  this.Z = 0;
                  return;
               }

               if (this.q == 1 || this.q == 6) {
                  this.q--;
               }

               this.aM();
               this.R = this.U;
               this.Q = 16;
               this.v = 58;
               this.Z = 0;
               this.c = -1;
            }
         }
      }
   }

   private void ar() {
      if (this.v == 68) {
         this.b();
      } else if (this.v == 65) {
         this.aM();
         this.Q = this.U;
         this.Z = 0;
         this.c = -1;
         this.g = 0;
      } else if (this.v == 58) {
         this.T = 0;
         this.Q = 22;
         this.v = 69;
         this.R = (byte)(this.q < 7 ? 18 : 29);
      } else if (this.v == 59) {
         this.e = 2;
         this.ac = true;
         this.aQ();
         this.R = this.Q = this.U;
      } else if (this.v == 64) {
         this.T = 1;
         this.Q = 22;
         this.v = 69;
         this.R = 21;
      } else if (this.v == 63) {
         this.Q = 31;
      } else if (this.v == 60) {
         this.p = 1;
         this.T = 0;
         this.Q = 22;
         this.v = 69;
         this.R = 18;
      } else {
         if (this.v == 62) {
            this.s = -1;
            this.t = -2;
            this.Q = 13;
            this.R = 2;
            this.Z = 1;
            this.e(0);
         }
      }
   }

   private void as() {
      if (this.Z == 1) {
         this.e = (byte)(this.e == 0 ? 2 : 0);
         this.a[this.a[151] + this.a[this.a[152] + 12] + 1] = (byte)(17 + this.e / 2);
         if (this.a != null) {
            this.a.a(this.e);
         } else {
            this.aR();
            this.aQ();
         }
      } else {
         if (this.Z == 3) {
            this.l = this.l == 0 ? 1 : 0;
            this.a[this.a[151] + this.a[this.a[152] + 12] + 3] = (byte)(17 + this.l);
         }
      }
   }

   private void at() {
      this.b = (byte)(this.Z / 2);
      if (this.q >= 7) {
         this.Q = 9;
         this.d = this.b;
      } else {
         if (this.r == 0) {
            this.Q = 16;
            this.v = 60;
            this.p = 0;
            this.s = 0;
         } else {
            this.Q = this.V;
         }

         this.c = this.b;
         this.e(0);
      }

      this.Z = 0;
   }

   private void au() {
      this.q = this.a[this.a[249] + this.a[this.a[151] + this.a[this.a[152] + this.Q] + this.Z] - 25];
      this.s = this.a[this.a[248] + this.q];
      if (this.q == 0) {
         this.Q = 16;
         this.v = 60;
         this.p = 0;
      } else {
         this.T = 0;
         this.Q = 22;
         this.v = 69;
      }

      this.R = 18;
      this.e(0);
   }

   private void av() {
      this.Q = 15;
      this.Z = 0;
      this.a[this.a[153] + 116 + this.Q] = 0;
      this.a[this.a[153] + 145 + this.Q] = 2;
      this.a[this.a[153] + 58 + this.Q] = 0;
      this.a.a(75);
      this.v = 71;
      this.m = -1;

      for (int var1 = 0; var1 < 2; var1++) {
         for (int var2 = 0; var2 < 5; var2++) {
            this.a[var1][24] = (short)(this.a[var1][24] + this.a[var1][19 + var2] * this.a[this.a[112] + var2] / 10);
         }
      }
   }

   private void aw() {
      this.q = 7;
      this.R = this.Q;
      if (this.W) {
         this.Q = 3;
         this.Z = 0;
      } else if (this.r <= 0 && !this.af) {
         this.v = 70;
         this.Q = 21;
         this.Z = 0;
      } else {
         this.Q = 13;
         this.Z = 1;
      }

      this.aa = 1;
   }

   private void ax() {
      this.Z = 0;
      this.R = this.Q;
      if (this.q < 7) {
         if (this.s > -1) {
            this.Q = 16;
            this.v = 62;
         } else if (this.Q == 4) {
            this.Q = 16;
            this.v = 60;
            this.p = 0;
         } else {
            this.Q = this.V;
         }
      } else {
         this.Q = 13;
         this.Z = this.aa = 1;
      }
   }

   private void ay() {
      if (!this.X) {
         this.R = this.Q;
         this.Q = 16;
         this.v = 65;
      } else {
         this.aM();
         this.Q = this.U;
         this.Z = 0;
         this.c = -1;
         this.g = 0;
      }
   }

   private void az() {
      this.R = this.Q;
      this.Q = 15;
      this.aa = this.Z;
      this.v = 71;
      this.a[this.a[153] + 145 + this.Q] = 0;
      this.a[this.a[153] + 58 + this.Q] = 1;
   }

   private void aA() {
      this.R = this.Q;
      this.aa = this.Z;
      this.X = true;
      if (this.q < 7 ? this.t <= -1 : !this.W) {
         this.T = 1;
         this.Q = 22;
         this.v = 69;
         this.R = 21;
      } else {
         this.Q = 16;
         this.v = 64;
      }
   }

   private void aB() {
      if (this.a[this.a[153] + 174 + this.Q] == 1) {
         if (!this.Q) {
            this.y--;
            return;
         }
      } else {
         if (this.Q == 12) {
            this.Z--;
         } else if (this.Q == 13 && this.Z == 1) {
            this.Z--;
         }

         this.Z = this.Z > 0 ? this.Z - 1 : this.ab - 1;
      }
   }

   private void aC() {
      if (this.a[this.a[153] + 174 + this.Q] == 1) {
         if (!this.R) {
            this.y++;
            return;
         }
      } else {
         this.Z = this.Z < this.ab - 1 ? this.Z + 1 : 0;
         if (this.Q == 12) {
            this.Z = this.Z / 2 * 2 + 1;
            return;
         }

         if (this.Q == 13 && this.Z == 0) {
            this.Z++;
         }
      }
   }

   private void aD() {
      if (this.Q == 31) {
         if (this.t < this.s && this.q < 7) {
            this.q = this.s;
            if (this.q >= 1) {
               this.q++;
            }

            this.T = 0;
            this.Q = 22;
            this.v = 69;
            this.R = 18;
         } else {
            this.T = 2;
            this.Q = 22;
            this.v = 69;
            this.R = 28;
         }

         this.b = this.c;
      }

      if (this.Q == 28) {
         this.a(this.a[0], this.a[1], this.a[2], this.a[4], this.a[5], this.a[6], this.a[7], this.a[8], this.a[9]);
         this.c = false;
         this.y = this.z;
         this.A = this.B;
         this.I = this.J;
         this.K = this.L;
         this.A = true;
         this.v = 1;
         this.i();
      } else if (this.Q == 19) {
         this.Y();
         this.E();
      } else if (this.Q == 30) {
         this.Q = 16;
         this.v = 68;
         this.H = true;
      } else {
         if (this.Q == 29) {
            this.a(true, true, false, false);
            this.A = true;
            this.Q = 28;
         }
      }
   }

   private void aE() {
      this.F++;
      if (this.F > 4) {
         this.u = true;
         this.t = false;
         this.F = 0;
         this.F = 4;
         this.k = 0;
         this.a(true, true, false, false);
         this.q = 0;
         this.G = this.y + this.I;
         this.H = this.A + this.K;
         this.aI();
      }
   }

   private void aF() {
      // Añade esto al inicio de F():
    if (this.Q == 18 || this.Q == 19 || this.Q == 22 || this.Q == 23 || this.Q == 31 || this.Q == 32) {
        this.Q = 28; // Te devuelve al juego
        this.v = 1;
        this.H = true;
        this.i();
        return;
    }
    
      this.u = false;
      this.t = false;
      this.aI();
      this.L = 0;

      for (this.K = this.C + 1; this.K <= this.C + this.E; this.K++) {
         for (this.J = this.B + 1; this.J <= this.B + this.D; this.J++) {
            this.H = this.c[this.K][this.J];
            if (this.H >= 1 && this.H <= 50 && this.e[1919 + this.H] > 0) {
               if (this.L < 50) {
                  this.a[4][this.L] = this.H;
                  this.e[909 + this.H] = 4;
               }

               this.L++;
            }
         }
      }

      if (this.a[4][0] == 0) {
         this.w = 0;
         this.k = 0;
         this.F = -1;
      } else if (this.a[4][1] == 0) {
         this.e[909 + this.a[4][0]] = 0;
         this.d(this.a[4][0]);
         this.a[4][0] = 0;
         this.F = -1;
      } else {
         this.F = 4;
         this.w = 1;
         this.M = this.L;
         if (this.M > 50) {
            this.M = 50;
         }
      }

      this.B = this.C = this.D = this.E = 0;
   }

   private void aG() {
      this.w = false;
      this.I = 0;
      switch (this.i) {
         case 7:
            this.G = 2;
            break;
         case 9:
            this.G = 3;
            break;
         default:
            return;
      }

      for (this.L = 0; this.L < 50; this.L++) {
         this.H = this.F != -1 ? this.a[this.F][this.L] : (this.L == 0 ? this.k : 0);
         this.a[0][this.L] = this.H;
         this.e[909 + this.a[this.G][this.L]] = 0;
         this.a[this.G][this.L] = 0;
      }

      for (this.L = 0; this.L < 50; this.L++) {
         this.H = this.a[0][this.L];
         if (this.H != 0) {
            this.e((int)this.H);
            this.a[this.G][this.L] = this.H;
            this.e[909 + this.H] = this.G;
         }
      }

      this.w = 1;
      this.F = this.G;
      this.k = 0;
      this.a(true, true, false, false);
   }

   private void aH() {
      this.w = false;
      this.I = 0;
      switch (this.i) {
         case 7:
            this.G = 2;
            break;
         case 9:
            this.G = 3;
            break;
         default:
            return;
      }

      if (this.F == this.G) {
         this.f(this.a[this.F][0], 0);
      } else {
         if (this.a[this.G][0] != 0) {
            this.F = this.G;
            this.aI();
            this.M = 0;

            for (this.L = 0; this.L < 50; this.L++) {
               if (this.a[this.F][this.L] != 0) {
                  this.e[909 + this.a[this.F][this.L]] = this.F;
                  this.M++;
               }
            }

            this.w = 1;
            this.k = 0;
            this.a(true, true, false, false);
         }
      }
   }

   final void e(int var1) {
      for (int var5 = 0; var5 < 5; var5++) {
         byte var6;
         if ((var6 = var5 < 4 ? this.a[this.a[125] + var5] : 4) != -1) {
            for (int var4 = 0; var4 < 50; var4++) {
               if (this.a[var6][var4] == var1) {
                  while (var4 < 50) {
                     this.a[var6][var4] = var4 < 49 ? this.a[var6][var4 + 1] : 0;
                     var4++;
                  }

                  if (this.a[var6][0] == 0 && this.F == this.e[909 + var1]) {
                     if (this.w == 1) {
                        this.w = 0;
                     }

                     this.F = -1;
                  }

                  this.e[909 + var1] = 0;
                  return;
               }
            }
         }
      }
   }

   private void aI() {
      for (int var1 = 0; var1 < 50; var1++) {
         if (this.a[4][var1] != 0) {
            this.e[909 + this.a[4][var1]] = 0;
            this.a[4][var1] = 0;
         }
      }
   }

   private void aJ() {
      if (this.u) {
         this.u = false;
         this.F = -1;
         this.k = 0;
         this.B = this.C = this.D = this.E = 0;
      }
   }

   private void aK() {
      this.y = this.C;
      this.A = this.D;

      while (this.I < 0) {
         this.I++;
      }

      while (this.K < 0 && !this.s) {
         this.K++;
      }

      while (this.I + this.O > this.c - 1) {
         this.I--;
      }

      while (this.K + this.P >= this.d - 1) {
         this.K--;
      }
   }

   private void aL() {
      if (this.w) {
         this.I++;
         if (this.I > 10) {
            this.w = false;
            this.I = 0;
         }
      }
   }

   private static byte a(int var0) {
      if (var0 >= 1 && var0 <= 50) {
         return 0;
      } else {
         return (byte)(var0 >= 51 && var0 <= 100 ? 1 : 2);
      }
   }

   final byte a(byte var1, byte var2, byte var3, byte var4, byte var5) {
      byte var7 = (byte)(1 + var1 * 50);
      byte var6 = 0;

      while (this.e[1919 + var7 + var6] != 0) {
         var6++;
      }

      if (var6 >= 50) {
         return -1;
      }

      var6 = (byte)(var6 + var7);
      if (this.F) {
         this.P = true;
      }

      this.e[0 + var6] = this.e[6262 + var6] = this.e[3131 + var6] = var2;
      this.e[101 + var6] = this.e[6363 + var6] = this.e[3232 + var6] = var3;
      this.e[202 + var6] = this.e[303 + var6] = 0;
      this.e[808 + var6] = 0;
      this.e[909 + var6] = 0;
      this.e[1111 + var6] = 0;
      this.e[4949 + var6] = (byte)(4 + (var5 & 7));
      this.e[606 + var6] = 3;
      this.e[1313 + var6] = 0;
      this.e[1414 + var6] = var4;
      this.e[1616 + var6] = (byte)((var5 & 7) * 2 + this.a(255, (int)2));
      this.e[1717 + var6] = (byte)((var5 & 7) * 2 + this.a(255, (int)2));
      this.e[1818 + var6] = (byte)(3 + (var5 & 7));
      this.e[2020 + var6] = (byte)(50 + 25 * (1 - var1) + this.a(255, (int)25));
      this.e[2121 + var6] = (byte)(50 + 25 * (1 - var1) + this.a(255, (int)25));
      this.e[505 + var6] = (byte)(50 + 25 * (1 - var1) + this.a(255, (int)25));
      int var8 = (var5 & 32) != 0 ? 3 : 0;
      int var9 = this.a(255, (int)3);
      int var10 = this.a(255, (int)3);
      this.e[6969 + var6] = (byte)(var9 == 0 ? 2 + this.a(255, (int)(2 + var8)) : 1);
      this.e[7070 + var6] = (byte)(var9 == 1 ? 2 + this.a(255, (int)(2 + var8)) : 1);
      this.e[7272 + var6] = (byte)(var9 == 2 ? 2 + this.a(255, (int)(2 + var8)) : 1);
      this.e[7171 + var6] = (byte)(var10 == 0 ? 2 + this.a(255, (int)(2 + var8)) : 1);
      this.e[7373 + var6] = (byte)(var10 == 1 ? 2 + var1 + this.a(255, (int)(2 + var8)) : 1 + var1);
      this.e[7474 + var6] = (byte)(var10 == 2 ? 2 + this.a(255, (int)(2 + var8)) : 1);
      this.e[7575 + var6] = (byte)(1 + (var5 >> 3 & 3) * 3 + this.a(255, (int)3));
      this.e[6464 + var6] = 69;
      this.e[3434 + var6] = -1;
      this.e[3535 + var6] = 0;
      this.e[3636 + var6] = 0;
      this.e[3737 + var6] = (byte)(2 + this.a(255, (int)2));
      this.e[3838 + var6] = var6;
      this.e[4545 + var6] = 0;
      this.e[4646 + var6] = -1;
      this.e[4747 + var6] = var6;
      this.e[4848 + var6] = 0;
      int var11 = 0;
      int var12 = 0;
      var11 = this.a(255, (int)3);
      var12 = this.a(15, (int)4);
      this.e[5151 + var6] = (byte)(var12 << 2 | var11);
      if ((this.a[var1][12] <= this.a[var1][13] || this.aw == 0) && this.aw != 1) {
         this.e[1515 + var6] = 0;
         this.a[var1][12]++;
      } else {
         this.e[1515 + var6] = 1;
         this.a[var1][13]++;
      }

      if (var4 < 12) {
         this.e[2828 + var6] = 17;
         this.e[2929 + var6] = 14;
         this.e[6767 + var6] = this.e[1919 + var6] = (byte)(5 + this.a(255, (int)10));
         this.e[1010 + var6] = 8;
      } else {
         this.e[2828 + var6] = 69;
         this.e[2929 + var6] = 8;
         this.e[6767 + var6] = this.e[1919 + var6] = (byte)((this.q == 0 && var1 == 1 ? 20 : 40) + (this.e[1515 + var6] - 1) * -10 + this.a(255, (int)15));
         this.e[1010 + var6] = (byte)((var5 & 7) == 0 ? 8 : 9 - (var5 & 7));
      }

      this.e[4444 + var6] = var6;
      this.e[6565 + var6] = 9;
      if ((var5 & 64) != 0) {
         this.e[6565 + var6] = (byte)this.a(255, (int)(4 + var1 * 2));
      }

      if (this.q == 3) {
         this.e[6565 + var6] = 0;
      }

      if ((this.q == 4 || this.q == 5) && this.e[6565 + var6] == 1) {
         this.e[6565 + var6] = 3;
      }

      this.e[3333 + var6] = -1;
      this.e[7979 + var6] = this.e[8282 + var6] = 0;
      this.e[8080 + var6] = 0;
      this.e[2222 + var6] = this.e[2323 + var6] = this.e[2424 + var6] = this.e[2525 + var6] = this.e[2626 + var6] = 0;
      this.g((int)var6);
      this.b(var6);
      if (this.c[var3][var2] == 0) {
         this.c[var3][var2] = var6;
      }

      if (!this.s) {
         this.a[var1][11]++;
         if (var1 == 0) {
            this.a((byte)1, var2, var3, var6);
         }

         this.a[var1][19]++;
      }

      if (var1 == 0) {
         this.a.a(this.e[0 + var6], this.e[101 + var6], this.e[4949 + var6]);
      }

      return var6;
   }

   final void a(byte var1) {
      byte var2 = (byte)((var1 - 1) / 50);
      int var3 = this.e[0 + var1] + this.a[this.a[1] + this.e[606 + var1]];
      int var4 = this.e[101 + var1] + this.a[this.a[1] + 8 + this.e[606 + var1]];
      if ((this.e[2929 + var1] & 255) <= 7
         && (this.e[1111 + var1] & 15) < (this.a[this.a[15] + (this.e[606 + var1] & 1) * 9 + this.e[1010 + var1] - this.e[7777 + var1]] + 1) / 2
         && this.c[var4][var3] == -128) {
         this.c[var4][var3] = (byte)(this.e[4545 + var1] >= 111 ? -this.e[4545 + var1] : 0);
      }

      this.e((int)var1);
      this.f((int)var1);
      this.e[1919 + var1] = -1;
      this.c((int)var1);
      if (this.F || var1 == this.e[8810 + this.q]) {
         this.P = true;
      }

      if (!this.s) {
         if (var2 == 0) {
            this.a((byte)3, this.e[0 + var1], this.e[101 + var1], var1);
         }

         this.a[1 - var2][22]++;
      }
   }

   private void f(int var1, int var2) {
      this.J = this.I;
      this.L = this.K;
      if (var1 > 100) {
         this.I = (byte)(this.e[9359 + var1 - 101] - this.C);
         this.K = (byte)(this.e[9381 + var1 - 101] - this.D + var2);
      } else if (var1 > 0) {
         this.I = (byte)(this.e[0 + var1] - this.C);
         this.K = (byte)(this.e[101 + var1] - this.D + var2);
      } else if (var1 == -100) {
         this.I = (byte)(this.I - this.C);
         this.K = (byte)(this.K - (this.D - var2));
      } else {
         if (var1 >= 0) {
            return;
         }

         this.I = (byte)(this.e[8383 + -var1] + (this.a[this.a[138] + 104 + this.e[8749 + -var1]] >> 1) - this.C);
         this.K = (byte)(this.e[8444 + -var1] + (this.a[this.a[138] + 130 + this.e[8749 + -var1]] >> 1) - this.D + var2);
      }

      this.aK();
      this.A = true;
   }

   final void b(int var1, int var2) {
      for (byte var3 = 1; var3 <= 50; var3++) {
         if (this.e[1919 + var3] > 0) {
            this.c[this.e[101 + var3]][this.e[0 + var3]] = 0;
         }
      }

      for (byte var4 = 1; var4 <= 50; var4++) {
         if (this.e[1919 + var4] > 0) {
            if (this.c[var2][var1] != 0) {
               this.a.v = 0;
               this.a.a(1, 127, var1, var2);
               var1 = this.e[3131];
               var2 = this.e[3232];
            }

            if ((this.e[2929 + var4] & 255) <= 7
               && (this.e[1111 + var4] & 15) < (this.a[this.a[15] + (this.e[606 + var4] & 1) * 9 + this.e[1010 + var4] - this.e[7777 + var4]] + 1) / 2
               && this.c[this.e[101 + var4] + this.a[this.a[1] + 8 + this.e[606 + var4]]][this.e[0 + var4] + this.a[this.a[1] + this.e[606 + var4]]] == -128) {
               this.c[this.e[101 + var4] + this.a[this.a[1] + 8 + this.e[606 + var4]]][this.e[0 + var4] + this.a[this.a[1] + this.e[606 + var4]]] = 0;
            }

            this.e[0 + var4] = this.e[6262 + var4] = this.e[3131 + var4] = (byte)var1;
            this.e[101 + var4] = this.e[6363 + var4] = this.e[3232 + var4] = (byte)var2;
            this.e[202 + var4] = this.e[303 + var4] = 0;
            this.e[808 + var4] = 0;
            this.e[2828 + var4] = 69;
            this.e[2929 + var4] = 8;
            this.e[3030 + var4] = 0;
            this.e[6161 + var4] = 0;
            this.c[this.e[101 + var4]][this.e[0 + var4]] = var4;
            this.a.a(this.e[0 + var4], this.e[101 + var4], this.e[4949 + var4]);
         }
      }
   }

   final void f(int var1) {
      if (this.k == var1) {
         this.k = 0;
         if (this.w == 1) {
            this.w = 0;
            this.l = 0;
            this.a(true, true, false, false);
            return;
         }

         if (this.w == 2 && this.e[8749 + this.q] == 6) {
            this.w = 0;
            this.a(true, true, false, false);
         }
      }
   }

   final void b(byte var1) {
      byte var2 = 2;
      if (var1 >= 51) {
         var2 = (byte)(var1 == 51 ? 4 : 3);
      } else if (this.e[1414 + var1] < 12) {
         var2 = 0;
      } else if (this.e[1414 + var1] < 35) {
         var2 = 1;
      }

      this.e[2727 + var1] = (byte)(
         this.a[this.a[189] + this.e[1515 + var1] * 10 + var2 * 2] + this.a((int)255, (int)this.a[this.a[189] + this.e[1515 + var1] * 10 + var2 * 2 + 1])
      );
      if (var1 == this.l) {
         this.b[4] = this.a[4];
      }
   }

   final void g(int var1) {
      this.e[6868 + var1] = var1 == 51 || var1 == 52
         ? -2
         : (var1 > 51 ? -1 : (byte)((var1 > 3 ? 1 + this.a(65535, (int)58) : var1) % 60 + 60 * this.e[1515 + var1] - 1));
   }

   private static byte b(int var0) {
      if (var0 <= -1 && var0 >= -30) {
         return 0;
      } else {
         return (byte)(var0 <= -31 && var0 >= -60 ? 1 : 2);
      }
   }

   final byte a(byte var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      byte var8 = this.a[this.a[138] + 104 + var2];
      byte var9 = this.a[this.a[138] + 130 + var2];
      byte var11 = (byte)(1 + var1 * 30);
      byte var10 = 0;

      try {
         while (this.e[8505 + var11 + var10] != 0) {
            var10++;
         }

         if (var10 >= 30) {
            if (var1 == 0) {
               this.s = 100;
               this.l(-1);
               this.u[0] = 0;
               this.a((byte)10, (byte)0, (byte)0, (byte)0);
            }

            return -1;
         } else {
            var10 = (byte)(var10 + var11);
            if (var7 == -1) {
               if (!this.a(var2, var3, var4, !var6)) {
                  return -2;
               }
            } else {
               var10 = (byte)var7;
            }

            if (var2 >= 20 && var2 <= 22) {
               if (var7 == -1) {
                  var10 = 0;

                  while (var10 < 30 && this.f[0][var10] != 0) {
                     var10++;
                  }
               } else {
                  var10 = (byte)var7;
               }

               if (var10 == 30) {
                  return -1;
               }

               this.f[0][var10] = (byte)this.q;
               this.f[2][var10] = (byte)var3;
               this.f[3][var10] = (byte)var4;
               this.f[1][var10] = (byte)var2;
               if (!var6) {
                  this.a[0][this.au][6 + this.s - 20]++;
                  this.c[var4][var3] = (byte)(var1 == 0 ? -123 : -126);
               } else {
                  this.c[var4][var3] = (byte)(20 - var2 - 111 - var1 * 6);
               }

               this.c(var3, var4, 1, 1);
               return var10;
            } else {
               if (var2 == 0) {
                  byte var12 = 0;

                  while (this.a[var1][var12][11] != 0) {
                     if (++var12 > 10) {
                        return -1;
                     }
                  }

                  this.a[var1][var12][11] = var10;
               }

               this.c(var3, var4, var8, var9);
               this.e[8383 + var10] = (byte)var3;
               this.e[8444 + var10] = (byte)var4;
               this.e[8749 + var10] = (byte)var2;
               this.e[8871 + var10] = 0;
               this.e[9176 + var10] = 0;
               this.e[8932 + var10] = 0;
               this.e[8993 + var10] = 0;
               this.e[9054 + var10] = 0;
               if (var5 == 0) {
                  var5 = this.a[this.a[113] + (this.q < 2 ? 0 : (this.q == 2 ? 12 : 24)) + var2];
               }

               this.e[9115 + var10] = (byte)var5;
               this.e[8810 + var10] = 0;
               this.e[8688 + var10] = 5;
               this.e[8627 + var10] = 0;
               this.e[8505 + var10] = this.e[8566 + var10] = this.a[this.a[138] + 182 + var2];
               if (var2 >= 12 && var2 <= 19) {
                  if (!this.a.a(var10)) {
                     if (var1 == 0) {
                        this.s = 100;
                        this.l(-1);
                        this.u[0] = 0;
                        this.a((byte)10, (byte)0, (byte)0, (byte)0);
                     }

                     this.e[8505 + var10] = 0;
                     return -1;
                  }

                  this.e[9237 + var10] = (byte)(var1 == 0 ? this.r[this.as] : this.a.v);
                  this.e[8566 + var10] = this.a[this.a[138] + 182 + this.e[9237 + var10]];
                  this.e[9115 + var10] = 3;
               } else if (var1 == 0) {
                  this.a
                     .a(
                        this.e[8383 + var10] + this.a[this.a[138] + 104 + this.e[8749 + var10]] / 2,
                        this.e[8444 + var10] + this.a[this.a[138] + 130 + this.e[8749 + var10]] / 2,
                        this.e[8688 + var10] & 15
                     );
               }

               for (int var17 = 0; var17 < var9; var17++) {
                  for (int var13 = 0; var13 < var8; var13++) {
                     this.c[var4 + var17][var3 + var13] = (byte)(-var10);
                  }
               }

               if (var2 == 2) {
                  this.a[var1][16] = (short)(this.a[var1][16] + 4);
                  if (this.a[var1][16] > 50) {
                     this.a[var1][16] = 50;
                  }
               }

               if (!this.s && var7 == -1) {
                  this.a[var1][14]++;
                  this.a[var1][20]++;
               }

               if (var2 == 2) {
                  this.a.a((int)var10);
               }

               if (var6 && var1 == 0) {
                  this.a((byte)5, (byte)var3, (byte)var4, (byte)0);
               }

               return var10;
            }
         }
      } catch (Exception var14) {
         return -1;
      }
   }

   final void c(int var1, boolean var2) {
      byte var3 = this.e[8749 + var1];
      byte var4 = this.e[8383 + var1];
      byte var5 = this.e[8444 + var1];
      byte var6 = this.a[this.a[138] + 104 + var3];
      byte var7 = this.a[this.a[138] + 130 + var3];
      int var8 = var1 < 31 ? 0 : 1;
      if (var3 == 2) {
         this.a.a(var1);
      }

      try {
         if (var2) {
            this.f(var1 == 1 ? -1 : 0, 0);
            this.e[8505 + var1] = -1;
            this.a(var1, (int)3);

            for (byte var14 = this.e[8993 + var1]; var14 > 0; var14 = this.e[4545 + var14]) {
               this.a(var14, var1, true, false);
            }

            if (this.e[8810 + var1] > 1 && (this.e[8749 + var1] != 2 || this.e[8627 + var1] != 0)) {
               this.a(this.e[8810 + var1], var1, true, false);
            }

            if ((this.w == 2 || this.w == 4) && var1 == this.q) {
               this.w = 0;
               this.q = 0;
               this.a(true, true, false, false);
               return;
            }
         } else {
            this.e[8505 + var1] = 0;
            this.e[8627 + var1] = 3;

            for (int var9 = 0; var9 < var7; var9++) {
               for (int var10 = 0; var10 < var6; var10++) {
                  this.c[var5 + var9][var4 + var10] = 0;
               }
            }

            if (var3 == 2) {
               this.a[var8][16] = (short)(this.a[var8][16] - 4);
               if (this.a[var8][16] < 0) {
                  this.a[var8][16] = 1;
               }

               for (int var12 = var8 * 50 + 1; var12 <= (var8 + 1) * 50; var12++) {
                  if (this.e[3434 + var12] == var1) {
                     this.e[3434 + var12] = 0;
                  }
               }
            }

            if (!this.s) {
               this.a[var8][14]--;
               this.a[1 - var8][21]++;
            }

            if (var3 == 0) {
               byte var13 = 0;

               while (this.a[var8][var13][11] != var1) {
                  if (++var13 >= 10) {
                     var13--;
                     break;
                  }
               }

               this.a[var8][var13][11] = 0;
            }

            this.a.c(var1);
            if (var8 == 0) {
               this.a((byte)8, (byte)var4, (byte)var5, (byte)0);
            }
         }
      } catch (Exception var11) {
      }
   }

   private boolean a(int var1, int var2, int var3, boolean var4) {
      byte var5 = this.a[this.a[138] + 104 + var1];
      byte var6 = this.a[this.a[138] + 130 + var1];
      boolean var7 = true;

      for (int var8 = 0; var8 < var6; var8++) {
         for (int var9 = 0; var9 < var5; var9++) {
            if (!this.b(var2 + var9, var3 + var8) || this.c[var3 + var8][var2 + var9] != 0 || var4 && this.a(var2 + var9, (int)(var3 + var8)) != 0) {
               var7 = false;
            }
         }
      }

      return var7;
   }

   private void a(int var1, int var2, boolean var3, boolean var4) {
      if (this.e[2828 + var1] == 93 || this.e[2828 + var1] == 92 || this.e[2828 + var1] == 106) {
         var3 = true;
      }

      if (this.e[8810 + var2] != var1 || this.e[8749 + var2] == 2 && this.e[8627 + var2] == 0) {
         if (!var3
            || this.e[8627 + var2] == 0 && (this.e[8749 + var2] == 2 || this.e[8749 + var2] == 7 || this.e[8749 + var2] == 4 || this.e[8749 + var2] == 8)) {
            this.e[2828 + var1] = 87;
            this.e[6161 + var1] = 3;
            return;
         }

         this.e[6161 + var1] = 2;
      } else {
         if (var3) {
            this.e[8810 + var2] = 0;
         }

         label42: {
            this.d(var2);
            if (this.c[this.e[101 + var1]][this.e[0 + var1]] != var1) {
               if (var3) {
                  this.e[6161 + var1] = 2;
                  break label42;
               }

               this.e[2828 + var1] = 87;
            } else {
               this.e[3131 + var1] = this.e[0 + var1];
               this.e[3232 + var1] = this.e[101 + var1];
               if (var3) {
                  this.e[6262 + var1] = this.e[0 + var1];
                  this.e[6363 + var1] = this.e[101 + var1];
               }

               this.e[2828 + var1] = 69;
               if (var3) {
                  this.e[6161 + var1] = 2;
                  this.e[4747 + var1] = 0;
                  break label42;
               }
            }

            this.e[6161 + var1] = 3;
         }

         if (var4) {
            this.a(var2, false);
            return;
         }
      }
   }

   final void h(int var1) {
      this.f(var1);
      this.e(var1);
   }

   final byte a(int var1, byte var2) {
      byte var4 = 1;
      byte var5 = 0;
      if (var1 >= 51) {
         var4 = 31;
         var5 = 1;
      }

      while (var4 < 30) {
         if (this.e[8810 + var4 + 0] == var1) {
            var4 = (byte)(var4 + 0);
            break;
         }

         var4++;
      }

      byte var3;
      for (var3 = 0; var3 < 30; var3++) {
         if (this.b[var5][0][var3] == var4) {
            this.b[var5][4][var3] = var2;
            break;
         }
      }

      return var3;
   }

   private static boolean b(int var0) {
      return var0 >= 101 && var0 <= 122;
   }

   final void b(int var1, int var2, int var3, int var4) {
      byte var5;
      for (var5 = 0; var5 < 22; var5++) {
         if (this.e[9513 + var5] == 0) {
            if (this.q != 3) {
               this.t[var4]++;
            }
            break;
         }
      }

      this.e[9513 + var5] = this.a[this.a[180] + var1];
      this.e[9535 + var5] = (byte)var1;
      this.e[9359 + var5] = this.e[9645 + var5] = (byte)var2;
      this.e[9381 + var5] = this.e[9667 + var5] = (byte)var3;
      this.e[9403 + var5] = this.e[9425 + var5] = 0;
      this.e[9711 + var5] = this.e[9689 + var5] = 0;
      this.e[9601 + var5] = 0;
      this.e[9491 + var5] = (byte)this.a(255, (int)8);
      this.e[9469 + var5] = (byte)var4;
      this.e[9557 + var5] = this.a[this.a[184] + var1];
      this.e[9579 + var5] = 0;
      this.e[9447 + var5] = 0;
      this.c[var3][var2] = (byte)(101 + var5);
   }

   private static boolean c(int var0) {
      return var0 <= -61 && var0 >= -110;
   }

   final void a(int var1, int var2, int var3, byte var4) {
      byte var5 = 0;

      while (var5 < 50 && this.e[9833 + var5] != 0) {
         var5++;
      }

      if (var5 == 50) {
         var5 = 0;

         while (this.e[9833 + var5] != 6 || this.e[9833 + var5] != 7) {
            var5++;
         }

         this.c[this.e[9783 + var5]][this.e[9733 + var5]] = 0;
      }

      this.e[9833 + var5] = (byte)var1;
      this.e[9733 + var5] = (byte)var2;
      this.e[9783 + var5] = (byte)var3;
      this.e[9883 + var5] = var4;
      this.c[var3][var2] = (byte)(-61 - var5);
   }

   private static byte c(int var0) {
      if (var0 <= -111 && var0 >= -116) {
         return 0;
      } else if (var0 <= -117 && var0 >= -122) {
         return 1;
      } else {
         return (byte)(var0 == -123 ? 3 : 2);
      }
   }

   private boolean b(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < this.c && var2 < this.d;
   }

   private byte a(int var1, int var2) {
      if ((this.a[0][var1 >> 5][var2] >> var1 & 31 & 1) == 0) {
         return 2;
      } else {
         return (byte)((this.a[1][var1 >> 5][var2] >> var1 & 31 & 1) == 0 ? 1 : 0);
      }
   }

   final void c(int var1, int var2, int var3, int var4) {
      for (int var5 = var2; var5 < var2 + var4; var5++) {
         for (int var6 = var1; var6 < var1 + var3; var6++) {
            if (this.a(var6, (int)var5)) {
               this.a[var5 - this.K][var6 - this.I] = true;
            }
         }
      }

      this.B = true;
   }

   private void a(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.a(var1, var2, var3, var4, false, false, false, false, false);
   }

   private void a(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.b[0] = this.a[0] = var1;
      this.b[1] = this.a[1] = var2;
      this.b[2] = this.a[2] = var3;
      this.b[4] = this.a[4] = var4;
      this.b[5] = this.a[5] = var5;
      this.b[6] = this.a[6] = var6;
      this.b[7] = this.a[7] = var7;
      this.b[8] = this.a[8] = var8;
      this.b[9] = this.a[9] = var9;
      this.b[17] = this.a[17] = true;
      if (var2) {
         if (this.u[0] == 0) {
            this.b[1] = this.a[1] = true;
            this.b[9] = this.a[9] = false;
         } else if (this.u[0] != 0) {
            this.b[9] = this.a[9] = true;
            this.b[1] = this.a[1] = false;
         }
      }

      int var10 = this.bb;
      if (this.a[4]) {
         this.bb = 48;
         this.ax = this.d[3];
      } else {
         this.bb = 22;
         this.ax = this.d[2];
      }

      if (var10 < this.bb && this.ag == 0 && this.K < this.d - 1) {
         this.ag = 1;
         this.K++;
         this.A--;
         if (this.K < this.d - 1) {
            this.K++;
            this.A--;
            this.A = true;
         }
      } else if (var10 > this.bb && !var4 && this.ag == 0 && this.K > 0) {
         this.ag = -1;
         this.K--;
         this.A++;
         if (this.K > 0) {
            this.K--;
            this.A++;
            this.A = true;
         }
      }

      if (this.a[1]) {
         this.ad = 1;
      } else if (this.a[2]) {
         this.ad = 2;
      } else if (this.a[5]) {
         this.ad = 5;
      } else if (this.a[6]) {
         this.ad = 6;
      } else if (this.a[9]) {
         this.ad = 9;
      }

      this.ba = this.b[this.a[this.a[195] + 0 + this.ad]];
      byte var11 = this.P;
      this.P = (byte)((319 - this.bb - this.ba + this.d[2]) / 16 + 1);
      if (this.P > var11) {
         this.C = true;
      }

      this.A = this.P * 16;
      this.A += 16;
      this.c[2] = this.c[3] = this.A;
      this.c[4] = this.c[5] = this.c[7] = this.c[10] = this.A + this.bb;
      this.c[11] = this.c[this.a[this.a[195] + 0 + this.ad]] + this.b[this.a[this.a[195] + 0 + this.ad]];
   }

   final void a(byte var1, byte var2, byte var3, byte var4) {
      if (this.c != 0 && this.u <= 0) {
         boolean var5 = false;
         if (var1 != 100) {
            var5 = true;

            for (int var6 = 0; var6 < 10; var6++) {
               if (this.u[var6] == 0) {
                  this.u[var6] = var1;
                  this.k[0][var6] = var2;
                  this.k[1][var6] = var3;
                  this.k[2][var6] = var4;
                  this.g[var6] = 0;
                  break;
               }
            }
         } else if (this.u[0] != 0) {
            boolean var8 = false;
            var5 = true;
            this.ay = 0;

            for (int var7 = 0; var7 < 9; var7++) {
               this.g[var7]++;
            }

            if (this.u[1] != 0) {
               if (this.g[0] > 1) {
                  var8 = true;
               }
            } else if (this.g[0] > 4) {
               var8 = true;
            }

            if (var8) {
               for (int var9 = 0; var9 < 9; var9++) {
                  this.u[var9] = this.u[var9 + 1];
                  this.k[0][var9] = this.k[0][var9 + 1];
                  this.k[1][var9] = this.k[1][var9 + 1];
                  this.k[2][var9] = this.k[2][var9 + 1];
                  this.g[var9] = this.g[var9 + 1];
                  this.u[var9 + 1] = 0;
               }

               if (this.u[0] != 0 && this.u[1] == 0) {
                  this.g[0] = 0;
               }
            }
         }

         if (var5 && (this.a[1] || this.a[9])) {
            this.a(this.a[0], true, false, this.a[4]);
            this.ay = (byte)(this.k[0][0] == 0 && this.k[1][0] == 0 ? 0 : 1);
         }
      }
   }

   private void g(byte var1) {
      try {
         this.q = var1;
         this.aM();
         this.aN();
         this.aO();
      } catch (Exception var3) {
      }
   }

   private void aM() {
      this.u = false;
      this.t = false;
      this.F = -1;

      for (int var1 = 0; var1 < this.b[121]; var1++) {
         this.e[var1] = 0;
      }

      for (int var3 = 0; var3 <= 100; var3++) {
         this.e[4040 + var3] = -100;
         this.e[4242 + var3] = 1;
         this.e[4343 + var3] = -1;
      }

      for (int var4 = 0; var4 < 50; var4++) {
         this.a[2][var4] = this.a[3][var4] = this.a[4][var4] = 0;
      }

      for (int var5 = 0; var5 < 10; var5++) {
         this.u[var5] = 0;
      }

      for (int var6 = 0; var6 < 5; var6++) {
         this.c[0][var6][2] = -1;
      }

      for (byte var7 = 0; var7 < 30; var7++) {
         this.e[0][var7] = 0;
      }

      for (byte var8 = 0; var8 < 3; var8++) {
         for (byte var2 = 0; var2 < 96; var2++) {
            this.a[0][var8][var2] = 0;
         }
      }

      for (byte var9 = 0; var9 < 10; var9++) {
         for (byte var14 = 0; var14 < 12; var14++) {
            this.a[0][var9][var14] = 0;
            this.a[1][var9][var14] = 0;
         }
      }

      for (byte var10 = 0; var10 < 30; var10++) {
         for (byte var15 = 0; var15 < 4; var15++) {
            this.f[var15][var10] = 0;
         }

         for (byte var16 = 0; var16 < 5; var16++) {
            this.b[0][var16][var10] = this.b[1][var16][var10] = 0;
         }
      }

      for (int var11 = 0; var11 < 96; var11++) {
         for (int var17 = 0; var17 < 96; var17++) {
            this.c[var11][var17] = this.b[var11][var17] = 0;
         }
      }

      for (int var12 = 0; var12 < this.P + 3; var12++) {
         for (int var18 = 0; var18 < this.O; var18++) {
            this.g[var12][var18] = 0;
         }
      }

      if (!this.s) {
         for (byte var13 = 0; var13 < 26; var13++) {
            this.a[0][var13] = this.a[1][var13] = 0;
         }

         this.a[0][17] = 0;
      }

      this.a[0][16] = 1;
      this.t();
      this.c = 0;
      this.h = 0;
      this.L = this.N = false;
      this.F = false;
      this.K = false;
      this.W = this.X = 0;
      this.aL = 0;
      this.u = 0;
      this.ay = 0;
      this.a.a();
      this.i();
      this.k = true;
   }

   private void aN() {
      int var1 = 0;

      try {
         System.gc();
         Thread.yield();
         Object var4 = null;
         int var5 = 0;
         this.c = this.e = this.a[this.a[149] + this.q * 2];
         this.d = this.f = this.a[this.a[149] + this.q * 2 + 1];
         if (this.q == 0) {
            this.c = 40;
            this.d = 32;
         } else if (this.q == 5) {
            this.c = (short)(this.c - 32);
         }

         int var8 = 0;
         int var7 = 10;

         for (int var3 = 0; var3 < this.f; var3++) {
            for (int var2 = 0; var2 < this.e; var2++) {
               if (var7 >= this.a[this.a[197] + 0 + var8]) {
                  var1 = (short)(this.v[this.h[this.a[this.a[248] + this.q]] + var5] & 0xFF);
                  var5++;
                  if (var1 >= 250) {
                     var7 = 0;
                     var8 = var1 - 250;
                     var1 = this.a[this.a[197] + 6 + var8] & 255;
                  }
               }

               var7++;
               int var6 = var1;
               if (var1 <= 8) {
                  var6 += this.a(3, (int)3);
               }

               this.b[var3][var2] = (byte)var6;
               int var9 = (this.b[9][var6] & '\uffff') >> 13 & 1;
               if ((var6 >= 175 || var9 == 1) && this.c[var3][var2] != -127) {
                  this.c[var3][var2] = -126;
               } else if (this.c[var3][var2] == -126) {
                  this.c[var3][var2] = 0;
               }

               if (this.q != 3) {
                  if (((this.j[16][var6] & '\uffff') >> 6 & 3) == 2) {
                     this.c[var3][var2] = -125;
                  }

                  if (var6 >= 180 && var6 <= 231) {
                     this.c[var3][var2] = -124;
                  } else if (var6 >= 175 && var6 <= 179) {
                     this.a(var6 - 175 + 1, var2, var3, this.a[this.a[110] + var6 - 175 + 1]);
                  }
               }

               if (var3 == 0 || var3 == this.f - 1 || var2 == this.e - 1) {
                  this.c[var3][var2] = -126;
               }
            }
         }

         for (int var13 = 0; var13 < this.d; var13++) {
            for (int var12 = 1; var12 < this.c - 1; var12++) {
               if (c((int)this.c[var13][var12]) && this.e[9833 + (this.c[var13][var12] + 61) * -1] == 5) {
                  byte var14;
                  if ((var14 = this.b[var13][var12 - 1]) == 33 || var14 == 34 || var14 == 37 || var14 == 38) {
                     this.c[var13][var12 - 1] = -127;
                  }

                  if ((var14 = this.b[var13][var12 + 1]) == 33 || var14 == 34 || var14 == 37 || var14 == 38) {
                     this.c[var13][var12 + 1] = -127;
                  }
               }
            }
         }
      } catch (Exception var11) {
      }
   }

   private void aO() {
      this.aP();
      this.a[0][17] = (short)(this.q == 3 ? 0 : 1);
      this.y = this.C;
      this.A = this.D;
      this.I = this.J = (byte)(this.a[this.a[150] + this.q * 2] - this.y);
      this.K = this.L = (byte)(this.a[this.a[150] + this.q * 2 + 1] - this.A);
      this.aK();
      this.J = this.I;
      this.L = this.K;
      this.z = this.y;
      this.B = this.A;
      this.a.d();
   }

   private void aP() {
      if (this.q == 3) {
         this.aw = 0;
      }

      short var1 = this.a[250 + this.q];
      byte var2 = this.a[this.a[262] + this.q];

      for (byte var3 = 0; var3 < var2; var3++) {
         if (this.a[var1 + 0 * var2 + var3] != -1) {
            if (this.a[var1 + 1 * var2 + var3] >= 0) {
               this.a(
                  this.a[var1 + 0 * var2 + var3],
                  this.a[var1 + 1 * var2 + var3],
                  this.a[var1 + 2 * var2 + var3],
                  this.a[var1 + 3 * var2 + var3],
                  this.a[var1 + 4 * var2 + var3],
                  true,
                  -1
               );
            } else if (this.a[var1 + 1 * var2 + var3] == -1) {
               this.a(
                  (byte)(this.a[var1 + 0 * var2 + var3] & 1),
                  this.a[var1 + 2 * var2 + var3],
                  this.a[var1 + 3 * var2 + var3],
                  this.a[var1 + 4 * var2 + var3],
                  (byte)((this.a[var1 + 0 * var2 + var3] >> 1) + ((this.a[var1 + 0 * var2 + var3] & 1) != 0 ? this.b : 0))
               );
            } else if (this.a[var1 + 1 * var2 + var3] == -2) {
               this.b(1, this.a[var1 + 2 * var2 + var3], this.a[var1 + 3 * var2 + var3], this.a[var1 + 0 * var2 + var3]);
            }

            if (var3 <= 10 && this.q != 1 && this.q != 6) {
               this.a[0][var3] = this.a[this.a[263] + 11 * this.q * 2 + var3];
               this.a[1][var3] = (short)(this.a[this.a[263] + 11 * (this.q * 2 + 1) + var3] * 20);
            }
         }
      }

      if (this.q == 0) {
         this.e[7476] = 4;
         this.e[7479] = 5;
      } else {
         if (this.q == 3) {
            this.aw = 2;
         }
      }
   }

   static boolean a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         var0.drawRegion(var1, var2, var3, var4, var5, 0, var6, var7, var8);
         return true;
      } catch (Exception var10) {
         return false;
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.fillRect(11 + var1, 8 + var2, var3, var4 + 0);
   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawRect(var1, var2, var3, var4);
   }

   private static void c(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(var1, var2, var3, var4);
   }

   private static void d(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawLine(var1, var2, var3, var4);
   }

   private boolean d(int var1) {
      boolean var2 = false;

      try {
         System.gc();
         Thread.yield();
         RecordStore var4;
         if ((var4 = RecordStore.openRecordStore(this.b + var1, true)).getNumRecords() <= 0) {
            var4.closeRecordStore();
            return false;
         }

         DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var4.getRecord(1)));

         try {
            if (var1 == 0) {
               this.l = var3.readInt();
               this.W = var3.readBoolean();
               this.r = var3.readByte();
               this.V = (byte)(4 + this.r);
               this.s = var3.readByte();
               this.t = var3.readByte();
               this.c = var3.readByte();
               this.p = var3.readByte();
            } else {
               this.q = var3.readByte();
               this.aM();
               this.p = var3.readByte();
               this.d = var3.readByte();
               if (var1 == 2) {
                  this.b = this.d;
               }

               this.aN();
               var3.read(this.e);
               var3.read(this.q);
               var3.read(this.a[0]);
               var3.read(this.a[1]);
               var3.read(this.a[2]);
               var3.read(this.a[3]);

               for (int var5 = 0; var5 < 26; var5++) {
                  this.a[0][var5] = var3.readShort();
                  this.a[1][var5] = var3.readShort();
               }

               var3.read(this.e[0]);
               var3.read(this.e[1]);
               var3.read(this.e[2]);

               for (int var12 = 0; var12 < 10; var12++) {
                  for (int var6 = 0; var6 < 12; var6++) {
                     this.a[0][var12][var6] = var3.readByte();
                     this.a[1][var12][var6] = var3.readByte();
                  }
               }

               var3.read(this.f[0]);
               var3.read(this.f[1]);
               var3.read(this.f[2]);
               var3.read(this.f[3]);

               for (int var13 = 0; var13 < 5; var13++) {
                  var3.read(this.b[0][var13]);
                  var3.read(this.b[1][var13]);
                  var3.read(this.c[0][var13]);
                  var3.read(this.c[1][var13]);
               }

               this.aq = var3.readByte();
               this.y = this.z = var3.readByte();
               this.A = this.B = var3.readByte();
               this.I = this.J = var3.readByte();
               this.K = this.L = var3.readByte();
               this.h = var3.readByte();
               this.ai = var3.readByte();
               this.c = var3.readInt();
               this.L = var3.readBoolean();
               this.N = var3.readBoolean();

               for (int var14 = 0; var14 < 3; var14++) {
                  for (int var21 = 0; var21 < 96; var21++) {
                     this.a[0][var14][var21] = var3.readInt();
                  }
               }

               var3.read(this.a.c[0]);
               var3.read(this.a.c[1]);
               var3.read(this.a.c[2]);
               var3.read(this.a.c[3]);
               var3.read(this.a.c[4]);
               var3.read(this.a.c[5]);
               this.a.f = var3.readByte();
               this.a.K = var3.readByte();
               this.a.R = var3.readByte();
               this.a.L = var3.readByte();
               this.a.aQ = var3.readInt();
               var3.read(this.a.f[0]);
               var3.read(this.a.f[1]);
               var3.read(this.a.g[0]);
               var3.read(this.a.g[1]);
               var3.read(this.a.g[2]);
               var3.read(this.a.j);
               this.a.N = var3.readByte();
               this.a.O = var3.readByte();
               this.a.g = var3.readByte();
               this.a.J = var3.readByte();
               this.a.I = var3.readByte();
               var3.read(this.t);
               int var7 = -111;

               while (var7 >= -122) {
                  byte var15;
                  if ((var15 = var3.readByte()) == 127) {
                     var7--;
                  } else {
                     byte var22 = var3.readByte();
                     this.c[var22][var15] = (byte)var7;
                  }
               }

               for (int var16 = 0; var16 < 30; var16++) {
                  if (this.f[0][var16] != 0) {
                     this.c[this.f[3][var16]][this.f[2][var16]] = (byte)(this.f[0][var16] <= 30 ? -123 : -126);
                  }
               }

               for (int var17 = 0; var17 < 50; var17++) {
                  if (this.e[9833 + var17] >= 6) {
                     this.c[this.e[9783 + var17]][this.e[9733 + var17]] = (byte)(-61 - var17);
                  }
               }

               for (int var18 = 1; var18 <= 100; var18++) {
                  if (this.e[1919 + var18] != 0) {
                     this.e[808 + var18] = 0;
                     if (this.e[4646 + var18] < 0) {
                        this.c[this.e[101 + var18]][this.e[0 + var18]] = (byte)var18;
                        if ((this.e[2929 + var18] & 255) <= 7
                           && (this.e[1111 + var18] & 15)
                              < (this.a[this.a[15] + (this.e[606 + var18] & 1) * 9 + this.e[1010 + var18] - this.e[7777 + var18]] + 1) / 2
                           && this.c[this.e[101 + var18] + this.a[this.a[1] + 8 + this.e[606 + var18]]][this.e[0 + var18]
                                 + this.a[this.a[1] + this.e[606 + var18]]]
                              == 0) {
                           this.c[this.e[101 + var18] + this.a[this.a[1] + 8 + this.e[606 + var18]]][this.e[0 + var18]
                              + this.a[this.a[1] + this.e[606 + var18]]] = -128;
                        }
                     }
                  }
               }

               for (int var19 = 0; var19 < 22; var19++) {
                  this.e[9689 + var19] = 0;
                  if (this.e[9513 + var19] != 0) {
                     this.c[this.e[9381 + var19]][this.e[9359 + var19]] = (byte)(101 + var19);
                     if ((this.e[9557 + var19] & 255) <= 7
                        && (this.e[9623 + var19] & 15)
                           < (this.a[this.a[15] + (this.e[9491 + var19] & 1) * 9 + this.a[this.a[179] + this.e[9535 + var19]]] + 1) / 2
                        && this.c[this.e[9381 + var19] + this.a[this.a[1] + 8 + this.e[9491 + var19]]][this.e[9359 + var19]
                              + this.a[this.a[1] + this.e[9491 + var19]]]
                           == 0) {
                        this.c[this.e[9381 + var19] + this.a[this.a[1] + 8 + this.e[9491 + var19]]][this.e[9359 + var19]
                           + this.a[this.a[1] + this.e[9491 + var19]]] = -128;
                     }
                  }
               }

               for (int var20 = 1; var20 <= 60; var20++) {
                  if (this.e[8505 + var20] != 0) {
                     for (int var8 = 0; var8 < this.a[this.a[138] + 130 + this.e[8749 + var20]]; var8++) {
                        for (int var9 = 0; var9 < this.a[this.a[138] + 104 + this.e[8749 + var20]]; var9++) {
                           this.c[this.e[8444 + var20] + var8][this.e[8383 + var20] + var9] = (byte)(-var20);
                        }
                     }
                  }
               }

               this.a.n();
               this.a.j();
               this.a.d();
               this.aK();
               this.J = this.I;
               this.L = this.K;
            }

            var2 = true;
         } catch (Exception var10) {
         }

         var3.close();
         var4.closeRecordStore();
         if (!var2) {
            RecordStore.deleteRecordStore(this.b + var1);
            this.d(var1);
         }

         return var2;
      } catch (Exception var11) {
         return false;
      }
   }

   private boolean e(int var1) {
      boolean var2 = false;

      try {
         RecordStore var3 = null;
         ByteArrayOutputStream var4 = null;
         DataOutputStream var5 = null;

         try {
            RecordStore.deleteRecordStore(this.b + var1);
            var3 = RecordStore.openRecordStore(this.b + var1, true);
            var4 = new ByteArrayOutputStream();
            var5 = new DataOutputStream(var4);
            if (var1 == 0) {
               var5.writeInt(this.l);
               var5.writeBoolean(this.W);
               var5.writeByte(this.r);
               var5.writeByte(this.s);
               var5.writeByte(this.t);
               var5.writeByte(this.c);
               var5.writeByte(this.p);
            } else {
               if (var1 == 2) {
                  this.W = true;
               } else if (var1 == 1) {
                  this.t = this.a[this.a[248] + this.q];
               }

               var5.writeByte(this.q);
               var5.writeByte(this.p);
               var5.writeByte(this.d);
               var5.write(this.e);
               var5.write(this.q);
               var5.write(this.a[0]);
               var5.write(this.a[1]);
               var5.write(this.a[2]);
               var5.write(this.a[3]);

               for (int var6 = 0; var6 < 26; var6++) {
                  var5.writeShort(this.a[0][var6]);
                  var5.writeShort(this.a[1][var6]);
               }

               var5.write(this.e[0]);
               var5.write(this.e[1]);
               var5.write(this.e[2]);

               for (int var11 = 0; var11 < 10; var11++) {
                  for (int var7 = 0; var7 < 12; var7++) {
                     var5.writeByte(this.a[0][var11][var7]);
                     var5.writeByte(this.a[1][var11][var7]);
                  }
               }

               var5.write(this.f[0]);
               var5.write(this.f[1]);
               var5.write(this.f[2]);
               var5.write(this.f[3]);

               for (int var12 = 0; var12 < 5; var12++) {
                  var5.write(this.b[0][var12]);
                  var5.write(this.b[1][var12]);
                  var5.write(this.c[0][var12]);
                  var5.write(this.c[1][var12]);
               }

               var5.writeByte(this.aq);
               var5.writeByte(this.y);
               var5.writeByte(this.A);
               var5.writeByte(this.I);
               var5.writeByte(this.K);
               var5.writeByte(this.h);
               var5.writeByte(this.ai);
               var5.writeInt(this.c);
               var5.writeBoolean(this.L);
               var5.writeBoolean(this.N);

               for (int var13 = 0; var13 < 3; var13++) {
                  for (int var15 = 0; var15 < 96; var15++) {
                     var5.writeInt(this.a[0][var13][var15]);
                  }
               }

               var5.write(this.a.c[0]);
               var5.write(this.a.c[1]);
               var5.write(this.a.c[2]);
               var5.write(this.a.c[3]);
               var5.write(this.a.c[4]);
               var5.write(this.a.c[5]);
               var5.writeByte(this.a.f);
               var5.writeByte(this.a.K);
               var5.writeByte(this.a.R);
               var5.writeByte(this.a.L);
               var5.writeInt(this.a.aQ);
               var5.write(this.a.f[0]);
               var5.write(this.a.f[1]);
               var5.write(this.a.g[0]);
               var5.write(this.a.g[1]);
               var5.write(this.a.g[2]);
               var5.write(this.a.j);
               var5.writeByte(this.a.N);
               var5.writeByte(this.a.O);
               var5.writeByte(this.a.g);
               var5.writeByte(this.a.J);
               var5.writeByte(this.a.I);
               var5.write(this.t);

               for (int var8 = -111; var8 >= -122; var8--) {
                  for (int var14 = 0; var14 < this.c; var14++) {
                     for (int var16 = 0; var16 < this.d; var16++) {
                        if (this.c[var16][var14] == var8) {
                           var5.writeByte(var14);
                           var5.writeByte(var16);
                        }
                     }
                  }

                  var5.writeByte(127);
               }
            }

            var3.addRecord(var4.toByteArray(), 0, var4.size());
            var2 = true;
         } catch (Exception var9) {
         }

         if (var3 != null) {
            var3.closeRecordStore();
         }

         if (var4 != null) {
            var4.close();
         }

         if (var5 != null) {
            var5.close();
         }
      } catch (Exception var10) {
      }

      return var2;
   }

   final int a(int var1, int var2) {
      return (this.a.nextInt() & var1) % var2;
   }

   private static long a() {
      return System.currentTimeMillis();
   }

   public final void hideNotify() {
      this.d();
   }

   public final void showNotify() {
      this.e();
   }

   public final void d() {
      this.Y = true;
      this.Z = true;
      if (this.aa && !this.ad) {
         this.aR();
      }

      this.ad = true;
   }

   public final void e() {
      this.Y = false;
   }

   private void aQ() {
      this.a.k();
      f = this.b[this.h * 2 + this.a(255, (int)2)];
      if (this.a == null || this.a.a() <= 100 || f != g) {
         g = f;
         this.aR();
         new StringBuffer().append("/s").append(f).toString();
         this.a = new a("audio/midi");
      }

      this.a.a(this.e);
   }

   private void aR() {
      if (this.a != null) {
         this.a.a();
         this.a.b();
         this.a = null;
      }
   }

   private void aS() {
      if (this.Z) {
         if (this.Q != 27 && this.ac) {
            this.ab = true;
            this.v = 0;
            this.S = this.R;
            this.R = this.Q;
            this.Q = 27;
            this.z = this.y;
            this.B = this.A;
            this.J = this.I;
            this.L = this.K;
         }

         while (this.Y) {
            this.n = false;
            Thread.yield();
            tribes.a(10);
         }
      }

      this.Z = false;
      this.ad = false;
      if (this.Q != 27 && this.e == 2 && (this.a == null || this.a != null && this.a.a() != 400)) {
         this.aQ();
      }

      tribes.a(10);
   }

   private void m(int var1) {
      if (var1 == this.j[0]) {
         for (int var4 = 0; var4 < 6; var4++) {
            this.i[var4] = 0;
         }

         this.i[0] = this.j[0];
      } else {
         if (this.i[0] == this.j[0]) {
            for (int var2 = 0; var2 < 6; var2++) {
               if (this.i[var2] == 0) {
                  this.i[var2] = var1;
                  break;
               }
            }

            this.ae = true;

            for (int var3 = 0; var3 < 5; var3++) {
               if (this.i[var3] != this.j[var3]) {
                  this.ae = false;
                  break;
               }
            }

            if (this.ae && this.i[5] != 0) {
               switch (this.i[5]) {
                  case 49:
                     this.af = true;
                  case 50:
                  case 52:
                  case 53:
                  case 54:
                  case 56:
                  default:
                     break;
                  case 51:
                     this.ag = true;
                     break;
                  case 55:
                     this.a[0][0] = (short)(this.a[0][0] + 100);
                     this.a[0][1] = (short)(this.a[0][1] + 100);
                     this.a[0][2] = (short)(this.a[0][2] + 100);
                     this.a[0][3] = (short)(this.a[0][3] + 100);
                     this.a[0][4] = (short)(this.a[0][4] + 100);
                     this.a[0][5] = (short)(this.a[0][5] + 3);
                     this.a[0][8] = (short)(this.a[0][8] + 3);
                     this.a[0][10] = (short)(this.a[0][10] + 3);
                     break;
                  case 57:
                     this.u = 1;
                     if (this.q == 0) {
                        this.q++;
                     }
               }

               this.i[0] = 0;
            }
         }
      }
   }
}
