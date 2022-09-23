// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import counter.Counter;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_1e778fabbc implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(counter.Counter t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.increment();
    }

    private counter.Counter target;
}
