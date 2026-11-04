import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class tribes extends MIDlet implements Runnable {
   f a;
   d a;
   Display a;

   public void startApp() {
      if (this.a != null) {
         this.a.e();
      } else {
         this.a = Display.getDisplay(this);
         new Thread(this).start();
      }
   }

   public void pauseApp() {
      if (this.a != null) {
         this.a.d();
      }
   }

   public void destroyApp(boolean var1) {
      if (this.a != null) {
         this.a.b();
      }
   }

   public void run() {
    System.gc();
    Thread.yield();
    this.a = new d(this);
    this.a.a();
    this.a.a = 0;
    this.setCurrent(this.a);
    a(100); // Antes 1000
    this.a.a();
    a(100); // Antes 2000
    this.a.a = 1;
    this.a.a();
    a(100); // Antes 2000
    this.a.a = 2;
    this.a.a();
    Thread.yield();
    this.a.a = 5;
    this.a = new f(this);
    this.a.a();
   }

   static void a(int var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var2) {
      }
   }
}
