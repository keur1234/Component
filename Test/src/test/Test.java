/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import student.Student;

/**
 *
 * @author abc_k
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std1 = new Student();
        std1.setName("PraYut");
        std1.setGpa(1.5);
        std1.setId(42222332);
        
        System.out.print("name : " + std1.getName()+ "\n GPA : " + std1.getGpa() + "\n ID : " + std1.getId() + "\n");
        
        
    }
    
}
