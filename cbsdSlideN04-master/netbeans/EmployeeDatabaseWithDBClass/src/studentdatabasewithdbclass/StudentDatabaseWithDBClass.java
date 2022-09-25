/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasewithdbclass;

import java.sql.SQLException;
import java.util.ArrayList;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;

/**
 *
 * @author user
 */
public class StudentDatabaseWithDBClass {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/student";
        String user = "root";
        String passwd = "root";

        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student stu1 = new Student(63050100, "Johny", "Walker", 4.00);
        Student stu2 = new Student(63050101, "Le", "Gency", 3.89);
        Student stu3 = new Student(63050102, "Hong", "Tong", 3.22);
        Student stu4 = new Student(63050103, "Blend", "285", 3.14);
        
        StudentTable.insertStudent(dbHandler, stu1);
        StudentTable.insertStudent(dbHandler, stu2);
        StudentTable.insertStudent(dbHandler, stu3);
        StudentTable.insertStudent(dbHandler, stu4);

        stu4.setGPA(3.05);
        StudentTable.updateStudent(dbHandler, stu4);

        StudentTable.removeStudent(dbHandler, stu1);
        StudentTable.removeStudent(dbHandler, stu2);
        StudentTable.removeStudent(dbHandler, stu3);
        StudentTable.removeStudent(dbHandler, stu4);
        


        ArrayList<Student> StudentList = StudentTable.findAllStudent(dbHandler);
        if (StudentList != null) {
            printAllStudent(StudentList);
        }
        dbHandler.closeConnection();
    }
    
    public static void printAllStudent(ArrayList<Student> stuList) {
        System.out.println("All student list");
        for(int i = 0; i < stuList.size(); i++) {
            System.out.print(stuList.get(i).getId() + " ");
            System.out.print(stuList.get(i).getFname() + " ");
             System.out.print(stuList.get(i).getLname() + " ");
            System.out.println(stuList.get(i).getGPA() + " ");
        }
        
    }
}
