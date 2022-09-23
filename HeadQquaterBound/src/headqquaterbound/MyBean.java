/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package headqquaterbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author abc_k
 */
public class MyBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "someData";
    
    private int someData;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getSampleProperty() {
        return someData;
    }
    
    public void setSampleProperty(int value) {
        int oldValue = someData;
        someData = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, someData);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
