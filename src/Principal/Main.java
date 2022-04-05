
package Principal;
import javax.swing.UIManager;
import Vista.FormArquitecto;
/**
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            FormArquitecto f=new FormArquitecto();
            f.setLocationRelativeTo(f);
            f.setVisible(true);
        } catch (Exception e) {
        }
    }

}
