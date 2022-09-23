// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import textevents.TextReceiver;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ___Hookup_224dacb706 implements java.awt.event.TextListener, java.io.Serializable {

    public void setTarget(textevents.TextReceiver t) {
        target = t;
    }

    public void textValueChanged(java.awt.event.TextEvent arg0) {
        target.textValueChanged(arg0);
    }

    private textevents.TextReceiver target;
}
