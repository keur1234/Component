// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import mouseevents2.MouseReceiver2;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class ___Hookup_1e7ebb4fbc implements java.awt.event.MouseListener, java.io.Serializable {

    public void setTarget(mouseevents2.MouseReceiver2 t) {
        target = t;
    }

    public void mouseClicked(java.awt.event.MouseEvent arg0) {
        target.mouseClicked(arg0);
    }

    public void mouseEntered(java.awt.event.MouseEvent arg0) {
    }

    public void mouseExited(java.awt.event.MouseEvent arg0) {
    }

    public void mousePressed(java.awt.event.MouseEvent arg0) {
    }

    public void mouseReleased(java.awt.event.MouseEvent arg0) {
    }

    private mouseevents2.MouseReceiver2 target;
}
