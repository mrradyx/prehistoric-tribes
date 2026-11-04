import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d extends Canvas {
   byte a = 0;
   boolean a;

   public d(tribes var1) {
      this.setFullScreenMode(true);
   }

   public final void paint(Graphics var1) {
      var1.drawImage(f.a[0], -11, -8, 0);
   }

   final void a() {
      if (!this.a) {
         this.a = true;
         f.a[0] = Image.createImage(264, 352);
         f.a[0] = f.a[0].getGraphics();
      }

      try {
         if (this.a < 4) {
            f.a[0].setColor(16777215);
            b();
            f.a[0].drawImage(Image.createImage("/l" + this.a), 131, 168, 3);
         }
      } catch (Exception var2) {
      }

      this.repaint();
   }

   private static void b() {
      f.a[0].fillRect(11, 8, 240, 321);
   }

   protected final void keyPressed(int var1) {
   }
}
