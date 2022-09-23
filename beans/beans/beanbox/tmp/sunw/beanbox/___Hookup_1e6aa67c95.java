// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sunw.demo.misc.Voter;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_1e6aa67c95 implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(sunw.demo.misc.Voter t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.vetoableChange(arg0);
    }

    private sunw.demo.misc.Voter target;
}
