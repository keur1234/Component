// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sunw.demo.misc.Voter;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_1f2de94a1f implements java.beans.VetoableChangeListener, java.io.Serializable {

    public void setTarget(sunw.demo.misc.Voter t) {
        target = t;
    }

    public void vetoableChange(java.beans.PropertyChangeEvent arg0)
         throws java.beans.PropertyVetoException  {
        target.vetoableChange(arg0);
    }

    private sunw.demo.misc.Voter target;
}
