/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package headqquaterbound;

/**
 *
 * @author abc_k
 */
public class HeadQquaterBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBean hqBeans = new MyBean();
        Marketing mk1 = new Marketing();
        Cnior c1 = new Cnior();
        hqBeans.addPropertyChangeListener(mk1);
        hqBeans.addPropertyChangeListener(c1);
        hqBeans.setSampleProperty(544);
        hqBeans.setSampleProperty(5424);
        
    }
    
}
