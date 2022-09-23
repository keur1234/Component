// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import counter.Counter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ___Hookup_1e778fcdd9 implements java.awt.event.ActionListener, java.io.Serializable {

    public void setTarget(counter.Counter t) {
        target = t;
    }

    public void actionPerformed(java.awt.event.ActionEvent arg0) {
        target.start();
    }

    private counter.Counter target;
}
