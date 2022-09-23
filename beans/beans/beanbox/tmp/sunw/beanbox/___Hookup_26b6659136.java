// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sunw.demo.molecule.Molecule;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ___Hookup_26b6659136 implements java.awt.event.ActionListener, java.io.Serializable {

    public void setTarget(sunw.demo.molecule.Molecule t) {
        target = t;
    }

    public void actionPerformed(java.awt.event.ActionEvent arg0) {
        target.rotateX(arg0);
    }

    private sunw.demo.molecule.Molecule target;
}
