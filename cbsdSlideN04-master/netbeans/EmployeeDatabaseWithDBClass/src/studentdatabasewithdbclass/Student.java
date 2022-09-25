/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasewithdbclass;

/**
 *
 * @author sarun
 */
public class Student {
    
    private int studentID;
    private String Fname;
    private String Lname;
    private double GPA;
    
    public Student() {
        
    }
    public Student(int studentID, String Fname,String Lname, double GPA) {
        this.studentID = studentID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.GPA = GPA;
    }
    
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    
    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getId() {
        return studentID;
    }

    public void setId(int studentID) {
        this.studentID = studentID;
    }

}
