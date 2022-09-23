// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import myevent.MyEventReceiver;
import myevent.MyListener;
import myevent.MyEvent;

public class ___Hookup_2190981c1b implements myevent.MyListener, java.io.Serializable {

    public void setTarget(myevent.MyEventReceiver t) {
        target = t;
    }

    public void changeMyValue(myevent.MyEvent arg0) {
        target.changeMyValue(arg0);
    }

    private myevent.MyEventReceiver target;
}
