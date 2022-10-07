/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentJPA;

/**
 *
 * @author abc_k
 */
public class TestJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Student stu1 = new Student(63050100, "Johny", "Walker", 4.00);
        Student stu2 = new Student(63050101, "Le", "Gency", 3.89);
        Student stu3 = new Student(63050102, "Hong", "Tong", 3.22);
        Student stu4 = new Student(63050103, "Blend", "285", 3.14);
        
        StudentTable.insertStudent(stu1);
        StudentTable.insertStudent(stu2);
        StudentTable.insertStudent(stu3);
        StudentTable.insertStudent(stu4);

        stu4.setGpa(3.05);
        StudentTable.updateStudent(stu4);

//        StudentTable.removeStudent(stu1);
//        StudentTable.removeStudent(stu2);
//        StudentTable.removeStudent(stu3);
//        StudentTable.removeStudent(stu4);
        
    }
    
}
