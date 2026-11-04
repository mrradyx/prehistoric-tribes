public final class b {
   f a;
   byte[] a;
   byte[][][] a;
   byte[][][] b;
   short[][] a;
   byte[] b;
   short[] a;
   short[] b;
   short[] c;
   byte[][][] c;
   byte[][] a;
   byte[][] b;
   byte a;
   byte b;
   byte c;
   byte[] c;
   byte[] d;
   byte[] e;
   byte[] f;
   byte[][][] d;
   byte[] g;
   byte[][][] e;
   byte[] h;
   byte d;
   byte e;
   byte[][] c;
   int a;
   int b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h;
   byte f;
   byte g;
   int i;
   boolean[] a;
   int j;
   int k;
   int l;
   int m;
   int n;
   byte[][] d;
   byte h;
   byte i;
   byte j;
   byte k;
   byte l;
   byte m;
   int o;
   int p;
   int q;
   int r;
   byte n;
   byte o;
   byte p;
   int s;
   int t;
   byte q;
   byte r;
   short[] d;
   int u;
   int v;
   int w;
   int x;
   int y;
   int z;
   int A;
   int B;
   int C;
   int D;
   int E;
   int F;
   boolean a;
   boolean b;
   boolean c;
   int G;
   int H;
   boolean d;
   byte s;
   int I;
   int J;
   int K;
   byte t;
   byte u;
   int L;
   byte[] i;
   byte v;
   byte w;
   byte x;
   int M;
   byte y;
   byte z;
   byte A;
   byte B;
   byte C;
   byte D;
   byte E;
   byte F;
   int N;
   int O;
   int P;
   int Q;
   byte[][] e;
   byte G;
   byte H;
   boolean e;
   int R;
   int S;
   boolean f;
   int T;
   boolean g;
   int U;
   int V;
   int W;
   int X;
   int Y;
   int Z;
   int aa;
   int ab;
   int ac;
   boolean h;
   int ad;
   int ae;
   int af;
   byte I;
   int ag;
   int ah;
   int ai;
   int aj;
   int ak;
   int al;
   int am;
   int an;
   int ao;
   int ap;
   int aq;
   int ar;
   int as;
   int at;
   int au;
   int av;
   int aw;
   int ax;
   int ay;
   int az;
   int aA;
   int aB;
   int aC;
   int aD;
   int aE;
   int aF;
   int aG;
   int aH;
   int aI;
   int aJ;
   byte[][] f;
   byte[][] g;
   int aK;
   int aL;
   int aM;
   byte J;
   byte K;
   byte L;
   int aN;
   int aO;
   int aP;
   byte[] j;
   byte M;
   byte N;
   byte O;
   byte P;
   byte Q;
   byte R;
   int aQ;
   int aR;
   int aS;
   int aT;
   int aU;
   int aV;
   int aW;
   int aX;
   int aY;
   int[] a = new int[26];
   byte S;
   byte[] k;

   public b() {
      this.a[0] = 0;
      this.a[1] = 1;
      this.a[2] = 3;
      this.a[3] = 7;
      this.a[4] = 15;
      this.a[5] = 31;
      this.a[6] = 63;
      this.a[7] = 127;
      this.a[8] = 255;
      this.a[9] = 511;
      this.a[10] = 1023;
      this.a[11] = 2047;
      this.a[12] = 4095;
      this.a[13] = 8191;
      this.a[14] = 16383;
      this.a[15] = 32767;
      this.a[16] = 65535;
      this.a[17] = 131071;
      this.a[18] = 262143;
      this.a[19] = 524287;
      this.a[20] = 1048575;
      this.a[21] = 2097151;
      this.a[22] = 4194303;
      this.a[23] = 8388607;
      this.a[24] = 16777215;
      this.a[25] = 33554431;
   }

   final void a(f var1) {
      this.a = var1;
      this.b = this.a.c;
      this.a = this.a.e;
      this.a = this.a.a;
      this.b = this.a.a;
      this.a = this.a.a;
      this.b = this.a.b;
      this.c = this.a.c;
   }

   final void a() {
      this.f = this.g = 0;
      this.F = 0;
      this.J = 0;
      this.L = 0;
      this.S = 1;
      this.K = 50;
      this.a.a.a();
      this.I = (byte)(this.a.q == 2 ? 3 : 0);
      this.O = -1;
      this.aQ = this.aR = -1;
      this.R = (byte)(this.a.q != 2 && this.a.q != 4 ? 0 : 128);
      this.P = this.Q = -1;

      for (this.a = 0; this.a < 3; this.a++) {
         this.a.t[this.a] = 0;
      }

      for (this.a = 0; this.a < 10; this.a++) {
         this.c[4][this.a] = 0;
      }

      for (this.a = 0; this.a < 6; this.a++) {
         this.d[this.a] = -1;
      }

      for (this.a = 0; this.a < 10; this.a++) {
         this.f[0][this.a] = 0;
      }

      for (this.a = 0; this.a < 20; this.a++) {
         this.g[0][this.a] = 0;
      }

      for (this.a = 0; this.a < 50; this.a++) {
         this.j[this.a] = (byte)this.a;
      }

      this.j();
      this.G = this.a[219] + this.a.q * 4;
   }

   private byte a(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         this.i = var6 == 0 ? 80 : 5;
         this.a(var2, var1, var4, var3, var6);

         for (this.a = 0; this.a < this.c; this.a++) {
            this.f(var6);
            if (!this.a[0] && !this.a[1]) {
               this.d(var6);
               if (this.m < 0) {
                  this.f[this.g[0]] = (byte)(this.e[0][2][this.a] + 1);
               } else {
                  this.f[this.g[(this.m & 1) + 1]] = (byte)((this.m >> 1) + 1);
                  this.a[this.m & 1] = true;
                  this.a(false);
                  this.a[this.m & 1] = false;
               }
               break;
            }

            this.a(true);
            if (this.f[this.g[0]] + var5 >= this.i) {
               break;
            }
         }

         for (this.j = 0; this.j < this.c; this.j++) {
            if (this.e[1][0][this.j] >= 0) {
               this.a.b[this.e[1][1][this.j]][this.e[1][0][this.j]] = this.h[this.j];
            }
         }

         if (this.f[this.g[0]] + var5 >= this.i) {
            this.f[this.g[0]] = (byte)(this.i - var5);
         }

         for (this.a = 0; this.a < this.f[this.g[0]]; this.a++) {
            if (var6 == 0) {
               this.a[0][this.v][this.a + var5] = this.d[this.g[0]][0][this.a];
               this.a[1][this.v][this.a + var5] = this.d[this.g[0]][1][this.a];
            } else {
               this.b[0][this.v][this.a + var5] = this.d[this.g[0]][0][this.a];
               this.b[1][this.v][this.a + var5] = this.d[this.g[0]][1][this.a];
            }
         }

         if (var6 == 0) {
            this.a[707 + this.v] = 0;
            this.a[3030 + this.v] = 0;
            this.P();
         }
      } catch (Exception var8) {
      }

      return this.f[this.g[0]];
   }

   private byte a(int var1, int var2, int var3, int var4) {
      try {
         this.d[0][0] = (byte)var2;
         this.d[1][0] = (byte)var1;
         this.d = 1;
         this.a(var2, var1, var4, var3, 0);

         for (this.a = 0; this.a < this.c; this.a++) {
            this.f(0);
            if (!this.a[0] && !this.a[1]) {
               this.d(0);
               this.d[0][this.d] = this.m < 0 ? this.e[0][0][this.a] : this.d[this.g[(this.m & 1) + 1]][0][this.m >> 1];
               this.d[1][this.d] = this.m < 0 ? this.e[0][1][this.a] : this.d[this.g[(this.m & 1) + 1]][1][this.m >> 1];

               for (this.j = 0; this.j < this.c; this.j++) {
                  if (this.e[1][0][this.j] >= 0) {
                     this.a.b[this.e[1][1][this.j]][this.e[1][0][this.j]] = this.h[this.j];
                  }
               }

               return (byte)this.d;
            }

            this.b = (!this.a[0] || this.f[this.g[1]] >= this.f[this.g[2]]) && this.a[1] ? 2 : 1;
            this.d[0][this.d] = this.d[this.g[this.b]][0][this.f[this.g[this.b]] / 2];
            this.d[1][this.d] = this.d[this.g[this.b]][1][this.f[this.g[this.b]] / 2];
            this.a = this.e[this.g[this.b]];
            this.d++;
         }

         this.l = 0;
         this.d[0][this.d] = (byte)var4;
         this.d[1][this.d] = (byte)var3;

         for (this.j = 0; this.j < this.c; this.j++) {
            if (this.e[1][0][this.j] >= 0) {
               this.a.b[this.e[1][1][this.j]][this.e[1][0][this.j]] = this.h[this.j];
            }
         }
      } catch (Exception var6) {
      }

      return (byte)this.d;
   }

   private void d(int var1) {
      this.a(this.e[0][0][this.a], this.e[0][1][this.a], var1);
      this.l = (this.q - this.e[0][0][this.a]) * (this.q - this.e[0][0][this.a]) + (this.r - this.e[0][1][this.a]) * (this.r - this.e[0][1][this.a]);
      this.m = -1;
      if (this.l > this.B) {
         this.n = this.f[this.g[this.f[this.g[1]] > this.f[this.g[2]] ? 1 : 2]] * 2;

         for (this.j = 0; this.j < this.n; this.j++) {
            if (this.f[this.g[(this.j & 1) + 1]] > this.j >> 1) {
               this.k = (this.q - this.d[this.g[(this.j & 1) + 1]][0][this.j >> 1]) * (this.q - this.d[this.g[(this.j & 1) + 1]][0][this.j >> 1])
                  + (this.r - this.d[this.g[(this.j & 1) + 1]][1][this.j >> 1]) * (this.r - this.d[this.g[(this.j & 1) + 1]][1][this.j >> 1]);
               if (this.k < this.l) {
                  this.l = this.k;
                  this.m = this.j;
                  if (this.a(this.d[this.g[(this.j & 1) + 1]][0][this.j >> 1], this.d[this.g[(this.j & 1) + 1]][1][this.j >> 1], var1) / 10 <= this.B) {
                     return;
                  }
               }
            }
         }
      }
   }

   private byte b(int var1, int var2, int var3, int var4) {
      this.i = 0;
      this.h = this.a((int)var1, (int)var2, (int)var3, (int)var4);

      for (this.j = 0; this.j < this.h; this.j++) {
         this.i = (byte)(this.i + this.a(this.d[1][this.j], this.d[0][this.j], this.d[1][this.j + 1], this.d[0][this.j + 1], this.i, 0));
         if (!this.a[0] && !this.a[1]) {
            break;
         }
      }

      return this.a.q == 3 && this.i > 2 ? 2 : this.i;
   }

   private void o() {
      if (this.a[4848 + this.v] > 1) {
         this.a[4848 + this.v] = 0;
      }

      this.a[2] = true;
      this.a[808 + this.v] = this.b(this.a[101 + this.v], this.a[0 + this.v], this.a[3232 + this.v], this.a[3131 + this.v]);
   }

   private void p() {
      this.o();
      if (this.a[808 + this.v] < 1 && this.a(this.a[0 + this.v], this.a[101 + this.v], 0) / 10 > this.B) {
         this.a[4848 + this.v]++;
         if (!this.a[2]) {
            return;
         }

         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 223);
         if (this.b[this.a[39] + this.a[2828 + this.v]] == 1) {
            this.b(this.a[8749 + this.a[4444 + this.v]], this.a[4444 + this.v]);
         }

         if (this.a[2828 + this.v] == 69 || this.a[2828 + this.v] == 79 || this.a[2828 + this.v] == 59 || this.a[2828 + this.v] == 87) {
            this.a[4848 + this.v] = 0;
            if (this.a[6464 + this.v] == 69 && this.a[6262 + this.v] == this.a[3131 + this.v] && this.a[6363 + this.v] == this.a[3232 + this.v]) {
               this.a[6262 + this.v] = this.a[0 + this.v];
               this.a[6363 + this.v] = this.a[101 + this.v];
            }

            this.a[3131 + this.v] = this.a[0 + this.v];
            this.a[3232 + this.v] = this.a[101 + this.v];
            return;
         }

         if (this.a[2828 + this.v] == 17 || this.a[2828 + this.v] == 109 || this.a[2828 + this.v] == 110 || this.a[2828 + this.v] == 27) {
            this.N();
            return;
         }

         if (this.b[this.a[39] + this.a[2828 + this.v]] != 1 && this.a[2828 + this.v] > 9) {
            this.a(
               (int)0,
               (int)(this.a[4949 + this.v] * 2 + 1),
               (int)b(this.a[0 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.c - 1),
               (int)b(this.a[101 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.d - 1)
            );
            return;
         }
      } else if (this.a[808 + this.v] > 0
         && (
            this.a[2828 + this.v] <= 9
               || this.a[2828 + this.v] == 59
               || this.a[2828 + this.v] == 87
               || this.u == 0 && this.a.N
               || this.u == 1 && this.Q > 0
               || this.a.q == 3 && this.f == 4
         )) {
         this.a[7777 + this.v] = 3;
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.a(var3 - var1, (int)(var4 - var2));

         for (this.a = 0; this.a < 3; this.a++) {
            this.d[this.a << 1] = (byte)var1;
            this.d[(this.a << 1) + 1] = (byte)var2;
         }

         this.e(var5);
         this.b = 1000;

         for (this.a = 0; this.a < 3; this.a++) {
            if (this.e[this.a] < this.b) {
               this.b = this.e[this.a];
               this.g[0] = (byte)this.a;
            }
         }

         this.g[1] = (byte)((this.g[0] + 1) % 3);
         this.g[2] = (byte)((this.g[0] + 2) % 3);
         this.d = 0;
         this.c = 0;
         if (this.e[this.g[0]] > 0) {
            for (this.a = 0; this.a < this.f[this.g[0]]; this.a++) {
               this.e = this.d;
               byte var6 = this.d[this.g[0]][0][this.a];
               byte var7 = this.d[this.g[0]][1][this.a];
               this.d = this.b[var7][var6] == 0 ? 0 : this.a(var6, var7, var5);
               if (this.e == 0 && this.d != 0) {
                  if (this.c >= 10) {
                     return;
                  }

                  this.e[0][0][this.c] = (byte)(this.a == 0 ? var1 : this.d[this.g[0]][0][this.a - 1]);
                  this.e[0][1][this.c] = (byte)(this.a == 0 ? var2 : this.d[this.g[0]][1][this.a - 1]);
                  this.e[0][2][this.c] = (byte)(this.a - 1);
                  this.e[1][0][this.c] = -1;
                  this.c++;
               } else if (this.e != 0 && this.d == 0) {
                  this.e[1][0][this.c - 1] = var6;
                  this.e[1][1][this.c - 1] = var7;
                  this.e[1][2][this.c - 1] = (byte)this.a;
                  this.h[this.c - 1] = this.a.b[var7][var6];
                  this.a.b[var7][var6] = (byte)(256 - this.c);
               }
            }
         }
      } catch (Exception var8) {
      }
   }

   private void a(int var1, int var2) {
      this.a = 0;
      if (var1 > 0) {
         this.a = (byte)(this.a + 4);
      } else {
         var1 *= -1;
      }

      if (var2 > 0) {
         this.a = (byte)(this.a + 2);
      } else {
         var2 *= -1;
      }

      if (var1 > var2) {
         this.a++;
         this.c[0] = (byte)(var1 - var2);
         this.c[1] = (byte)var2;
      } else {
         this.c[0] = (byte)(var2 - var1);
         this.c[1] = (byte)var1;
      }
   }

   private void e(int var1) {
      for (this.a = 0; this.a < 3; this.a++) {
         this.f[this.a] = (byte)(this.c[0] + this.c[1]);
         this.e[this.a] = 0;
      }

      for (this.e = 0; this.e < 2; this.e++) {
         this.c = 0;

         for (this.a = this.e; this.a != 2 - 3 * this.e; this.a = this.a + (1 - 2 * this.e)) {
            for (this.b = 0; this.b < this.c[this.a]; this.c++) {
               this.d[this.e << 1] = (byte)(this.d[this.e << 1] + this.b[this.a[0] + this.a * 4 + this.a * 2]);
               this.d[(this.e << 1) + 1] = (byte)(this.d[(this.e << 1) + 1] + this.b[this.a[0] + this.a * 4 + this.a * 2 + 1]);
               this.d[this.e][0][this.c] = this.d[this.e << 1];
               this.d[this.e][1][this.c] = this.d[(this.e << 1) + 1];
               this.e[this.e] = (byte)(
                  this.e[this.e]
                     + (this.b[this.d[(this.e << 1) + 1]][this.d[this.e << 1]] == 0 ? 0 : this.a(this.d[this.e << 1], this.d[(this.e << 1) + 1], var1))
               );
               this.b++;
            }
         }
      }

      this.e = 0;
      this.f = 0;
      this.b = this.g = this.c[1] > 0 ? this.c[0] * 50 / this.c[1] : 1000000;

      for (this.a = 0; this.a < this.c[0] + this.c[1]; this.a++) {
         if ((this.b < 50 || this.e >= this.c[0]) && this.f < this.c[1]) {
            this.d[4] = (byte)(this.d[4] + this.b[this.a[0] + this.a * 4 + 2]);
            this.d[5] = (byte)(this.d[5] + this.b[this.a[0] + this.a * 4 + 3]);
            this.f++;
            this.b = this.b + this.g;
         } else {
            this.d[4] = (byte)(this.d[4] + this.b[this.a[0] + this.a * 4 + 0]);
            this.d[5] = (byte)(this.d[5] + this.b[this.a[0] + this.a * 4 + 1]);
            this.e++;
            this.b -= 50;
         }

         this.d[2][0][this.a] = this.d[4];
         this.d[2][1][this.a] = this.d[5];
         this.e[2] = (byte)(this.e[2] + (this.b[this.d[5]][this.d[4]] == 0 ? 0 : this.a(this.d[4], this.d[5], var1)));
      }
   }

   private void f(int var1) {
      try {
         this.g = 1;

         for (this.e = 1; this.e < 3; this.e++) {
            this.h = this.g[this.e];
            this.f[this.h] = 0;
            this.a[this.e - 1] = false;
            this.b = this.b[this.a[3]
               + this.d[this.g[0]][0][this.e[0][2][this.a] + 1]
               - this.e[0][0][this.a]
               + (this.d[this.g[0]][1][this.e[0][2][this.a] + 1] - this.e[0][1][this.a]) * 3
               + 4];
            this.d[this.h * 2] = this.e[0][0][this.a];
            this.d[this.h * 2 + 1] = this.e[0][1][this.a];

            for (this.b = 0; this.b < 80; this.b++) {
               for (this.f = 0; this.f < 8; this.f++) {
                  byte var2 = (byte)(this.d[this.h * 2] + this.b[this.a[1] + this.b]);
                  byte var3 = (byte)(this.d[this.h * 2 + 1] + this.b[this.a[1] + 8 + this.b]);
                  if ((this.c = var2 < this.a.c && var3 < this.a.d && var2 >= 0 && var3 >= 0 ? (this.b[var3][var2] == 0 ? 0 : this.a(var2, var3, var1)) : 2)
                     == 2) {
                     this.b = 130;
                     break;
                  }

                  if (this.c == 0) {
                     if ((this.b & 1) > 0) {
                        if ((
                                 var2 = this.a.b[this.d[this.h * 2 + 1] + this.b[this.a[1] + 8 + (this.b + this.g & 7)]][this.d[this.h * 2]
                                    + this.b[this.a[1] + (this.b + this.g & 7)]]
                              )
                              < -this.a
                           && var2 >= -10) {
                           this.e[this.h] = (byte)(-(var2 + 1));
                           this.a[this.e - 1] = true;
                           this.b = 130;
                           break;
                        }

                        if (this.d[this.h * 2] + this.b[this.a[1] + (this.b + this.g & 7)] == this.e[0][0][this.a]
                           && this.d[this.h * 2 + 1] + this.b[this.a[1] + 8 + (this.b + this.g & 7)] == this.e[0][1][this.a]) {
                           this.b = 130;
                           break;
                        }
                     }

                     this.d[this.h * 2] = (byte)(this.d[this.h * 2] + this.b[this.a[1] + this.b]);
                     this.d[this.h * 2 + 1] = (byte)(this.d[this.h * 2 + 1] + this.b[this.a[1] + 8 + this.b]);
                     break;
                  }

                  this.b = (byte)(this.b + this.g & 7);
               }

               if (this.f >= 8 || this.d[this.h * 2] == this.e[0][0][this.a] && this.d[this.h * 2 + 1] == this.e[0][1][this.a]) {
                  if (this.f >= 8) {
                     this.a[2] = false;
                  }
                  break;
               }

               if (this.b > 127) {
                  break;
               }

               byte var6;
               if ((var6 = this.a.b[this.d[this.h * 2 + 1]][this.d[this.h * 2]]) < -this.a && var6 >= -10) {
                  this.e[this.h] = (byte)(-(var6 + 1));
                  this.a[this.e - 1] = true;
                  break;
               }

               this.d[this.h][0][this.b] = this.d[this.h * 2];
               this.d[this.h][1][this.b] = this.d[this.h * 2 + 1];
               this.f[this.h]++;
               this.b = (byte)(this.b - this.g * 2 & 7);
            }

            this.g *= -1;
         }
      } catch (Exception var4) {
      }
   }

   private void a(boolean var1) {
      if (!this.a[0] || this.f[this.g[1]] > this.f[this.g[2]] && this.a[1]) {
         this.e = this.g[1];
         this.g[1] = this.g[2];
         this.g[2] = (byte)this.e;
      }

      for (this.e = 0; this.e <= this.e[0][2][this.a]; this.e++) {
         this.d[this.g[2]][0][this.e] = this.d[this.g[0]][0][this.e];
         this.d[this.g[2]][1][this.e] = this.d[this.g[0]][1][this.e];
      }

      this.f[this.g[2]] = (byte)(this.e[0][2][this.a] + 1);

      for (this.e = 0; this.e <= this.f[this.g[1]] && this.e + this.f[this.g[2]] < this.i; this.e++) {
         this.d[this.g[2]][0][this.e + this.f[this.g[2]]] = this.d[this.g[1]][0][this.e];
         this.d[this.g[2]][1][this.e + this.f[this.g[2]]] = this.d[this.g[1]][1][this.e];
      }

      this.f[this.g[2]] = (byte)b(this.f[this.g[2]] + this.f[this.g[1]], 0, this.i);
      this.e = this.g[0];
      this.g[0] = this.g[2];
      this.g[2] = (byte)this.e;
      if (var1 && this.f[this.g[0]] < this.i) {
         this.g = this.e[1][2][this.e[this.g[1]]];
         this.h = this.f[this.g[1]] - this.g + this.e[0][2][this.a] + 1;

         for (this.e = 0; this.e <= this.f[this.g[2]] - this.g && this.e + this.f[this.g[0]] < this.i; this.e++) {
            this.d[this.g[0]][0][this.e + this.f[this.g[0]]] = this.d[this.g[2]][0][this.e + this.g];
            this.d[this.g[0]][1][this.e + this.f[this.g[0]]] = this.d[this.g[2]][1][this.e + this.g];
         }

         this.f[this.g[0]] = (byte)b(this.f[this.g[0]] + this.f[this.g[2]] - this.g, 0, this.i);
         this.a = this.e[this.g[1]];

         for (this.e = this.a + 1; this.e < this.c; this.e++) {
            this.e[0][2][this.e] = (byte)(this.e[0][2][this.e] + this.h);
            this.e[1][2][this.e] = (byte)(this.e[1][2][this.e] + this.h);
         }
      }
   }

   private byte a(int var1, int var2, int var3) {
      if (var3 == 0
         && (this.b[var2][var1] > 0 && this.b[var2][var1] <= 122 || this.b[var2][var1] == -128)
         && this.b[this.a[53]
               + (var2 - this.a[101 + this.v] >= -12 && var2 - this.a[101 + this.v] <= 12 ? var2 - this.a[101 + this.v] + 12 : 0) * 25
               + (var1 - this.a[0 + this.v] >= -12 && var1 - this.a[0 + this.v] <= 12 ? var1 - this.a[0 + this.v] + 12 : 0)]
            > 29) {
         if (this.b[var2][var1] == -128) {
            return 0;
         }

         if ((this.a[this.b[this.b[var2][var1] <= 100 ? 29 : 108] + (this.b[var2][var1] <= 100 ? this.b[var2][var1] : this.b[var2][var1] - 101)] & 255) <= 7) {
            return 0;
         }
      }

      if (this.u == 0 && var3 == 0 && (this.a.a[0][var1 >> 5][var2] >> (var1 & 31) & 1) == 0) {
         return 0;
      } else if (var3 == 0
         && this.b[var2][var1] <= -111 - (this.u ^ 1) * 3 * 2
         && this.b[var2][var1] > -111 - (this.u ^ 1) * 3 * 2 - 3
         && this.a[1414 + this.v] >= 12) {
         return 0;
      } else if (this.b[var2][var1] == this.v + var3) {
         return 0;
      } else if (var3 != 0
         || this.a[4848 + this.v] <= 0
         || this.b[var2][var1] <= this.u * 50
         || this.b[var2][var1] > (this.u + 1) * 50
         || this.b[this.a[43] + this.a[2828 + this.v]] <= this.b[this.a[43] + this.a[2828 + this.b[var2][var1]]]
            && this.b[this.a[43] + this.a[2828 + this.b[var2][var1]]] != 0
         || (this.a[2929 + this.b[var2][var1]] < 8 || this.a[2929 + this.b[var2][var1]] >= 21)
            && this.a[2929 + this.b[var2][var1]] != -101
            && this.a[2929 + this.b[var2][var1]] != -100
            && (
               (this.a[2929 + this.b[var2][var1]] & 255) <= 7
                  || this.a[2828 + this.b[var2][var1]] != 69
                     && this.a[2828 + this.b[var2][var1]] != 79
                     && this.a[2828 + this.b[var2][var1]] != 80
                     && (this.a[2828 + this.b[var2][var1]] < 83 || this.a[2828 + this.b[var2][var1]] > 85)
            )) {
         return (byte)(var3 == 0 && this.b[var2][var1] == -127 && this.a[2828 + this.v] == 13 ? 0 : 1);
      } else {
         return 0;
      }
   }

   private void g(int var1) {
      try {
         if (this.a[6161 + this.v] > 1) {
            this.a[6161 + this.v] = (byte)(this.a[6161 + this.v] == 2 ? 1 : 0);
            if (this.I == 1 || this.I == 2 || this.a.q == 2 && this.u == 1 && this.f == 1) {
               this.a[7777 + this.v] = 3;
            }
         }

         if (var1 < 3) {
            this.d(this.v, var1);
         }

         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
            this.U();
         } else {
            this.a(this.a[3131 + this.v], this.a[3232 + this.v], var1 > 0);
            if (this.l >= 0 && (this.l != 10 || var1 < 2)) {
               this.a[3131 + this.v] = this.a[0 + this.v];
               this.a[3232 + this.v] = this.a[101 + this.v];
               this.Q();
               if (this.a[6161 + this.v] == 1) {
                  this.a(this.l, this.v, this.v);
               }
            } else {
               this.h(var1);
            }
         }
      } catch (Exception var3) {
      }
   }

   private void h(int var1) {
      this.a[4444 + this.v] = this.k[2];
      if (this.m == 2 || this.m == 7) {
         this.a[7979 + this.v] = (byte)(
            this.a[2828 + this.v] != 60 && var1 != 0 && (this.a[2828 + this.v] != 2 && this.a[2828 + this.v] != 7 || (this.a[7979 + this.v] & 128) != 0)
               ? this.a[7979 + this.v] | 128
               : this.a[7979 + this.v] & 127
         );
      }

      if ((
            var1 == 0
               || !this.a.N
                  && (this.m == 12 || this.m == 16)
                  && (this.b[this.a[41] + this.a[6464 + this.v]] == 3 || this.b[this.a[41] + this.a[6464 + this.v]] == 7)
         )
         && (!this.a.N && this.K >= 50 || this.b[this.a[41] + this.m] != 0)) {
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v
            && (this.b[this.a[39] + this.m] != 1 || this.a[8810 + this.k[2]] != this.v && this.b[this.a[41] + this.m] != 0)) {
            this.a.c(this.v);
         }

         if (this.b[this.a[39] + this.m] != 1) {
            this.a[6464 + this.v] = var1 == 0 && this.m >= 19 && this.m <= 26 ? 69 : this.b[this.a[29] + this.m];
            this.a[6262 + this.v] = this.a[3131 + this.v];
            this.a[6363 + this.v] = this.a[3232 + this.v];
         }
      }

      if (this.a[1414 + this.v] >= 12
         && (
            var1 < 2
               || !this.a.N
                  && (this.m == 12 || this.m == 16)
                  && (this.b[this.a[41] + this.a[6464 + this.v]] == 3 || this.b[this.a[41] + this.a[6464 + this.v]] == 7)
         )) {
         this.a(this.v, this.m);
      }

      if (this.a[2828 + this.v] == 13) {
         if (this.a[3131 + this.v] > 0
            && (this.b[this.a[3232 + this.v]][this.a[3131 + this.v] - 1] == -127 || this.b[this.a[3232 + this.v]][this.a[3131 + this.v] - 1] == this.v)) {
            this.a[3131 + this.v]--;
         }

         if (this.a[3131 + this.v] < this.a.c - 1
            && (this.b[this.a[3232 + this.v]][this.a[3131 + this.v] + 1] == -127 || this.b[this.a[3232 + this.v]][this.a[3131 + this.v] + 1] == this.v)) {
            this.a[3131 + this.v]++;
         }
      }

      if (this.b[this.a[39] + this.a[2828 + this.v]] == 1) {
         this.b(this.k[1], this.k[2]);
      }
   }

   private void a(int var1, int var2, boolean var3) {
      if (var3) {
         this.a[4747 + this.v] = this.b[var2][var1];
      }

      this.c(var1, var2, this.u, 0);
      this.k = this.k[0];
      this.l = this.a();
      if (this.k[3] == 0) {
         this.m = this.b[this.a[16] + this.b[this.a[17] + this.k] + this.k[this.k != 4 ? 1 : 2]];
         if (this.k == 2) {
            if (this.k[1] == 6 && this.a[3636 + this.v] > 0 && this.a[3535 + this.v] <= 13 && !var3) {
               this.m = this.b[this.a[121] + this.a[3535 + this.v]];
            }

            if (this.k[1] >= 12 && this.a[8505 + this.k[2]] >= this.b[this.a[138] + 182 + this.a[9237 + this.k[2]]]) {
               this.m = 69;
            }
         }
      } else if (this.a[1414 + this.k[2]] < 12 && this.k[0] != 2) {
         this.m = 107;
      } else {
         this.m = (byte)(this.b[this.a[19] + this.k - 1] + (var3 ? 1 : 0));
      }

      if (this.m <= 9) {
         this.m = (byte)(this.m + this.b[this.a[18] + this.a[6565 + this.v]]);
      }

      if (this.a.q == 3 && this.b[this.a[41] + this.m] != 0) {
         this.m = 69;
      }
   }

   private void a(int var1, byte var2) {
      if (this.a[2828 + var1] != var2) {
         this.a[404 + var1] = 0;
         this.a[2828 + var1] = var2;
         this.a[1111 + var1] = (byte)(this.a[1111 + var1] & 15);
         this.B = this.b[this.a[38] + var2];
         if (this.B < 0) {
            this.B = this.a[this.b[-this.B] + var1];
         }

         if (var2 < 83 || var2 > 85) {
            this.C();
         }
      }

      this.a[3838 + var1] = this.b[this.a[32] + var2] == 0 ? (byte)var1 : this.a[this.b[this.b[this.a[32] + var2]] + var1];
   }

   private void b(int var1, int var2) {
      this.o = this.a = 0;

      for (this.p = 10000; this.a < this.b[this.a[20] + var1]; this.a++) {
         this.q = this.a[8383 + var2] + this.b[this.a[22] + var1 * 3 + this.a];
         this.r = this.a[8444 + var2] + this.b[this.a[23] + var1 * 3 + this.a];
         if (this.q < this.a.c && this.r < this.a.d && this.q >= 0 && this.r >= 0 && (this.b[this.r][this.q] == 0 || this.a((int)this.q, this.r, 0) == 0)) {
            this.q = (this.a[0 + this.v] - this.q) * (this.a[0 + this.v] - this.q) + (this.a[101 + this.v] - this.r) * (this.a[101 + this.v] - this.r);
            if (this.p > this.q) {
               this.p = this.q;
               this.o = this.a;
            }
         }
      }

      this.a[3131 + this.v] = (byte)(this.a[8383 + var2] + this.b[this.a[22] + var1 * 3 + this.o]);
      this.a[3232 + this.v] = (byte)(this.a[8444 + var2] + this.b[this.a[23] + var1 * 3 + this.o]);
      this.a[4040 + this.v] = this.b[this.a[21] + var1 * 3 + this.o];
   }

   private void q() {
      this.p = this.a[4444 + this.v];
      if (this.a[this.b[this.b[this.a[26] + this.a[2828 + this.v]]] + this.p] <= 0) {
         this.r();
      }

      if ((this.b[this.a[27] + this.a[2828 + this.v]] & 2) > 0) {
         this.n = (byte)(this.a(this.a[0 + this.v], this.a[101 + this.v], 0) / 10);
         if (this.a[2828 + this.v] == 92 || this.a[2828 + this.v] == 106) {
            if (this.n > this.a[1818 + this.v]) {
               this.b(false);
               this.a(this.v, this.b[this.a[57] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]);
               this.i(0);
               this.a[3030 + this.v] = -1;
               return;
            }

            this.a[3131 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]]] + this.p];
            this.a[3232 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]] + 1] + this.p];
            return;
         }

         if (this.n <= this.a[4949 + this.v] + 2) {
            if (this.a[3131 + this.v] != this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]]] + this.p]
               || this.a[3232 + this.v] != this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]] + 1] + this.p]) {
               this.a[3131 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]]] + this.p];
               this.a[3232 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]] + 1] + this.p];
               if (this.n > this.B) {
                  this.p();
                  if (this.a[2828 + this.v] >= 94 && this.a[2828 + this.v] <= 97 && (this.a[7979 + this.v] & 16) > 0) {
                     this.a.a(this.v, (byte)0);
                     this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 239);
                  }
               }
            }

            return;
         }

         if (this.a[808 + this.v] == 0) {
            if (this.a[2828 + this.v] <= 9 && this.a[6161 + this.v] == 0) {
               this.Q();
               this.a[3131 + this.v] = this.a[0 + this.v];
               this.a[3232 + this.v] = this.a[101 + this.v];
               return;
            }

            this.a[3131 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]]] + this.p];
            this.a[3232 + this.v] = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]] + 1] + this.p];
         }
      }
   }

   private void r() {
      if (this.a[2828 + this.v] == 2 || this.a[2828 + this.v] == 7) {
         if ((this.a[7979 + this.v] & 128) == 0) {
            this.g(1);
         } else {
            this.Q();
         }
      }

      if (this.a[2828 + this.v] == 93 || this.a[2828 + this.v] == 92 || this.a[2828 + this.v] == 106) {
         this.b(false);
         this.a(this.v, this.b[this.a[57] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]);
         this.i(0);
         this.a[3030 + this.v] = -1;
      }

      if ((this.b[this.a[27] + this.a[2828 + this.v]] & 1) > 0) {
         if (this.a[1414 + this.v] < 12) {
            this.Q();
         } else {
            if (this.a[6565 + this.v] == 9 && (this.a[2828 + this.v] == 0 || this.a[2828 + this.v] == 3)) {
               this.a[2828 + this.v] = (byte)(this.a[2828 + this.v] ^ 1);
            }

            this.a = this.b = true;
            if (this.a[2828 + this.v] > 9 || !this.p()) {
               this.Q();
               if ((this.a[2929 + this.v] & 255) > 7) {
                  this.a[3131 + this.v] = this.a[0 + this.v];
                  this.a[3232 + this.v] = this.a[101 + this.v];
               }
            }
         }
      }

      if (this.a[2828 + this.v] >= 94 && this.a[2828 + this.v] <= 96) {
         this.ap();
      }
   }

   private void b(boolean var1) {
      for (this.s = this.u * 30 + 1; this.s <= (this.u + 1) * 30; this.s++) {
         if ((this.a[8749 + this.s] == 11 || var1) && this.a[8932 + this.s] >= 1) {
            for (this.t = this.a[8993 + this.s]; this.t > 0; this.t = this.a[4545 + this.t]) {
               if (this.t == this.v) {
                  this.a[4444 + this.v] = (byte)this.s;
                  this.a[4747 + this.v] = (byte)(-this.s);
                  this.a[3131 + this.v] = this.a[0 + this.v];
                  this.a[3232 + this.v] = this.a[101 + this.v];
                  return;
               }
            }
         }
      }
   }

   private int a(int var1, int var2, int var3) {
      if (var3 == 0 && this.a[4444 + this.v] < -1) {
         return 0;
      }

      byte var4;
      if ((var4 = this.a[this.b[var3 == 0 ? 44 : 110] + this.v]) >= 1 && this.b[this.a[28] + this.a[2828 + this.v]] != 43 && var3 == 0) {
         this.q = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]]] + var4];
         this.r = this.a[this.b[this.b[this.a[28] + this.a[2828 + this.v]] + 1] + var4];
         if (this.b[this.a[28] + this.a[2828 + this.v]] == 83) {
            this.q = (byte)b(var1, this.q, this.q + this.b[this.a[138] + 104 + this.a[8749 + var4]] - 1);
            this.r = (byte)b(var2, this.r, this.r + this.b[this.a[138] + 130 + this.a[8749 + var4]] - 1);
            if (this.a[2828 + this.v] <= 9) {
               this.a[3131 + this.v] = this.q;
               this.a[3232 + this.v] = this.r;
            }
         }
      } else {
         this.q = this.a[this.b[var3 == 0 ? 31 : 112] + this.v];
         this.r = this.a[this.b[var3 == 0 ? 32 : 113] + this.v];
      }

      byte var5 = (byte)(this.q - var1);
      byte var6 = (byte)(this.r - var2);
      return var5 >= -12 && var6 >= -12 && var5 <= 12 && var6 <= 12 ? this.b[this.a[53] + (12 + var6) * 25 + 12 + var5] : 200;
   }

   private static int b(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 < var2 ? var0 : var2;
      }
   }

   final void b() {
      for (this.v = 1; this.v <= 50; this.v++) {
         if ((
               this.a.N
                  || this.b[this.a[100] + this.b[this.a[41] + this.a[2828 + this.v]]] + this.b[this.a[100] + this.b[this.a[41] + this.a[6464 + this.v]]] > 1
                     && this.a[6565 + this.v] != 9
                     && (this.a[1717 + this.v] > 4 || this.a[1616 + this.v] > 4 || this.a[7575 + this.v] > 4)
            )
            && (!this.a.L || (this.a[7979 + this.v] & 64) == 0)) {
            this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 96);
         }
      }
   }

   final void c() {
      for (this.v = 1; this.v <= 50; this.v++) {
         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 159);
         if (this.a[1919 + this.v] > 0 && this.a[2828 + this.v] == 69 && this.a[6161 + this.v] == 0) {
            this.a(this.v, false);
         }
      }
   }

   final void d() {
      for (int var1 = 0; var1 < 3; var1++) {
         for (int var2 = 0; var2 < 96; var2++) {
            this.a.a[1][var1][var2] = 0;
         }
      }

      for (int var4 = 1; var4 <= 50; var4++) {
         if (this.a[1919 + var4] != 0) {
            this.a((int)this.a[0 + var4], (int)this.a[101 + var4], (int)this.a[4949 + var4]);
         }
      }

      for (int var5 = 51; var5 <= 100; var5++) {
         if (this.a[1919 + var5] != 0
            && this.a[2929 + var5] >= 23
            && this.a[2929 + var5] <= 36
            && this.a[2828 + var5] <= 9
            && this.a[2828 + var5] != 2
            && this.a[2828 + var5] != 7) {
            this.a(this.a[0 + var5], this.a[101 + var5], 0);
         }
      }

      for (int var6 = 1; var6 <= 30; var6++) {
         if (this.a[8505 + var6] != 0) {
            if (this.a[8749 + var6] >= 12) {
               this.a(
                  (int)this.a[8383 + var6],
                  (int)this.a[8444 + var6],
                  (int)this.b[this.a[138] + 104 + this.a[8749 + var6]],
                  (int)this.b[this.a[138] + 130 + this.a[8749 + var6]]
               );
            } else {
               this.a(
                  (int)(this.a[8383 + var6] + this.b[this.a[138] + 104 + this.a[8749 + var6]] / 2),
                  this.a[8444 + var6] + this.b[this.a[138] + 130 + this.a[8749 + var6]] / 2,
                  this.a[8688 + var6] & 15
               );
            }
         }
      }

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var7 = 0; var7 < 96; var7++) {
            this.a.a[0][var3][var7] = this.a.a[0][var3][var7] | this.a.a[1][var3][var7];
         }
      }
   }

   final void e() {
      try {
         this.s();

         for (this.u = 0; this.u < 2; this.u++) {
            if (this.u == 1) {
               this.aq();
            }

            this.a(0);
            if (this.a[this.u][18] >= 0) {
               this.a[this.u][18]++;
            }

            if (this.a[this.u][18] >= (this.u == 0 ? 750 : this.b[this.a[273 + this.a.b] + this.a.q] * 50)) {
               this.a[this.u][18] = -1;
            }

            for (this.v = this.u * 50 + 1; this.v <= (this.u + 1) * 50; this.v++) {
               if (this.a[1919 + this.v] != 0 && !this.a()) {
                  if (this.a[4545 + this.v] > -111 || this.a[4545 + this.v] < -122) {
                     this.t();
                     if (this.a[7575 + this.v] > 3 && this.h()) {
                        continue;
                     }

                     if (this.a.c % 15 == (this.v & 7) && this.u == 0 && this.a[1414 + this.v] >= 12) {
                        this.B();
                     }

                     if (this.b()) {
                        continue;
                     }
                  }

                  this.v();
                  this.b = true;
                  if (this.a[5050 + this.v] == 0 && this.a[1414 + this.v] >= 12 && this.a[2828 + this.v] != 50 && this.a[2828 + this.v] != 105) {
                     this.a = (
                           this.a[6161 + this.v] == 0
                              || (this.I & this.u + 1) != 0
                              || this.a[6161 + this.v] == 1
                                 && this.a[808 + this.v] <= this.a[707 + this.v]
                                 && this.z / 10 > this.B
                                 && (this.a[2929 + this.v] & 255) > 7
                        )
                        && (
                           this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v
                              || this.b[this.a[41] + this.a[2828 + this.v]] == 16 && this.b[this.a[18] + this.a[6565 + this.v]] > 0
                        )
                        && (this.a[7979 + this.v] & 2) == 0
                        && (this.a[2828 + this.v] > 9 || (this.b[this.a[27] + this.a[2828 + this.v]] & 4) == 0);
                     this.b = false;
                     this.p();
                  }

                  this.u();
                  if (this.a[5959 + this.v] > 0) {
                     this.R();
                  }
               }
            }

            this.Z();
         }

         this.T();
         if (this.K < 50) {
            this.K++;
         }

         for (this.v = 1; this.v <= 4; this.v++) {
            if (this.a[0][this.v] > 999) {
               this.a[0][this.v] = 999;
            }
         }
      } catch (Exception var2) {
      }
   }

   private void s() {
      this.a.a.b();
      if ((this.a.c & 3) == 0) {
         this.d();
      }

      if (this.a.L && (this.a.c & 63) == 2) {
         this.b();
      }

      if (this.a.c == this.b[this.a[277] + this.a.q] * (1000 / (1 + this.a.b * 3))) {
         this.a[1][8] = 5000;
      }

      if (this.a.c == this.b[this.a[278] + this.a.q] * (1000 / (1 + this.a.b * 3))) {
         this.a[1][9] = 5000;
         this.a[1][10] = 5000;
      }

      if (this.f == 2) {
         this.F = 0;
      }
   }

   private boolean a() {
      if (this.a[1919 + this.v] < 0) {
         this.a[3030 + this.v]++;
         if (this.a[3030 + this.v] >= this.a.j[4][this.a[2929 + this.v] & 0xFF]) {
            this.m(this.v);
         }

         if (this.a[5959 + this.v] > 0) {
            this.R();
         }

         return true;
      } else {
         if (this.f == 2 && this.u == 0 && (this.a[1717 + this.v] > 4 || this.a[1616 + this.v] > 4)) {
            this.F++;
         }

         this.B = this.b[this.a[38] + this.a[2828 + this.v]];
         if (this.B < 0) {
            this.B = this.a[this.b[-this.B] + this.v];
         }

         if ((this.a[8282 + this.v] & 128) != 0 && this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            this.a(19, this.a[0 + this.v], this.a[101 + this.v], (byte)this.v);
            return true;
         }

         if ((this.a.c & (this.a[1414 + this.v] < 12 ? 1 : (this.u == 0 ? 3 : 15))) == 0) {
            this.a[6666 + this.v]++;
         }

         if ((this.a.c & 3) == (this.v & 3) && !this.q()) {
            return true;
         }

         if ((this.a.c & 31) == (this.v & 15)) {
            this.W();
         }

         if (this.a[3434 + this.v] < 1 && this.a[1414 + this.v] >= 12 && (this.a.c & 31) == 0) {
            this.V();
         }

         if ((this.a[7979 + this.v] & 4) != 0 && (this.a.c & 7) == (this.v & 7) && this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            this.Y();
         }

         if ((this.a.c & 1) == 1 && (this.a[7979 + this.v] & 4) == 0) {
            this.X();
         }

         if (this.a[2828 + this.v] <= 9 && this.a[2828 + this.v] != 2 && this.a[2828 + this.v] != 7) {
            this.K = 0;
         }

         this.a[5050 + this.v]++;
         if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0) {
            this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 240);
         }

         if (this.a[3333 + this.v] >= 11 && this.a[2929 + this.v] != 39 && this.a[2929 + this.v] != 104 && this.a[2929 + this.v] != 105) {
            this.a[3333 + this.v] = -1;
         }

         return false;
      }
   }

   private void t() {
      if (true) return false;
      if (this.a[6161 + this.v] >= 2 && this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0) {
         if (this.c = this.a[6161 + this.v] == 2) {
            this.a(this.a[3131 + this.v], this.a[3232 + this.v], true);
            if (this.l >= 0) {
               this.c = false;
            }

            if (this.b[this.a[41] + this.a[6464 + this.v]] == this.b[this.a[41] + this.m] || this.b[this.a[41] + this.m] == 0 && (this.a.N || this.K < 50)) {
               this.c = false;
            }
         }

         if (this.u != 1 && this.a[505 + this.v] < 10 && this.a[6161 + this.v] == 2 && this.b[this.a[41] + this.m] != 0) {
            this.a[6161 + this.v] = 0;
            this.a[3131 + this.v] = this.a[0 + this.v];
            this.a[3232 + this.v] = this.a[101 + this.v];
            this.a[4444 + this.v] = this.a[4747 + this.v] = 0;
            this.Q();
            this.a((byte)12, this.v, 0);
         } else if (!this.a((byte)-1, this.c)) {
            if (this.a[6161 + this.v] == 4) {
               this.a[4444 + this.v] = (byte)(this.a[4747 + this.v] - (this.a[4747 + this.v] <= 100 ? 0 : 101));
               this.a[4747 + this.v] = (byte)(this.a[4747 + this.v] <= 100 ? 0 : 99);
               this.a[3131 + this.v] = this.a[this.b[this.a[4747 + this.v]] + this.a[4444 + this.v]];
               this.a[3232 + this.v] = this.a[this.b[this.a[4747 + this.v] + 1] + this.a[4444 + this.v]];
               if (this.a(this.a[0 + this.v], this.a[101 + this.v], 0) / 10 <= this.a[4949 + this.v]) {
                  this.g(1);
                  this.a[6161 + this.v] = 0;
               } else {
                  this.a(this.v, (byte)87);
               }
            }

            this.a[808 + this.v] = 0;
            if (this.a[6161 + this.v] > 0) {
               this.g(this.a[6161 + this.v] == 2 ? 0 : 2);
               return;
            }
         }
      }
   }

   private boolean b() {
      if (((this.a.c & 31) == (this.v & 31) || this.a.c == 0) && this.u == 0 && this.a[1414 + this.v] >= 12) {
         this.A();
      }

      if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0 && this.a[6161 + this.v] < 2) {
         if (this.a[2828 + this.v] == 109) {
            this.o();
         }

         if (this.a[5050 + this.v] >= this.a[1010 + this.v] - this.a[7777 + this.v] && ((this.a[2929 + this.v] & 255) <= 7 || this.a[3030 + this.v] == 0)) {
            if (this.a[1414 + this.v] >= 12 && this.m()) {
               this.a[3636 + this.v] = 0;
               return true;
            }

            if ((
                     this.b[this.a[31] + this.a[2828 + this.v]] == 13 && this.b[this.a[33] + this.a[2828 + this.v]] == 13
                        || this.b[this.a[41] + this.a[2828 + this.v]] >= 13 && this.b[this.a[41] + this.a[2828 + this.v]] <= 15
                  )
                  && (this.b[this.a[39] + this.a[2828 + this.v]] != 1 || this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v)
                  && this.a[2929 + this.v] != -109
                  && this.a[3131 + this.v] == this.a[0 + this.v]
                  && this.a[3232 + this.v] == this.a[101 + this.v]
               || this.a[4444 + this.v] == -1) {
               if (this.a[4444 + this.v] == -1 && this.a[2828 + this.v] >= 10 && this.a[2828 + this.v] <= 16 && this.a[3636 + this.v] > 0) {
                  this.an();
               } else {
                  this.n();
               }
            }

            if ((this.u == 0 && !this.a.N && (!this.a.L || (this.a[7979 + this.v] & 64) == 0) || this.u == 1 && this.Q < 0)
               && this.a[1414 + this.v] >= 12
               && (this.a[2828 + this.v] == 69 || this.a[2828 + this.v] == 84 && this.a[3939 + this.v] == 69)
               && this.a[7777 + this.v] == 0
               && this.a[6161 + this.v] == 0
               && (this.a[3131 + this.v] != this.a[6262 + this.v] || this.a[3232 + this.v] != this.a[6363 + this.v])) {
               this.a(this.a[6262 + this.v], this.a[6363 + this.v], true);
               this.Q();
               if (this.b[this.a[41] + this.m] != this.b[this.a[41] + this.a[6464 + this.v]] && (this.m != 16 || this.a[6464 + this.v] != 12)) {
                  if (this.a[6464 + this.v] != 12 && this.a[6464 + this.v] != 16) {
                     this.a[4747 + this.v] = 0;
                  } else {
                     this.a(this.v, (byte)12);
                     if (!this.b(false)) {
                        this.a(this.v, (byte)60);
                        this.a[6464 + this.v] = 12;
                        this.a[3131 + this.v] = this.a[6262 + this.v];
                        this.a[3232 + this.v] = this.a[6363 + this.v];
                     }
                  }
               } else {
                  this.a[3131 + this.v] = this.a[6262 + this.v];
                  this.a[3232 + this.v] = this.a[6363 + this.v];
                  if (this.a[505 + this.v] >= 30) {
                     this.g(1);
                  }
               }
            }

            this.a[5050 + this.v] = 0;
         }

         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v
            || this.a[2828 + this.v] == 93
            || this.a[2828 + this.v] == 92
            || this.a[2828 + this.v] == 106) {
            if (this.a[4444 + this.v] >= 0) {
               this.q();
            } else if (this.a[4444 + this.v] >= -1) {
               if ((this.a.c & 63) == (this.v & 63)) {
                  this.an();
               }
            } else {
               this.N();
            }
         }

         this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0);
         if (this.a[5050 + this.v] == 0
            && this.a[808 + this.v] <= this.a[707 + this.v]
            && this.z / 10 > this.B
            && this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            this.p();
         }
      }

      return false;
   }

   private void u() {
      if (true) return false;
      if (this.a[202 + this.v] != 0 || this.a[303 + this.v] != 0 || this.a[1313 + this.v] == -1 || this.z / 10 > this.B && this.a[808 + this.v] > 0) {
         this.a[2929 + this.v] = this.b(this.v);
         this.E = 0;
         if (this.c()) {
            return;
         }

         if ((this.a[2929 + this.v] & 255) <= 7 && this.E < 2) {
            this.D();
            if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0 && this.a[4545 + this.v] <= -111 && this.a[4545 + this.v] >= -122) {
               this.a[2929 + this.v] = (byte)(-5 - (this.u ^ 1) * 3 * 2 - this.a[4545 + this.v]);
               this.a[3030 + this.v] = 0;
               this.a[808 + this.v] = 0;
               this.a[1313 + this.v] = 1;
               this.a.c(this.a[0 + this.v], this.a[101 + this.v], 1, 1);
               if (this.u == 0) {
                  this.R--;
                  return;
               }
            }
         }
      } else if ((this.a[2929 + this.v] & 255) <= 7) {
         this.a[3030 + this.v] = 0;
         this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 15);
         this.P();
         this.a[808 + this.v] = 0;
      }
   }

   private boolean c() {
      if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0 && this.a[1313 + this.v] != -1) {
         try {
            this.a[606 + this.v] = this.b[this.a[4]
               + (this.a[0][this.v][this.a[707 + this.v]] - this.a[0 + this.v] + 1) * 3
               + this.a[1][this.v][this.a[707 + this.v]]
               - this.a[101 + this.v]
               + 1];
         } catch (Exception var2) {
            this.N();
            this.a[808 + this.v] = 0;
            return true;
         }

         if (this.b[this.a[1][this.v][this.a[707 + this.v]]][this.a[0][this.v][this.a[707 + this.v]]] != 0
            && this.a(this.a[0][this.v][this.a[707 + this.v]], this.a[1][this.v][this.a[707 + this.v]], 0) != 0) {
            if (!this.b && this.y > 1) {
               if (this.a[2828 + this.v] == 0 || this.a[2828 + this.v] == 3) {
                  this.a[2828 + this.v]++;
               }

               if (this.a[6161 + this.v] == 1) {
                  this.a[6161 + this.v] = 0;
               }
            }

            this.p();
            return true;
         }

         if (this.b[this.a[1][this.v][this.a[707 + this.v]]][this.a[0][this.v][this.a[707 + this.v]]] > this.u * 50
            && this.b[this.a[1][this.v][this.a[707 + this.v]]][this.a[0][this.v][this.a[707 + this.v]]] <= (this.u + 1) * 50) {
            this.a(this.b[this.a[1][this.v][this.a[707 + this.v]]][this.a[0][this.v][this.a[707 + this.v]]]);
         } else {
            this.a[4848 + this.v] = 0;
         }

         if (this.E == 0) {
            this.C = this.a[0 + this.v] + this.b[this.a[1] + 0 + this.a[606 + this.v]];
            this.D = this.a[101 + this.v] + this.b[this.a[1] + 8 + this.a[606 + this.v]];
            if (this.b[this.D][this.C] != 0) {
               this.a[4545 + this.v] = (byte)(-this.b[this.D][this.C]);
            }

            this.b[this.D][this.C] = -128;
         }

         if ((this.a[2929 + this.v] & 255) <= 7 && this.E < 2) {
            this.a[707 + this.v]++;
         }
      }

      return false;
   }

   private void v() {
      if (true) return false;
      try {
         this.d = false;
         if (this.a[5959 + this.v] > 0
            && this.a[3030 + this.v] == 0
            && this.a[6565 + this.v] == 1
            && (
               this.a[2828 + this.v] >= 5 && this.a[2828 + this.v] <= 9
                  || this.a[2828 + this.v] == 93
                  || this.a[2828 + this.v] == 92
                  || this.a[2828 + this.v] == 106
            )
            && (this.a[2929 + this.v] & 255) > 7
            && this.a[5858 + this.v] + 2 < this.a[5959 + this.v]) {
            this.a[2929 + this.v] = 34;
         } else {
            this.w();
            if (this.a[3030 + this.v] >= this.a.j[4][this.a[2929 + this.v] & 0xFF]) {
               this.a[3030 + this.v] = 0;
               if (this.a[4646 + this.v] < -1) {
                  this.a[4646 + this.v] = -1;
               }

               if ((this.a[2929 + this.v] & 255) > 7) {
                  if (this.d()) {
                     return;
                  }

                  if (this.b[this.a[39] + this.a[2828 + this.v]] == 2 && this.a[1313 + this.v] == -3) {
                     if (this.a[2828 + this.v] == 59
                        && this.a[4646 + this.v] == 0
                        && (this.b[this.a[138] + 156 + this.a[8749 + this.a[4444 + this.v]]] >= 0 || this.a[8627 + this.a[4444 + this.v]] != 0)) {
                        this.a.a(this.a[4444 + this.v], false);
                     }

                     this.x();
                     return;
                  }

                  if (this.e()) {
                     return;
                  }

                  this.d = true;
               }
            }

            this.y();
         }
      } catch (Exception var2) {
      }
   }

   private void w() {
      this.a[3030 + this.v]++;
      if (this.b[this.a[171] + (this.a[2929 + this.v] & 255)] != -2) {
         this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] + 16);
      }

      if (this.a[2828 + this.v] <= 4
         && this.a[this.b[this.b[this.a[26] + this.a[2828 + this.v]]] + this.a[4444 + this.v]] > 0
         && this.a.j[5][this.a[2929 + this.v] & 0xFF] == this.a[3030 + this.v]) {
         this.c(
            this.a[0 + this.v] + this.b[this.a[1] + this.a[606 + this.v]],
            this.a[101 + this.v] + this.b[this.a[1] + 8 + this.a[606 + this.v]],
            this.a.j[6][this.a[2929 + this.v] & 0xFF]
         );
      }

      if (this.a[3030 + this.v] == this.a.j[4][this.a[2929 + this.v] & 0xFF] - 1 && this.a[2929 + this.v] >= 35 && this.a[2929 + this.v] <= 36) {
         if (this.a[2828 + this.v] >= 5 && this.a[2828 + this.v] <= 9) {
            this.a(this.a[0 + this.v], this.a[101 + this.v], 0, this.b[this.a[123] + this.a[2828 + this.v] - 5]);
         } else if (this.a[2828 + this.v] == 93 || this.a[2828 + this.v] == 92 || this.a[2828 + this.v] == 106) {
            this.a(this.a[0 + this.v], this.a[101 + this.v], 24, 37);
         }
      }

      if (this.a[2929 + this.v] == 22 && this.a[3030 + this.v] == 10 && this.a[2828 + this.v] <= 26) {
         if (this.a[2828 + this.v] < 26) {
            this.a[this.u][23] = (short)(this.a[this.u][23] + this.a[3636 + this.v]);
         }

         this.J();
      }

      if (this.a[2929 + this.v] == -108 && this.a[3030 + this.v] == 6) {
         this.a[6464 + this.v] = 69;
      }

      if (this.a[2929 + this.v] == -109 && this.a[3030 + this.v] == 1) {
         this.a[6464 + this.v] = this.b[this.a[29] + this.a[2828 + this.v]];
      }
   }

   private boolean d() {
      if (this.a[2929 + this.v] == -107 || this.a[2929 + this.v] == -106) {
         this.i(this.z);
         return true;
      }

      if (this.a[2929 + this.v] == -95) {
         this.a[3131 + this.v] = this.a[8384];
         this.a[3232 + this.v] = this.a[8445];
         this.g(3);
         this.p();
         return true;
      }

      if (this.z / 10 <= this.B && this.a[2828 + this.v] != 85 && this.a[2828 + this.v] != 80) {
         if (this.a[6161 + this.v] == 1) {
            this.a[6161 + this.v] = 0;
         }

         this.a[7777 + this.v] = 0;
      }

      if (this.a[2929 + this.v] >= 106 && this.a[2929 + this.v] <= 108) {
         this.a[1919 + this.v] = (byte)(this.a[1919 + this.v] - this.b[this.a[106] + this.a[2929 + this.v] - 106]);
         this.a.a.f[this.v] = (byte)(this.a.a.f[this.v] - this.b[this.a[106] + this.a[2929 + this.v] - 106]);
         this.P();
         this.a[1313 + this.v] = 0;
         this.a[4545 + this.v] = 0;
         if (this.a[1919 + this.v] <= 0) {
            this.a(19, this.a[0 + this.v], this.a[101 + this.v], (byte)this.v);
         }

         return true;
      } else {
         return false;
      }
   }

   private void x() {
      this.a[8932 + this.a[4444 + this.v]]--;
      if (this.a[8993 + this.a[4444 + this.v]] == this.v) {
         this.a[8993 + this.a[4444 + this.v]] = this.a[4545 + this.v];
      } else {
         this.x = this.a[8993 + this.a[4444 + this.v]];

         while (this.a[4545 + this.x] != this.v && this.x != 0) {
            this.x = this.a[4545 + this.x];
         }

         this.a[4545 + this.x] = this.a[4545 + this.v];
      }

      if ((this.a[8871 + this.a[4444 + this.v]] & 2) != 0 && (this.a[7979 + this.v] & 4) != 0) {
         this.a[8871 + this.a[4444 + this.v]] = (byte)(this.a[8871 + this.a[4444 + this.v]] & 253);

         for (this.x = this.a[8993 + this.a[4444 + this.v]]; this.a[4545 + this.x] != 0; this.x = this.a[4545 + this.x]) {
            if ((this.a[7979 + this.x] & 4) != 0 && (this.a[8627 + this.a[4444 + this.v]] != 0 || this.a[8749 + this.a[4444 + this.v]] != 8)) {
               this.a[8871 + this.a[4444 + this.v]] = (byte)(this.a[8871 + this.a[4444 + this.v]] | 2);
               break;
            }
         }
      }

      this.a[4646 + this.v] = -1;
      this.a[4545 + this.v] = 0;
      this.b(this.a[4444 + this.v]);
      this.a(
         (int)1,
         (int)127,
         (int)(this.a[8383 + this.a[4444 + this.v]] + this.b[this.a[24] + this.a[8749 + this.a[4444 + this.v]]]),
         (int)(this.a[8444 + this.a[4444 + this.v]] + this.b[this.a[25] + this.a[8749 + this.a[4444 + this.v]]])
      );
      this.a[0 + this.v] = this.a[3131 + this.v];
      this.a[101 + this.v] = this.a[3232 + this.v];
      this.a[202 + this.v] = 0;
      this.a[303 + this.v] = 0;
      this.a[606 + this.v] = this.b[this.a[111] + this.a[8749 + this.a[4444 + this.v]]];
      this.b[this.a[101 + this.v]][this.a[0 + this.v]] = (byte)this.v;
      this.a[1313 + this.v] = 0;
      this.a[1818 + this.v] = (byte)(this.a[1818 + this.v] - 2);
      if (this.a[2828 + this.v] == 59) {
         this.a[6464 + this.v] = 69;
         this.a[6262 + this.v] = this.a[0 + this.v];
         this.a[6363 + this.v] = this.a[101 + this.v];
      }

      this.P();
      this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 240);
      this.a[5050 + this.v] = this.a[1010 + this.v];
      this.a.h(this.v);
      if (this.a[2828 + this.v] >= 109) {
         this.a[6161 + this.v] = 0;
      }

      if ((this.a.p & 3) == 1 && this.a[7575 + this.v] > 3 && this.u == 0 && this.a.q < 7) {
         this.b(this.v, 0, 1);
         this.a.b(61);
         this.a.p = (byte)(this.a.p | 2);
      } else if (this.b[this.a[160] + this.a[2828 + this.v]] == 69 && this.a[2828 + this.v] < 109) {
         if (!this.n()) {
            this.a(
               (int)1,
               (int)21,
               (int)b(this.a[0 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.c - 1),
               (int)b(this.a[101 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.d - 1)
            );
            this.Q();
         }

         this.p();
         this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0);
      } else {
         if (this.a[6161 + this.v] < 2) {
            this.N();
         }
      }
   }

   private boolean e() {
      if (this.b[this.a[39] + this.a[2828 + this.v]] == 1
         && this.a[4040 + this.v] > 0
         && (this.a[2929 + this.v] & 255) >= 8
         && this.a[3131 + this.v] == this.a[0 + this.v]
         && this.a[3232 + this.v] == this.a[101 + this.v]) {
         if (this.c((int)this.a[4444 + this.v])) {
            this.a[2929 + this.v] = this.b(this.v);
            if (this.a[8810 + this.a[4444 + this.v]] != this.v || this.a[8749 + this.a[4444 + this.v]] == 2 && this.a[8627 + this.a[4444 + this.v]] == 0) {
               this.a[8932 + this.a[4444 + this.v]]++;
            }

            this.a[606 + this.v] = this.a[4040 + this.v];
            this.a[1313 + this.v] = -1;
            this.a[4040 + this.v] = -100;
            this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 240);
            this.a[4848 + this.v] = 0;
         } else if (this.b[this.a[41] + this.a[2828 + this.v]] == 0 && this.a[2828 + this.v] != 69 && this.a[8749 + this.a[4444 + this.v]] != 11) {
            if (this.a((int)this.a[8749 + this.a[4444 + this.v]])) {
               this.g(1);
            }
         } else if (this.b[this.a[41] + this.a[2828 + this.v]] != 0
            && (this.b[this.a[41] + this.a[2828 + this.v]] < 13 || this.b[this.a[41] + this.a[2828 + this.v]] > 15)) {
            this.Q();
         }

         return true;
      } else {
         return (this.a[2929 + this.v] & 255) <= 7;
      }
   }

   private void y() {
      if (this.b[this.a[171] + (this.a[2929 + this.v] & 255)] != -2 && (this.a[1111 + this.v] & 255) >> 4 >= this.b[this.a[37] + this.a[2828 + this.v]]
         || this.b[this.a[171] + (this.a[2929 + this.v] & 255)] == -2 && this.d) {
         this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 15);
         if (this.a[2828 + this.v] == 84
            && (this.a[3939 + this.v] >= 28 && this.a[3939 + this.v] <= 49 || this.a[3939 + this.v] == 99)
            && this.b(this.a[3939 + this.v] - 28, true, this.v)) {
            this.a[404 + this.v] = 100;
         }

         if ((this.a[4444 + this.v] >= 0 && this.z / 10 <= this.B || this.a[2828 + this.v] == 85 || this.a[2828 + this.v] == 80)
            && this.i()
            && (this.a[2828 + this.v] != 69 || this.a[6161 + this.v] < 2)) {
            if (this.a[3131 + this.v] == this.a[0 + this.v] && this.a[3232 + this.v] == this.a[101 + this.v]) {
               if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
                  return;
               }
            } else {
               if (this.a[2828 + this.v] == 58 || this.a[2828 + this.v] == 57) {
                  this.v = this.a(this.v);
               }

               this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0);
               this.p();
               if (this.a[808 + this.v] > 0) {
                  return;
               }
            }

            this.d = true;
         }
      }

      if (this.d) {
         this.i(this.z);
      }
   }

   private void i(int var1) {
      if (!this.f()) {
         if (this.a[2828 + this.v] != 69 || this.a[202 + this.v] != 0 || this.a[303 + this.v] != 0) {
            if (this.a[2828 + this.v] == 84 && this.a[3939 + this.v] == 69 && this.x < 10) {
               this.a(this.v, (byte)85);
            }
         } else if (this.x < 3) {
            this.a[606 + this.v] = (byte)(this.a[606 + this.v] + this.x % 3 + 7 & 7);
         } else if (this.x < 5 && var1 == 0 && (this.a[7979 + this.v] & 2) == 0) {
            this.M();
         }

         if ((this.a[2828 + this.v] <= 9 || this.a[2828 + this.v] == 93 || this.a[2828 + this.v] == 92 || this.a[2828 + this.v] == 106) && var1 / 10 <= this.B) {
            this.H = this.a[6565 + this.v];
            this.y = this.a.a(16777215, (int)(this.b[this.a[18] + this.H] == 0 ? 2 + this.a[1717 + this.v] : 1));
            this.a[2929 + this.v] = this.b[this.a[161] + this.b[this.a[163] + this.H] + this.y];
         } else if (this.b(var1)) {
            return;
         }

         if (this.b[this.a[38] + this.H] != 0 && this.H != 105) {
            this.a[606 + this.v] = (byte)(var1 % 10);
         }

         if (this.H >= 94 && this.H <= 97 && (this.a[7979 + this.v] & 16) == 0) {
            this.a.a(this.v, (byte)1);
            this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 16);
         }

         if (this.a[2929 + this.v] == 39 || this.a[2929 + this.v] == 104 || this.a[2929 + this.v] == 105) {
            this.a[3333 + this.v] = (byte)(11 + (this.x & 1));
         }

         if (this.H == 57 && this.u == 0 && this.a.q < 7 && ((this.a.p & 5) == 1 || (this.a.p & 9) == 1 && this.a[9115 + this.a[4444 + this.v]] == 2)) {
            this.b(this.v, 0, 1);
            this.a.b((this.a.p & 5) == 1 ? 60 : 62);
            this.a.p = (byte)(this.a.p | ((this.a.p & 5) == 1 ? 4 : 8));
         }
      }
   }

   private boolean f() {
      if (this.a[2828 + this.v] == 78 && this.a[2929 + this.v] >= 113 && this.a[2929 + this.v] <= 116) {
         return true;
      }

      if (this.a[4646 + this.v] >= 0 && this.a[1313 + this.v] == -2) {
         this.a.d(this.a[4444 + this.v]);
         if (this.a[2828 + this.v] == 51) {
            this.C = this.a[8810 + this.a[4444 + this.v]];
            if (this.a[1313 + this.C] >= 0 && this.a[4646 + this.C] >= 0) {
               this.a[2828 + this.C] = 55;
            } else {
               this.a[6161 + this.v] = 3;
               this.a[2828 + this.v] = 87;
            }
         }

         if (this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.v]]] != this.b[this.a[42] + this.b[this.a[41] + this.a[2828 + this.v]]]
            && this.b[this.a[42] + this.b[this.a[41] + this.a[2828 + this.v]]] > 0) {
            this.a[2929 + this.v] = -109;
            this.a[1313 + this.v] = (byte)(this.a[8627 + this.a[4444 + this.v]] != 0 ? 50 : (this.a[8749 + this.a[4444 + this.v]] == 7 ? 51 : 1));
            return true;
         }

         if (this.a[8810 + this.a[4444 + this.v]] == this.v
            && (this.a[8749 + this.a[4444 + this.v]] >= 12 || this.a[8627 + this.a[4444 + this.v]] != 0)
            && this.a[3636 + this.v] == 9) {
            if (this.a[8749 + this.a[4444 + this.v]] >= 12) {
               this.v = 0;

               while (this.v < 10 && this.f[0][this.v] != this.a[4444 + this.v]) {
                  this.v++;
               }

               this.f[1][this.v]++;
            } else {
               this.v = 0;

               while (this.v < 20 && this.g[0][this.v] != this.a[4444 + this.v]) {
                  this.v++;
               }

               this.g[2][this.v] = (byte)(this.g[2][this.v] * -1);
            }

            this.a[3636 + this.v] = 0;
            this.a[3535 + this.v] = 0;
            this.a[1313 + this.v] = (byte)(this.a[8627 + this.a[4444 + this.v]] != 0 ? 50 : 1);
            this.a[2929 + this.v] = -102;
            return true;
         }
      }

      this.x = this.a.a(16777215, (int)100);
      return false;
   }

   private boolean b(int var1) {
      if ((this.a[4444 + this.v] < 0 || var1 / 10 > this.B || this.b[this.a[39] + this.a[2828 + this.v]] == 1 && this.a[4646 + this.v] < 0)
         && this.a[2828 + this.v] != 105
         && this.a[2828 + this.v] != 85) {
         if (this.a[1414 + this.v] >= 12) {
            this.H = 69;
         } else {
            this.H = 17;
         }
      } else {
         this.a[4848 + this.v] = 0;
         this.H = this.a[2828 + this.v];
      }

      if (this.H == 13) {
         if ((this.a[2929 + this.v] & 255) < 141) {
            this.a[2929 + this.v] = -111;
            this.a[606 + this.v] = (byte)(
               this.b[this.a[101 + this.v]][this.a[0 + this.v] + 1] <= -61 && this.b[this.a[101 + this.v]][this.a[0 + this.v] + 1] >= -110 ? 0 : 4
            );
            return true;
         }

         if (this.a[2929 + this.v] == -110) {
            return true;
         }
      }

      if ((this.a[2929 + this.v] == -101 || this.a[2929 + this.v] == -100) && this.x > 20) {
         this.z();
      } else if (this.H == 69 && (this.a[7979 + this.v] & 2) == 0 && this.x > 98 && this.g()) {
         return true;
      }

      if (this.H == 72) {
         this.y = this.b[this.a[158] + this.b[this.a[77] + this.a[6565 + this.v]]];
      } else if (this.H == 69 && (this.a[7979 + this.v] & 2) > 0) {
         this.y = 6;
      } else if ((this.H == 69 || this.H == 109 || this.H == 60 || this.H == 51 || this.H == 87) && (this.a[3535 + this.v] != 0 || this.a[6565 + this.v] == 1)) {
         this.y = this.H == 60 ? 1 : (this.H != 51 && this.H != 87 ? 4 : 2);
      } else if (this.H == 83 || this.H == 85 || this.H == 105) {
         this.y = this.a[1313 + this.v];
      } else if (this.H == 84) {
         this.y = this.b[this.a[167] + this.a[1313 + this.v]];
      } else {
         this.y = 0;
      }

      for (this.y = this.y + (this.b[this.a[166] + this.H] & 255); this.y < (this.b[this.a[166] + this.H + 1] & 255); this.y++) {
         if (this.b[this.a[165] + this.y] > this.x) {
            this.a[2929 + this.v] = this.b[this.a[164] + this.y];
            if (this.a[4646 + this.v] < 0 || this.a[8749 + this.a[4444 + this.v]] != 2 || this.a[1313 + this.v] <= 0) {
               if ((this.b[this.a[171] + (this.a[2929 + this.v] & 255)] & 254) != 254 && this.x >= 85) {
                  this.a[2929 + this.v] = this.b[this.a[171] + (this.a[2929 + this.v] & 255)];
               }

               if (this.a[4646 + this.v] >= 0) {
                  this.a[1313 + this.v] = (
                           this.a[2828 + this.v] == this.b[this.a[58] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
                              || this.a[2828 + this.v] == 53
                              || this.a[2828 + this.v] == 111
                              || this.a[4646 + this.v] > 0 && this.a[8749 + this.a[4444 + this.v]] < 12
                        )
                        && this.a[8627 + this.a[4444 + this.v]] == 0
                     ? (byte)(this.y - (this.b[this.a[166] + this.H] & 255))
                     : 50;
               }
            }
            break;
         }
      }

      return false;
   }

   private boolean g() {
      for (this.C = this.a[0 + this.v] - 1; this.C < this.a[0 + this.v] + 2; this.C += 2) {
         for (this.D = this.a[101 + this.v] - 1; this.D < this.a[101 + this.v] + 2; this.D++) {
            if (this.C > 0 && this.C < this.a.c - 1 && this.D > 0 && this.D < this.a.d - 1) {
               this.y = this.b[this.D][this.C];
               if (this.y > this.u * 50
                  && this.y <= (this.u + 1) * 50
                  && (this.a[2929 + this.y] == 8 || this.a[2929 + this.y] == 9 || this.a[2929 + this.y] >= 15 && this.a[2929 + this.y] <= 18)) {
                  this.a[2929 + this.v] = (byte)(this.a[3535 + this.v] == 0 && this.a[6565 + this.v] != 1 ? -101 : -100);
                  this.a[606 + this.v] = (byte)(this.b[this.a[53] + (12 + this.D - this.a[101 + this.v]) * 25 + 12 + this.C - this.a[0 + this.v]] % 10);
                  this.a[606 + this.y] = (byte)(this.a[606 + this.v] + 4 & 7);
                  this.a[4646 + this.v] = (byte)(-92 - this.b[this.a[99] + 8 + this.a[606 + this.v]]);
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void z() {
      this.y = this.b[this.a[101 + this.v] + this.b[this.a[1] + 8 + this.a[606 + this.v]]][this.a[0 + this.v] + this.b[this.a[1] + this.a[606 + this.v]]];
      if (this.y > this.u * 50
         && this.y <= (this.u + 1) * 50
         && (this.a[2929 + this.y] == 8 || this.a[2929 + this.y] == 9 || this.a[2929 + this.y] >= 15 && this.a[2929 + this.y] <= 18)) {
         this.a[2929 + this.y] = (byte)(this.a[3535 + this.y] == 0 && this.a[6565 + this.y] != 1 ? -101 : -100);
         this.a[606 + this.y] = (byte)(this.a[606 + this.v] + 4 & 7);
         this.a[3030 + this.y] = (byte)(this.y < this.v ? 0 : -1);
         this.a[4646 + this.y] = (byte)(-92 - this.b[this.a[99] + 8 + this.a[606 + this.y]]);
      }
   }

   private boolean c(int var1) {
      if (!this.d(var1)) {
         this.Q();
         return false;
      }

      this.s = this.a[8627 + var1] == 0
         ? this.b[this.a[138] + (this.a[9115 + var1] - 1) * 26 + this.a[8749 + var1]]
         : this.b[this.a[138] + 494 + this.a[8749 + var1]];
      if ((this.b[this.a[138] + 156 + this.a[8749 + var1]] > -1 || this.a[8627 + var1] != 0)
         && this.a[8810 + var1] > 0
         && this.a[8810 + var1] != this.v
         && (this.b[this.a[101 + this.a[8810 + var1]]][this.a[0 + this.a[8810 + var1]]] == this.a[8810 + var1] || this.a[4444 + this.a[8810 + var1]] != var1)) {
         this.s--;
      }

      return this.a[2828 + this.v] == 51
         ? this.a[8810 + var1] >= 1
            && this.a[2828 + this.a[8810 + var1]] == 57
            && this.a[1313 + this.a[8810 + var1]] >= 1
            && this.a[8932 + var1] == 1
            && this.a[9237 + var1] == 0
         : this.s > this.a[8932 + var1];
   }

   final byte a(int var1) {
      byte var2 = this.a[8932 + var1];
      if ((this.b[this.a[138] + 156 + this.a[8749 + var1]] > -1 || this.a[8627 + var1] != 0)
         && this.a[8810 + var1] > 0
         && (this.a[4646 + this.a[8810 + var1]] < 0 || this.a[4444 + this.a[8810 + var1]] != var1)) {
         var2++;
      }

      byte var3;
      return var3 = (byte)(
         var2
            + (
               b(
                     (
                           this.a[8627 + var1] == 0
                              ? (this.a[8749 + var1] != 3 ? this.b[this.a[138] + (this.a[9115 + var1] - 1) * 26 + this.a[8749 + var1]] : 1)
                              : this.b[this.a[138] + 494 + this.a[8749 + var1]]
                        )
                        - var2,
                     0,
                     7
                  )
                  << 4
            )
      );
   }

   private boolean d(int var1) {
      if (this.a[8749 + var1] >= 12 && this.a[8505 + var1] >= this.b[this.a[138] + 182 + this.a[9237 + var1]]) {
         return false;
      }

      if (this.a[8505 + var1] <= 0) {
         return false;
      }

      this.a(this.a[8383 + var1], this.a[8444 + var1], true);
      return this.b[this.a[41] + this.m] == this.b[this.a[41] + this.a[2828 + this.v]];
   }

   private boolean a(byte var1, boolean var2) {
      if (this.a[4646 + this.v] < 0
         || this.a[2929 + this.v] != this.b[this.a[173] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
            && this.a[2929 + this.v] != this.b[this.a[176] + this.b[this.a[177] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]) {
         if (this.a[2828 + this.v] == 79
            || this.a[2828 + this.v] == 80
            || this.a[2828 + this.v] >= 83 && this.a[2828 + this.v] <= 85
            || var2 && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.v]]] != 0
            || this.a[2929 + this.v] == -108 && this.a[3030 + this.v] != this.a.j[4][this.a[2929 + this.v] & 0xFF] - 1) {
            if (this.a[2828 + this.v] != 83 && this.a[2828 + this.v] != 84) {
               if (this.a[2828 + this.v] != 79) {
                  if (var2 && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.v]]] > 0 && this.a[2929 + this.v] != -108) {
                     this.a[808 + this.v] = 0;
                     this.a[2929 + this.v] = -108;
                     this.a[3030 + this.v] = var1;
                     if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
                        this.a[1313 + this.v] = (byte)(this.a[8627 + this.a[4444 + this.v]] != 0 ? 50 : (this.a[8749 + this.a[4444 + this.v]] == 7 ? 51 : 1));
                     }

                     return true;
                  }

                  return true;
               }

               this.a(this.v, (byte)80);
            } else {
               this.a(this.v, (byte)85);
            }

            this.i(0);
            this.a[3030 + this.v] = var1;
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private boolean h() {
      if ((this.a.c & 7) == (this.v & 7)) {
         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 1);
         this.a(7, 17, this.a[0 + this.v], this.a[101 + this.v]);
         if (this.u == 0) {
            for (this.B = 0; this.B < 5; this.B++) {
               if (this.a.c[1][this.B][2] >= 0 && this.a.c[1][this.B][3] != 1) {
                  this.z = (byte)(this.a.c[1][this.B][0] - this.a[0 + this.v]);
                  this.A = (byte)(this.a.c[1][this.B][1] - this.a[101 + this.v]);
                  if (this.b[this.a[53] + (this.A > -10 && this.A < 10 ? 12 + this.A : 0) * 25 + (this.z > -10 && this.z < 10 ? 12 + this.z : 0)] / 10
                     <= this.a[7575 + this.v] - 3) {
                     this.a.c[1][this.B][3] = 1;
                  }
               }
            }
         }
      }

      if (this.a[2929 + this.v] == -106 || this.a[2929 + this.v] == -107) {
         this.a[3030 + this.v]++;
         if (this.a[3030 + this.v] < this.a.j[4][this.a[2929 + this.v] & 0xFF]) {
            return true;
         }

         if (this.a[2929 + this.v] == -107) {
            this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 2);
         }

         return false;
      } else {
         if (this.a[2828 + this.v] == 69 && this.a[6464 + this.v] == 69 && this.a[7777 + this.v] == 0 && (this.a[7979 + this.v] & 3) == 1) {
            this.a[2929 + this.v] = -107;
            this.a[3030 + this.v] = 0;
            return true;
         }

         if ((this.a[7979 + this.v] & 2) == 0
            || (this.a[2828 + this.v] == 69 || this.a[2828 + this.v] == 105) && (this.a[7979 + this.v] & 1) != 0 && this.a[7777 + this.v] <= 0) {
            return false;
         }

         this.a[2929 + this.v] = -106;
         this.a[3030 + this.v] = 0;
         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 253);
         return true;
      }
   }

   private void A() {
      this.a[2222 + this.v] = this.b[this.a[41] + this.a[6464 + this.v]];

      for (this.I = 0; this.I < 4; this.I++) {
         this.a[this.b[23 + this.I] + this.v] = (byte)(9 + (this.I >> 1));
      }

      for (this.I = 2; this.I >= 0; this.I--) {
         for (this.J = 25; this.J <= 26; this.J++) {
            if (this.a[this.b[this.b[this.a[107] + this.a[this.b[this.J] + this.v]]] + this.v] <= this.a[this.b[this.b[this.a[107] + this.I]] + this.v]) {
               for (this.K = 26; this.K > this.J; this.K--) {
                  this.a[this.b[this.K] + this.v] = this.a[this.b[this.K - 1] + this.v];
               }

               this.a[this.b[this.J] + this.v] = (byte)this.I;
               break;
            }
         }
      }

      this.a[1818 + this.v] = (byte)b(this.a[1818 + this.v], 3 + this.a[1616 + this.v] / 2, 7);
      this.a[4949 + this.v] = (byte)b(this.a[4949 + this.v], this.a[1818 + this.v] + 1, 9);

      for (this.I = 3; this.I < 9; this.I++) {
         for (this.J = 23; this.J <= 24; this.J++) {
            if (this.a[this.b[this.b[this.a[107] + this.a[this.b[this.J] + this.v]]] + this.v] < this.a[this.b[this.b[this.a[107] + this.I]] + this.v]) {
               if (this.I == this.a[2525 + this.v]
                  || this.I == this.a[2626 + this.v]
                  || this.b[this.a[108] + this.I] == (this.a[2222 + this.v] < 8 && this.a[2222 + this.v] > 0 ? 7 : this.a[2222 + this.v])) {
                  break;
               }

               for (this.K = 24; this.K > this.J; this.K--) {
                  this.a[this.b[this.K] + this.v] = this.a[this.b[this.K - 1] + this.v];
               }

               this.a[this.b[this.J] + this.v] = (byte)this.I;
               break;
            }
         }
      }

      for (this.J = 23; this.J <= 26; this.J++) {
         if (this.a[this.b[this.J] + this.v] > 8) {
            this.a[this.b[this.J] + this.v] = -1;
         } else {
            this.a[this.b[this.J] + this.v] = this.b[this.a[108] + this.a[this.b[this.J] + this.v]];
         }
      }
   }

   private void B() {
      if (this.a[2929 + this.v] != 39 && this.a[2929 + this.v] != 104 && this.a[2929 + this.v] != 105) {
         if (this.a[3333 + this.v] >= 0) {
            this.a[3333 + this.v] = (byte)(-2 - this.a.a(255, (int)4));
         } else if (this.a[3333 + this.v] < -1) {
            this.a[3333 + this.v]++;
         }

         if (this.a[3333 + this.v] >= -1 && this.a[2828 + this.v] > 9) {
            if (this.a[2828 + this.v] >= 109 && this.a[2828 + this.v] <= 111) {
               this.a[3333 + this.v] = 1;
            } else {
               this.I = this.a.a(16777215, (int)22);
               if (this.I < 11
                  && this.a[this.b[this.b[this.a[56] + this.I]] + this.v] >= this.b[this.a[56] + 11 + this.I]
                  && this.a[this.b[this.b[this.a[56] + this.I]] + this.v] <= this.b[this.a[56] + 22 + this.I]
                  && this.a.a(16777215, (int)100) < this.b[this.a[56] + 33 + this.I]) {
                  this.a[3333 + this.v] = (byte)this.I;
               }

               if (this.a[3434 + this.v] < 1 && this.a[505 + this.v] < 10) {
                  this.a[3333 + this.v] = 9;
               }

               if (this.a[2020 + this.v] == 0) {
                  this.a[3333 + this.v] = 0;
               }

               if (this.a[2121 + this.v] == 0) {
                  this.a[3333 + this.v] = 2;
               }
            }
         }
      }
   }

   private void C() {
      if (this.a[2828 + this.v] != 78 || this.a[2929 + this.v] < 113 || this.a[2929 + this.v] > 116) {
         if (this.b[this.a[40] + this.a[2828 + this.v]] != -1) {
            if (this.a[3535 + this.v] != this.b[this.a[40] + this.a[2828 + this.v]]) {
               this.a[3636 + this.v] = 0;
               this.a[3535 + this.v] = this.b[this.a[40] + this.a[2828 + this.v]];
               return;
            }
         } else if (this.a[3636 + this.v] == 0) {
            this.a[3535 + this.v] = 0;
         }
      }
   }

   private void a(byte var1) {
      this.u = (byte)this.v;
      this.v = var1;
      if (!this.a((byte)(var1 < this.u ? 0 : -1), false)) {
         this.a[808 + var1] = 0;
         this.t = this.a[0 + var1];
         this.a[0 + var1] = this.a[0 + this.u];
         this.a[0 + this.u] = this.t;
         this.t = this.a[101 + var1];
         this.a[101 + var1] = this.a[101 + this.u];
         this.a[101 + this.u] = this.t;
         if (this.a[6262 + var1] == this.a[0 + this.u] && this.a[6363 + var1] == this.a[101 + this.u]) {
            this.a[6262 + var1] = this.a[0 + var1];
            this.a[6363 + var1] = this.a[101 + var1];
            this.a[3131 + var1] = this.a[0 + var1];
            this.a[3232 + var1] = this.a[101 + var1];
         }

         this.b[this.a[101 + this.u]][this.a[0 + this.u]] = this.u;
         this.b[this.a[101 + var1]][this.a[0 + var1]] = var1;
         this.a[606 + var1] = (byte)(this.a[606 + this.u] + 4 & 7);
         this.a[1111 + var1] = (byte)(this.a[1111 + var1] & 240);
         this.a[4848 + var1] = 120;
         this.a[4848 + this.u] = 120;
         this.a[2929 + var1] = this.b((int)var1);
         this.D();
         if (var1 > this.u) {
            this.a[1111 + var1] = (byte)(this.a[1111 + var1] & 240);
         }

         this.E = 1;
      } else {
         this.E = 2;
      }

      this.v = this.u;
   }

   private void D() {
      this.E();
      if ((this.a[1111 + this.v] & 15) == (this.b[this.a[15] + this.w * 9 + this.L] + 1) / 2 && this.a[4848 + this.v] != 120) {
         this.b[this.a[101 + this.v]][this.a[0 + this.v]] = 0;
         if (this.a[4545 + this.v] <= -111) {
            this.b[this.a[101 + this.v]][this.a[0 + this.v]] = this.a[4545 + this.v];
            this.a[4545 + this.v] = 0;
         }

         if (this.a[4545 + this.v] >= 111) {
            this.a[4545 + this.v] = (byte)(this.a[4545 + this.v] * -1);
            this.a[1313 + this.v] = 0;
         }

         if (this.a[1313 + this.v] == -1) {
            this.F();
            return;
         }

         this.a[0 + this.v] = (byte)(this.a[0 + this.v] + this.b[this.a[1] + 0 + this.a[606 + this.v]]);
         this.a[101 + this.v] = (byte)(this.a[101 + this.v] + this.b[this.a[1] + 8 + this.a[606 + this.v]]);
         this.b[this.a[101 + this.v]][this.a[0 + this.v]] = (byte)this.v;
      }

      if (this.a[4848 + this.v] == 120) {
         if ((this.a[1111 + this.v] & 15) < (this.b[this.a[15] + this.w * 9 + this.L] + 1) / 2) {
            this.a[202 + this.v] = (byte)(this.a[202 + this.v] - this.b[this.a[1] + 0 + this.a[606 + this.v]] * 22);
            this.a[303 + this.v] = (byte)(this.a[303 + this.v] - this.b[this.a[1] + 8 + this.a[606 + this.v]] * 16);
         }

         this.a[202 + this.v] = (byte)(
            this.a[202 + this.v]
               + this.b[this.a[9 + this.w] + this.b[this.a[12 + this.w * 2] + this.L] + (this.a[1111 + this.v] & 15)]
                  * this.b[this.a[2] + 0 + this.a[606 + this.v]]
         );
         this.a[303 + this.v] = (byte)(
            this.a[303 + this.v]
               + this.b[this.a[11 + this.w * 2] + this.b[this.a[12 + this.w * 2] + this.L] + (this.a[1111 + this.v] & 15)]
                  * this.b[this.a[2] + 8 + this.a[606 + this.v]]
         );
      }
   }

   private void E() {
      this.w = this.a[606 + this.v] & 1;
      this.L = this.a[1010 + this.v] - this.a[7777 + this.v];
      this.a[1111 + this.v]++;
      this.a[202 + this.v] = this.b[this.a[5 + this.w]
         + this.b[this.a[12 + this.w * 2] + this.L]
         + (this.b[this.a[15] + this.w * 9 + this.L] + (this.a[1111 + this.v] & 15) * this.b[this.a[1] + 0 + this.a[606 + this.v]])
            % this.b[this.a[15] + this.w * 9 + this.L]];
      this.a[303 + this.v] = this.b[this.a[7 + this.w]
         + this.b[this.a[12 + this.w * 2] + this.L]
         + (this.b[this.a[15] + this.w * 9 + this.L] + (this.a[1111 + this.v] & 15) * this.b[this.a[1] + 8 + this.a[606 + this.v]])
            % this.b[this.a[15] + this.w * 9 + this.L]];
      if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0 && this.a[4848 + this.v] == 120) {
         this.a[4848 + this.v] = 1;
      }

      if ((this.a[1111 + this.v] & 15) == (this.b[this.a[15] + this.w * 9 + this.L] + 1) / 2) {
         if ((this.b[this.a[15] + this.w * 9 + this.L] & 1) == 0 && this.b[this.a[1] + 0 + this.a[606 + this.v]] < 0) {
            this.a[202 + this.v] = (byte)(this.a[202 + this.v] + 22);
         }

         if ((this.b[this.a[15] + this.w * 9 + this.L] & 1) == 0 && this.b[this.a[1] + 8 + this.a[606 + this.v]] < 0) {
            this.a[303 + this.v] = (byte)(this.a[303 + this.v] + 16);
         }
      }
   }

   private void F() {
      this.a[202 + this.v] = 0;
      this.a[303 + this.v] = 0;
      this.a[3030 + this.v] = 0;
      this.a[1111 + this.v] = (byte)(this.a[1111 + this.v] & 240);
      if (this.a[6161 + this.v] <= 1 && this.b[this.a[39] + this.a[2828 + this.v]] == 1 && this.d(this.a[4444 + this.v])) {
         this.a.h(this.v);
         this.a[6161 + this.v] = 0;
         this.a[3131 + this.v] = this.a[0 + this.v];
         this.a[3232 + this.v] = this.a[101 + this.v];
         this.a[1313 + this.v] = -2;
         this.a[1818 + this.v] = (byte)(this.a[1818 + this.v] + 2);
         this.G();
         this.a[4545 + this.v] = this.a[8993 + this.a[4444 + this.v]];
         this.a[8993 + this.a[4444 + this.v]] = (byte)this.v;
         this.b(this.a[4444 + this.v]);
         if ((this.b[this.a[27] + this.a[2828 + this.v]] & 128) == 0) {
            this.a(
               this.v,
               this.a[8627 + this.a[4444 + this.v]] == 0
                  ? this.b[this.a[57] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
                  : this.b[this.a[59] + this.b[this.a[177] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
            );
         }

         if (this.a[4646 + this.v] == this.b[this.a[138] + 156 + this.a[8749 + this.a[4444 + this.v]]]
            || this.b[this.a[138] + 156 + this.a[8749 + this.a[4444 + this.v]]] < 0
               && this.a[8749 + this.a[4444 + this.v]] != 2
               && this.a[8749 + this.a[4444 + this.v]] != 3
            || this.a[8749 + this.a[4444 + this.v]] >= 12
            || this.a[8627 + this.a[4444 + this.v]] != 0) {
            if (this.b[this.a[42] + this.b[this.a[41] + this.b[this.a[16] + this.b[this.a[17] + 2] + this.a[8749 + this.a[4444 + this.v]]]]] == 0
               && this.a[8627 + this.a[4444 + this.v]] == 0) {
               this.a[6464 + this.v] = this.b[this.a[16] + this.b[this.a[17] + 2] + this.a[8749 + this.a[4444 + this.v]]];
            }

            this.a[6262 + this.v] = this.a[8383 + this.a[4444 + this.v]];
            this.a[6363 + this.v] = this.a[8444 + this.a[4444 + this.v]];
         }

         if ((this.a[7979 + this.v] & 4) != 0 && (this.a[8627 + this.a[4444 + this.v]] != 0 || this.a[8749 + this.a[4444 + this.v]] != 8)) {
            this.a[8871 + this.a[4444 + this.v]] = (byte)(this.a[8871 + this.a[4444 + this.v]] | 2);
         }

         this.a[2929 + this.v] = this.a[8627 + this.a[4444 + this.v]] == 0
            ? this.b[this.a[172] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
            : this.b[this.a[175] + this.b[this.a[177] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]];
      } else {
         if (this.a[6161 + this.v] == 1) {
            this.a[6161 + this.v] = 0;
         }

         if (this.a[8810 + this.a[4444 + this.v]] != this.v || this.a[8749 + this.a[4444 + this.v]] == 2 && this.a[8627 + this.a[4444 + this.v]] == 0) {
            this.a[8932 + this.a[4444 + this.v]]--;
         }

         this.a[1313 + this.v] = 0;
         this.b[this.a[101 + this.v]][this.a[0 + this.v]] = (byte)this.v;
         this.P();
         this.Q();
      }
   }

   private void G() {
      this.x = this.a[8749 + this.a[4444 + this.v]];
      this.v = this.a[8627 + this.a[4444 + this.v]] == 0 ? this.b[this.a[138] + 156 + this.x] : 0;
      this.w = this.a[8932 + this.a[4444 + this.v]];

      for (this.x = 0; this.x < 8; this.x++) {
         this.i[this.x] = 0;
      }

      for (this.x = this.a[8993 + this.a[4444 + this.v]]; this.x > 0; this.x = this.a[4545 + this.x]) {
         this.i[this.a[8627 + this.a[4444 + this.v]] == 0 ? this.a[4646 + this.x] : this.b[this.a[93] + this.b[this.a[94] + this.x] + this.a[4646 + this.x]]] = (byte)this.x;
      }

      if (this.v >= 0 && this.i[0] == 0) {
         if (this.a[8810 + this.a[4444 + this.v]] <= 0 || this.a[8810 + this.a[4444 + this.v]] == this.v) {
            if (this.a[8810 + this.a[4444 + this.v]] == this.v) {
               this.a[8932 + this.a[4444 + this.v]]++;
            }

            this.a[4646 + this.v] = this.v;
            this.a[8810 + this.a[4444 + this.v]] = (byte)this.v;
            return;
         }

         this.i[this.v] = this.a[8810 + this.a[4444 + this.v]];
         if (this.a[4646 + this.i[this.v]] < 0 || this.a[4444 + this.i[this.v]] != this.a[4444 + this.v]) {
            this.w++;
         }
      }

      this.a[4646 + this.v] = (byte)(
         this.a
               .a(
                  16777215,
                  (int)((
                        this.a[8627 + this.a[4444 + this.v]] == 0
                           ? this.b[this.a[138] + (this.a[9115 + this.a[4444 + this.v]] - 1) * 26 + this.x]
                           : this.b[this.a[138] + 494 + this.x]
                     )
                     - this.w
                     + 1)
               )
            + 1
      );
      if (this.x == 2 && this.i[0] == 0) {
         this.a[4646 + this.v] = 0;
      } else {
         this.x = 0;

         for (this.y = 0;
            this.x
               < (
                  this.a[8627 + this.a[4444 + this.v]] == 0
                     ? this.b[this.a[138] + (this.a[9115 + this.a[4444 + this.v]] - 1) * 26 + this.x]
                     : this.b[this.a[138] + 494 + this.x]
               );
            this.x++
         ) {
            if (this.i[this.x] == 0) {
               this.y++;
            }

            if (this.a[4646 + this.v] == this.y) {
               this.a[4646 + this.v] = (byte)this.x;
               break;
            }
         }

         if (this.a[8627 + this.a[4444 + this.v]] != 0) {
            this.a[4646 + this.v] = this.b[this.a[95] + this.b[this.a[96] + this.x] + this.a[4646 + this.v]];
         }
      }
   }

   private void b(byte var1) {
      this.a[8688 + var1] = 5;
      if (this.u == 0 && this.a[8749 + var1] == 11) {
         for (this.M = this.a[8993 + var1]; this.M > 0; this.M = this.a[4545 + this.M]) {
            if (this.a[4949 + this.M] + 3 > (this.a[8688 + var1] & 15)) {
               this.a[8688 + var1] = (byte)((this.a[8688 + var1] & 240) + this.a[4949 + this.M] + 3);
            }

            if (this.a[7575 + this.M] > this.a[8688 + var1] >> 4) {
               this.a[8688 + var1] = (byte)((this.a[8688 + var1] & 15) + (this.a[7575 + this.M] << 4));
            }
         }
      }
   }

   final boolean a(int var1, int var2, int var3, int var4) {
      byte var6 = 0;
      byte var7 = 1;
      byte[] var10 = new byte[2];
      this.y = 0;
      byte var9 = (byte)(this.u ^ 1);

      while (var6 < var2) {
         var6++;

         for (byte var5 = 0; var5 < 2; var5++) {
            for (byte var8 = 0; var8 < var6; var8++) {
               var10[var5] += var7;
               if (var3 + var10[0] >= 0 && var3 + var10[0] < this.a.c && var4 + var10[1] >= 0 && var4 + var10[1] < this.a.d) {
                  this.B = this.b[var4 + var10[1]][var3 + var10[0]];
                  if (var2 < 24) {
                     this.C = (byte)(this.b[this.a[53] + (12 + var10[1]) * 25 + 12 + var10[0]] / 10);
                     this.E = (byte)(this.b[this.a[53] + (12 + var10[1]) * 25 + 12 + var10[0]] % 10 + 4 & 7);
                  }

                  if (var1 > 4) {
                     if (var1 == 6) {
                        if (this.C <= 3) {
                           if (-this.B > 0 && -this.B <= 30 && this.a[9601 + this.v] == 0) {
                              if (this.a[8505 + -this.B] > 0 && this.a[8932 + -this.B] != 0) {
                                 this.a(var3 + var10[0], var4 + var10[1], this.B, 50);
                              }
                           } else if (this.B > 0 && this.B <= 100 && this.a[1919 + this.B] > 0 && (this.a[9601 + this.v] <= 0 || this.B > 50)) {
                              this.a(var3 + var10[0], var4 + var10[1], this.B, 50);
                              if (this.B > 50) {
                                 return true;
                              }
                           }
                        }
                     } else if (var1 == 7) {
                        if (this.B > var9 * 50 && this.B <= (var9 + 1) * 50) {
                           if (this.a[1919 + this.B] > 0
                              && (
                                 (this.a[7979 + this.v] & 2) > 0
                                       && 1 + (10 - this.a[7575 + this.v]) / 3 + this.a[7575 + this.B] / (this.a[7575 + this.v] - 3) >= this.C
                                    || (this.a[7979 + this.v] & 2) == 0 && this.a[4949 + this.B] >= this.C
                              )) {
                              this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 254);
                              return true;
                           }
                        } else if (-this.B > var9 * 30 && -this.B <= (var9 + 1) * 30) {
                           if (this.a[8505 + -this.B] > 0
                              && this.a[8932 + -this.B] != 0
                              && var3 + var10[0] == this.a[8383 + -this.B] + this.b[this.a[138] + 104 + this.a[8749 + -this.B]] / 2
                              && var4 + var10[1] == this.a[8444 + -this.B] + this.b[this.a[138] + 130 + this.a[8749 + -this.B]] / 2
                              && (
                                 (this.a[7979 + this.v] & 2) > 0
                                       && 1 + (10 - this.a[7575 + this.v]) / 3 + (this.a[8688 + -this.B] >> 4) / (this.a[7575 + this.v] - 3) >= this.C
                                    || (this.a[7979 + this.v] & 2) == 0 && (this.a[8688 + -this.B] & 15) >= this.C
                              )) {
                              this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 254);
                              return true;
                           }
                        } else if (-this.B >= 111 + 6 * (this.u ^ 1)
                           && -this.B < 111 + 6 * (this.u ^ 1) + 3
                           && this.a[7575 + this.v] >= 6
                           && this.C <= this.a[7575 + this.v] - 4) {
                           this.b[var4 + var10[1]][var3 + var10[0]] = (byte)(this.b[var4 + var10[1]][var3 + var10[0]] + (3 - this.u * 6));
                           this.a.c(var3 + var10[0], var4 + var10[1], 1, 1);
                           if (this.u == 0) {
                              this.R--;
                           }
                        }
                     } else if (var1 >= 8
                        && this.B >= (var1 == 9 ? 51 : 1)
                        && this.B <= (var1 == 9 ? 100 : 50)
                        && this.a[1919 + this.B] > 0
                        && this.a[1414 + this.B] >= 12) {
                        this.a.p[6 + this.O] = this.B;
                        this.O++;
                     }
                  } else {
                     if (var1 == 3) {
                        if (this.B != 0 && this.B != this.c[0][this.ae] && this.B != this.c[1][this.ae] || var3 + var10[0] >= this.a.c - 1) {
                           continue;
                        }

                        this.B = this.b[var4 + var10[1]][var3 + var10[0] + 1];
                        if (this.B != 0 && this.B != this.c[1][this.ae]) {
                           continue;
                        }

                        this.B = this.c[1 - (this.a[8282 + this.v] & 1)][this.ae];
                        if (this.a[2828 + this.B] == 109) {
                           this.a[3131 + this.B] = (byte)(var3 + var10[0] + 1 - (this.a[8282 + this.v] & 1));
                           this.a[3232 + this.B] = (byte)(var4 + var10[1]);
                        }
                     } else if (var1 != 2 && var1 != 1
                        ? (
                           var1 == 4
                              ? this.a.b[var4 + var10[1]][var3 + var10[0]] < 95 || this.a.b[var4 + var10[1]][var3 + var10[0]] > 114 || this.B != 0
                              : !this.c(this.B)
                        )
                        : this.B != 0) {
                        continue;
                     }

                     this.a[this.b[var1 == 2 ? 112 : 31] + this.v] = (byte)(var3 + var10[0] + (var1 == 3 ? this.a[8282 + this.v] & 1 : 0));
                     this.a[this.b[var1 == 2 ? 113 : 32] + this.v] = (byte)(var4 + var10[1]);
                     if (var1 >= 1 && var1 <= 3 || this.v == 0) {
                        return true;
                     }

                     this.a[4444 + this.v] = -1;
                     this.o();
                     if (this.a[808 + this.v] > 0 || this.a(this.a[0 + this.v], this.a[101 + this.v], 0) / 10 <= this.B) {
                        if (this.a[6161 + this.v] > 0 || this.a[2828 + this.v] == 10 || this.a[2828 + this.v] == 13 || this.a[2828 + this.v] == 15) {
                           this.a[6262 + this.v] = this.a[3131 + this.v];
                           this.a[6363 + this.v] = this.a[3232 + this.v];
                        }

                        this.g(2);
                        return true;
                     }
                  }
               }
            }
         }

         var7 *= -1;
      }

      return false;
   }

   private void H() {
      this.P = this.a[101] + this.a.q * 4;
      if ((this.I & this.u + 1) == 0
         || this.f < 50
            && (
               this.y == 2
                  || this.y == 1 && this.a.q != 2
                  || this.z < this.b[this.P]
                  || this.A < this.b[this.P + 1]
                  || this.z > this.b[this.P + 2]
                  || this.A > this.b[this.P + 3]
            )) {
         this.B = this.b[this.A][this.z];
         if (!this.a) {
            if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v && this.a[1313 + this.v] > 0) {
               this.a[2828 + this.v] = 87;
               this.a[6161 + this.v] = 3;
            }
         } else {
            this.f = this.a[6565 + this.v] != 9
               || this.a[2828 + this.v] <= 9
               || this.u == 1
               || this.a.N
               || this.y == 1
               || this.a[0 + this.v] - this.a[8384] >= -6
                  && this.a[0 + this.v] - this.a[8384] <= 6
                  && this.a[101 + this.v] - this.a[8445] >= -6
                  && this.a[101 + this.v] - this.a[8445] <= 6;
            if ((this.f || this.a[2828 + this.v] != 59) && (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v || this.y != 1)) {
               this.a[3131 + this.v] = this.f ? this.z : this.a[0 + this.v];
               this.a[3232 + this.v] = this.f ? this.A : this.a[101 + this.v];
               if (this.f) {
                  if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
                     this.g(1);
                     if ((this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0)) / 10 > this.B) {
                        this.p();
                     }
                  } else {
                     if (this.a[2828 + this.v] <= 82) {
                        this.a[0 + this.v] = this.a[8383 + this.a[4444 + this.v]];
                        this.a[101 + this.v] = this.a[8444 + this.a[4444 + this.v]];
                     }

                     this.a[4747 + this.v] = this.B;
                     this.a[4444 + this.v] = (byte)(this.B * this.b[this.a[62] + this.y] - (this.y == 2 ? 101 : 0));
                     this.a(this.v, this.b[this.a[61] + this.y]);
                     this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0);
                     this.i(this.z);
                     this.a[3030 + this.v] = 0;
                     this.a[1313 + this.v] = 1;
                  }
               } else {
                  this.a(this.v, (byte)59);
                  this.a[2929 + this.v] = -95;
                  this.a[3030 + this.v] = 0;
                  this.a[3636 + this.v] = 0;
                  this.a[808 + this.v] = 0;
               }
            }
         }

         if (this.y == 4 && this.u == 0) {
            if ((this.a[7979 + this.v] & 2) == 0) {
               this.a((byte)4, this.v, this.B);
            }

            if (this.d[0] < 0) {
               this.d[0] = 0;
               this.a.a((byte)6, this.z, this.A, (byte)0);
            }
         }

         this.D = this.F;
         if ((this.y == 4 || this.y == 2 && (this.a[7979 + this.v] & 128) != 0) && (this.a[7979 + this.v] & 2) == 0) {
            this.a(this.a[0 + this.v], this.a[101 + this.v], this.a[4949 + this.v]);
         }
      } else if (this.y == 4) {
         if (this.a[4646 + this.v] < 0) {
            this.a(this.v, false);
            this.a(this.v, (byte)69);
         } else {
            this.a(this.v, (byte)87);
            this.a[6161 + this.v] = 3;
         }
      }

      if (this.f < this.b[this.a[291] + this.a.q]
         && this.u == 0
         && this.b[this.a[287] + this.b[this.a[288] + this.a.q] + this.f] == 1
         && this.y == 4
         && this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
         this.b(this.v, this.B > 0 ? this.B : 0, this.z, this.A);
      }
   }

   private void a(int var1, int var2, byte var3, int var4) {
      if (this.b[this.a[181] + this.a[9535 + this.v]] <= var4 && this.a[9601 + this.v] == 0) {
         this.e(true);
      } else {
         this.a[9645 + this.v] = (byte)var1;
         this.a[9667 + this.v] = (byte)var2;
         this.a[9601 + this.v] = var3;
      }
   }

   private boolean c(byte var1) {
      if (var1 == this.a[4747 + this.v]
         && this.a[2828 + this.v] != 10
         && this.a[2828 + this.v] != 15
         && this.a[2828 + this.v] != 12
         && this.a[2828 + this.v] != 16
         && this.a[2828 + this.v] != 13) {
         return true;
      }

      if (this.a[2828 + this.v] >= 10 && this.a[2828 + this.v] <= 16 && var1 <= -61 && var1 >= -110) {
         byte var2 = this.b[this.a[16] + this.b[this.a[17] + 3] + this.a[9772 - var1]];
         if ((this.a[2828 + this.v] == 12 || this.a[2828 + this.v] == 16) && (var2 == 12 || var2 == 16) && this.a[9822 - var1] > 0
            || this.a[9872 - var1] > 0 && var2 == this.a[2828 + this.v]) {
            return true;
         }
      }

      return false;
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.N = this.a[289] + this.b[this.a[290] + this.a.q] + this.f * 4;
      if (var3 >= this.b[this.N]
         && var4 >= this.b[this.N + 1]
         && var3 <= this.b[this.N + 2]
         && var4 <= this.b[this.N + 3]
         && (this.a.q == 3 || this.a[1919 + this.a[0][17]] > 0 && this.a[1414 + this.a[0][17]] >= 12)) {
         if (this.a.q == 4 && this.f == 1) {
            this.c(false);

            for (this.N = 0; this.N < 4; this.N++) {
               this.a.p[this.N + 1] = this.e[this.N][0] != 0 ? this.e[this.N][0] : this.e[0][0];
            }
         } else {
            this.b(var1, var2, 1);
            this.a[3131 + var2] = this.a[0 + var2];
            this.a[3232 + var2] = this.a[101 + var2];
            this.O = 0;
            this.a(this.a.q == 2 ? 9 : 8, 25, this.a[0 + (this.a.q == 2 ? var2 : var1)], this.a[101 + (this.a.q == 2 ? var2 : var1)]);
         }

         this.a.b((int)this.b[this.a[286] + this.b[this.a[288] + this.a.q] + this.f]);
         this.f = (byte)(this.f + 50);
      }
   }

   private void b(int var1, int var2, int var3) {
      this.a.p[1] = this.a.p[2] = (byte)this.a[0][17];
      this.a.p[5] = (byte)var2;
      if (var1 != 0) {
         this.a.p[0] = this.a.p[2] = this.a.p[3] = this.a.p[4] = (byte)var1;
      }

      this.O = var3;

      for (this.N = var1 != this.a[0][17] && var1 != 0 ? 3 : 2; this.O <= 50 && this.N <= 4; this.O++) {
         if (this.a[1919 + this.O] > 0 && this.a[1414 + this.O] >= 12 && this.O != var1 && this.O != this.a[0][17]) {
            this.a.p[this.N] = (byte)this.O;
            this.N++;
         }
      }
   }

   private void c(boolean var1) {
      this.e = false;
      this.H = 0;
      if (this.a[8994] == this.a[0][17]) {
         this.H = 1;
      }

      this.c(this.a[0][17], 0);

      for (this.N = 1; this.N < 4; this.N++) {
         this.e[this.N][0] = this.e[this.N][1] = 0;
      }

      for (this.O = 1; this.O <= 50; this.O++) {
         if (this.a[1919 + this.O] > 0 && this.a[0][17] != this.O && this.a[1414 + this.O] >= 12) {
            this.Q = this.a[1717 + this.O] > this.a[1616 + this.O] ? this.a[1717 + this.O] : this.a[1616 + this.O];
            b var10000 = this;
            int var10001 = 1;
            int var10002 = var1 && this.e ? 1 : 0;

            while (true) {
               var10000.N = var10001 + var10002;
               if (this.N >= 4) {
                  break;
               }

               if (this.e[this.N][1] < this.Q || var1 && !this.e && this.a[6464 + this.O] == 57) {
                  for (this.P = 3; this.P > this.N; this.P--) {
                     this.e[this.P][0] = this.e[this.P - 1][0];
                     this.e[this.P][1] = this.e[this.P - 1][1];
                  }

                  this.e[this.N][0] = (byte)this.O;
                  this.e[this.N][1] = (byte)this.Q;
                  if (var1 && !this.e && this.a[6464 + this.O] == 57) {
                     this.e = true;
                  }
                  break;
               }

               var10000 = this;
               var10001 = this.N;
               var10002 = 1;
            }
         }
      }

      for (this.G = 1; this.G < 4 && this.e[this.G][0] != 0; this.G++) {
         this.c(this.e[this.G][0], this.G);
         if (this.G == 1 && var1) {
            this.a[6464 + this.e[this.G][0]] = 57;
         }
      }

      this.a[8933] = this.G;
   }

   private void c(int var1, int var2) {
      this.e[var2][0] = (byte)var1;

      for (this.N = 1; this.N < 8; this.N++) {
         this.e[var2][this.N] = this.a[this.b[this.b[this.a[186] + this.N]] + var1];
         this.a[this.b[this.b[this.a[186] + this.N]] + var1] = (byte)(
            this.b[this.a[186] + this.N] == 29 ? this.b[this.a[188] + var2] : (this.b[this.a[186] + this.N] == 46 ? var2 + 1 : this.b[this.a[187] + this.N])
         );
      }

      if (var1 != this.a[0][17] || this.H == 0) {
         this.a[4545 + var1] = this.a[8994];
         this.a[8994] = (byte)var1;
      }
   }

   final void f() {
      this.a[8933] = this.H;

      for (this.O = this.G - 1; this.O >= 0; this.O--) {
         for (this.N = 1; this.N < 8; this.N++) {
            this.a[this.b[this.b[this.a[186] + this.N]] + this.e[this.O][0]] = this.e[this.O][this.N];
         }
      }

      this.a[8994] = (byte)(this.H > 0 ? this.a[0][17] : 0);
   }

   private boolean i() {
      if ((this.a[2929 + this.v] & 255) < 8 || (this.a[2929 + this.v] & 255) > 14 || this.a[2828 + this.v] == 60 || this.a[2828 + this.v] == 87) {
         this.f = false;
         if (this.a[2828 + this.v] > 9 && !this.l()) {
            return false;
         }

         if ((this.a[2828 + this.v] < 28 || this.a[2828 + this.v] > 49) && this.a[2828 + this.v] != 99) {
            this.J();
            if (this.a[2929 + this.v] == 117) {
               this.j(0);
            }

            if (this.a[4646 + this.v] >= 0) {
               if ((this.b[this.a[70] + this.a[8749 + this.a[4444 + this.v]]] & 2) > 0
                  && this.a[8627 + this.a[4444 + this.v]] == 0
                  && (this.a[8810 + this.a[4444 + this.v]] == this.v || (this.b[this.a[70] + this.a[8749 + this.a[4444 + this.v]]] & 1) > 0)
                  && this.a[1313 + this.v] > 0) {
                  this.f = this.b(this.a[8749 + this.a[4444 + this.v]], this.a[9115 + this.a[4444 + this.v]] - 1);
               }
            } else if ((this.b[this.a[48] + this.a[2828 + this.v]] & 2) > 0) {
               this.a(
                  this.b[this.a[45] + this.a[2828 + this.v]],
                  this.b[this.a[46] + this.a[2828 + this.v]],
                  this.b[this.a[47] + this.a[2828 + this.v]],
                  this.b[this.a[64] + this.b[this.a[45] + this.a[2828 + this.v]]]
               );
            }

            if (this.j()) {
               return true;
            }

            if (this.a[2828 + this.v] == 84 && this.a[404 + this.v] == 100) {
               this.f = true;
            }

            if (this.a[2828 + this.v] == 70 || this.a[2828 + this.v] == 71) {
               this.S = (this.a[6767 + this.v] + 12) / 12;
               if (this.a[2020 + this.v] % (100 / this.S) <= 4) {
                  this.a[this.u][0]--;
               }
            }

            if (this.R * this.A >= this.b[this.a[30] + this.a[2828 + this.v]] * this.A) {
               if (this.b[this.a[31] + this.a[2828 + this.v]] > 0 && this.a[2828 + this.v] > 9) {
                  this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]] = this.b[this.a[30] + this.a[2828 + this.v]];
               }

               this.f = true;
            }
         } else {
            this.a(this.a[2828 + this.v], true, this.v);
         }

         if (this.f) {
            if (this.a[2828 + this.v] == 13 && (this.a[2929 + this.v] & 255) < 145) {
               this.a[2929 + this.v] = -110;
               this.a[3636 + this.v]--;
               this.a[404 + this.v] = 99;
               return false;
            }

            if (this.k()) {
               return true;
            }

            this.I();
            return true;
         }
      }

      return false;
   }

   private boolean j() {
      if (this.a[2929 + this.v] == -116 && this.a[404 + this.v] >= this.b[this.a[49] + this.a[2828 + this.v]]) {
         if (this.a[2828 + this.v] >= 94 && this.a[2828 + this.v] <= 97) {
            this.K();
         } else if (this.a[2828 + this.v] == 55) {
            this.j(1);
            this.a[404 + this.v] = 0;
         }
      } else if (this.b[this.a[33] + this.a[2828 + this.v]] == 4 && this.a[404 + this.v] >= this.b[this.a[49] + this.a[2828 + this.v]]) {
         if (this.a[4646 + this.v] < 0) {
            if ((this.b[this.a[48] + this.a[2828 + this.v]] & 2) == 0) {
               this.a(
                  this.b[this.a[45] + this.a[2828 + this.v]],
                  this.b[this.a[46] + this.a[2828 + this.v]],
                  this.b[this.a[47] + this.a[2828 + this.v]],
                  this.b[this.a[64] + this.b[this.a[45] + this.a[2828 + this.v]]]
               );
            }
         } else {
            if ((this.b[this.a[70] + this.a[8749 + this.a[4444 + this.v]]] & 2) == 0
                  && (this.a[8810 + this.a[4444 + this.v]] == this.v || (this.b[this.a[70] + this.a[8749 + this.a[4444 + this.v]]] & 1) > 0)
               || this.a[8627 + this.a[4444 + this.v]] != 0) {
               this.f = this.b(this.a[8627 + this.a[4444 + this.v]] == 0 ? this.a[8749 + this.a[4444 + this.v]] : 16, this.a[9115 + this.a[4444 + this.v]] - 1);
            }

            if (this.a[8627 + this.a[4444 + this.v]] != 0) {
               this.S = 0;

               while (this.S < 20 && this.g[0][this.S] != this.a[4444 + this.v]) {
                  this.S++;
               }

               this.g[1][this.S]++;
            }
         }

         if (this.b[this.a[31] + this.a[2828 + this.v]] != 13) {
            this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]] = (byte)(
               this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]] + this.A
            );
         }

         this.a[404 + this.v] = 0;
         if (this.a[2828 + this.v] == 111) {
            this.f = true;
         }

         if (this.a[2828 + this.v] == 107) {
            if (this.z < 20) {
               this.f = true;
            } else {
               this.a[4444 + this.a[4444 + this.v]] = (byte)this.v;
            }
         }

         if (this.b[this.a[31] + this.a[2828 + this.v]] == 36
            && this.b[this.a[30] + this.a[2828 + this.v]] == 99
            && this.a[3636 + this.v] >= this.a[3737 + this.v]) {
            this.f = true;
         }

         if ((this.a[2828 + this.v] == 11 || this.a[2828 + this.v] == 14) && this.a[3636 + this.v] < this.a[3737 + this.v]) {
            this.N();
            return true;
         }

         if (this.a[2828 + this.v] == 10
            || this.a[2828 + this.v] == 15
            || this.a[2828 + this.v] == 12
            || this.a[2828 + this.v] == 16
            || this.a[2828 + this.v] == 13) {
            this.a[9883 + this.a[4444 + this.v]]--;
            if (this.a[9883 + this.a[4444 + this.v]] < 0) {
               this.a[9883 + this.a[4444 + this.v]] = 0;
            }
         } else if (this.a[2828 + this.v] == 54) {
            this.a[this.u][0]++;
         }
      }

      return false;
   }

   private boolean k() {
      if (this.a[2828 + this.v] <= 9) {
         if (this.a[6565 + this.v] == 9 && (this.a[2828 + this.v] == 0 || this.a[2828 + this.v] == 3)) {
            this.a[2828 + this.v] = (byte)(this.a[2828 + this.v] ^ 1);
         }

         this.a = this.b = true;
         if (this.p()) {
            return true;
         }
      }

      if (this.a[2828 + this.v] == 26 || this.a[2828 + this.v] == 27) {
         this.f(true);
      }

      if (this.a[2828 + this.v] >= 94 && this.a[2828 + this.v] <= 97) {
         this.ao();
      }

      if (this.a[2828 + this.v] == 50) {
         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 191);
         this.L();
      }

      if (this.a[2828 + this.v] == 111) {
         this.a[3636 + this.v] = 0;
         this.o();
      }

      if (this.a[2828 + this.v] == 109) {
         this.d(this.v, 0);
      }

      if (this.a[2828 + this.v] == 110) {
         this.a[3535 + this.v] = 15;
      }

      if (this.a[2828 + this.v] == 107) {
         this.c(this.a[4444 + this.v]);
      }

      if (this.a[2828 + this.v] == 79) {
         this.a[3333 + this.v] = -1;
      }

      if (this.a[2828 + this.v] <= 4
         && this.b[this.a[3232 + this.v]][this.a[3131 + this.v]] == this.a[4747 + this.v]
         && this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[4444 + this.v]] == 0) {
         this.a((int)this.b[this.a[31] + this.a[2828 + this.v]], (int)this.a[3131 + this.v], (int)this.a[3232 + this.v], this.a[4444 + this.v]);
      }

      if ((this.b[this.a[27] + this.a[2828 + this.v]] & 8) != 0 && this.n()) {
         return true;
      }

      if (this.a[2828 + this.v] == 60) {
         this.a(this.v, (byte)12);
         if (this.b(true)) {
            return true;
         }

         this.a(this.v, (byte)60);
      }

      if (this.a[1414 + this.v] < 11 && this.a[2828 + this.v] == 17 && this.a(10)) {
         this.a(this.v, (byte)73);
         this.g(1);
         return true;
      } else {
         return false;
      }
   }

   private void I() {
      if (this.a[2828 + this.v] >= 83 && this.a[3939 + this.v] >= 44 && this.a[3939 + this.v] <= 48) {
         this.a[3535 + this.v] = (byte)(this.a[3939 + this.v] - 44 + 8);
      }

      if (this.a[2828 + this.v] == 85) {
         if (this.a[6161 + this.v] >= 2) {
            this.a[3939 + this.v] = 69;
         }

         this.a(this.v, this.a[3939 + this.v]);
         if (this.a[2828 + this.v] >= 44 && this.a[2828 + this.v] <= 48) {
            this.a[3535 + this.v] = 0;
         }

         this.a[3939 + this.v] = 69;
         this.a[1313 + this.v] = 0;
         this.a[404 + this.v] = 0;
      } else {
         this.a(
            this.v,
            this.a[2828 + this.v] >= 19 && this.a[2828 + this.v] <= 26 && this.a[6464 + this.v] == 69 ? 69 : this.b[this.a[160] + this.a[2828 + this.v]]
         );
      }

      if (this.a[2828 + this.v] == 26 || this.a[2828 + this.v] == 27) {
         this.f(false);
      }

      if (this.a[6161 + this.v] < 2 && (this.b[this.a[39] + this.a[2828 + this.v]] == 2 || this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v)) {
         this.N();
      }

      if (this.a[2828 + this.v] == 16) {
         this.an();
      }
   }

   private void J() {
      this.A = 1;
      if ((this.b[this.a[27] + this.a[2828 + this.v]] & 32) == 0) {
         this.A = -1;
      }

      this.C = (this.a[this.b[this.b[this.a[35] + this.a[2828 + this.v]]] + this.v] + this.b[this.a[36] + this.a[2828 + this.v]]) * this.A;
      if (this.b[this.a[35] + this.a[2828 + this.v]] >= 69
         && this.b[this.a[35] + this.a[2828 + this.v]] <= 74
         && this.u == 0
         && this.a[0 + this.v] - this.a[0 + this.a[0][17]] >= -4
         && this.a[0 + this.v] - this.a[0 + this.a[0][17]] <= 4
         && this.a[101 + this.v] - this.a[101 + this.a[0][17]] >= -4
         && this.a[101 + this.v] - this.a[101 + this.a[0][17]] <= 4) {
         this.C = this.C * 3 / 2;
      }

      if (this.b[this.a[33] + this.a[2828 + this.v]] <= 0) {
         this.a[this.u][-this.b[this.a[33] + this.a[2828 + this.v]]] = (short)(this.a[this.u][-this.b[this.a[33] + this.a[2828 + this.v]]] + this.C);
      } else {
         this.a[this.b[this.b[this.a[33] + this.a[2828 + this.v]]] + this.v] = (byte)(
            this.a[this.b[this.b[this.a[33] + this.a[2828 + this.v]]] + this.v] + this.C
         );
      }

      this.A = 1;
      if ((this.b[this.a[27] + this.a[2828 + this.v]] & 16) == 0) {
         this.A = -1;
      }

      this.C = this.b[this.a[34] + this.a[2828 + this.v]] >= 0
         ? this.b[this.a[34] + this.a[2828 + this.v]]
         : this.a[this.b[-this.b[this.a[34] + this.a[2828 + this.v]]] + this.v];
      this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]] = (byte)(
         this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]] + this.C * this.A
      );
      this.R = this.a[this.b[this.b[this.a[31] + this.a[2828 + this.v]]] + this.a[3838 + this.v]];
   }

   private void K() {
      this.a[404 + this.v] = 0;
      this.a(
         this.b[this.a[45] + this.a[2828 + this.v]],
         this.b[this.a[46] + this.a[2828 + this.v]],
         this.b[this.a[47] + this.a[2828 + this.v]],
         this.b[this.a[64] + this.b[this.a[45] + this.a[2828 + this.v]]]
      );
      this.f = true;
      switch (this.a[2828 + this.v]) {
         case 94:
            this.f = this.a(this.a[4444 + this.v], 10);
            return;
         case 95:
            this.a[8181 + this.a[4444 + this.v]] = 0;
            this.a[7979 + this.a[4444 + this.v]] = (byte)(this.a[7979 + this.a[4444 + this.v]] | 8);
            return;
         case 96:
            this.a[505 + this.R] = 99;
            this.R = this.v;
            this.v = this.a[4444 + this.v];
            if ((this.a[8282 + this.v] & 127) >> 1 == 0) {
               this.a(true);
            }

            this.v = this.R;
            return;
         case 97:
            for (this.R = 3; this.R >= 0; this.R--) {
               if (this.a.c[this.u][this.R][2] >= 0) {
                  for (this.S = 0; this.S < 4; this.S++) {
                     this.a.c[this.u][this.R + 1][this.S] = this.a.c[this.u][this.R][this.S];
                  }
               }
            }

            this.a.c[this.u][0][0] = this.a[3131 + this.v];
            this.a.c[this.u][0][1] = this.a[3232 + this.v];
            this.a.c[this.u][0][2] = 0;
            this.a.c[this.u][0][3] = (byte)(this.u ^ 1);
      }
   }

   private boolean a(int var1, int var2) {
      if (var2 > 1) {
         this.a[8080 + var1] = -100;
         this.a[7979 + var1] = (byte)(this.a[7979 + var1] & 251);
      }

      if (this.a[1919 + var1] >= this.a[6767 + var1] && var2 > 0) {
         return true;
      }

      if (this.u == 0 || var2 < 0) {
         this.a.a.f[var1] = (byte)(this.a.a.f[var1] + var2);
      }

      this.a[1919 + var1] = (byte)b(this.a[1919 + var1] + var2, 0, this.a[6767 + var1]);
      return this.a[1919 + var1] >= this.a[6767 + var1];
   }

   private void c(byte var1) {
      for (this.R = this.u * 50 + 1; this.R <= (this.u + 1) * 50; this.R++) {
         if (this.a[1919 + this.R] == 0) {
            if (this.u == 1) {
               this.a.e(var1);
               this.a.f(var1);
               this.a((byte)17, this.a[0][17], var1);
            }

            this.a[4444 + var1] = 0;

            for (this.S = 0; this.S < 83; this.S++) {
               this.a[this.b[this.S] + this.R] = this.a[this.b[this.S] + var1];
            }

            for (this.S = 0; this.S < 80; this.S++) {
               this.a[0][this.R][this.S] = this.a[0][var1][this.S];
               this.a[1][this.R][this.S] = this.a[1][var1][this.S];
            }

            this.a[this.u][11]++;
            this.a[this.u ^ 1][11]--;
            this.a[this.u][12 + this.a[1515 + this.R]]++;
            this.a[this.u ^ 1][12 + this.a[1515 + this.R]]--;
            this.a[1919 + var1] = 0;
            this.b[this.a[101 + this.R]][this.a[0 + this.R]] = (byte)this.R;
            this.a.b((byte)this.R);
            this.a.g((byte)this.R);
            return;
         }
      }
   }

   private void j(int var1) {
      for (this.S = this.a[8993 + this.a[4444 + this.v]]; this.S > 0; this.S = this.a[4545 + this.S]) {
         if (this.S != this.v) {
            if (var1 == 0) {
               this.a[505 + this.S] = (byte)b(this.a[505 + this.S] + (this.a[7272 + this.v] + 2) / 2, 0, 99);
               this.a[2121 + this.S] = (byte)b(this.a[2121 + this.S] + (this.a[7272 + this.v] + 2) / 2, 0, 99);
            } else {
               this.a(this.S, (int)10);
               if (this.a[1919 + this.S] >= this.a[6767 + this.S]) {
                  this.a[2828 + this.S] = 87;
                  this.a[6161 + this.S] = 3;
               }
            }
         }
      }
   }

   private boolean l() {
      for (this.A = this.b[this.a[166] + this.a[2828 + this.v]] & 255; this.A < (this.b[this.a[166] + this.a[2828 + this.v] + 1] & 255); this.A++) {
         if (this.a[2929 + this.v] == this.b[this.a[164] + this.A]) {
            return true;
         }
      }

      return false;
   }

   private boolean b(int var1, int var2) {
      this.g = true;

      for (this.T = this.b[this.a[69] + var1 * 4 + var2]; this.T < this.b[this.a[69] + var1 * 4 + var2 + 1]; this.T++) {
         if (!this.a(
            this.b[this.a[65] + this.b[this.a[68] + var1] + this.T],
            this.b[this.a[66] + this.b[this.a[68] + var1] + this.T],
            this.b[this.a[67] + this.b[this.a[68] + var1] + this.T],
            this.b[this.a[63] + this.b[this.a[68] + var1] + this.T]
         )) {
            this.g = false;
         }
      }

      return this.g;
   }

   private boolean a(byte var1, byte var2, byte var3, byte var4) {
      this.U = this.a[this.b[this.b[this.a[44] + var1]] + this.v];
      if (this.a.a(16777215, (int)100) < var2 && this.U * var4 < var3 * var4) {
         this.a[this.b[this.b[this.a[44] + var1]] + this.v] = (byte)(this.a[this.b[this.b[this.a[44] + var1]] + this.v] + var4);
         if (var1 == 4) {
            if (this.a[6767 + this.v] >= this.b[this.a[98] + this.a[1414 + this.v]]) {
               this.a[6767 + this.v] = this.b[this.a[98] + this.a[1414 + this.v]];
            }

            this.a[1919 + this.v] = (byte)(this.a[1919 + this.v] + (this.a[6767 + this.v] - this.U));
            return true;
         }
      }

      return this.a[this.b[this.b[this.a[44] + var1]] + this.v] * var4 >= var3 * var4 && var2 >= 100;
   }

   private boolean a(int var1, boolean var2, int var3) {
      this.S = var1 - 28;
      this.f = this.b(this.S, var2, var3);
      if (!this.f) {
         if (var2) {
            this.M();
            this.N();
         }

         return false;
      } else {
         int var4 = var1 == 37 ? b(9, 1, this.a[this.u][1]) : 0;
         if (var1 != 99) {
            for (this.R = this.b[this.a[73] + this.S]; this.R < this.b[this.a[73] + this.S + 1]; this.R++) {
               this.a[this.u][this.b[this.a[71] + this.R]] = (short)(
                  this.a[this.u][this.b[this.a[71] + this.R]] - (var1 == 37 ? var4 : this.b[this.a[72] + this.R])
               );
            }
         } else {
            if (this.a[8627 + this.W] == 2) {
               for (this.R = 0; this.R < 3; this.R++) {
                  this.a[this.u][2 + this.R] = (short)(
                     this.a[this.u][2 + this.R] - this.b[this.a[138] + (10 + this.R) * 26 + this.a[8749 + this.W]] * this.V / (this.a[8566 + this.W] * 2)
                  );
               }
            } else {
               for (this.R = 0; this.R < 3; this.R++) {
                  this.a[this.u][2 + this.R] = (short)(this.a[this.u][2 + this.R] - this.b[this.a[138] + (13 + this.R) * 26 + this.a[8749 + this.W]]);
               }
            }

            for (this.aK = 0; this.aK < 20; this.aK++) {
               if (this.g[0][this.aK] == this.W) {
                  this.g[2][this.aK] = (byte)(
                     this.a[8627 + this.W] == 2
                        ? -this.V
                        : this.b[this.a[138] + (7 + this.a[9115 + this.W] - 1) * 26 + this.a[8749 + this.W]]
                           - this.b[this.a[138] + (7 + this.a[9115 + this.W]) * 26 + this.a[8749 + this.W]]
                  );
                  if (!var2) {
                     this.g[2][this.aK] = (byte)(this.g[2][this.aK] * -1);
                  }
                  break;
               }
            }
         }

         if (var2) {
            if (this.a[2828 + var3] == 99) {
               this.a[3636 + var3] = 9;
               this.a[3535 + var3] = 2;
            } else if (this.a[2828 + var3] >= 44) {
               if (this.a[6565 + var3] <= 5) {
                  this.a[this.u][this.b[this.a[88] + this.a[6565 + var3]]] = (short)(
                     this.a[this.u][this.b[this.a[88] + this.a[6565 + var3]]] + this.b[this.a[105] + this.a[6565 + var3]]
                  );
               }

               this.a[6565 + var3] = (byte)(this.a[2828 + var3] - 44);
               this.a.d(this.a[4444 + var3]);
            } else {
               this.a[3636 + var3] = (byte)(var1 == 37 ? var4 : this.b[this.a[75] + this.S]);
               this.a[3535 + var3] = this.b[this.a[74] + this.S];
            }
         }

         return true;
      }
   }

   private boolean b(int var1, boolean var2, int var3) {
      if (var1 == 71) {
         this.W = var2 ? -this.b[this.a[6363 + var3]][this.a[6262 + var3]] : this.v;
         if (this.a[8627 + this.W] == 2) {
            this.V = this.a[8566 + this.W] - this.a[8505 + this.W];

            for (this.R = 0; this.R < 3; this.R++) {
               if (this.a[this.u][2 + this.R] < this.b[this.a[138] + (10 + this.R) * 26 + this.a[8749 + this.W]] * this.V / (this.a[8566 + this.W] * 2)) {
                  this.a[3535 + var3] = this.b[this.a[76] + 2 + this.R];
                  if (this.d[1] < 0 && this.u == 0) {
                     this.d[1] = 0;
                     this.a.a((byte)9, (byte)0, (byte)0, (byte)0);
                  }

                  return false;
               }
            }

            return true;
         } else {
            for (this.R = 0; this.R < 3; this.R++) {
               if (this.a[this.u][2 + this.R] < this.b[this.a[138] + (13 + this.R) * 26 + this.a[8749 + this.W]]) {
                  this.a[3535 + var3] = this.b[this.a[76] + 2 + this.R];
                  if (this.d[1] < 0 && this.u == 0) {
                     this.d[1] = 0;
                     this.a.a((byte)9, (byte)0, (byte)0, (byte)0);
                  }

                  return false;
               }
            }

            return true;
         }
      } else {
         for (this.R = this.b[this.a[73] + var1]; this.R < this.b[this.a[73] + var1 + 1]; this.R++) {
            if (this.a[this.u][this.b[this.a[71] + this.R]] < this.b[this.a[72] + this.R] && this.a[6565 + var3] != var1 - 16) {
               if (var1 < 16) {
                  this.a[3535 + var3] = this.b[this.a[76] + this.b[this.a[71] + this.R]];
                  if (this.d[1] < 0 && this.u == 0) {
                     this.d[1] = 0;
                     this.a.a((byte)9, (byte)0, (byte)0, (byte)0);
                  }
               }

               return false;
            }
         }

         return true;
      }
   }

   private void L() {
      this.X = this.a[1717 + this.v] < this.a[1616 + this.v] ? 3 : 0;

      for (this.Y = this.X; this.Y < 6 + this.X; this.Y++) {
         if (this.a[this.u][this.b[this.a[88] + this.b[this.a[103] + this.Y]]] >= this.b[this.a[104] + this.Y]) {
            this.a[this.u][this.b[this.a[88] + this.b[this.a[103] + this.Y]]] = (short)(
               this.a[this.u][this.b[this.a[88] + this.b[this.a[103] + this.Y]]] - this.b[this.a[104] + this.Y]
            );
            this.a[6565 + this.v] = this.b[this.a[103] + this.Y];
            this.a.d(this.a[4444 + this.v]);
            return;
         }
      }
   }

   private void M() {
      this.a[3939 + this.v] = this.a[2828 + this.v];
      this.a(this.v, (byte)83);
      this.R = this.b[this.a[169] + this.a[3939 + this.v]];
      this.a[1313 + this.v] = (byte)(
         this.b[this.a[168] + 0 + this.R] + this.a.a(16777215, (int)(this.b[this.a[168] + 2 + this.R] - this.b[this.a[168] + 0 + this.R] + 1))
      );
   }

   private void N() {
      if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
         if (this.a[8749 + this.a[4444 + this.v]] == 2 && this.a[4646 + this.v] == 0) {
            this.Z = this.a[8993 + this.a[4444 + this.v]];
            if (this.Z == this.v) {
               this.Z = this.a[4545 + this.v];
            }

            if (this.Z > 0) {
               this.a[4646 + this.v] = this.a[4646 + this.Z];
               this.a[4646 + this.Z] = 0;
            }
         }

         this.g(2);
      } else if (this.a[2828 + this.v] == 17
         || this.a[2828 + this.v] == 60
         || this.a[2828 + this.v] == 83
         || (this.a[2828 + this.v] == 11 || this.a[2828 + this.v] == 14) && this.a[3636 + this.v] > 0) {
         this.a[1313 + this.v] = 0;
         if (this.a[2828 + this.v] == 17 && this.a[4444 + this.v] > (this.u ^ 1) * 50 && this.a[4444 + this.v] <= ((this.u ^ 1) + 1) * 50) {
            if (this.a[2828 + this.a[4444 + this.v]] == 107) {
               this.a[3131 + this.v] = this.a[0 + this.a[4444 + this.v]];
               this.a[3232 + this.v] = this.a[101 + this.a[4444 + this.v]];
            } else {
               this.a[4444 + this.v] = 0;
            }
         } else {
            if (this.a[2828 + this.v] == 17 || this.a[2828 + this.v] == 60 || this.a[2828 + this.v] == 83) {
               this.a[4747 + this.v] = 0;
            }

            this.a(
               (int)0,
               (int)(this.a[4949 + this.v] * 2 + 1),
               (int)b(this.a[0 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.c - 1),
               (int)b(this.a[101 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.d - 1)
            );
         }
      } else if (this.a[2828 + this.v] == 109) {
         this.ae = ((this.a[8282 + this.v] & 127) >> 1) - 1;
         this.a(3, 127, this.c[2][this.ae], this.c[3][this.ae]);
         this.g(3);
      } else if (this.a[2828 + this.v] == 110) {
         if (!this.a(4, this.a[4949 + this.v] * 2 + 1, this.a[0 + this.v], this.a[101 + this.v])) {
            this.a(this.v, (byte)109);
            this.ae = ((this.a[8282 + this.v] & 127) >> 1) - 1;
            this.a(3, 127, this.c[2][this.ae], this.c[3][this.ae]);
         }

         this.g(3);
      } else {
         this.O();
      }
   }

   private void O() {
      if (this.a[2828 + this.v] == 69 || this.a[2828 + this.v] == 80 || this.a[2828 + this.v] == 84 || this.a[2828 + this.v] == 85) {
         this.a[3131 + this.v] = this.a[0 + this.v];
         this.a[3232 + this.v] = this.a[101 + this.v];
      } else if (this.a[2828 + this.v] >= 94 && this.a[2828 + this.v] <= 97) {
         this.aO = 0;

         while (this.aO < 30 && this.a.b[this.u][0][this.aO] != this.a[4040 + this.v]) {
            this.aO++;
         }

         if (this.a.b[this.u][2][this.aO] < 0) {
            this.ap();
         } else if (this.a[2828 + this.v] != 97) {
            this.a[3131 + this.v] = this.a[0 + this.a.b[this.u][2][this.aO]];
            this.a[3232 + this.v] = this.a[101 + this.a.b[this.u][2][this.aO]];
            this.a[4444 + this.v] = this.a[4747 + this.v] = this.a.b[this.u][2][this.aO];
         } else {
            this.a[3131 + this.v] = this.a.b[this.u][2][this.aO];
            this.a[3232 + this.v] = this.a.b[this.u][3][this.aO];
            this.g(2);
         }
      } else {
         if (this.a[2828 + this.v] == 27) {
            for (this.aN = 0; this.aN < 10; this.aN++) {
               this.aP = this.a.a[this.u][this.aN][11];
               if (this.aP > 0 && this.v == this.a[8810 + this.aP]) {
                  for (this.aO = 0; this.aO < 30; this.aO++) {
                     if (this.a.f[0][this.aO] == this.aP && this.a.f[1][this.aO] == this.a.a[this.u][this.aN][10] + 14) {
                        this.a[3131 + this.v] = this.a.f[2][this.aO];
                        this.a[3232 + this.v] = this.a.f[3][this.aO];
                        this.g(2);
                        return;
                     }
                  }

                  return;
               }
            }
         } else {
            if ((this.b[this.a[27] + this.a[2828 + this.v]] & 64) > 0) {
               if (this.a[2828 + this.v] != 65) {
                  this.a[3131 + this.v] = this.a[6262 + this.v];
                  this.a[3232 + this.v] = this.a[6363 + this.v];
               } else {
                  this.a[3131 + this.v] = this.a[8383 + this.a[3434 + this.v]];
                  this.a[3232 + this.v] = this.a[8444 + this.a[3434 + this.v]];
               }

               this.g(2);
               return;
            }

            if (this.a(6)) {
               this.g(2);
               return;
            }

            this.a[4444 + this.v] = -6;
         }
      }
   }

   final boolean a(int var1) {
      this.aa = 1000000;
      this.h = false;
      boolean var2 = var1 == 6;

      for (this.Z = this.u * 30 + 1; this.Z <= (this.u + 1) * 30; this.Z++) {
         if (this.a[8505 + this.Z] > 0
            && (this.a[8749 + this.Z] == var1 || var2 && this.a[8749 + this.Z] == 16 && this.a[9237 + this.Z] == 6 && this.a[2828 + this.v] <= 25)) {
            this.h = true;
            if ((this.a[8627 + this.Z] == 0 || var1 == 6)
               && (this.b[this.a[138] + 156 + var1] < 0 || this.a[8810 + this.Z] >= 1)
               && (this.a[8932 + this.Z] <= 0 || this.a[8932 + this.Z] < this.b[this.a[138] + (this.a[9115 + this.Z] - 1) * 26 + var1] || var1 == 6)) {
               this.ab = (this.a[8383 + this.Z] + this.b[this.a[138] + 104 + this.a[8749 + this.Z]] / 2 - this.a[0 + this.v])
                     * (this.a[8383 + this.Z] + this.b[this.a[138] + 104 + this.a[8749 + this.Z]] / 2 - this.a[0 + this.v])
                  + (this.a[8444 + this.Z] + this.b[this.a[138] + 130 + this.a[8749 + this.Z]] / 2 - this.a[101 + this.v])
                     * (this.a[8444 + this.Z] + this.b[this.a[138] + 130 + this.a[8749 + this.Z]] / 2 - this.a[101 + this.v]);
               if (this.aa > this.ab || var2 && this.a[8749 + this.Z] == var1) {
                  var2 = this.a[8749 + this.Z] != var1;
                  this.aa = this.ab;
                  this.ac = this.Z;
               }
            }
         }
      }

      if (this.aa < 1000000) {
         this.a[3131 + this.v] = (byte)b(
            this.a[0 + this.v], this.a[8383 + this.ac], this.a[8383 + this.ac] + this.b[this.a[138] + 104 + this.a[8749 + this.ac]] - 1
         );
         this.a[3232 + this.v] = (byte)b(
            this.a[101 + this.v], this.a[8444 + this.ac], this.a[8444 + this.ac] + this.b[this.a[138] + 130 + this.a[8749 + this.ac]] - 1
         );
         return true;
      } else {
         this.a[3131 + this.v] = this.a[0 + this.v];
         this.a[3232 + this.v] = this.a[101 + this.v];
         return false;
      }
   }

   private boolean m() {
      if (this.u == 1) {
         if ((this.a[7979 + this.v] & 32) != 0 && this.Q >= 1) {
            if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
               this.a[3131 + this.v] = this.a[0 + this.Q];
               this.a[3232 + this.v] = this.a[101 + this.Q];
               this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 223);
               this.a(this.v, (byte)69);
            } else {
               this.a[2828 + this.v] = 87;
            }

            this.a[6161 + this.v] = 3;
            return true;
         } else {
            return false;
         }
      } else if ((this.a[7979 + this.v] & 32) != 0
         || this.a.N
            && this.a[3131 + this.v] == this.a[0 + this.v]
            && this.a[3232 + this.v] == this.a[101 + this.v]
            && (this.a.c & 31) <= this.a[1010 + this.v]) {
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            if (this.a.N && (this.a[7979 + this.v] & 64) != 0) {
               this.a[3636 + this.v] = 0;
               if (this.a[2828 + this.v] != 50) {
                  if (this.a(6) && this.a[6565 + this.v] == 9) {
                     this.a(this.v, (byte)50);
                     this.a[6161 + this.v] = 3;
                     this.a[7777 + this.v] = 3;
                     return true;
                  }

                  this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 191);
               }
            } else {
               this.a[3131 + this.v] = this.a.q[0];
               this.a[3232 + this.v] = this.a.q[1];
               this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 223);
               if (this.a[0 + this.v] != this.a[3131 + this.v] || this.a[101 + this.v] != this.a[3232 + this.v]) {
                  this.a(this.v, (byte)69);
                  this.a[6161 + this.v] = 3;
                  this.a[7777 + this.v] = 3;
                  return true;
               }
            }
         } else if ((this.a.N || this.a[2020 + this.v] > 30 || this.a[8749 + this.a[4444 + this.v]] != 4) && this.a[1313 + this.v] > 0) {
            this.a[2828 + this.v] = 87;
            this.a[6161 + this.v] = 3;
            return true;
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean n() {
      if (this.a.q != 3 && !this.a.N && (!this.a.L && this.u != 1 || (this.a[7979 + this.v] & 64) == 0) && this.a[1414 + this.v] >= 12) {
         if (this.u == 0) {
            if (this.o()) {
               return true;
            }

            if (this.a(false)) {
               return true;
            }
         }

         if (this.b[this.a[50] + this.a[2828 + this.v]] == 127 || this.b[this.a[52] + this.a[2828 + this.v]] == 127) {
            return false;
         }

         if (this.a[2121 + this.v] <= (this.a[505 + this.v] > 5 ? 20 : 50)) {
            if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
               this.a(this.v, (byte)87);
               this.g(1);
            } else {
               this.aJ = this.a.a(255, (int)3);
               if (this.a[3434 + this.v] > 0 && this.a[8627 + this.a[3434 + this.v]] == 0 && this.a[9237 + this.a[3434 + this.v]] < 2) {
                  this.a[3131 + this.v] = this.a[8383 + this.a[3434 + this.v]];
                  this.a[3232 + this.v] = this.a[8444 + this.a[3434 + this.v]];
                  this.g(1);
               } else if (this.aJ == 1 && this.a(7)) {
                  this.g(1);
               } else {
                  this.a[3131 + this.v] = this.a[0 + this.v];
                  this.a[3232 + this.v] = this.a[101 + this.v];
                  this.a(this.v, (byte)79);
                  this.a[2929 + this.v] = 40;
                  this.a[3030 + this.v] = 0;
               }

               if (this.a[3434 + this.v] <= 0) {
                  this.a((byte)1, this.v, this.v);
               }
            }

            return true;
         } else {
            if (this.a[2020 + this.v] <= (this.a[505 + this.v] > 5 ? 20 : 50)
               && this.a[6464 + this.v] != 66
               && this.a[2828 + this.v] != 66
               && this.a(4, (byte)0)) {
               return true;
            }

            if (this.a[505 + this.v] <= 30 && this.a[6464 + this.v] != 86 && this.a[2828 + this.v] != 86) {
               if (this.a(7, (byte)2)) {
                  return true;
               }

               if (this.a[505 + this.v] <= 5 && this.b[this.a[41] + this.a[2828 + this.v]] != 0) {
                  if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
                     this.a(this.v, (byte)87);
                     this.a[6161 + this.v] = 3;
                     return true;
                  }

                  this.Q();
               }
            }

            return (this.a[1919 + this.v] < this.a[6767 + this.v] * 2 / 3 || (this.a[7979 + this.v] & 4) != 0)
               && this.a[6464 + this.v] != 57
               && this.a[2828 + this.v] != 57
               && this.a(8, (byte)3);
         }
      } else {
         return false;
      }
   }

   private boolean a(int var1, byte var2) {
      if (this.a(var1)) {
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
            this.a(this.v, (byte)87);
         }

         this.g(1);
         return true;
      } else {
         if (!this.h) {
            this.a(var2, this.v, this.v);
         }

         return false;
      }
   }

   private boolean a(boolean var1) {
      if (!var1) {
         if (this.a[this.u][18] >= 0) {
            return false;
         }

         if (this.a.a(65535, (int)10) < 4 || this.a[505 + this.v] < 75) {
            return false;
         }
      }

      int var3 = this.a.a(65535, (int)(this.a[this.u][11] / 2 + 1));
      this.ad = this.u * 50 + 1;
      int var2 = 0;

      while (true) {
         if ((this.a[505 + this.ad] >= 75 || var1)
            && (!var1 || this.ad != this.R)
            && this.a[1515 + this.v] != this.a[1515 + this.ad]
            && this.a[1919 + this.ad] > 0
            && this.a[1414 + this.ad] >= 12
            && this.a[2828 + this.ad] < 109
            && (this.a[8282 + this.ad] & 127) == 0) {
            if (++var2 > var3) {
               break;
            }
         }

         if (this.ad > (this.u + 1) * 50) {
            if (var2 == 0) {
               break;
            }

            this.ad = this.u * 50;
         }

         this.ad++;
      }

      if (this.ad > (this.u + 1) * 50) {
         return false;
      }

      for (this.x = 0; this.x < 10; this.x++) {
         if (this.c[4][this.x] == 0) {
            var3 = this.a.a(65535, (int)(this.a[this.u][14] / 2 + 1));
            this.ae = this.u * 30 + 1;
            var2 = 0;

            while (true) {
               if (this.a[8505 + this.ae] >= 0
                  && this.a[8749 + this.ae] == 2
                  && this.a[8627 + this.ae] == 0
                  && this.a[9237 + this.ae] == 0
                  && this.a[8932 + this.ae] <= 1) {
                  if (++var2 > var3) {
                     this.a[this.u][18] = 0;
                     this.c[4][this.x] = 1;
                     this.c[0][this.x] = (byte)this.v;
                     this.c[1][this.x] = (byte)this.ad;
                     this.a[8282 + this.v] = (byte)(this.a[8282 + this.v] + (this.x + 1 << 1));
                     this.a[8282 + this.ad] = (byte)(this.a[8282 + this.ad] + (this.x + 1 << 1) + 1);
                     this.c[5][this.x] = (byte)this.ae;
                     this.a[9237 + this.ae] = 1;
                     this.c[2][this.x] = (byte)(this.a[8383 + this.ae] + 1);
                     this.c[3][this.x] = (byte)(this.a[8444 + this.ae] + 2);
                     this.a(this.v, (byte)(110 - this.a[1515 + this.v]));
                     this.N();
                     return true;
                  }
               }

               if (this.ae > (this.u + 1) * 30) {
                  if (var2 == 0) {
                     return false;
                  }

                  this.ae = this.u * 30;
               }

               this.ae++;
            }
         }
      }

      return false;
   }

   private boolean o() {
      this.x = ((this.a[8282 + this.v] & 127) >> 1) - 1;
      if (this.x < 0) {
         return false;
      }

      if (this.a[2828 + this.v] < 109) {
         this.a(this.v, (byte)(110 - this.a[1515 + this.v]));
         this.c[4][this.x] = 2;
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            this.N();
         } else {
            this.g(3);
         }
      } else if (this.c[4][this.x] == 2) {
         if (this.a[0 + this.c[0][this.x]] != this.a[3131 + this.c[0][this.x]]
            || this.a[101 + this.c[0][this.x]] != this.a[3232 + this.c[0][this.x]]
            || this.a[0 + this.c[1][this.x]] != this.a[3131 + this.c[0][this.x]] + 1
            || this.a[101 + this.c[1][this.x]] != this.a[3232 + this.c[0][this.x]]
            || this.a[2828 + this.c[0][this.x]] != 109
            || this.a[2828 + this.c[1][this.x]] != 109
            || this.a[202 + this.c[0][this.x]] != 0
            || this.a[303 + this.c[0][this.x]] != 0
            || this.a[202 + this.c[1][this.x]] != 0
            || this.a[303 + this.c[1][this.x]] != 0) {
            return true;
         }

         this.C = this.c[0 + this.a[1515 + this.c[0][this.x]]][this.x];
         this.D = this.c[1 - this.a[1515 + this.c[0][this.x]]][this.x];
         if (this.a[2929 + this.C] != -99) {
            this.a[2929 + this.C] = -99;
            this.a[2929 + this.D] = -98;
            this.a[2828 + this.C] = 109;
            this.a[3030 + this.C] = 0;
            this.a[3030 + this.D] = 0;
            this.a[606 + this.c[0][this.x]] = 0;
            this.a[606 + this.c[1][this.x]] = 4;
            this.a[4646 + this.c[0][this.x]] = -90;
            this.a[9237 + this.c[5][this.x]] = 2;
            this.a.a(this.c[5][this.x], true);
         } else if (this.a[3030 + this.v] == 6 && this.a[3535 + this.C] == 15) {
            this.a[3535 + this.C] = 0;
            this.a[3535 + this.D] = 15;
            this.a[3636 + this.C] = 0;
            this.a[3636 + this.D] = 1;
         } else if (this.a[3030 + this.v] == this.a.j[4][this.a[2929 + this.v] & 0xFF] - 1) {
            this.a[3131 + this.C] = this.a[8383 + this.c[5][this.x]];
            this.a[3232 + this.C] = this.a[8444 + this.c[5][this.x]];
            this.a[3131 + this.D] = this.a[8383 + this.c[5][this.x]];
            this.a[3232 + this.D] = this.a[8444 + this.c[5][this.x]];
            this.a[2828 + this.C] = 111;
            this.a[2828 + this.D] = 111;
            this.a[808 + this.C] = 0;
            this.a[808 + this.D] = 0;
            this.c[4][this.x] = 3;
            this.ae = this.v;
            this.v = this.c[0][this.x];
            this.g(3);
            this.v = this.c[1][this.x];
            this.g(3);
            this.v = this.ae;
         }
      } else if (this.a[2828 + this.v] == 111) {
         this.a[9237 + this.c[5][this.x]] = 3;
         this.d(this.v, 0);
      }

      return true;
   }

   private void d(int var1, int var2) {
      this.ae = ((this.a[8282 + var1] & 127) >> 1) - 1;
      if (this.ae >= 0) {
         if (var2 > 0 && this.c[4][this.ae] != 3) {
            return;
         }

         this.c[4][this.ae] = 0;
         this.k(this.c[0 + (this.a[8282 + var1] + 1 & 1)][this.ae]);
         if (var2 < 0) {
            this.k(var1);
         }

         if (this.a[3535 + var1] == 15) {
            this.a[3636 + var1] = 0;
         }

         this.a[8282 + this.c[0][this.ae]] = (byte)(this.a[8282 + this.c[0][this.ae]] & 128);
         this.a[8282 + this.c[1][this.ae]] = (byte)(this.a[8282 + this.c[1][this.ae]] & 128);
         if (this.a[9237 + this.c[5][this.ae]] < 3) {
            this.a[9237 + this.c[5][this.ae]] = 0;
         }
      }
   }

   final void a(int var1) {
      if (this.a[9237 + var1] >= 1) {
         for (this.af = 0; this.af < 10; this.af++) {
            if (this.c[4][this.af] != 0 && this.c[5][this.af] == var1) {
               this.d(this.c[0][this.af], -1);
               return;
            }
         }
      }
   }

   private void k(int var1) {
      if (this.a[3535 + var1] == 15) {
         this.a[3636 + var1] = 0;
      }

      if (this.a[2828 + var1] >= 109) {
         if (this.b[this.a[101 + var1]][this.a[0 + var1]] == var1) {
            this.a[3131 + var1] = this.a[0 + var1];
            this.a[3232 + var1] = this.a[101 + var1];
            this.a(var1, (byte)69);
            return;
         }

         this.a[6161 + var1] = 3;
         this.a(var1, (byte)87);
      }
   }

   final byte b(int var1) {
      if (this.a[1414 + var1] < 12) {
         this.a[7777 + var1] = 0;
         return 6;
      }

      if ((this.a[7979 + var1] & 2) <= 0 || this.a[7777 + var1] != 0 && this.a[3535 + var1] == 0 && this.a[6565 + var1] != 1) {
         if (this.a[3535 + var1] != 0 || this.a[6565 + var1] == 1) {
            this.a[7777 + var1] = 0;
            return 1;
         } else {
            return (byte)(this.a[7777 + var1] > 0 ? 7 : 0);
         }
      } else {
         this.a[7777 + var1] = 0;
         return 5;
      }
   }

   private void P() {
      this.a[2929 + this.v] = (byte)(this.b(this.v) % 7 + 8);
   }

   private void Q() {
      if (this.a[1414 + this.v] >= 12) {
         this.a(this.v, (byte)69);
      } else {
         this.a(this.v, (byte)17);
      }
   }

   private boolean p() {
      if ((this.a.q != 3 || this.f < 5) && (this.a.q != 2 || this.f != 1)) {
         this.b(this.a[0 + this.v], this.a[101 + this.v], this.a[4949 + this.v]);
         this.y = 0;

         for (this.ag = this.u * (this.a.q == 3 ? 6 : 3); this.ag <= this.u * (this.a.q == 3 ? 6 : 3) + 2; this.ag++) {
            if (this.a.q != 3 || this.ag != 1) {
               this.aj = this.b[this.a[120] + this.ag];
               this.a(this.a[0 + this.v], this.a[101 + this.v], (byte)0, (byte)0);
               if (this.y == this.b[this.a[119] + this.aj]) {
                  break;
               }
            }
         }

         if (this.y <= 0) {
            return false;
         }

         if (!this.b && this.a[2828 + this.v] <= 9) {
            this.a = this.a && (this.b[this.a[122] + this.a[2828 + this.v]] < this.y || this.z / 10 > this.B && this.an <= this.B);
         }

         this.B = this.b[this.A][this.z];
         this.H();
         return true;
      } else {
         return false;
      }
   }

   private void a(byte var1, byte var2, byte var3) {
      this.b(var1, var2, var3);
      this.aj = this.u;
      this.a(var1, var2, this.D, var3);
   }

   private void b(byte var1, byte var2, byte var3) {
      this.an = 0;
      this.at = b(var1 - var3 >> 4, 0, 5);
      this.au = b(var1 + var3 >> 4, 0, 5);
      this.av = b(var2 - var3 >> 4, 0, 5);
      this.aw = b(var2 + var3 >> 4, 0, 5);
   }

   private void a(byte var1, byte var2, byte var3, byte var4) {
      for (this.ah = this.at; this.ah <= this.au; this.ah++) {
         for (this.ai = this.av; this.ai <= this.aw; this.ai++) {
            for (this.ak = this.c[this.aj][this.ai][this.ah]; this.ak >= 0; this.ak = this.a[this.aj][this.ak]) {
               this.al = this.ak + this.b[this.a[115] + this.aj];
               this.ap = this.a[this.b[this.b[this.a[118] + this.aj]] + this.al]
                  + (this.aj != 2 && this.aj != 3 ? 0 : this.b[this.a[138] + 104 + this.a[8749 + this.al]] / 2);
               this.aq = this.a[this.b[this.b[this.a[118] + this.aj] + 1] + this.al]
                  + (this.aj != 2 && this.aj != 3 ? 0 : this.b[this.a[138] + 130 + this.a[8749 + this.al]] / 2);
               this.ar = this.ap - var1;
               this.as = this.aq - var2;
               this.ao = this.b[this.a[53] + (this.ar >= -12 && this.ar <= 12 ? 12 + this.ar : 0) * 25 + (this.as >= -12 && this.as <= 12 ? 12 + this.as : 0)]
                  / 10;
               if (var3 == 0) {
                  if (this.a[this.b[this.b[this.a[117] + this.aj]] + this.al] > 0
                     && (this.aj > 1 || (this.a[7979 + this.al] & 1) == 0)
                     && (this.aj != 4 || this.a[2828 + this.v] == 60 || this.a[9601 + this.al] != 0)
                     && this.ao <= this.a[this.b[this.b[var2][var1] == this.v ? 49 : 18] + this.v]) {
                     this.am = this.aj < 2 && this.a[1414 + this.al] < 12 ? 1 : this.b[this.a[119] + this.aj];
                     if (this.y < this.am || this.y == this.am && this.ao < this.an) {
                        this.y = (byte)this.am;
                        this.an = this.ao;
                        this.z = (byte)this.ap;
                        this.A = (byte)this.aq;
                        this.F = (byte)this.al;
                     }
                  }
               } else if (this.ao <= var4
                  && this.b[this.a[101 + this.al]][this.a[0 + this.al]] == this.al
                  && this.a[1919 + this.al] > 0
                  && this.a[1414 + this.al] >= 12
                  && this.a[6161 + this.al] == 0
                  && this.a[2828 + this.al] > 9
                  && this.a[2828 + this.al] != 59
                  && this.a[2828 + this.al] != 87
                  && this.a[2828 + this.al] != 50) {
                  this.a[6161 + this.al] = 4;
                  this.a[4747 + this.al] = var3;
               }
            }
         }
      }
   }

   private void a(byte var1, byte var2, int var3, int var4) {
      try {
         if (this.a[5959 + this.v] <= 0) {
            this.aG = this.b[this.a[77] + this.a[6565 + this.v]];
            this.aE = this.a[3131 + this.v] - var1;
            this.aF = this.a[3232 + this.v] - var2;
            if (this.b[this.a[53] + (this.aF >= -12 && this.aF <= 12 ? 12 + this.aF : 0) * 25 + (this.aE >= -12 && this.aE <= 12 ? 12 + this.aE : 0)] / 10
               <= this.B) {
               this.ax = this.b[this.c[1] + (this.aF > 0 ? this.aF : -this.aF) * 11 + (this.aE > 0 ? this.aE : -this.aE)];
               this.a[5959 + this.v] = (byte)(this.ax > this.b[this.a[159] + this.aG] ? this.ax / this.b[this.a[159] + this.aG] : 1);
               this.ay = this.az = this.aA = this.aB = 0;
               this.a[7878 + this.v] = 9;
               if ((this.b[this.a[27] + this.a[2828 + this.v]] & 2) > 0) {
                  if (this.a[4747 + this.v] > 100) {
                     if ((this.a[9557 + this.a[4444 + this.v]] & 255) <= 7) {
                        this.aB = this.b[this.a[179] + this.a[9535 + this.a[4444 + this.v]]];
                        this.aC = this.a[9491 + this.a[4444 + this.v]];
                        this.aD = 101;
                     }
                  } else if ((this.a[2929 + this.a[4444 + this.v]] & 255) <= 7) {
                     this.aB = this.a[1010 + this.a[4444 + this.v]] - this.a[7777 + this.a[4444 + this.v]];
                     this.aC = this.a[606 + this.a[4444 + this.v]];
                     this.aD = 2;
                  }

                  if (this.aB > 0) {
                     this.a[7878 + this.v] = (byte)this.aB;
                     this.az = this.a[this.b[this.aD] + this.a[4444 + this.v]]
                        + this.b[this.a[1] + 0 + this.aC] * 22 * this.a[5959 + this.v] / this.b[this.a[15] + (this.aC & 1) * 9 + this.aB];
                     this.aA = this.a[this.b[this.aD + 1] + this.a[4444 + this.v]]
                        + this.b[this.a[1] + 8 + this.aC] * 16 * this.a[5959 + this.v] / this.b[this.a[15] + (this.aC & 1) * 9 + this.aB];
                  }
               }

               this.a[5656 + this.v] = (byte)((this.aE * 22 + this.az + (this.aE > 0 ? 1 : -1) * this.a[5959 + this.v] / 2) / this.a[5959 + this.v]);
               this.a[5757 + this.v] = (byte)((this.aF * 16 + this.aA + (this.aF > 0 ? 1 : -1) * this.a[5959 + this.v] / 2) / this.a[5959 + this.v]);

               for (this.ay = 0; this.ay <= this.a[5959 + this.v]; this.ay++) {
                  this.a.h[this.ay][this.v] = (byte)(
                     (-this.b[this.a[159] + this.aG] * this.ay * this.b[this.a[159] + this.aG] * this.ay + this.ax * this.b[this.a[159] + this.aG] * this.ay)
                           / this.b[this.c[3] + this.aG * 8 + this.a[606 + this.v]]
                        + var3
                        - var4 * this.ay / this.a[5959 + this.v]
                  );
                  this.a.i[this.ay][this.v] = (byte)(
                     this.aG == 2
                        ? this.ay & 1
                        : b(
                           (this.ax - 2 * this.b[this.a[159] + this.aG] * this.ay - var4 * this.b[this.c[3] + this.aG * 8 + this.a[606 + this.v]] / this.ax)
                                 * -4
                                 / this.b[this.c[3] + this.aG * 8 + this.a[606 + this.v]]
                              + 8,
                           0,
                           16
                        )
                  );
               }

               this.a[7676 + this.v] = (byte)(this.b[this.a[53] + (this.aF + 12) * 25 + this.aE + 12] % 10);
               this.a[5858 + this.v] = this.a[5454 + this.v] = this.a[5555 + this.v] = 0;
               this.a[5252 + this.v] = var1;
               this.a[5353 + this.v] = var2;
            }
         }
      } catch (Exception var6) {
         this.a[5959 + this.v] = 0;
      }
   }

   private void R() {
      if (this.a[5858 + this.v] < this.a[5959 + this.v]) {
         this.a[5454 + this.v] = (byte)(this.a[5454 + this.v] + this.a[5656 + this.v]);
         this.a[5555 + this.v] = (byte)(this.a[5555 + this.v] + this.a[5757 + this.v]);
         this.a[5252 + this.v] = (byte)(this.a[5252 + this.v] + ((this.a[5454 + this.v] + 11 + 66) / 22 - 3));
         this.a[5353 + this.v] = (byte)(this.a[5353 + this.v] + ((this.a[5555 + this.v] + 8 + 48) / 16 - 3));
         this.a[5454 + this.v] = (byte)(this.a[5454 + this.v] - ((this.a[5454 + this.v] + 11 + 66) / 22 - 3) * 22);
         this.a[5555 + this.v] = (byte)(this.a[5555 + this.v] - ((this.a[5555 + this.v] + 8 + 48) / 16 - 3) * 16);
      }

      this.a[5858 + this.v]++;
      if (this.a[5858 + this.v] > this.a[5959 + this.v]) {
         this.S();
      }
   }

   private void S() {
      this.a[5959 + this.v] = 0;
      this.a(
         this.a[5252 + this.v],
         this.a[5353 + this.v],
         this.u,
         this.a[2828 + this.v] <= 9
            ? this.b[this.a[79] + this.a[2828 + this.v]]
            : (this.a[2828 + this.v] == 92 ? 1 : (this.a[2828 + this.v] == 93 ? 2 : (this.a[2828 + this.v] == 106 ? 5 : 0))),
         this.a[4444 + this.v],
         0,
         (this.a[1616 + this.v] / 3 + this.b[this.a[102] + this.a[6565 + this.v]])
            * (this.a.a(65535, (int)(11 - this.a[7878 + this.v])) + this.a[7878 + this.v])
            / 10,
         1
      );
   }

   private void a(int var1, int var2, int var3, byte var4) {
      if (var1 == 106) {
         this.l(var4);
         this.a.a(6, var2, var3, this.b[this.a[183] + this.a[9535 + var4]]);
         this.a.c(var2, var3, 1, 1);
      } else if (var1 == 19) {
         if (var4 <= 50) {
            switch (this.b[this.a[41] + this.a[6464 + var4]]) {
               case 8:
                  this.a.a((byte)14, (byte)var2, (byte)var3, var4);
                  break;
               case 9:
                  this.a.a((byte)12, (byte)var2, (byte)var3, var4);
                  break;
               case 10:
                  this.a.a((byte)15, (byte)var2, (byte)var3, var4);
                  break;
               case 11:
                  this.a.a((byte)13, (byte)var2, (byte)var3, var4);
            }

            if (var4 == this.a[0][17]) {
               for (int var5 = 1; var5 <= 50; var5++) {
                  if (this.a[1414 + var5] >= 12) {
                     this.a[505 + var5] = (byte)b(this.a[505 + var5] - 25, 0, 99);
                  }
               }
            }
         }

         this.a.a(var4);
         this.a[2929 + var4] = (byte)(this.a[1414 + var4] >= 12 ? 43 : 44);
         this.a[3030 + var4] = (byte)(var4 > this.v ? -1 : 0);
         this.a[4646 + var4] = -64;
         this.e((var4 - 1) / 50, var4);
      } else if (var1 == 85) {
         this.a.c(var4, true);
      }

      if (this.f < this.b[this.a[291] + this.a.q]
         && this.b[this.a[287] + this.b[this.a[288] + this.a.q] + this.f] == 10
         && (var1 == 106 || var1 == 19 && var4 > 50)) {
         this.b(0, 0, 1);
         this.a.b((int)this.b[this.a[286] + this.b[this.a[288] + this.a.q] + this.f]);
         this.f = (byte)(this.f + 50);
      }
   }

   private void l(int var1) {
      if ((this.a[9557 + var1] & 255) <= 7
         && this.a[9623 + var1] < (this.b[this.a[15] + (this.a[9491 + var1] & 1) * 9 + this.b[this.a[179] + this.a[9535 + var1]]] + 1) / 2
         && this.b[this.a[9381 + var1] + this.b[this.a[1] + 8 + this.a[9491 + var1]]][this.a[9359 + var1] + this.b[this.a[1] + this.a[9491 + var1]]] == -128) {
         this.b[this.a[9381 + var1] + this.b[this.a[1] + 8 + this.a[9491 + var1]]][this.a[9359 + var1] + this.b[this.a[1] + this.a[9491 + var1]]] = 0;
      }

      this.b[this.a[9381 + var1]][this.a[9359 + var1]] = 0;
      this.a[9513 + var1] = 0;
      if (this.a[9469 + var1] < this.b[this.a[202] + this.a.q]) {
         this.a.t[this.a[9469 + var1]]--;
      }
   }

   private void m(int var1) {
      this.d(var1, 0);
      this.a[1919 + var1] = 0;
      this.a[5959 + var1] = 0;
      this.b[this.a[101 + var1]][this.a[0 + var1]] = this.a[4545 + var1] <= -111 ? this.a[4545 + var1] : 0;
      this.a[(var1 - 1) / 50][11]--;
      this.a[(var1 - 1) / 50][12 + this.a[1515 + var1]]--;
      this.b(var1);
   }

   private void c(int var1, int var2, int var3) {
      if (this.a(
            var1,
            var2,
            this.u,
            this.b[this.a[79] + this.a[2828 + this.v]],
            this.a[4444 + this.v],
            var3,
            this.b[this.a[124] + this.a[1717 + this.v]] + this.b[this.a[102] + this.a[6565 + this.v]],
            0
         )
         && (this.a[2929 + this.v] & 255) >= 31
         && this.a[6565 + this.v] != 9
         && this.k[0] == 1
         && this.a[202 + this.k[2]] == 0
         && this.a[303 + this.k[2]] == 0
         && (this.a[2929 + this.k[2]] < 106 || this.a[2929 + this.k[2]] > 108)) {
         this.a[2929 + this.k[2]] = 42;
         this.a[3030 + this.k[2]] = 0;
         this.a[4646 + this.k[2]] = (byte)(-(62 + (this.x & 1)));
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.ax = this.b[this.a[78] + 14 + var4];
      this.ay = var4 == 0
         ? 10
         : (var4 == 2 ? 0 : this.b[this.a[53] + (12 + this.a[this.b[this.ax + 1] + var5] - var2) * 25 + 12 + this.a[this.b[this.ax] + var5] - var1] / 10);
      if (this.ay <= var8 && this.ay > 0) {
         var1 = this.a[this.b[this.ax] + var5];
         var2 = this.a[this.b[this.ax + 1] + var5];
      }

      this.c(var1, var2, var3 & 1, 1);
      if (this.a.ag && this.k[0] == 1 && this.k[2] <= 50) {
         return false;
      }

      if (this.b[this.a[78] + this.k[0]] == 127) {
         return false;
      }

      if (this.a[this.b[this.b[this.a[78] + this.k[0]]] + this.k[2]] <= 0) {
         return false;
      }

      if (var3 >= 2 || this.k[3] != 0 || this.k[0] != 1 && this.k[0] != 2) {
         if (var3 == 0
            && this.a[0 + this.v] - this.a[0 + this.a[0][17]] >= -4
            && this.a[0 + this.v] - this.a[0 + this.a[0][17]] <= 4
            && this.a[101 + this.v] - this.a[101 + this.a[0][17]] >= -4
            && this.a[101 + this.v] - this.a[101 + this.a[0][17]] <= 4) {
            var7 = var7 * 3 / 2;
         }

         if (this.k[0] == 2) {
            if ((this.a[9054 + this.k[2]] & 128) == 0) {
               this.D = (byte)(this.v + (var3 == 2 ? 101 : 0));
               this.u ^= 1;
               this.a(
                  (byte)(this.a[8383 + this.k[2]] + this.b[this.a[138] + 104 + this.k[1]] / 2),
                  (byte)(this.a[8444 + this.k[2]] + this.b[this.a[138] + 130 + this.k[1]] / 2),
                  (byte)8
               );
               this.u ^= 1;
            }

            this.a[9054 + this.k[2]] = (byte)(this.a[9054 + this.k[2]] | 128);
            this.a.a(this.k[2], true);
            var7 /= var7 > 1 ? 2 : 1;
         }

         if (this.k[0] == 1 && (this.a[7979 + this.k[2]] & 8) != 0) {
            var7 /= var7 > 1 ? 2 : 1;
         }

         if ((var7 = var7 / (this.ay + 1)) < 1) {
            return false;
         }

         if (this.k[0] == 1
            && this.a[1919 + this.k[2]] > 0
            && this.a[1414 + this.k[2]] >= 12
            && this.a[6161 + this.k[2]] == 0
            && this.a[2828 + this.k[2]] > 9
            && this.a[2828 + this.k[2]] != 59
            && this.a[2828 + this.k[2]] != 87
            && this.a[2828 + this.k[2]] != 50) {
            this.a[6161 + this.k[2]] = 4;
            this.a[4747 + this.k[2]] = (byte)this.v;
         }

         if (this.k[0] == 1 || this.k[0] == 5) {
            this.a.a.f[this.k[2] + (this.k[0] == 5 ? 101 : 0)] = (byte)(this.a.a.f[this.k[2] + (this.k[0] == 5 ? 101 : 0)] - var7);
         }

         if (this.k[0] == 5 && var3 != 2 && this.a[9601 + this.k[2]] <= 0) {
            this.a[9447 + this.k[2]] = (byte)(19 + this.v);
         }

         this.a[this.b[this.b[this.a[78] + this.k[0]]] + this.k[2]] = (byte)(this.a[this.b[this.b[this.a[78] + this.k[0]]] + this.k[2]] - var7);
         if (this.a[this.b[this.b[this.a[78] + this.k[0]]] + this.k[2]] <= 0) {
            this.a(this.b[this.a[78] + this.k[0]], var1, var2, this.k[2]);
            return false;
         }

         if (this.k[0] == 2) {
            var6 = var1 - this.a[8383 + this.k[2]] + (var2 - this.a[8444 + this.k[2]] << 4);
         }

         this.a.a(this.k[2], this.b[this.a[178] + this.k[0]], var6, b(52 + var7 / 4 * 3 + this.a.a(255, (int)3), 52, 61));
         if (this.k[0] == 1 && this.k[2] <= 50) {
            if (this.a[1414 + this.k[2]] < 12) {
               this.a((byte)16, this.a[0][17], this.k[2]);
            } else if (this.d[0] < 0) {
               this.d[0] = 0;
               this.a.a((byte)7, (byte)var1, (byte)var2, (byte)0);
            } else if (var3 == 2 && this.a[2828 + this.k[2]] != 2 && this.a[2828 + this.k[2]] != 7) {
               this.z = (byte)var1;
               this.A = (byte)var2;
               this.a((byte)5, (int)this.k[2], (int)this.k[2]);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void T() {
      for (this.u = 0; this.u < 2; this.u++) {
         for (this.v = this.u * 50 + 1; this.v <= (this.u + 1) * 50; this.v++) {
            if (this.a[5959 + this.v] > 0
               && this.a[5252 + this.v] >= this.a.I
               && this.a[5252 + this.v] < this.a.I + this.a.O
               && this.a[5353 + this.v] >= this.a.K
               && this.a[5353 + this.v] < this.a.K + this.a.P) {
               this.a[6060 + this.v] = this.a.g[this.a[5353 + this.v] - this.a.K][this.a[5252 + this.v] - this.a.I];
               this.a.g[this.a[5353 + this.v] - this.a.K][this.a[5252 + this.v] - this.a.I] = (byte)this.v;
            }
         }
      }
   }

   private void U() {
      this.b(true);
      if (this.a[4646 + this.v] == 1 && this.a[8749 + this.a[4444 + this.v]] == 8 && this.a[8627 + this.a[4444 + this.v]] == 0) {
         this.a[2828 + this.a[8810 + this.a[4444 + this.v]]] = 57;
         this.a[2929 + this.a[8810 + this.a[4444 + this.v]]] = 105;
         this.a[3030 + this.a[8810 + this.a[4444 + this.v]]] = 0;
      }

      this.a[2929 + this.v] = this.a[1414 + this.v] >= 12
            && this.a[8749 + this.a[4444 + this.v]] < 12
            && (this.a[8627 + this.a[4444 + this.v]] != 0 || this.b[this.a[41] + this.a[2828 + this.v]] == 12)
         ? this.b[this.a[176] + this.b[this.a[177] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]]
         : this.b[this.a[173] + this.b[this.a[174] + this.a[8749 + this.a[4444 + this.v]]] + this.a[4646 + this.v]];
      this.a[3030 + this.v] = 0;
      this.a[1313 + this.v] = -3;
      this.a.d(this.a[4444 + this.v]);
      this.a[3131 + this.v] = this.a[0 + this.v];
      this.a[3232 + this.v] = this.a[101 + this.v];
      if (this.b[this.a[39] + this.a[2828 + this.v]] != 2) {
         this.a(this.v, (byte)59);
      }
   }

   private void V() {
      if (this.v == this.a[this.u][17]) {
         this.a[3434 + this.v] = 1;
      } else {
         for (this.aI = this.u * 30 + 1; this.aI <= (this.u + 1) * 30; this.aI++) {
            if (this.a[8749 + this.aI] == 2
               && this.a[8627 + this.aI] == 0
               && this.a[8810 + this.aI] < this.b[this.a[138] + (this.a[9115 + this.aI] - 1) * 26 + 2]) {
               this.a[3434 + this.v] = (byte)this.aI;
               this.a[8810 + this.aI]++;
               return;
            }
         }
      }
   }

   final void b(int var1) {
      byte var2;
      if ((var2 = this.a[3434 + var1]) > 0) {
         this.a[this.b[this.a[8627 + var2] == 0 ? 90 : 97] + var2]--;
         this.a[3434 + var1] = 0;
      }
   }

   private boolean q() {
      if (this.a[6666 + this.v] >= (this.u == 0 ? 125 : 50)) {
         this.a[6666 + this.v] = 0;
         this.a[1414 + this.v]++;
         this.aJ = this.b[this.a[97] + this.a[1414 + this.v]] + this.a.a(255, (int)5) - 2;
         if (this.a[1515 + this.v] == 1) {
            this.aJ = this.aJ + (this.aJ > 0 ? -1 : 1);
         }

         this.a[6767 + this.v] = (byte)b(this.a[6767 + this.v] + this.aJ, 0, this.b[this.a[98] + this.a[1414 + this.v]]);
         if (this.aJ > 0) {
            this.a[1919 + this.v] = (byte)(this.a[1919 + this.v] + this.aJ);
            if (this.a[6767 + this.v] >= 55
               && this.a[6767 + this.v] - this.aJ < 55
               && this.a[1010 + this.v] > 6
               && this.a[202 + this.v] == 0
               && this.a[303 + this.v] == 0) {
               this.a[1010 + this.v]--;
            }
         }

         this.a[1919 + this.v] = (byte)b(this.a[1919 + this.v], 0, this.a[6767 + this.v]);
         if (!this.s()) {
            return false;
         }

         if (this.a[1414 + this.v] == 12) {
            this.a(this.v, (byte)69);
            this.A();
            this.a[6464 + this.v] = 69;
            this.a[3030 + this.v] = 20;
            this.a[6262 + this.v] = this.a[3131 + this.v] = this.a[0 + this.v];
            this.a[6363 + this.v] = this.a[3232 + this.v] = this.a[101 + this.v];
         }

         if (this.a[1414 + this.v] == 12 || this.a[1414 + this.v] == 35) {
            this.a.b((byte)this.v);
         }
      }

      if (this.a[1414 + this.v] == 11 && this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v && this.a[1313 + this.v] >= 0) {
         this.a[6161 + this.v] = 3;
         this.a(this.v, (byte)59);
      }

      if (!this.r()) {
         return false;
      }

      if ((this.a[7979 + this.v] & 8) > 0) {
         this.a[8181 + this.v]++;
         if (this.a[8181 + this.v] >= 120) {
            this.a[8181 + this.v] = 0;
            this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 247);
         }
      }

      return true;
   }

   private boolean r() {
      if (this.a[1414 + this.v] >= 12 && this.a.c >= this.b[this.c[4] + this.a.q]) {
         if (this.b[this.a[41] + this.a[6464 + this.v]] == 9 && (this.a.c & 63) == (this.v & 63)) {
            if (this.a[2020 + this.v] < 100) {
               this.a[2020 + this.v]++;
            }
         } else if (this.b[this.a[50] + this.a[2828 + this.v]] < 127 && this.a.c % (this.b[this.a[50] + this.a[2828 + this.v]] * (this.u * 4 + 1)) <= 3) {
            if (this.a[2020 + this.v] > 0) {
               this.a[2020 + this.v]--;
            } else {
               this.a(this.v, (int)-1);
            }

            if (this.a[2020 + this.v] <= 5 && this.a.L && (this.a[7979 + this.v] & 64) != 0) {
               this.a((byte)14, this.v, this.v);
            }
         }

         this.aJ = (this.a[2929 + this.v] & 255) <= 14 ? this.b[this.a[170] + this.a[2929 + this.v]] : this.b[this.a[52] + this.a[2828 + this.v]];
         if (this.aJ < 127 && this.a.c % (this.aJ * (this.u * 4 + 1)) <= 3) {
            if (this.a[2121 + this.v] > 0) {
               this.a[2121 + this.v]--;
            } else {
               this.a(this.v, (int)-1);
            }

            if (this.a[2121 + this.v] <= 5 && this.a.L && (this.a[7979 + this.v] & 64) != 0) {
               this.a((byte)15, this.v, this.v);
            }
         }

         if (!this.s()) {
            return false;
         }
      }

      if (this.a[7373 + this.v] > 1 && this.b[this.a[41] + this.a[6464 + this.v]] == 11) {
         if (this.a.c % (46 - this.a[7373 + this.v] * 3) <= 3) {
            this.a(this.v, (int)2);
         }
      } else if ((this.a.c & 127) == (this.v & 15)) {
         if ((this.a[7979 + this.v] & 4) == 0) {
            this.a(this.v, (int)1);
         }
      } else if ((this.a[7979 + this.v] & 4) > 0 && (this.a.c & 31) == (this.v & 15)) {
         this.a(this.v, (int)-1);
         if (!this.s()) {
            return false;
         }
      }

      return true;
   }

   private boolean s() {
      if (this.a[1919 + this.v] <= 0) {
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
            this.a(19, this.a[0 + this.v], this.a[101 + this.v], (byte)this.v);
            return false;
         }

         this.a[1919 + this.v] = this.a[6767 + this.v] = 1;
         this.a[6161 + this.v] = 2;
         this.a[8282 + this.v] = (byte)(this.a[8282 + this.v] | 128);
      }

      return true;
   }

   private void W() {
      if (this.a.c >= this.b[this.c[4] + this.a.q]) {
         this.w = this.a[505 + this.v]
            + this.b[this.a[51] + this.a[2828 + this.v]]
            + (this.b[this.a[51] + this.a[2828 + this.v]] < 0 && this.a[3434 + this.v] < 1 ? -3 : 0)
            - (this.a[2121 + this.v] < 20 ? 1 : 0)
            - (this.a[2020 + this.v] < 20 ? 1 : 0);
         this.w = this.w
            + (
               this.a[4646 + this.v] >= 0 && this.a[2828 + this.v] != 92 && this.a[2828 + this.v] != 93 && this.a[2828 + this.v] != 106
                  ? this.b[this.a[138] + (21 + this.a[9115 + this.a[4444 + this.v]] - 1) * 26 + this.a[8749 + this.a[4444 + this.v]]]
                  : 0
            );
         this.a[505 + this.v] = (byte)b(this.w + (this.a.q < 2 ? 1 : 0) + this.u, 0, 99);
      }
   }

   private void X() {
      if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
         if (this.a[8080 + this.v] > 0) {
            this.a[8080 + this.v]--;
         }
      } else if (this.a[2828 + this.v] != 92 && this.a[2828 + this.v] != 93 && this.a[2828 + this.v] != 106) {
         this.a[8080 + this.v] = (byte)b(this.a[8080 + this.v] + ((this.a[8871 + this.a[4444 + this.v]] & 2) != 0 ? 1 : -1), 0, 30);
      }

      if (this.a[8080 + this.v] >= 30) {
         this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 4);
         this.a[8080 + this.v] = 0;
      }
   }

   private void Y() {
      for (this.n = -1; this.n < 2; this.n++) {
         for (this.o = -1; this.o < 2; this.o++) {
            if (this.a[0 + this.v] + this.n >= 0
               && this.a[0 + this.v] + this.n < this.a.c
               && this.a[101 + this.v] + this.n >= 0
               && this.a[101 + this.v] + this.n < this.a.d) {
               this.p = this.b[this.a[101 + this.v] + this.o][this.a[0 + this.v] + this.n];
               if (this.p > 0 && this.p <= 100 && (this.a[7979 + this.p] & 4) == 0 && this.a[1414 + this.p] >= 12) {
                  this.a[8080 + this.p] = (byte)(this.a[8080 + this.p] + 8);
               }
            }
         }
      }
   }

   private void Z() {
      if (this.a.q != 3) {
         if (this.u == 1) {
            if (this.a[1][11] >= this.b[this.a[275 + this.a.b] + this.a.q]) {
               this.a[1][18] = 0;
            }

            if (this.a[1][18] != -1) {
               return;
            }
         }

         for (this.aH = this.u * 30 + 1; this.aH <= (this.u + 1) * 30; this.aH++) {
            if (this.a[8505 + this.aH] != 0 && this.a[8749 + this.aH] == 2 && this.a[8627 + this.aH] == 0 && this.a[8932 + this.aH] <= 3) {
               if (this.u == 0) {
                  if (this.a[9237 + this.aH] < 9) {
                     if (this.a[9237 + this.aH] >= 3) {
                        this.a[9237 + this.aH]++;
                     }
                     continue;
                  }
               } else {
                  if (this.a[8383 + this.aH] >= this.a.I - 1
                     && this.a[8444 + this.aH] >= this.a.K - 1
                     && this.a[8383 + this.aH] <= this.a.I + this.a.O
                     && this.a[8444 + this.aH] <= this.a.K + this.a.P) {
                     continue;
                  }

                  this.a[this.u][18] = 0;
                  if (this.u == 1 && this.Q > 0) {
                     return;
                  }
               }

               this.a[9237 + this.aH] = 0;
               this.v = this.a
                  .a(
                     (byte)this.u,
                     this.a[8383 + this.aH],
                     this.a[8444 + this.aH],
                     (byte)2,
                     (byte)(this.u == 0 ? 0 : this.b[this.a[212 + this.a.b] + this.a.q] / 4)
                  );
               if (this.v < 1) {
                  return;
               }

               this.a[4444 + this.v] = (byte)this.aH;
               this.a[8932 + this.aH]++;
               this.G();
               this.a[4545 + this.v] = this.a[8993 + this.aH];
               this.a[8993 + this.aH] = (byte)this.v;
               this.a[1313 + this.v] = -3;
               this.a[2929 + this.v] = 71;
               this.a[3030 + this.v] = 0;
               this.a[2828 + this.v] = 59;
               if (this.u == 1) {
                  return;
               }
            }
         }
      }
   }

   final void g() {
      if (this.a.c % 10 == 0) {
         this.n();
      }

      try {
         this.ax();

         for (this.u = 0; this.u < 2; this.u++) {
            for (this.v = this.u * 30 + 1; this.v <= (this.u + 1) * 30; this.v++) {
               if (this.a[8505 + this.v] != 0) {
                  this.z = this.a[8749 + this.v];
                  if ((this.a.c & 15) == 0) {
                     this.a[9054 + this.v] = (byte)(this.a[9054 + this.v] & 127);
                  }

                  if (this.z >= 12 || this.z == 4 || this.z == 2 || this.a[8627 + this.v] != 0) {
                     this.x = this.A = 0;
                     if (this.z >= 12) {
                        while (this.x < 10 && this.f[0][this.x] != this.v) {
                           this.x++;
                        }
                     }

                     if (this.a[8627 + this.v] != 0) {
                        while (this.x < 20 && this.g[0][this.x] != this.v) {
                           this.x++;
                        }
                     }

                     if (this.a[8627 + this.v] == 0
                        || (this.g[2][this.x] <= 0 || this.g[1][this.x] < this.g[2][this.x] || this.a[8627 + this.v] != 1)
                           && (this.a[8627 + this.v] != 2 || this.a[8505 + this.v] < this.a[8566 + this.v])
                           && (this.a[9054 + this.v] & 1) == 0) {
                        this.C = 0;
                        this.aa();
                        if ((this.a.c & 0xFF) == this.v) {
                           this.ac();
                        }

                        if (this.z == 2 && this.x > 0) {
                           if (this.a[1313 + this.x] == 2 && this.A != 3) {
                              this.a[1313 + this.x] = 1;
                           }

                           if (this.a[1313 + this.x] == 1 && this.A == 3) {
                              this.a[1313 + this.x] = 2;
                           }
                        }

                        if (this.z >= 12 && this.a[8505 + this.v] >= this.b[this.a[138] + 182 + this.a[9237 + this.v]] && this.a[8932 + this.v] == 0) {
                           this.a.a((byte)this.u, this.a[9237 + this.v], this.a[8383 + this.v], this.a[8444 + this.v], 1, true, this.v);
                           this.a.a(this.v, (int)0);
                           this.a[9237 + this.v] = 0;
                           this.f[0][this.x] = 0;
                        }

                        if ((this.z >= 12 || this.a[8627 + this.v] != 0) && (this.a.c & 15) == (this.v & 15)) {
                           this.ae();
                        }
                     } else {
                        this.a.a(this.v, true);
                        this.ad();
                     }
                  }
               }
            }
         }
      } catch (Exception var2) {
      }
   }

   private void aa() {
      for (this.w = this.a[8993 + this.v]; this.w > 0; this.w = this.a[4545 + this.w]) {
         this.C++;
         if (this.z == 2 && this.a[8627 + this.v] == 0) {
            if (this.a[4646 + this.w] == 0) {
               this.x = this.w;
            }

            if (this.a[1313 + this.w] > 0 && this.a[2828 + this.w] == 111) {
               this.A = this.A | 1 + this.a[1515 + this.w];
            }
         } else if (this.z >= 12 && this.a[8505 + this.v] >= this.b[this.a[138] + 182 + this.a[9237 + this.v]]) {
            switch (this.u) {
               case 0:
                  this.a[2828 + this.w] = 87;
                  this.a[6161 + this.w] = 3;
                  break;
               case 1:
                  this.a[6161 + this.w] = 2;
            }
         } else if (this.a[2828 + this.w] != 87
            && this.a[1313 + this.w] != -3
            && (
               this.a[1313 + this.w] != -2
                  || this.a[3030 + this.w] >= this.a.j[4][this.a[2929 + this.w] & 0xFF] - 1
                     && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.w]]] == this.b[this.a[42] + this.b[this.a[41] + this.a[2828 + this.w]]]
                     && this.a[3636 + this.w] <= 0
            )
            && (this.a[2929 + this.w] != -109 && this.a[2929 + this.w] != -102 || this.a[3030 + this.w] >= this.a.j[4][this.a[2929 + this.w] & 0xFF] - 1)
            && (
               this.a[8627 + this.v] == 0
                  || this.a[2828 + this.w] == 56
                  || this.a[2828 + this.w] == 76
                  || this.a[2828 + this.w] == 77
                  || this.a[2828 + this.w] == 78
            )) {
            this.ab();
         }
      }
   }

   private void ab() {
      if (this.a[4646 + this.w] == 0) {
         if (this.a[6161 + this.w] == 2) {
            return;
         }

         if (this.a[8627 + this.v] != 0) {
            if (this.g[1][this.x] >= this.g[2][this.x]) {
               this.g[1][this.x] = this.g[2][this.x] = 0;
            }

            if (this.g[2][this.x] == 0) {
               this.a(this.w, (byte)99);
               this.a[6161 + this.w] = 3;
            }
         } else if (this.f[1][this.x] < this.b[this.a[80] + this.a[9237 + this.v]] && this.z >= 12
            || this.z == 4 && this.a[this.u][0] < 40 && this.a[2828 + this.w] == 66) {
            this.a[6161 + this.w] = 3;
            if (this.z >= 12) {
               this.a(this.w, this.b[this.a[81] + this.b[this.a[82] + this.a[9237 + this.v]] + this.f[1][this.x]]);
            } else if (this.a[3636 + this.w] <= 0
               || this.a[3535 + this.w] != 1 && this.a[3535 + this.w] != 5 && this.a[3535 + this.w] != 6 && this.a[3535 + this.w] != 7) {
               this.a(this.w, (byte)37);
            } else {
               this.a(this.w, (byte)54);
               this.a[6161 + this.w] = 0;
            }
         }

         if (this.a[8749 + this.v] == 6 || this.a[8749 + this.v] == 16 && this.a[9237 + this.v] == 6) {
            if (this.a[6161 + this.w] == 3) {
               this.a[6161 + this.w] = 0;
               if (this.a(this.a[2828 + this.w], false, this.w)) {
                  if (this.a[8749 + this.v] == 16) {
                     this.f[1][this.x]++;
                  }

                  this.d(false);
                  return;
               }

               this.f = true;
               if (this.a[8749 + this.v] != 6 && this.a[8505 + this.v] < this.b[this.a[83] + this.b[this.a[84] + this.a[9237 + this.v]] + this.f[1][this.x]]) {
                  this.f = false;
               }

               this.d(this.f);
               return;
            }

            this.d(false);
            return;
         }
      } else if (this.a[2828 + this.w] != 59) {
         if (this.a[8627 + this.v] != 0) {
            if (this.g[1][this.x] < this.g[2][this.x]) {
               this.a(this.w, this.b[this.a[60] + this.b[this.a[177] + this.z] + this.a[4646 + this.w]]);
               return;
            }

            this.a(this.w, this.b[this.a[59] + this.b[this.a[177] + this.z] + this.a[4646 + this.w]]);
            return;
         }

         if (this.a[8505 + this.v] < this.b[this.a[83] + this.b[this.a[84] + this.a[9237 + this.v]] + this.f[1][this.x]] && this.z >= 12
            || this.z == 4 && this.a[this.u][0] > 0) {
            this.a(this.w, this.b[this.a[58] + this.b[this.a[174] + this.z] + this.a[4646 + this.w]]);
            return;
         }

         this.a(this.w, this.b[this.a[57] + this.b[this.a[174] + this.z] + this.a[4646 + this.w]]);
      }
   }

   private void ac() {
      for (int var1 = this.u * 50 + 1; var1 <= (this.u + 1) * 50; var1++) {
         if (this.a[1919 + var1] > 0
            && this.a[4444 + var1] == this.v
            && this.a[4646 + var1] < 0
            && this.a[1313 + var1] == -1
            && (var1 != this.a[8810 + this.v] || this.a[8749 + this.v] == 2 && this.a[8627 + this.v] == 0)) {
            this.C++;
         }
      }

      this.a[8932 + this.v] = (byte)this.C;
   }

   private void ad() {
      if ((this.a[9054 + this.v] & 1) == 0) {
         this.a.a(this.v, (int)0);
         if (this.a[8627 + this.v] == 1) {
            this.a[9115 + this.v]++;
         }
      }

      this.a[9054 + this.v] = (byte)(this.a[9054 + this.v] & 254);
      this.a[8627 + this.v] = 0;
      this.a[8810 + this.v] = this.a[9237 + this.v];
      this.a[9237 + this.v] = 0;
      this.g[0][this.x] = 0;
      this.a.d(this.v);
   }

   final boolean a(byte var1) {
      for (this.aK = 0; this.aK < 10; this.aK++) {
         if (this.f[0][this.aK] < 1) {
            this.f[0][this.aK] = var1;
            this.f[1][this.aK] = 0;
            this.a[9298 + var1] = 0;
            return true;
         }
      }

      return false;
   }

   final boolean b(byte var1) {
      for (this.aK = 0; this.aK < 20; this.aK++) {
         if (this.g[0][this.aK] < 1) {
            this.g[0][this.aK] = var1;
            this.g[1][this.aK] = 0;
            this.g[2][this.aK] = 0;
            this.a[9237 + var1] = this.a[8810 + var1];
            this.a[8810 + var1] = 0;
            this.a[9298 + var1] = 0;
            if (this.a[8749 + var1] == 2) {
               this.a((int)var1);
            }

            return true;
         }
      }

      return false;
   }

   private void ae() {
      if ((this.u != 0 || !this.a.N) && (this.u != 1 || this.Q <= 0)) {
         this.aK = this.a[8627 + this.v] == 0
            ? this.b[this.a[138] + (this.a[9115 + this.v] - 1) * 26 + this.a[8749 + this.v]]
            : this.b[this.a[138] + 494 + this.a[8749 + this.v]];
         if (this.a[9298 + this.v] < this.a[8932 + this.v] && this.a[8810 + this.v] > 0) {
            this.a[9298 + this.v] = this.a[8932 + this.v];
         }

         if (this.a[9298 + this.v] < this.aK) {
            for (this.aL = this.u * 50 + 1; this.aL <= (this.u + 1) * 50 && this.a[9298 + this.v] < this.aK; this.aL++) {
               int var1;
               if ((
                     this.u == 0
                           && (this.a[2828 + this.aL] == 69 || this.a[2828 + this.aL] == 84 && this.a[3939 + this.aL] == 69)
                           && this.a[6161 + this.aL] == 0
                           && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.aL]]] == 2
                        || this.u == 1
                           && this.j[this.aL - this.u * 50 - 1] < this.b[this.a[242] + this.a.q]
                           && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.aL]]] != 2
                  )
                  && (
                     this.u != 0
                        || (var1 = -this.b[this.a[6363 + this.aL]][this.a[6262 + this.aL]]) <= this.u * 30
                        || var1 > (this.u + 1) * 30
                        || this.a[8749 + var1] < 12 && this.a[8627 + var1] == 0
                  )) {
                  this.a[6262 + this.aL] = this.a[3131 + this.aL] = this.a[8383 + this.v];
                  this.a[6363 + this.aL] = this.a[3232 + this.aL] = this.a[8444 + this.v];
                  this.a[6464 + this.aL] = this.a[2828 + this.aL] = 77;
                  this.a[6161 + this.aL] = 3;
                  this.a[9298 + this.v]++;
                  if (this.b[this.a[101 + this.aL]][this.a[0 + this.aL]] != this.aL) {
                     this.a[2828 + this.aL] = 87;
                  }
               }
            }
         }
      }
   }

   final void c(int var1) {
      for (this.aK = 0; this.aK < 10; this.aK++) {
         if (this.f[0][this.aK] == var1) {
            this.f[0][this.aK] = 0;
         }
      }
   }

   private void d(boolean var1) {
      if (var1) {
         this.a(this.w, (byte)78);
         if (this.a[2929 + this.w] != 115 && this.a[2929 + this.w] != 113) {
            this.a[2929 + this.w] = 115;
            this.a[3030 + this.w] = -1;
            this.a[1313 + this.w] = 1;
            return;
         }

         if (this.a[3030 + this.w] == this.a.j[4][this.a[2929 + this.w] & 0xFF] - 1) {
            this.a[2929 + this.w] = 113;
            return;
         }
      } else {
         if (this.a[2929 + this.w] == 115 || this.a[2929 + this.w] == 113) {
            this.a[2929 + this.w] = 116;
            this.a[3030 + this.w] = -1;
            return;
         }

         if (this.a[3030 + this.w] == this.a.j[4][this.a[2929 + this.w] & 0xFF] - 1) {
            this.a(this.w, (byte)56);
         }
      }
   }

   final void h() {
      try {
         if (this.b[this.a[202] + this.a.q] > 0 && this.a.c % (this.b[this.a[204] + this.a.q] * 40) == 10 && (this.a.q != 4 || this.a.c > 5000)) {
            if (this.a.t[this.u = this.a.a(16777215, (int)this.b[this.a[202] + this.a.q])] >= this.b[this.a[205] + this.a.q]) {
               this.u = 0;

               while (this.u < this.b[this.a[202] + this.a.q] && this.a.t[this.u] >= this.b[this.a[205] + this.a.q]) {
                  this.u++;
               }
            }

            if (this.u < this.b[this.a[202] + this.a.q]) {
               this.v = this.a.a(16777215, (int)100);
               this.w = 0;

               while (this.w < 3 && this.v >= this.b[this.a[185] + (this.b[this.a[201] + this.a.q] + this.u) * 3 + this.w]) {
                  this.w++;
               }

               this.v = 0;
               this.a(1, 10, this.b[this.a[199] + this.b[this.a[201] + this.a.q] + this.u], this.b[this.a[200] + this.b[this.a[201] + this.a.q] + this.u]);
               this.a.b(this.w, this.a[3131], this.a[3232], this.u);
               if (this.a.q == 4 && this.a.t[0] > 1 && this.a.a(16777215, (int)10) < this.a.t[0]) {
                  for (this.v = 0; this.v < 22; this.v++) {
                     if (this.a[9469 + this.v] == 0) {
                        this.a[9469 + this.v] = 2;
                     }
                  }

                  this.a.t[0] = 0;
               }
            }
         }

         for (this.v = 0; this.v < 22; this.v++) {
            if (this.a[9513 + this.v] > 0) {
               this.af();
               this.ah();
            }
         }
      } catch (Exception var2) {
      }
   }

   private void af() {
      this.a[9579 + this.v]++;
      if (this.a[9579 + this.v] >= this.a.j[4][this.a[9557 + this.v] & 0xFF]) {
         this.a[9579 + this.v] = 0;
         if (this.a[9557 + this.v] == 37 + this.a[9535 + this.v]) {
            this.a(
               this.a[9359 + this.v] + this.b[this.a[1] + this.a[9491 + this.v]],
               this.a[9381 + this.v] + this.b[this.a[1] + 8 + this.a[9491 + this.v]],
               2,
               this.a[9601 + this.v] > 0 ? 1 : 2,
               this.a[9601 + this.v] > 0 ? this.a[9601 + this.v] : -this.a[9601 + this.v],
               0,
               this.b[this.a[182] + this.a[9535 + this.v]] * (2 + this.a.a(255, (int)3)) / 4,
               0
            );
         }
      }

      if (this.a[9403 + this.v] == 0 && this.a[9425 + this.v] == 0) {
         this.a[9623 + this.v] = 0;
         if (this.a[9447 + this.v] > 5) {
            if (this.a[9447 + this.v] > 19) {
               this.a[9447 + this.v] = (byte)(this.a[9447 + this.v] - 19);
               this.a(this.a[0 + this.a[9447 + this.v]], this.a[101 + this.a[9447 + this.v]], this.a[9447 + this.v], 0);
            } else {
               this.e(false);
               this.a[9557 + this.v] = (byte)(10 + this.a[9535 + this.v]);
               this.a[9579 + this.v] = 0;
            }

            this.a[9447 + this.v] = 0;
         } else if ((this.a.c % this.b[this.a[179] + this.a[9535 + this.v]] == 0 || (this.a[9557 + this.v] & 255) <= 7) && (this.a.q != 3 || this.f < 5)) {
            this.a(6, 6, this.a[9359 + this.v], this.a[9381 + this.v]);
            if (this.a[9601 + this.v] != 0) {
               if (this.a[9601 + this.v] > 0) {
                  if (this.a[1919 + this.a[9601 + this.v]] > 0
                     && this.b[this.a[101 + this.a[9601 + this.v]]][this.a[0 + this.a[9601 + this.v]]] == this.a[9601 + this.v]) {
                     this.a[9645 + this.v] = this.a[0 + this.a[9601 + this.v]];
                     this.a[9667 + this.v] = this.a[101 + this.a[9601 + this.v]];
                     this.a[9689 + this.v] = 0;
                     if (this.a(this.a[9359 + this.v], this.a[9381 + this.v], 101) > 59 && (this.a.q != 3 || this.f != 4)) {
                        this.a[9601 + this.v] = 0;
                        this.a[9645 + this.v] = this.a[9359 + this.v];
                        this.a[9667 + this.v] = this.a[9381 + this.v];
                     }
                  } else {
                     this.a[9601 + this.v] = 0;
                  }
               } else if (this.a[8505 + -this.a[9601 + this.v]] <= 0) {
                  this.a[9601 + this.v] = 0;
               }
            }
         }

         this.z = this.a(this.a[9359 + this.v], this.a[9381 + this.v], 101);
         this.ag();
      } else {
         this.a[9557 + this.v] = (byte)(2 + this.a[9535 + this.v]);
      }
   }

   private void ag() {
      if (this.z / 10 - (this.a[9601 + this.v] != 0 ? 1 : 0) > 0) {
         if (this.a[9711 + this.v] >= this.a[9689 + this.v]) {
            if (this.a.c % this.b[this.a[179] + this.a[9535 + this.v]] == 0 || this.a[9601 + this.v] != 0) {
               this.a[9689 + this.v] = this.a[9711 + this.v] = 0;
               this.a[9689 + this.v] = this.a(this.a[9381 + this.v], this.a[9359 + this.v], this.a[9667 + this.v], this.a[9645 + this.v], 0, 101);
               if (this.a[9689 + this.v] == 0 && this.a[2]) {
                  this.e(false);
               }
            }

            if (this.a[9557 + this.v] > 7 || this.a[9711 + this.v] >= this.a[9689 + this.v]) {
               this.a[9557 + this.v] = (byte)(10 + this.a[9535 + this.v]);
               this.a[9579 + this.v] = 0;
            }
         }

         if (this.a[9711 + this.v] < this.a[9689 + this.v]) {
            if (this.b[this.b[1][this.v][this.a[9711 + this.v]]][this.b[0][this.v][this.a[9711 + this.v]]] != 0) {
               this.a[9689 + this.v] = this.a[9711 + this.v] = 0;
               this.a[9557 + this.v] = (byte)(10 + this.a[9535 + this.v]);
               this.a[9579 + this.v] = 0;
               return;
            }

            this.a[9491 + this.v] = this.b[this.a[4]
               + (this.b[0][this.v][this.a[9711 + this.v]] - this.a[9359 + this.v] + 1) * 3
               + this.b[1][this.v][this.a[9711 + this.v]]
               - this.a[9381 + this.v]
               + 1];
            this.a[9557 + this.v] = (byte)(2 + this.a[9535 + this.v]);
            this.b[this.a[9381 + this.v] + this.b[this.a[1] + 8 + this.a[9491 + this.v]]][this.a[9359 + this.v] + this.b[this.a[1] + this.a[9491 + this.v]]] = -128;
            this.a[9711 + this.v]++;
            this.a[9447 + this.v] = 0;
            return;
         }
      } else {
         if ((this.a[9557 + this.v] & 255) <= 7) {
            this.a[9579 + this.v] = 0;
         }

         if (this.a[9579 + this.v] == 0) {
            if (this.a[9447 + this.v] == 0) {
               this.ai();
            }

            if (this.a[9601 + this.v] == 0 && this.a[9447 + this.v] < 19) {
               this.a[9447 + this.v]++;
               return;
            }

            this.a[9447 + this.v] = 0;
            this.a[9491 + this.v] = (byte)(this.z % 10);
         }
      }
   }

   private void ah() {
      if ((this.a[9557 + this.v] & 255) <= 7) {
         this.w = this.a[9491 + this.v] & 1;
         this.a[9623 + this.v]++;
         this.a[9403 + this.v] = this.b[this.a[5 + this.w]
            + this.b[this.a[12 + this.w * 2] + this.b[this.a[179] + this.a[9535 + this.v]]]
            + (
                  this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]]
                     + this.a[9623 + this.v] * this.b[this.a[1] + 0 + this.a[9491 + this.v]]
               )
               % this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]]];
         this.a[9425 + this.v] = this.b[this.a[7 + this.w]
            + this.b[this.a[12 + this.w * 2] + this.b[this.a[179] + this.a[9535 + this.v]]]
            + (
                  this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]]
                     + this.a[9623 + this.v] * this.b[this.a[1] + 8 + this.a[9491 + this.v]]
               )
               % this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]]];
         if (this.a[9623 + this.v] == (this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]] + 1) / 2) {
            this.b[this.a[9381 + this.v]][this.a[9359 + this.v]] = 0;
            this.a[9359 + this.v] = (byte)(this.a[9359 + this.v] + this.b[this.a[1] + 0 + this.a[9491 + this.v]]);
            this.a[9381 + this.v] = (byte)(this.a[9381 + this.v] + this.b[this.a[1] + 8 + this.a[9491 + this.v]]);
            if ((this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]] & 1) == 0 && this.b[this.a[1] + 0 + this.a[9491 + this.v]] < 0) {
               this.a[9403 + this.v] = (byte)(this.a[9403 + this.v] + 22);
            }

            if ((this.b[this.a[15] + this.w * 9 + this.b[this.a[179] + this.a[9535 + this.v]]] & 1) == 0 && this.b[this.a[1] + 8 + this.a[9491 + this.v]] < 0) {
               this.a[9425 + this.v] = (byte)(this.a[9425 + this.v] + 16);
            }

            this.b[this.a[9381 + this.v]][this.a[9359 + this.v]] = (byte)(this.v + 101);
         }
      }
   }

   private void ai() {
      if (this.a[9601 + this.v] == 0) {
         this.x = this.a.a(16777215, (int)100);
         this.a[9557 + this.v] = this.b[this.a[184] + this.x / 50 * 3 + this.a[9535 + this.v]];
      } else {
         this.a[9557 + this.v] = (byte)(37 + this.a[9535 + this.v]);
      }

      if (this.a.q == 4 && this.a[9469 + this.v] == 2) {
         this.a[9469 + this.v] = 3;
      }
   }

   private void e(boolean var1) {
      boolean var2 = this.a.q != 3 || this.a[9469 + this.v] != 0 || this.a[9359 + this.v] > 27 || this.a[9359 + this.v] < 20 || this.a[9381 + this.v] > 6;
      this.a[9689 + this.v] = 0;
      this.x = this.a.a(16777215, (int)63);
      this.w = this.b[this.a[201] + this.a.q] + this.a[9469 + this.v];
      this.B = this.b[this.a[203] + this.a.q];
      this.a[9645 + this.v] = (byte)(
         !var2
            ? this.a[9359 + this.v]
            : b(
               this.a[9359 + this.v] + (var1 ? this.b[this.a[1] + this.E] : (this.x & 7) - 4),
               var1 ? 0 : this.b[this.a[199] + this.w] - this.B,
               var1 ? this.a.c - 1 : this.b[this.a[199] + this.w] + this.B
            )
      );
      this.a[9667 + this.v] = (byte)(
         !var2
            ? this.a[9381 + this.v]
            : b(
               this.a[9381 + this.v] + (var1 ? this.b[this.a[1] + 8 + this.E] : (this.x >> 3 & 7) - 4),
               var1 ? 0 : this.b[this.a[200] + this.w] - this.B,
               var1 ? this.a.d - 1 : this.b[this.a[200] + this.w] + this.B
            )
      );
      if (this.b[this.a[9667 + this.v]][this.a[9645 + this.v]] != 0 && var2) {
         this.a(2, 127, this.a[9645 + this.v], this.a[9667 + this.v]);
      }
   }

   final void i() {
      for (this.aM = 0; this.aM < 50; this.aM++) {
         if (this.a[9833 + this.aM] != 0) {
            if ((this.a.c & 127) == 1 && this.a[9833 + this.aM] == 6) {
               if (this.a[9883 + this.aM] > 0) {
                  this.a[9883 + this.aM]--;
               }
            } else if ((this.a.c & 511) == 1 && this.a[9833 + this.aM] != 7 && this.a[9883 + this.aM] < this.b[this.a[110] + this.a[9833 + this.aM]]) {
               this.a[9883 + this.aM]++;
            }

            if ((this.a.c & 7) == (this.aM & 7)) {
               this.aj();
            }

            for (this.w = 0; this.w <= 3; this.w++) {
               if (this.a[9883 + this.aM] <= this.b[this.a[110] + this.a[9833 + this.aM]] * this.b[this.a[85] + this.w] / 10) {
                  if (this.a[9933 + this.aM] != this.w) {
                     this.a.c(this.a[9733 + this.aM], this.a[9783 + this.aM], 1, 1);
                  }

                  this.a[9933 + this.aM] = (byte)this.w;
                  break;
               }
            }
         }
      }

      if (!this.t()) {
         if (this.a.q == 4) {
            if (this.u()) {
               return;
            }
         } else if (this.v()) {
            return;
         }

         this.ak();
         this.al();
         if (false && this.a.q <= 4) {
             this.v = this.b[this.a[302] + this.a.q] + this.L;
            if (this.K >= 50 && this.v < this.b[this.a[302] + this.a.q + 1] && this.a.c >= this.b[this.a[299] + this.v] * 100) {
               this.L = (byte)(this.L + (this.a.c >= this.b[this.a[299] + this.v + 1] * 100 ? 2 : 1));
               this.j();
               this.b(0, 0, 3);
               this.a.b((int)this.b[this.a[301] + this.v]);
            }
         }
      }
   }

   private void aj() {
      if (this.a[9883 + this.aM] == 0) {
         if (this.a[9833 + this.aM] == 7) {
            this.a[9833 + this.aM] = 0;
            this.b[this.a[9783 + this.aM]][this.a[9733 + this.aM]] = 0;
            this.a.c(this.a[9733 + this.aM], this.a[9783 + this.aM], 1, 1);
         }

         if (this.a[9833 + this.aM] == 6) {
            this.a[9833 + this.aM] = 7;
            this.a[9883 + this.aM] = this.b[this.a[110] + 7];
            this.a.c(this.a[9733 + this.aM], this.a[9783 + this.aM], 1, 1);
         }

         this.am();
      }
   }

   private boolean t() {
      for (this.aM = 0; this.aM < 2; this.aM++) {
         for (this.w = 0; this.w < 5 && this.a.c[this.aM][this.w][2] >= 0; this.w++) {
            if ((this.a.c & 7) == 0) {
               this.a.c[this.aM][this.w][2]++;
            }

            if (this.a.c[this.aM][this.w][2] >= 100) {
               this.a.c[this.aM][this.w][2] = -1;
            } else {
               for (this.u = -1; this.u < 2; this.u++) {
                  for (this.v = -1; this.v < 2; this.v++) {
                     this.C = this.a.c[this.aM][this.w][0] + this.u;
                     this.D = this.a.c[this.aM][this.w][1] + this.v;
                     if (this.C >= 0 && this.C < this.a.c && this.D >= 0 && this.D < this.a.d) {
                        this.A = this.b[this.D][this.C];
                        if (this.A >= 1 && this.A <= 100 && this.a[1414 + this.A] >= 12) {
                           this.a[7979 + this.A] = (byte)(this.a[7979 + this.A] | 4);
                        }
                     }
                  }
               }
            }
         }
      }

      if (this.a.q != 3
         && (this.a.q != 2 || this.f <= 2)
         && (this.a[1919 + this.a[0][17]] == 0 || this.a[1414 + this.a[0][17]] < 12)
         && !this.a.K
         && this.a[0][11] > 0
         && this.f < 50
         && this.a.u == 0
         && this.K >= 50) {
         for (this.v = 1; this.v <= 50; this.v++) {
            if (this.a[1919 + this.v] > 0 && this.a[1414 + this.v] >= 12) {
               this.a.K = true;
               this.a.a((byte)18, (byte)this.v, (byte)this.v);
               return true;
            }
         }
      }

      return false;
   }

   private boolean u() {
      if (this.a[1919 + this.a[0][17]] > 0 && this.a[1414 + this.a[0][17]] >= 12) {
         if ((this.a.a[1][0][67] & 256) != 0 && (this.R & 64) == 0 && this.K >= 50) {
            this.b(this.a[0][17], 0, 1);
            this.a.b(51);
            this.R = (byte)(this.R | 64);
            return true;
         }

         if (this.f > 0 && this.f < 3 && this.a.c >= 3000 + this.f * 7000 && this.K >= 50) {
            this.c(false);

            for (this.N = 0; this.N < 4; this.N++) {
               this.a.p[this.N + 1] = this.e[this.N][0] != 0 ? this.e[this.N][0] : this.e[0][0];
            }

            this.a.b(this.f == 1 ? 53 : 54);
            this.f = (byte)(this.f + 50);
            return true;
         }
      }

      return false;
   }

   private boolean v() {
      if (this.f < this.b[this.a[291] + this.a.q] && (this.a.q == 3 || this.a[1919 + this.a[0][17]] > 0 && this.a[1414 + this.a[0][17]] >= 12)) {
         this.N = this.b[this.a[287] + this.b[this.a[288] + this.a.q] + this.f];
         if (this.a[1][11] <= 0 && this.N == 3 && this.F == 1000000) {
            this.F = this.a.c;
         }

         if (this.N >= 3 && this.N <= 9) {
            if (this.N == 7) {
               if (this.a.q != 3 || this.f != 2 || this.K >= 50) {
                  for (this.aM = 1; this.aM <= 50; this.aM++) {
                     if (this.a[1919 + this.aM] > 0 && this.a[1414 + this.aM] >= 12 && this.a[202 + this.aM] == 0 && this.a[303 + this.aM] == 0) {
                        this.b(this.aM, 0, this.a[0 + this.aM], this.a[101 + this.aM]);
                        if (this.f >= 50) {
                           if (this.a.q == 3) {
                              for (this.aM = 0; this.aM < 5; this.aM++) {
                                 if (this.a.p[this.aM] != 0) {
                                    this.a((int)this.a.p[this.aM], true);
                                 }
                              }
                           }

                           return true;
                        }
                     }
                  }
               }
            } else if (this.N == 3 && this.a.c - this.F > 40
               || this.F > 2 && this.N == 4
               || this.a.c - this.F > (this.a.q < 2 ? 30 : 120) && this.N == 5
               || this.N == 6 && this.a[1][14] < 5
               || this.N == 8 && this.a[8536] == 0) {
               if (this.a.q < 2) {
                  this.I = (byte)(this.N == 4 ? 3 : 0);
               }

               if (this.N == 8) {
                  this.a.b(58, 30);
                  this.a.aw = 1;
                  this.a(3, 57, 30, (byte)0, (byte)9);
                  this.a.aw = 2;

                  for (this.N = 1; this.N < 9; this.N++) {
                     if (this.a[1919 + this.N] > 0) {
                        if (this.a[1515 + this.N] == 0) {
                           if (this.a.p[4] < 1) {
                              this.a.p[4] = (byte)this.N;
                           }
                        } else if (this.a.p[2] < 1) {
                           this.a.p[2] = (byte)this.N;
                        } else if (this.a.p[3] < 1) {
                           this.a.p[3] = (byte)this.N;
                        }

                        this.a[606 + this.N] = (byte)(3 + (this.a[1515 + this.N] << 2));
                     }
                  }

                  this.a.a((byte)0, (byte)56, (byte)30, (byte)2, (byte)0);
                  this.a.a((byte)0, (byte)55, (byte)31, (byte)2, (byte)0);
                  this.a[0][19] = (short)(this.a[0][19] - 5);
               } else if (this.N == 6) {
                  this.a(8, 21, 72, (byte)1, (byte)3);
                  this.a(8, 21, 75, (byte)1, (byte)3);

                  for (this.N = 51; this.N <= 100; this.N++) {
                     if (this.a[1919 + this.N] > 0) {
                        this.a[6161 + this.N] = 2;
                        this.a[4747 + this.N] = -1;
                        this.a[3131 + this.N] = this.a[8384];
                        this.a[3232 + this.N] = this.a[8445];
                     }
                  }
               } else if (this.a.q == 5) {
                  this.b(0, 0, 1);
               } else {
                  this.c(this.a.q == 2);

                  for (this.N = 0; this.N < 4; this.N++) {
                     this.a.p[this.N + 1] = this.e[this.N][0] != 0 ? this.e[this.N][0] : this.e[0][0];
                  }
               }

               this.a.b((int)this.b[this.a[286] + this.b[this.a[288] + this.a.q] + this.f]);
               this.f = (byte)(this.f + 50);
               return true;
            }
         }
      }

      return false;
   }

   private void ak() {
      if (this.a[1][14] <= 0 && (this.b[this.a[279] + this.a.q] & 1) != 0) {
         if (this.a.u == 0) {
            this.a.u = 1;
         }
      } else if ((this.a[0][11] <= 0 || this.a[8506] <= 0 && (this.b[this.a[279] + this.a.q] & 2) != 0) && this.a.u == 0) {
         this.a.u = 50;
      }

      if (this.a[1][14] <= 4 && this.a[1][11] <= 0) {
         switch (this.a.q) {
            case 2:
               if (this.f < 2) {
                  this.f = 2;
               }
               break;
            case 5:
               if (this.a.u == 0) {
                  this.a.u = 1;
                  return;
               }

               if (this.a.u == 20) {
                  this.a.u = 0;
                  this.a.c();
                  return;
               }
         }
      }
   }

   private void al() {
      if ((this.a.p & 1) == 1 && this.a.q < 2 && this.g < this.b[this.a[294] + this.f] && !this.a.K) {
         if (this.J < 120 - this.b[this.a[298] + this.g]) {
            switch (this.b[this.a[296] + this.g]) {
               case 1:
                  for (this.v = 1; this.v <= 30; this.v++) {
                     if (!this.a.F && this.a[8505 + this.v] > 0 && this.a[8749 + this.v] == this.b[this.a[297] + this.g]) {
                        this.J = (byte)(120 - this.b[this.a[298] + this.g]);
                        break;
                     }
                  }

                  if (this.J < 120 - this.b[this.a[298] + this.g]) {
                     this.J = 0;
                  }
                  break;
               case 2:
                  for (this.v = 1; this.v <= 50; this.v++) {
                     if (this.a[1919 + this.v] > 0 && this.b[this.a[41] + this.a[2828 + this.v]] == this.b[this.a[297] + this.g]) {
                        this.J = (byte)(120 - this.b[this.a[298] + this.g]);
                        break;
                     }
                  }
               case 3:
               default:
                  break;
               case 4:
                  if (this.a[1][11] == 0 && this.a.N) {
                     this.J = (byte)(120 - this.b[this.a[298] + this.g]);
                  }
            }
         }

         if ((this.a.c & 7) == 0) {
            this.J++;
         }

         if (this.J >= (this.b[this.a[296] + this.g] == 0 ? this.b[this.a[298] + this.g] : 120)) {
            this.J = 0;
            this.b(0, 0, 3);
            this.a.b((int)this.b[this.a[295] + this.g]);
            this.g++;
            if (this.g == 11) {
               this.aQ = this.a.c + 500;
            }
         }
      }
   }

   private void a(int var1, boolean var2) {
      this.a[3131 + var1] = this.a[0 + var1];
      this.a[3232 + var1] = this.a[101 + var1];
      if ((this.a[2929 + var1] & 255) <= 7
         && (this.a[1111 + var1] & 15) < (this.b[this.a[15] + (this.a[606 + var1] & 1) * 9 + this.a[1010 + var1] - this.a[7777 + var1]] + 1) / 2
         && this.a[1313 + var1] >= 0
         && this.a[808 + var1] > 0) {
         this.a[3131 + var1] = (byte)(this.a[3131 + var1] + this.b[this.a[1] + this.a[606 + var1]]);
         this.a[3232 + var1] = (byte)(this.a[3232 + var1] + this.b[this.a[1] + 8 + this.a[606 + var1]]);
      }

      this.a[808 + var1] = 0;
      if (var2) {
         this.a[6262 + var1] = this.a[3131 + var1];
         this.a[6363 + var1] = this.a[3232 + var1];
         this.a(var1, (byte)69);
      }
   }

   final void j() {
      for (this.w = 0; this.w < 12; this.w++) {
         this.a.f[this.w] = this.b[this.a[113] + (this.a.q < 4 ? 0 : (this.a.q == 4 ? 12 : 24)) + this.w];
      }

      if (this.a.q <= 4) {
         for (this.w = this.b[this.a[302] + this.a.q]; this.w < this.b[this.a[302] + this.a.q + 1]; this.w++) {
            if (this.a.c < this.b[this.a[299] + this.w] * 100) {
               return;
            }

            this.a.f[this.b[this.a[300] + this.w]]++;
         }
      }
   }

   final void k() {
      if (this.a.v == 1 && this.K < 50) {
         this.a.h = 2;
      } else if ((this.a.N || this.a.L || this.O >= 0 && this.O == this.b[this.a[236] + this.b[this.a[238] + this.a.q] + this.N] - 1) && this.a.v == 1) {
         this.a.h = 1;
      } else {
         this.a.h = 0;
      }
   }

   private void am() {
      for (this.u = 0; this.u < 2; this.u++) {
         for (this.v = this.u * 50 + 1; this.v <= (this.u + 1) * 50; this.v++) {
            if (this.a[3232 + this.v] == this.a[9783 + this.aM]
               && (this.a[3131 + this.v] == this.a[9733 + this.aM] || this.a[2828 + this.v] == 13)
               && this.a[2828 + this.v] >= 10
               && this.a[2828 + this.v] <= 16) {
               if (this.a[4444 + this.v] >= 0) {
                  this.a[4444 + this.v] = -1;
                  this.a[808 + this.v] = 0;
               }

               if ((this.a[2828 + this.v] == 16 || this.a[2828 + this.v] == 12) && this.a[3636 + this.v] > 0) {
                  this.a(this.v, this.b[this.a[160] + this.a[2828 + this.v]]);
                  this.N();
               }
            }
         }
      }
   }

   private void an() {
      if (this.a[2828 + this.v] >= 10 && this.a[2828 + this.v] <= 16 && this.a[2828 + this.v] != 11 && this.a[2828 + this.v] != 14) {
         this.a[3131 + this.v] = this.a[6262 + this.v];
         this.a[3232 + this.v] = this.a[6363 + this.v];
         if (this.c(this.b[this.a[6363 + this.v]][this.a[6262 + this.v]])) {
            this.g(1);
            return;
         }

         if (!this.b(false)) {
            if (this.a[3636 + this.v] > 0) {
               this.a(this.v, this.b[this.a[160] + this.a[2828 + this.v]]);
               this.N();
               return;
            }

            if (this.a[2828 + this.v] == 12 || this.a[2828 + this.v] == 16) {
               this.a(this.v, (byte)60);
               this.a[6464 + this.v] = 12;
               this.a[4444 + this.v] = 0;
               return;
            }
         }
      } else {
         this.a(
            (int)0,
            (int)19,
            (int)b(this.a[0 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.c - 1),
            (int)b(this.a[101 + this.v] - 3 + this.a.a(255, (int)6), 0, this.a.d - 1)
         );
      }
   }

   private boolean b(boolean var1) {
      byte var2 = 0;
      byte var3 = 0;
      this.E = 12;

      for (this.aM = 0; this.aM < 50; this.aM++) {
         if (this.a[9833 + this.aM] != 0) {
            this.z = (byte)(this.a[9733 + this.aM] - this.a[this.b[var1 ? 0 : 62] + this.v]);
            this.A = (byte)(this.a[9783 + this.aM] - this.a[this.b[var1 ? 1 : 63] + this.v]);
            this.C = (byte)(this.b[this.a[53] + (this.A > -12 && this.A < 12 ? 12 + this.A : 0) * 25 + (this.z > -12 && this.z < 12 ? 12 + this.z : 0)] / 10);
            if (this.C <= (var1 ? this.a[4949 + this.v] : 9) && this.C < this.E && this.c((byte)(-this.aM - 61))) {
               var2 = this.a[9733 + this.aM];
               var3 = this.a[9783 + this.aM];
               this.E = this.C;
            }
         }
      }

      if (this.E < 12) {
         this.a[3131 + this.v] = var2;
         this.a[3232 + this.v] = var3;
         this.g(2);
         return true;
      } else {
         return false;
      }
   }

   private int a(int var1) {
      for (this.aN = 0; this.aN < 10; this.aN++) {
         if (this.a.a[this.u][this.aN][11] > 0) {
            this.v = this.a[8810 + this.a.a[this.u][this.aN][11]];
            if (this.v > 0 && this.a[2828 + this.v] == 58 && this.a[1313 + this.v] >= 0) {
               this.aO = 0;

               while (this.aO < 10 && this.a.a[this.u][this.aN][this.aO] <= 0) {
                  this.aO++;
               }

               if (this.aO != 10) {
                  this.a(this.v, this.b[this.a[86] + this.aO]);
                  if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
                     this.N();
                  } else {
                     this.a[6161 + this.v] = 3;
                  }

                  this.a.a[this.u][this.aN][10] = (byte)this.aO;
               }
            }
         }
      }

      for (this.aN = this.u * 30 + 1; this.aN <= (this.u + 1) * 30; this.aN++) {
         if (this.a[8505 + this.aN] > 0 && this.a[8749 + this.aN] == 8 && this.a[8810 + this.aN] >= 1) {
            this.v = this.a[8810 + this.aN];
            if (this.a[2828 + this.v] == 57
               && this.a[1313 + this.v] >= 0
               && this.a[2929 + this.v] != -109
               && (this.a[8932 + this.aN] == 1 || this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v)) {
               this.aO = 0;

               while (this.aO < 30 && this.a.b[this.u][0][this.aO] != this.aN && this.a.b[this.u][0][this.aO] != 0) {
                  this.aO++;
               }

               if (this.aO < 30 && this.a.b[this.u][0][this.aO] != 0) {
                  if (this.a.b[this.u][2][this.aO] >= 0) {
                     this.a(this.v, this.b[this.a[87] + this.a.b[this.u][1][this.aO]]);
                     this.a[4040 + this.v] = (byte)this.aN;
                     this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] & 239);
                     if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
                        this.N();
                     } else {
                        this.a[6161 + this.v] = 3;
                     }

                     this.a[9237 + this.aN] = 1;
                  } else {
                     while (this.aO < 29) {
                        for (this.aP = 0; this.aP < 5; this.aP++) {
                           this.a.b[this.u][this.aP][this.aO] = this.a.b[this.u][this.aP][this.aO + 1];
                        }

                        this.aO++;
                     }

                     this.a.b[this.u][0][29] = 0;
                     this.aN--;
                  }
               }
            }
         }
      }

      return var1;
   }

   private void f(boolean var1) {
      for (this.aN = 0; this.aN < 10; this.aN++) {
         if (this.a.a[this.u][this.aN][11] > 0 && this.v == this.a[8810 + this.a.a[this.u][this.aN][11]]) {
            this.aO = this.a.a[this.u][this.aN][10];
            if (!var1) {
               this.a[3535 + this.v] = (byte)(this.b[this.a[88] + this.aO] - 5 + 8);
               this.a[3636 + this.v] = 1;
               return;
            }

            if (this.a[2828 + this.v] == 26) {
               this.a[this.u][this.b[this.a[88] + this.aO]]++;
               this.a.d(this.a[4444 + this.v]);
            } else {
               this.aP = 0;

               while (
                  this.aP < 30
                     && (
                        this.a.f[0][this.aP] != this.a.a[this.u][this.aN][11]
                           || this.a.f[2][this.aP] != this.a[3131 + this.v]
                           || this.a.f[3][this.aP] != this.a[3232 + this.v]
                     )
               ) {
                  this.aP++;
               }

               this.b[this.a[3232 + this.v]][this.a[3131 + this.v]] = (byte)(-111 - this.u * 3 * 2 - this.aO + 6);
               this.a.c(this.a[3131 + this.v], this.a[3232 + this.v], 1, 1);
               this.a.f[0][this.aP] = 0;
               if (this.u == 1) {
                  this.R++;
               }
            }

            if (this.a.a[this.u][this.aN][this.aO] > 0) {
               this.a.a[this.u][this.aN][this.aO]--;
            }

            this.a.d(this.a.a[this.u][this.aN][11]);
            return;
         }
      }
   }

   private void ao() {
      for (this.aN = this.u * 30 + 1; this.aN <= (this.u + 1) * 30; this.aN++) {
         if (this.a[8505 + this.aN] > 0 && this.a[8749 + this.aN] == 8 && this.a[8810 + this.aN] == this.v) {
            this.aO = 0;

            while (this.aO < 30 && this.a.b[this.u][0][this.aO] != this.aN) {
               this.aO++;
            }

            while (this.aO < 29) {
               for (this.aP = 0; this.aP < 5; this.aP++) {
                  this.a.b[this.u][this.aP][this.aO] = this.a.b[this.u][this.aP][this.aO + 1];
               }

               this.aO++;
            }

            this.a.b[this.u][0][29] = 0;
            this.a[9237 + this.aN] = 0;
            return;
         }
      }
   }

   private void ap() {
      this.ao();
      this.a(this.v, (byte)57);
      this.N();
      this.v = this.a(this.v);
      this.z = this.a(this.a[0 + this.v], this.a[101 + this.v], 0);
      this.p();
   }

   private void e(int var1, int var2) {
      for (byte var3 = 0; var3 < 30 && this.a.b[var1][0][var3] != 0; var3++) {
         if (this.a.b[var1][2][var3] == var2 && this.a.b[var1][1][var3] != 3) {
            this.a.b[var1][2][var3] = -2;
         }
      }
   }

   private void aq() {
      if (this.f < 50) {
         this.M = this.b[this.a[220] + this.a.q];
         this.A = this.b[this.a[216] + this.a.q] * 500;
         if (this.a[this.u][11] > 0 && this.Q < 1) {
            this.ar();
         }

         this.as();
         if (this.a.c % (this.b[this.a[264] + this.a.q] * 50) == 50) {
            for (this.aN = 0; this.aN < 10; this.aN++) {
               if ((this.aP = this.a.a[this.u][this.aN][11]) > 0) {
                  this.aO = 0;

                  while (this.aO < 9 && this.a.a[this.u][this.aN][this.aO] == 0) {
                     this.aO++;
                  }

                  if (this.aO >= 9) {
                     for (this.aO = 0; this.aO < 2; this.aO++) {
                        for (this.v = this.aO * 3; this.v < 5; this.v++) {
                           if (this.a[this.u][5 + this.b[this.a[109] + this.v]] != 0) {
                              this.a.a[this.u][this.aN][this.b[this.a[109] + this.v]] = this.b[this.a[265] + this.a.q * 5 + this.aO];
                              break;
                           }
                        }
                     }

                     if (this.a.c > this.A / 3 && (this.R & 63) < this.b[this.a[268] + this.a.q]) {
                        for (this.aO = 2; this.aO < 5; this.aO++) {
                           this.a.a[this.u][this.aN][this.aO + 4] = this.b[this.a[265] + this.a.q * 5 + this.aO];

                           for (this.aS = 0; this.aS < this.a.a[this.u][this.aN][this.aO + 4]; this.aS++) {
                              this.n(266);
                              this.aT = 0;

                              while (this.aT < 29 && this.a.f[0][this.aT] != 0) {
                                 this.aT++;
                              }

                              this.a.f[0][this.aT] = (byte)this.aP;
                              this.a.f[2][this.aT] = this.a[3131];
                              this.a.f[3][this.aT] = this.a[3232];
                              this.a.f[1][this.aT] = (byte)(this.aO + 4 + 14);
                              this.b[this.a[3232]][this.a[3131]] = -126;
                           }
                        }
                     }
                  }
               }
            }
         }

         if (this.a.c % (this.b[this.a[269] + this.a.q] * 50) == 50 && this.a.c > this.A / 2) {
            for (this.aN = this.u * 30 + 1; this.aN <= (this.u + 1) * 30; this.aN++) {
               if (this.a[8505 + this.aN] > 0 && this.a[8749 + this.aN] == 8) {
                  for (this.aS = 0; this.aS < this.b[this.a[270] + this.a.q]; this.aS++) {
                     this.n(271);
                     this.aT = 0;

                     while (this.aT < 29 && this.a.b[this.u][0][this.aT] != 0) {
                        this.aT++;
                     }

                     this.a.b[this.u][0][this.aT] = (byte)this.aN;
                     this.a.b[this.u][2][this.aT] = this.a[3131];
                     this.a.b[this.u][3][this.aT] = this.a[3232];
                     this.a.b[this.u][1][this.aT] = 3;
                  }
               }
            }
         }
      }
   }

   private void n(int var1) {
      this.v = 0;
      this.w = this.a[var1]
         + (this.b[this.a[var1 + 1] + this.a.q] + this.a.a(255, (int)(this.b[this.a[var1 + 1] + this.a.q + 1] - this.b[this.a[var1 + 1] + this.a.q]))) * 4;
      this.a(
         (int)1,
         (int)127,
         (int)(this.b[this.w] + this.a.a(65535, (int)(this.b[this.w + 2] - this.b[this.w] + 1))),
         (int)(this.b[this.w + 1] + this.a.a(65535, (int)(this.b[this.w + 3] - this.b[this.w + 1] + 1)))
      );
   }

   private void ar() {
      if ((this.a.c & 31) == 0 || this.a.c % (this.b[this.a[241] + this.a.q] * 10) == 0) {
         for (this.aS = this.b[this.a[247] + this.a.q] & 255; this.aS < (this.b[this.a[247] + this.a.q + 1] & 255); this.aS++) {
            this.aT = -this.b[this.b[this.a[246] + this.aS]][this.b[this.a[245] + this.aS]];
            if (this.aT >= 31 && this.aT <= 60) {
               if (this.a[8749 + this.aT] == this.b[this.a[243] + this.aS] && this.a[8505 + this.aT] > 0 && this.a[8627 + this.aT] == 0) {
                  if ((this.a.c & 31) == 0) {
                     if (this.a[8505 + this.aT] < this.a[8566 + this.aT] / 4) {
                        this.a.b(this.aT, false);
                     }
                  } else if (this.a[9115 + this.aT] < this.b[this.a[244] + this.aS]) {
                     this.a.b(this.aT, true);
                  }
               }
            } else if (this.aT == 0 && (this.a.c & 31) != 0 && this.P == -1) {
               this.P = (byte)this.aS;
            }
         }

         if (this.P != -1) {
            this.v = this.b[this.a[243] + (this.P & 255)];
            if (this.a
                  .a(
                     (byte)1,
                     this.b[this.a[138] + 416 + this.b[this.a[243] + (this.P & 255)]],
                     this.b[this.a[245] + (this.P & 255)],
                     this.b[this.a[246] + (this.P & 255)],
                     3,
                     true,
                     -1
                  )
               > 0) {
               this.P = -1;
            }
         }
      }
   }

   private void as() {
      if (this.aQ < this.a.c) {
         this.aQ = (this.b[this.a[214] + this.a.q] - this.b[this.a[215] + this.a.q] * this.a.b) * 100;
         this.aQ = this.a.c + this.aQ / 4 + this.a.a(16777215, (int)(this.aQ * 3 / 2));
      }

      if (this.f >= this.b[this.a[217] + this.a.q]) {
         if ((this.a.c & 63) == 25) {
            this.aT = this.a[218] + this.a.q * 4;
            this.Q = -1;

            for (this.v = 1; this.v <= 50; this.v++) {
               if (this.a[1919 + this.v] > 0
                  && this.a[1414 + this.v] >= 12
                  && this.a[0 + this.v] >= this.b[this.aT]
                  && this.a[101 + this.v] >= this.b[this.aT + 1]
                  && this.a[0 + this.v] <= this.b[this.aT + 2]
                  && this.a[101 + this.v] <= this.b[this.aT + 3]) {
                  this.Q = (byte)this.v;

                  for (this.w = 51; this.w <= 100; this.w++) {
                     if (this.a[1919 + this.w] > 0 && this.a[1414 + this.w] >= 12 && (this.a[7979 + this.w] & 64) == 0) {
                        this.a[7979 + this.w] = (byte)(this.a[7979 + this.w] | 32);
                     }
                  }
                  break;
               }
            }
         }

         for (this.v = this.u * 50 + 1 + 0; this.v <= (this.u + 1) * 50; this.v++) {
            this.aT = (byte)(this.v - this.u * 50 - 1);
            if (this.a[1919 + this.v] > 0 && this.a[1414 + this.v] >= 12) {
               if ((this.a[7979 + this.v] & 64) != 0) {
                  if (this.O < 0
                     && (this.a[7979 + this.v] & 2) != 0
                     && this.a(this.a[0 + this.v], this.a[101 + this.v], 0) < 29
                     && this.a[202 + this.v] == 0
                     && this.a[303 + this.v] == 0) {
                     this.a[3131 + this.v] = this.a[8384];
                     this.a[3232 + this.v] = this.a[8445];
                     this.g(1);
                  }
               } else {
                  this.at();
               }
            } else if ((this.a.c & 63) == (this.v & 31) && this.j[this.aT] < this.M) {
               for (this.aU = this.u * 50 + 1; this.aU <= (this.u + 1) * 50; this.aU++) {
                  if (this.j[this.aU - this.u * 50 - 1] >= this.M && this.a[1919 + this.v] > 0 && this.a[1414 + this.v] >= 12) {
                     this.j[this.aU - this.u * 50 - 1] = this.j[this.aT];
                     this.j[this.aT] = this.M;
                     break;
                  }
               }
            }
         }
      }

      if (this.Q < 0 && this.a.q != 3 && this.a.c == this.aQ) {
         this.aR = this.aQ;
         this.av();
      }

      if (this.O >= 0 && (this.a.c & 15) == 0) {
         this.aw();
      }

      this.aU = -1;
   }

   private void at() {
      if (this.Q < 0) {
         if (this.j[this.aT] < this.M) {
            this.x = this.b[this.a[221 + this.a.q] + this.M * 3 + this.j[this.aT]];
            this.x = this.a.q >= 4 && this.a.b != 0 && (this.aT >= this.b[this.a[242] + this.a.q] || this.x != 2) ? (this.x == 0 ? 4 : 5) : this.x;
            if (this.a[6565 + this.v] != this.x) {
               this.a[6565 + this.v] = (byte)this.x;
            }
         } else if (this.a[6565 + this.v] == 9) {
            this.o(-1);
         }
      }

      if ((this.a.c & 15) == (this.v & 15)) {
         boolean var1;
         if ((
               var1 = this.a[0 + this.v] < this.b[this.G]
                  || this.a[101 + this.v] < this.b[this.G + 1]
                  || this.a[0 + this.v] > this.b[this.G + 2]
                  || this.a[101 + this.v] > this.b[this.G + 3]
            )
            && this.b[this.a[41] + this.a[2828 + this.v]] == 0
            && this.a[6161 + this.v] == 0
            && (this.a.q != 5 || this.a.c > 120)) {
            this.a[3131 + this.v] = this.b[this.a[233] + this.a.q];
            this.a[3232 + this.v] = this.b[this.a[234] + this.a.q];
            this.a[6161 + this.v] = 2;
         }

         if (this.Q < 0 && !var1) {
            if (this.j[this.aT] < this.M) {
               if ((this.a[2828 + this.v] == 69 || this.a[2828 + this.v] == 84 && this.a[3939 + this.v] == 69)
                  && this.b[this.a[42] + this.b[this.a[41] + this.a[6464 + this.v]]] != 2
                  && this.a[6161 + this.v] == 0
                  && (
                     this.a[6262 + this.v] != this.b[this.a[221 + this.a.q] + this.M + this.j[this.aT]]
                        || this.a[6363 + this.v] != this.b[this.a[221 + this.a.q] + this.M * 2 + this.j[this.aT]]
                  )) {
                  this.a[6262 + this.v] = this.b[this.a[221 + this.a.q] + this.M + this.j[this.aT]];
                  this.a[6363 + this.v] = this.b[this.a[221 + this.a.q] + this.M * 2 + this.j[this.aT]];
                  this.a[6464 + this.v] = this.b[this.a[221 + this.a.q] + this.j[this.aT]];
                  return;
               }
            } else if (this.a[2828 + this.v] == 69
               || this.a[2828 + this.v] == 84 && this.a[3939 + this.v] == 69
               || this.b[this.a[41] + this.a[2828 + this.v]] >= 13
                  && this.b[this.a[41] + this.a[2828 + this.v]] <= 15
                  && this.b[this.a[101 + this.v]][this.a[0 + this.v]] == this.v) {
               this.w = this.b[this.a[212 + this.a.b] + this.a.q];
               this.x = (this.v & 3) == 0 && this.a.q >= 4 ? 2 : (this.a[1717 + this.v] >= this.a[1616 + this.v] ? 0 : 1);
               if (this.a[this.b[this.b[this.a[107] + this.x]] + this.v] < this.w) {
                  if (this.a((int)this.b[this.a[114] + this.x])) {
                     this.a(this.v, this.b[this.a[114] + 3 + this.x]);
                     this.a[6161 + this.v] = 3;
                     return;
                  }

                  this.au();
                  return;
               }

               this.au();
            }
         }
      }
   }

   private void au() {
      if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
         this.a[6161 + this.v] = 2;
      } else {
         this.C = this.a[0 + this.v] - this.b[this.a[233] + this.a.q];
         this.D = this.a[101 + this.v] - this.b[this.a[234] + this.a.q];
         if (this.C < -5 || this.C > 5 || this.D < -5 || this.D > 5) {
            this.a[6262 + this.v] = this.b[this.a[233] + this.a.q];
            this.a[6363 + this.v] = this.b[this.a[234] + this.a.q];
            this.a(this.v, (byte)69);
            this.a[6464 + this.v] = 69;
         }
      }
   }

   private void o(int var1) {
      if (this.a[2828 + this.v] > 9 && (this.a[2828 + this.v] < 44 || this.a[2828 + this.v] > 50)) {
         if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
            this.a(this.v, (byte)59);
            this.a[6161 + this.v] = 3;
         } else {
            if (this.a[202 + this.v] == 0 && this.a[303 + this.v] == 0) {
               this.a(this.v, (byte)(var1 >= 0 ? 44 + var1 : 50));
               if (this.a(6)) {
                  this.g(2);
                  return;
               }

               this.a(this.v, (byte)69);
            }
         }
      }
   }

   private void av() {
      this.aU = 0;
      if (this.a.q < 7 || this.a.c >= this.A / 7) {
         this.x = b(
            this.b[this.a[206 + this.a.b] + this.a.q] + this.a.c / this.b[this.a[210 + this.a.b] + this.a.q] / 1000,
            0,
            this.b[this.a[208 + this.a.b] + this.a.q]
         );
         this.x = this.x / 2 + this.a.a(16777215, (int)(this.x + 1));
         this.y = this.b[this.a[212 + this.a.b] + this.a.q];
         if (this.a.c < this.A && (this.a.q != 0 || this.g < 11)) {
            if (this.a.q == 0) {
               return;
            }

            this.y = this.y / (3 - this.a.b) + this.y * this.a.c / this.A / 2;
         }

         this.z = this.a.a(65535, (int)10);

         for (this.v = this.u * 50 + 1; this.v <= (this.u + 1) * 50; this.v++) {
            if (this.a[1919 + this.v] > 0
               && this.a[1414 + this.v] >= 12
               && this.j[this.v - this.u * 50 - 1] >= this.M
               && (this.a[7979 + this.v] & 64) == 0
               && this.a[6565 + this.v] != 9
               && (this.a[1515 + this.v] != 1 || (this.R & 128) == 0)
               && (this.a[1717 + this.v] >= this.y / 2 || this.a[1616 + this.v] >= this.y / 2 || this.a[7575 + this.v] >= this.y / 2)
               && (this.z < 2 || this.a[7575 + this.v] <= 3)) {
               this.a[7979 + this.v] = (byte)(this.a[7979 + this.v] | 64);
               this.a[1717 + this.v] = (byte)b(this.a[1717 + this.v], 0, this.y);
               this.a[1616 + this.v] = (byte)b(this.a[1616 + this.v], 0, this.y);
               if (this.a.c < this.A) {
                  this.a[1919 + this.v] = this.a[6767 + this.v] = (byte)(this.a[6767 + this.v] / 2 + this.a[6767 + this.v] * this.a.c / this.A / 2);
               }

               this.aU++;
               if (this.aU >= this.x) {
                  break;
               }
            }
         }

         this.R = (byte)(this.R & 127);
         this.a(this.x - this.aU, this.b[this.a[233] + this.a.q], this.b[this.a[234] + this.a.q], (byte)this.u, (byte)0);
         this.N = (byte)this.a.a(65535, (int)this.b[this.a[235] + this.a.q]);
         this.O = 0;
      }
   }

   private void aw() {
      boolean var1 = true;
      this.aU = 0;

      for (this.v = this.u * 50 + 1; this.v <= (this.u + 1) * 50; this.v++) {
         if (this.a[1919 + this.v] > 0 && this.a[1414 + this.v] >= 12 && (this.a[7979 + this.v] & 64) != 0) {
            this.aU++;
            if (this.b[this.a[101 + this.v]][this.a[0 + this.v]] != this.v) {
               var1 = false;
               this.a[2828 + this.v] = 87;
               this.a[6161 + this.v] = 3;
            } else {
               if (this.a[6161 + this.v] == 0) {
                  this.aT = this.a[239] + (this.b[this.a[240] + this.a.q] & 255) + this.b[this.a[237] + this.b[this.a[238] + this.a.q] + this.N] + this.O * 2;
                  this.a[6262 + this.v] = this.a[3131 + this.v] = this.b[this.aT];
                  this.a[6363 + this.v] = this.a[3232 + this.v] = this.b[this.aT + 1];
                  this.a[6161 + this.v] = 3;
                  this.a[2828 + this.v] = 69;
               } else {
                  var1 = false;
               }

               if (var1 && this.a(this.a[0 + this.v], this.a[101 + this.v], 0) > 69) {
                  var1 = false;
               }
            }
         }
      }

      if (var1 || this.aR + (this.O + 1) * 150 < this.a.c) {
         this.O++;
      }

      if (this.aU == 0 || this.O >= this.b[this.a[236] + this.b[this.a[238] + this.a.q] + this.N]) {
         this.O = -1;
      }
   }

   final void a(int var1, int var2, int var3, byte var4, byte var5) {
      for (this.a = 0; this.a < var1; this.a++) {
         int var6 = var2;
         int var7 = var3;
         if (this.b[var7][var6] != 0) {
            this.v = 0;
            this.a((int)1, (int)127, (int)var6, (int)var7);
            var6 = this.a[3131];
            var7 = this.a[3232];
         }

         if ((this.b = this.a.a(var4, (byte)var6, (byte)var7, (byte)20, (byte)0)) > 0) {
            this.a[6565 + this.b] = var5;
            if (this.aU >= 0 && var4 == 1) {
               this.v = this.b;
               this.a[this.b[16 + (this.b & 1)] + this.b] = (byte)this.y;
               this.L();
               this.a[7979 + this.b] = (byte)(this.a[7979 + this.b] | 64);
            }
         }
      }
   }

   final void l() {
      for (this.a = 1; this.a <= 60; this.a++) {
         this.a.c(this.a, false);
      }

      for (this.a = 1; this.a <= 100; this.a++) {
         if (this.a[1919 + this.a] != 0) {
            this.a.a((byte)this.a);
            this.m(this.a);
         }
      }

      for (this.a = 0; this.a < 22; this.a++) {
         this.l(this.a);
      }
   }

   final void m() {
      for (this.a = 51; this.a <= 100; this.a++) {
         if (this.a[1919 + this.a] != 0) {
            this.a.a((byte)this.a);
            this.m(this.a);
         }
      }

      for (this.a = 0; this.a < 22; this.a++) {
         this.l(this.a);
      }
   }

   final void a(int var1, int var2, int var3) {
      for (this.aV = 0; this.aV <= var3 << 1; this.aV++) {
         if (var2 - var3 + this.aV >= 0) {
            if (var2 - var3 + this.aV >= this.a.d) {
               return;
            }

            this.aY = this.b[this.a[54] + (this.b[this.a[55] + var3] & 255) + this.aV];
            this.d(var1 - (this.aY >> 1), var2 - var3 + this.aV, this.aY);
         }
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      for (this.aV = 0; this.aV < var4; this.aV++) {
         if (var2 + this.aV >= 0) {
            if (var2 + this.aV >= this.a.d) {
               return;
            }

            this.d(var1, var2 + this.aV, var3);
         }
      }
   }

   private void d(int var1, int var2, int var3) {
      for (this.aW = 0; this.aW < 3; this.aW++) {
         this.aX = 0;
         if (var1 >= this.aW << 5) {
            if (var1 < this.aW + 1 << 5) {
               this.aX = this.a[var3] << var1 - (this.aW << 5);
            }
         } else if (var1 + var3 >= this.aW << 5) {
            this.aX = this.a[var3] >> (this.aW << 5) - var1;
         }

         if (this.aX != 0) {
            this.a.a[this.S][this.aW][var2] = this.a.a[this.S][this.aW][var2] | this.aX;
         }
      }
   }

   private void c(int var1, int var2, int var3, int var4) {
      byte var5 = this.b[var2][var1];
      if (var4 == 0) {
         var5 = this.a[4747 + this.v];
      }

      if (var3 == 0 && (this.a.a[0][var1 >> 5][var2] >> (var1 & 31) & 1) == 0) {
         this.e(0, 0, var3);
      } else {
         for (byte var6 = 0; var6 < 7; var6++) {
            if (var5 >= this.b[this.a[89] + 0 + var6] && var5 <= this.b[this.a[89] + 7 + var6]) {
               if (var3 == 0 && var6 == 1 && (this.a.a[1][var1 >> 5][var2] >> (var1 & 31) & 1) == 0) {
                  this.e(0, 0, var3);
               } else {
                  this.e(var5, var6, var3);
               }
               break;
            }
         }
      }

      if ((this.k[0] == 1 || this.k[0] == 2) && this.a[this.b[this.b[this.a[78] + 0 + this.k[0]]] + this.k[2]] <= 0) {
         this.e(-126, 6, var3);
      }
   }

   private void e(int var1, int var2, int var3) {
      this.k[0] = (byte)var2;
      this.k[2] = (byte)(var1 * this.b[this.a[90] + 0 + var2] + this.b[this.a[90] + 7 + var2]);
      this.k[1] = this.a[this.b[this.b[this.a[91] + var2]] + this.k[2]];
      if (this.b[this.a[92] + var2] >= 127) {
         this.k[3] = 0;
      } else {
         this.k[3] = (byte)((this.k[2] - (this.k[0] != 1 && this.k[0] != 2 ? 0 : 1)) / this.b[this.a[92] + var2] + var3 & 1);
      }
   }

   private byte a() {
      if (this.k[3] == 0) {
         if (this.k[0] == 2) {
            if (this.k[1] != 10 && this.a[1414 + this.v] < 12) {
               return 11;
            }

            if (this.k[1] == 2 && this.a[8627 + this.k[2]] == 0 && this.a[9237 + this.k[2]] > 1 && this.a[2828 + this.v] != 111) {
               return 13;
            }

            if (this.a[8627 + this.k[2]] != 1 && this.a[8627 + this.k[2]] != 2) {
               if (this.k[1] == 1 && this.b[this.a[77] + this.a[6565 + this.v]] != -1) {
                  return 6;
               }

               if (this.k[1] == 5 && this.b[this.a[77] + this.a[6565 + this.v]] < 0) {
                  return 7;
               }

               if (this.k[1] == 10 && this.a[1414 + this.v] >= 11) {
                  return 9;
               }

               if (this.k[1] == 3 && this.v != this.a[0][17]) {
                  return 10;
               }

               if (this.a[8810 + this.k[2]] > 0 && this.a[8810 + this.k[2]] != this.v) {
                  this.k = 7;
               }
            } else {
               this.k = 8;
            }
         } else if (this.k[0] == 3 && this.k[1] == 5 && this.a[6565 + this.v] != 2) {
            return 8;
         }
      }

      return -1;
   }

   final void a(byte var1, int var2, int var3) {
      if (var2 <= 50) {
         if (this.a.q >= this.b[this.a[293] + var1]) {
            if (this.d[this.b[this.a[292] + var1]] < 0) {
               this.d[this.b[this.a[292] + var1]] = 0;
               if (var1 != 4 && var1 != 5 && this.K >= 50
                  || (var1 == 4 || var1 == 5) && (this.z < this.a.I || this.z >= this.a.I + this.a.O || this.A < this.a.K || this.A >= this.a.K + this.a.P)) {
                  this.a.a(var1, (byte)var2, (byte)var3);
               }
            }
         }
      }
   }

   private void ax() {
      for (this.a = 0; this.a < 6; this.a++) {
         if (this.a.l != 1) {
            this.d[this.a] = this.b[this.c[2] + this.a];
         } else {
            if (this.d[this.a] >= 0) {
               this.d[this.a]++;
            }

            if (this.d[this.a] >= this.b[this.c[2] + this.a]) {
               this.d[this.a] = -1;
            }
         }
      }
   }

   final void n() {
      for (int var1 = 0; var1 < 5; var1++) {
         for (int var2 = 0; var2 < 6; var2++) {
            for (int var3 = 0; var3 < 6; var3++) {
               this.c[var1][var2][var3] = -1;
            }
         }
      }

      for (int var6 = 0; var6 < 5; var6++) {
         for (int var7 = this.b[this.a[115] + var6]; var7 <= this.b[this.a[116] + var6]; var7++) {
            if (this.a[this.b[this.b[this.a[117] + var6]] + var7] > 0
               && (
                  var6 > 1
                     || this.b[this.a[this.b[this.b[this.a[118] + var6] + 1] + var7]][this.a[this.b[this.b[this.a[118] + var6]] + var7]] == var7
                     || this.a[2828 + var7] == 93
                     || this.a[2828 + var7] == 92
                     || this.a[2828 + var7] == 106
               )) {
               int var4 = this.a[this.b[this.b[this.a[118] + var6]] + var7] >> 4;
               int var5 = this.a[this.b[this.b[this.a[118] + var6] + 1] + var7] >> 4;
               int var8 = var7 - this.b[this.a[115] + var6];
               this.a[var6][var8] = this.c[var6][var5][var4];
               this.c[var6][var5][var4] = (byte)var8;
            }
         }
      }
   }
}
