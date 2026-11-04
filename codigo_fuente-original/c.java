import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

public final class c {
   f a;
   byte[] a;
   short[] a;
   byte[] b = new byte[1674];
   short[] b = new short[230];
   byte[] c = new byte[37488];
   short[] c = new short[310];
   byte[][] a = new byte[][]{this.b, this.c, this.c};
   short[][] a = new short[][]{this.b, this.c, this.c};
   String[] a = new String[]{"/s", "/t", "/d"};
   byte[][] b;
   byte[][] c;
   byte[] d;
   short[] d;
   short[] e;
   short[] f;
   byte[] e;
   byte a = 0;
   byte b;
   byte c;
   byte[] f;
   int a;
   InputStream a = null;
   int b;
   int c;
   int d;
   int e;
   int f = -1;
   int g;
   int h;
   byte d;
   int i;
   int j;
   int k;
   int l;
   int m;
   int n;
   int o;
   int p;
   int q;
   short[] g;
   short[] h;
   int r;
   int s;
   int t;
   int u;
   int v;
   int w;
   int x;
   int y;
   int z;
   int A;

   public c(f var1) {
      this.a = var1;
      this.a = this.a.a;
      this.a = this.a.a;
   }

   final void a() {
      for (this.k = 13; this.k < 33; this.k++) {
         this.f[this.k] = 0;
      }

      this.b = 0;
      this.c = 0;

      for (this.k = 0; this.k < 122; this.k++) {
         this.f[this.k] = 0;
      }
   }

   final void a(int var1) {
      this.a.w = -1;
      this.g = var1;

      for (this.c = this.a[308]; this.c < this.a[309]; this.c++) {
         if (var1 < this.a[this.c]) {
            this.c = this.c - this.a[308];
            break;
         }
      }

      if (this.f != this.c) {
         this.f = this.c;
         this.b(2);
      }
   }

   final void b(int var1) {
      try {
         try {
            new StringBuffer().append("/").append(f.a).append(this.a[var1]).toString();
            this.a = this.getClass().getResourceAsStream("/" + f.a + this.a[var1] + (var1 == 2 ? String.valueOf(this.f) : ""));
            if (this.a != null) {
               if (var1 < 2) {
                  this.d = 0;
                  this.a[var1][0] = 0;
                  this.c = 0;
               } else {
                  this.d = 71;
                  this.c = this.a[1][71];
               }

               while ((this.b = this.a.read()) != -1) {
                  if (this.b == 124) {
                     this.d++;
                     this.a[var1][this.d] = (short)this.c;
                  } else {
                     if (this.b == 31) {
                        for (this.e = 0; this.e < this.a.a.length(); this.c++) {
                           this.a[var1][this.c] = this.a[this.a[280] + (byte)this.a.a.charAt(this.e)];
                           this.e++;
                        }

                        this.c--;
                     } else {
                        this.a[var1][this.c] = this.a[this.a[280] + this.b];
                     }

                     this.c++;
                  }
               }
            }

            this.a.close();
            this.a = null;
         } catch (IOException var3) {
            return;
         }
      } catch (Exception var4) {
      }
   }

   final void a(int var1, int var2, int var3, String var4, int var5) {
      for (this.a = 0; this.a < var4.length(); this.a++) {
         this.b[this.b[228] + this.a] = this.a[this.a[280] + (byte)var4.charAt(this.a)];
      }

      this.b[229] = (short)(this.b[228] + var4.length());
      this.a(var1, var2, var3, 228, var5);
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      this.h = var2 == -100 ? 13 + this.b : this.a;
      if (this.h < 13 || this.f[this.h] == 0) {
         this.d[this.h] = (byte)(this.b[var4 + 1] - this.b[var4]);
         this.e[this.h] = (byte)var5;
         if (this.h >= 13) {
            var5 = 1;
         }

         this.d[this.h] = (short)((this.d[this.h] - 1) * (0 + var5));
         this.f[this.h] = (short)var1;
         this.e[this.h] = (short)(this.h >= 13 ? 0 : var2);

         for (this.a = 0; this.a < this.d[this.h]; this.a++) {
            this.d = this.b[this.b[var4] + this.a];
            if (this.d == 126) {
               this.c[this.h][this.a] = this.d;
               this.d[this.h] = (short)(this.d[this.h] - ((0 + var5) * 2 + 2));
            } else {
               this.c[this.h][this.a] = (byte)(this.d / 30);
               this.b[this.h][this.a] = (byte)(this.d % 30);
               if (this.d / 30 != 0 || this.d % 30 < 14) {
                  this.d[this.h] = (short)(
                     this.d[this.h]
                        + (
                           (this.a[this.a[281 + var5] + this.c[this.h][this.a] * 21 + this.b[this.h][this.a] + 1] & 255)
                              - (this.a[this.a[281 + var5] + this.c[this.h][this.a] * 21 + this.b[this.h][this.a]] & 255)
                        )
                  );
               }
            }
         }

         if (var4 == 97) {
            this.a.a(1041, 26, var2 - 2);
            this.a.a(1047, 211, var2 - 2);
         }

         if (this.h < 13) {
            this.f[this.h] = (short)(this.f[this.h] - this.d[this.h] * var3 / 2);
            this.a++;
         } else {
            this.b++;
            if (this.b >= 20) {
               this.b = 0;
            }
         }
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var4 >= 0) {
         this.a(var1, var2, 0, var4, var7);
         this.i = this.d[this.h] + 1;
         this.j = this.h;
      }

      if (var5 >= 0) {
         this.a(var1 + this.i, var2, 0, var5, var7);
         this.i = this.i + this.d[this.h] + 1;
      }

      if (var6 >= 0) {
         this.a(var1 + this.i, var2, 0, var6, var7);
         this.i = this.i + this.d[this.h];
      }

      while (this.j < this.a) {
         this.f[this.j] = (short)(this.f[this.j] - this.i * var3 / 2);
         this.j++;
      }
   }

   final void a(Graphics var1) {
      for (this.k = 0; this.k < this.a; this.k++) {
         this.m = this.f[this.k];

         for (this.l = 0; this.l < this.d[this.k]; this.l++) {
            if (this.c[this.k][this.l] == 126) {
               this.m = this.m - (0 + this.e[this.k] + 2);
            } else {
               this.n = this.e[this.k];
               this.q = this.m;
               this.o = (this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l] + 1] & 255)
                  - (this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 255);
               if (this.c[this.k][this.l] == 0 && this.b[this.k][this.l] >= 14) {
                  this.n = this.n - this.a[this.a[285] + this.b[this.k][this.l] - 14];
                  this.q = this.q - (0 + (this.o + this.p) / 2);
               }

               f.a(
                  var1,
                  this.a.a[0][25 + this.e[this.k]],
                  this.a[this.a[281 + this.e[this.k]] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 255,
                  this.a[this.a[284] + this.e[this.k] * 3 + this.c[this.k][this.l]],
                  this.o,
                  this.a[this.a[283] + this.e[this.k] * 3 + this.c[this.k][this.l]],
                  11 + this.q,
                  8 + this.n,
                  20
               );
               if (this.c[this.k][this.l] != 0 || this.b[this.k][this.l] < 14) {
                  this.m = this.m + this.o + 0 + this.e[this.k];
               }

               this.p = this.o;
            }
         }
      }

      this.a = 0;
   }

   final void b() {
      for (this.k = 13 + this.c; this.k != 13 + this.b; this.k++) {
         this.e[this.k] = (short)(this.e[this.k] + this.e[this.k] / 4 + 1);
         if (this.e[this.k] >= 15) {
            this.f[this.k] = 0;
            this.c++;
            if (this.c >= 20) {
               this.c = 0;
            }
         }

         if (this.k == 32) {
            this.k = 12;
         }
      }

      for (this.k = 0; this.k < 122; this.k++) {
         if (this.f[this.k] != 0 && this.k % 3 == this.a.c % 3) {
            this.a(this.k, -100, 0, (this.f[this.k] > 0 ? "+" : "") + this.f[this.k], this.f[this.k] > 0 ? 2 : (this.k <= 50 ? 1 : 0));
            this.f[this.k] = 0;
         }
      }
   }

   final void a(int var1, int var2, int var3) {
      for (this.k = 13 + this.c; this.k != 13 + this.b; this.k++) {
         if (this.f[this.k] == var1) {
            this.m = var2 - this.d[this.k] / 2 + this.a.a(255, (int)5) - 2;
            this.n = var3 - 5 - this.e[this.k] * 2;

            for (this.l = 0; this.l < this.d[this.k]; this.l++) {
               this.o = (this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l] + 1] & 255)
                  - (this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 255);
               f.a(
                  f.a[1],
                  this.a.a[0][26],
                  this.a[this.a[282] + this.c[this.k][this.l] * 21 + this.b[this.k][this.l]] & 255,
                  this.a[this.a[284] + 3 + this.c[this.k][this.l]] + this.a[this.a[283] + 3 + 0] * this.e[this.k],
                  this.o,
                  this.a[this.a[283] + 3 + this.c[this.k][this.l]],
                  11 + this.m,
                  8 + this.n,
                  20
               );
               this.m = this.m + this.o + 0 + 1;
            }
         }

         if (this.k >= 32) {
            this.k = 12;
         }
      }
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var1++;
      var3 -= 2;
      var2 += 4;
      var4 -= 4;
      if (var5 >= 71) {
         var5 += this.a[this.a[309] + this.g] & 255;
      }

      this.w = 0;
      this.u = 0;
      this.g[0] = this.a[1][var5];
      this.x = 0;

      for (this.v = this.a[1][var5] & '\uffff'; this.v < (this.a[1][var5 + 1] & '\uffff'); this.v++) {
         if (this.a[1][this.v] == 42 && (this.a[1][this.v + 1] < 90 || this.a[1][this.v + 1] >= 112) || this.a[1][this.v] == 127) {
            this.w = this.v + 1;
            this.y = this.x;
         }

         if (this.a[1][this.v] == 126) {
            this.x -= 0 + var7 + 2;
         } else if (this.a[1][this.v] < 127 && (this.a[1][this.v] / 30 != 0 || this.a[1][this.v] % 30 < 14)) {
            this.x += 0 + var7;
            this.x = this.x
               + (
                  this.a[1][this.v] >= 90
                     ? 15
                     : (this.a[this.a[281 + var7] + this.a[1][this.v] / 30 * 21 + this.a[1][this.v] % 30 + 1] & 255)
                        - (this.a[this.a[281 + var7] + this.a[1][this.v] / 30 * 21 + this.a[1][this.v] % 30] & 255)
               );
         }

         if (this.x > var3 && this.w > (this.g[this.u] & '\uffff') || this.a[1][this.v] == 127) {
            this.u++;
            this.g[this.u] = (short)this.w;
            this.h[this.u - 1] = (short)(var1 + (var3 - this.y) * (var6 & 1) / 2);
            this.v = this.w - 1;
            this.x = 0;
         }

         if (this.a[1][this.v] == 70 || this.a[1][this.v] == 73 || this.a[1][this.v] == 78) {
            this.w = this.v + 1;
            this.y = this.x;
         }
      }

      if (this.x > 0) {
         this.u++;
         this.h[this.u - 1] = (short)(var1 + (var3 - this.x) * (var6 & 1) / 2);
         this.g[this.u] = this.a[1][var5 + 1];
      }

      this.r = var2 + (var6 == 3 && this.u * 17 < var4 ? (var4 - this.u * 17) / 2 : 0);
      this.s = var7;
      this.t = var4 / 17;
   }

   final void a(Graphics var1, int var2) {
      try {
         for (this.k = var2; this.k < var2 + this.t && this.k < this.u; this.k++) {
            this.m = this.h[this.k];

            for (this.l = this.g[this.k] & '\uffff'; this.l < (this.g[this.k + 1] & '\uffff'); this.l++) {
               if (this.a[1][this.l] != 127) {
                  if (this.a[1][this.l] == 126) {
                     this.m = this.m - (0 + this.s + 2);
                  } else {
                     this.n = this.r + (this.k - var2) * 17;
                     if (this.a[1][this.l] > 112) {
                        this.z = this.a[1][this.l] - 112 - 1 + 19;
                        this.a(24, this.n, 0, String.valueOf(this.z == 24 ? this.a.a[0][this.z] * 10 + this.a.a(65535, (int)10) : this.a.a[0][this.z]), 0);
                        this.a(216, this.n, 2, String.valueOf(this.z == 24 ? this.a.a[1][this.z] * 10 + this.a.a(65535, (int)10) : this.a.a[1][this.z]), 0);
                     } else {
                        this.z = this.a[1][this.l] / 30;
                        this.A = this.a[1][this.l] % 30;
                        this.o = this.z >= 3
                           ? 15
                           : (this.a[this.a[281 + this.s] + this.z * 21 + this.A + 1] & 255) - (this.a[this.a[281 + this.s] + this.z * 21 + this.A] & 255);
                        this.q = this.m;
                        if (this.z >= 3) {
                           this.a.a(560 + this.a[1][this.l] - 90, this.q, this.n + -1);
                        } else {
                           if (this.z == 0 && this.A >= 14) {
                              this.n = this.n - this.a[this.a[285] + this.A - 14];
                              this.q = this.q - (0 + (this.o + this.p) / 2);
                           }

                           f.a(
                              var1,
                              this.a.a[0][25 + this.s],
                              this.a[this.a[281 + this.s] + this.z * 21 + this.A] & 255,
                              this.a[this.a[284] + this.s * 3 + this.z],
                              this.o,
                              this.a[this.a[283] + this.s * 3 + this.z],
                              11 + this.q,
                              8 + this.n,
                              20
                           );
                        }

                        if (this.z != 0 || this.A < 14) {
                           this.m = this.m + this.o + 0 + this.s;
                        }

                        this.p = this.o;
                     }
                  }
               }
            }
         }

         if (var2 == 0) {
            this.a.Q = true;
         } else {
            this.a.Q = false;
         }

         if (var2 + this.t < this.u) {
            this.a.R = false;
            return;
         }

         this.a.R = true;
      } catch (Exception var4) {
      }
   }
}
