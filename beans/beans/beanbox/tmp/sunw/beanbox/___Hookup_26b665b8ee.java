// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sunw.demo.molecule.Molecule;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_26b665b8ee implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(sunw.demo.molecule.Molecule t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.rotateOnX();
    }

    private sunw.demo.molecule.Molecule target;
}
