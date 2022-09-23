// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sun.beanbox.BeanBox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_1e6aa108e2 implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(sun.beanbox.BeanBox t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.equals(arg0);
    }

    private sun.beanbox.BeanBox target;
}
