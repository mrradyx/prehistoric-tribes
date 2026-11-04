import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class e {
   f a;
   short[] a = new short[]{
      119,
      1291,
      162,
      162,
      2782,
      144,
      1069,
      6903,
      823,
      1721,
      5492,
      119,
      1291,
      1291,
      1291,
      162,
      162,
      162,
      2782,
      2782,
      144,
      1069,
      1069,
      6903,
      6903,
      6903,
      823,
      1721,
      42,
      5492,
      5492,
      1810,
      1810,
      1810,
      1810,
      1810
   };
   byte a;
   byte[] a = new byte[]{31, 6, 12};
   String[] a = new String[]{"/pi0", "/pi9", "/pi8"};

   public e(f var1) {
      this.a = var1;
      this.a();
      this.c();
      this.i();
      this.a = 0;
      this.d();
      this.a = 1;
      this.d();
      this.b();
      this.f();
      this.e();
      this.g();
      this.h();
   }

   private void a() {
      System.gc();
      Thread.yield();
      int var1 = 0;
      this.a.b = new short[11][];
      this.a.j = new byte[25][];

      for (int var2 = 0; var2 <= 24; var2++) {
         this.a.j[var2] = new byte[this.a[var1 + 10 + 1]];
         if (var2 <= 10) {
            this.a.b[var2] = new short[this.a[var1]];
         }

         var1++;
      }

      System.gc();
      Thread.yield();
      this.a.a = new Image[3][];
      this.a.a[2] = new Image[1];
   }

   private void b() {
      System.gc();
      Thread.yield();

      try {
         DataInputStream var1;
         (var1 = new DataInputStream(this.getClass().getResourceAsStream("/pd0"))).readByte();
         int var2 = 0;

         for (int var3 = 0; var3 <= 10; var3++) {
            for (int var4 = 0; var4 < this.a[var2]; var4++) {
               this.a.b[var3][var4] = var1.readShort();
            }

            var2++;
            this.a.a(1);
         }

         for (int var7 = 0; var7 <= 24; var7++) {
            for (int var5 = 0; var5 < this.a[var2]; var5++) {
               this.a.j[var7][var5] = var1.readByte();
            }

            var2++;
            this.a.a(1);
         }

         var1.close();
         f.aV = this.a.j[23][this.a.b[10][this.a.b[9][548] & 8191] & 8191] + 9;
         f.aU = (240 - this.a.j[1][1010] * 2) / f.aV;
      } catch (Exception var6) {
      }
   }

   private void c() {
      try {
         System.gc();
         Thread.yield();
         this.a.A = 288;
         this.a.O = 11;
         this.a.P = (byte)((this.a.A - 1) / 16 + 1);
         boolean var1 = false;
         this.a.y = (byte)(this.a.O >> 1);
         this.a.A = (byte)(this.a.P >> 1);
         this.a.C = this.a.y;
         this.a.D = this.a.A;
         this.a.a = new int[]{264, 264, 240, 240, 240, 240, 68, 240, 68, 63, 240, 240, 240};
         this.a.b = new int[]{352, 304, 22, 48, 22, 48, 55, 86, 49, 55, 38, 0, 0};
         this.a.c = new int[]{0, 0, 304, 304, 326, 326, 0, 326, 0, 0, 326, 0, 0};
         this.a.d = new int[]{0, 16, 0, 0, 298, 272, 0, 234, 0, 0, 282, 320, 0};
         this.a.c = new byte[]{0, 1, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0};
         this.a.d = new byte[]{0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         f.a[this.a.c[1]] = Image.createImage(264, 304);
         f.a[this.a.c[1]] = f.a[this.a.c[1]].getGraphics();
         f.a[3] = Image.createImage(264, 304);
         f.a[3] = f.a[3].getGraphics();
         f.a[this.a.c[6]] = Image.createImage(79, 63);
         f.a[this.a.c[6]] = f.a[this.a.c[6]].getGraphics();
         this.a.bb = this.a.b[2];
      } catch (Exception var10) {
      }
   }

   private void d() {
      System.gc();
      Thread.yield();
      byte var1 = this.a[this.a];
      byte var3 = 0;

      try {
         System.gc();
         Thread.yield();
         DataInputStream var6 = new DataInputStream(this.getClass().getResourceAsStream(this.a[this.a]));
         byte[] var7 = new byte[62502];
         var6.read(var7);
         var6.close();
         int var8 = 0;
         var3 = 0;

         while (true) {
            if (var3 >= var1) {
               return;
            }

            byte var2 = (byte)(var7[var8] & 0xFF);
            var8++;
            if (var3 == 0) {
               this.a.a[this.a] = new Image[var1];
            }

            if (var2 == 255) {
               break;
            }

            short var5 = (short)(var2 << 8 | var7[var8] & 0xFF);
            var8++;

            try {
               if (var3 < 27) {
                  this.a.a[this.a][var3] = Image.createImage(var7, var8, var5);
               }
            } catch (Exception var10) {
            }

            var8 += var5;
            this.a.a(2);
            System.gc();
            Thread.yield();
            var3++;
         }
      } catch (Exception var11) {
      }
   }

   private void e() {
      System.gc();
      Thread.yield();
      this.a.a = new c(this.a);
      this.a.a.f = new byte[122];
      this.a.a.e = new byte[33];
      this.a.a.b = new byte[33][25];
      this.a.a.c = new byte[33][25];
      this.a.a.d = new byte[33];
      this.a.a.d = new short[33];
      this.a.a.e = new short[33];
      this.a.a.f = new short[33];
      this.a.a.g = new short[250];
      this.a.a.h = new short[250];
      this.a.a.b(0);
   }

   private void f() {
      System.gc();
      Thread.yield();
      this.a.a = new byte[17638];
      this.a.a = new short[312];
      this.a.b = new short[570];
      this.a.c = new short[5];
      InputStream var1 = null;

      try {
         if ((var1 = this.getClass().getResourceAsStream("/a")) != null) {
            this.a.a[0] = this.a.c[0] = 0;

            for (int var2 = 0; var2 < 312; var2++) {
               int var3 = var1.read() & 0xFF;
               int var5 = ((var1.read() & 0xFF) << 8) + var3;
               if (var2 < 311) {
                  this.a.a[var2 + 1] = (short)(this.a.a[var2] + var5);
               }

               if (var5 > 0) {
                  var1.read(this.a.a, this.a.a[var2], var5);
               }
            }

            for (int var9 = 0; var9 < 5; var9++) {
               int var10 = var1.read() & 0xFF;
               int var12 = ((var1.read() & 0xFF) << 8) + var10;
               if (var9 < 4) {
                  this.a.c[var9 + 1] = (short)(this.a.c[var9] + var12);
               }

               for (int var11 = 0; var11 < var12; var11++) {
                  int var4 = var1.read() & 0xFF;
                  this.a.b[this.a.c[var9] + var11] = (short)(((var1.read() & 0xFF) << 8) + var4);
               }
            }
         }

         var1.close();
      } catch (IOException var7) {
      }
   }

   private void g() {
      try {
         System.gc();
         Thread.yield();
         f.e = new short[]{8014, 6315, 5648, 3405, 3234};
         f.f = new short[]{0, 8014, 14329, 19977, 23382};
         f.w = new byte[26616];
         this.a.b = new byte[]{0, 1, 2, 3, 4, 4};
         InputStream var1;
         (var1 = this.getClass().getResourceAsStream("/sa")).read(f.w, 0, 26616);
         var1.close();
      } catch (Exception var2) {
      }
   }

   private void h() {
      try {
         System.gc();
         Thread.yield();
         this.a.h = new int[]{0, 2545, 6965, 10649, 15487, 22633, 27261, 31708, 35466, 39214};
         this.a.v = new byte[42381];
         InputStream var1;
         (var1 = this.getClass().getResourceAsStream("/ma")).read(this.a.v, 0, 42381);
         var1.close();
      } catch (Exception var2) {
      }
   }

   private void i() {
      System.gc();
      Thread.yield();
      this.a.e = new byte[9983];
      this.a.b = new byte[96][96];
      this.a.c = new byte[96][96];
      this.a.a = new int[3][4];

      try {
         this.a.a = this.a.a.getAppProperty("MIDlet-Version");
         this.a.d = this.a.a.getAppProperty("GameLinkEnabled").equals("true");
         this.a.a = this.a.a.getAppProperty("Cheat-Support").equals("on");
      } catch (Exception var2) {
      }

      if (this.a.d) {
         this.a.U = 1;
      }
   }
}
