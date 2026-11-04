import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class a implements PlayerListener {
   VolumeControl a;
   Player a;

   public a(String var1) {
      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(f.w, f.f[f.f], f.e[f.f]);
         this.a = Manager.createPlayer(var2, var1);
         var2.close();
         this.a.realize();
         this.a.addPlayerListener(this);
      } catch (Exception var3) {
      }
   }

   private void c() {
      try {
         if (this.a != null) {
            if (this.a.getState() == 300) {
               this.a();
            }

            if (this.a.getState() != 400) {
               this.a.prefetch();
               this.a.start();
            }
         }
      } catch (Exception var2) {
      }
   }

   final void a() {
      try {
         if (this.a != null) {
            if (this.a.getState() == 400) {
               this.a.setMediaTime(0L);
               this.a.stop();
            }
         }
      } catch (Exception var2) {
      }
   }

   final int a() {
      return this.a == null ? -1 : this.a.getState();
   }

   final void b() {
      if (this.a != null) {
         if (this.a.getState() != 0) {
            this.a.close();
         }
      }
   }

   final void a(int var1) {
      try {
         if (this.a == null) {
            return;
         }

         this.a = (VolumeControl)this.a.getControl("VolumeControl");
         if (var1 != 0) {
            if (this.a.getState() != 400) {
               this.c();
            }

            this.a.setLevel(var1 * 20);
            return;
         }

         this.a();
      } catch (Exception var3) {
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2.equals("deviceUnavailable")) {
         this.a();
         System.currentTimeMillis();
      }

      if (var2.equals("deviceAvailable")) {
         this.c();
      }
   }
}
