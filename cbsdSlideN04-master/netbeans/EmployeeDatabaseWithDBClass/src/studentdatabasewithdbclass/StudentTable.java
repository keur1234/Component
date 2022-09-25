/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasewithdbclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.DatabaseHandler;

/**
 *
 * @author sarun
 */
public class StudentTable {
    public static int updateStudent(DatabaseHandler dbHandler, Student stu) {
        String sql = "update student set firstname=?, lastname=?, GPA=? where id=?";
        int rowUpdated;
        try {
            rowUpdated = dbHandler.update(sql, stu.getFname(), stu.getLname(), stu.getId(), stu.getGPA());
            System.out.println(stu.getFname() + " Has updated");
        }
        catch (SQLException ex ) {
            System.out.println("No data change");
            rowUpdated = 0;
        }
        
        return rowUpdated;
    }
     public static int removeStudent(DatabaseHandler dbHandler, Student stu) {
         String sql ="delete from student where id = ?";
         
         int rowDeleted;
         try {
            rowDeleted = dbHandler.update(sql, stu.getId());
            System.out.println(stu.getFname() + "Has been deleted");
         }
         catch (SQLException ex ) {
             System.out.println("No data change");
             rowDeleted = 0;
         }
        return rowDeleted;
    }
    public static int insertStudent(DatabaseHandler dbHandler, Student stu) {
         String sql = "insert into student (id, firstname, lastname, GPA)" + 
               " values (?,?,?,?)";
         
         int rowInserted;
         try {
             rowInserted = dbHandler.update(sql, stu.getId(), stu.getFname(), stu.getLname(), stu.getGPA());
             System.out.println("Added " + stu.getFname());
         }
         catch(SQLException ex ) {
             System.out.println("No data change");
             rowInserted = 0;
         }
         return rowInserted;
    } 
     public static Student findStudentById(DatabaseHandler dbHandler, int id) throws SQLException {
        String sql = "select * from employee where id = ?";
        ResultSet rs;
        Student stu = null;
        rs = dbHandler.query(sql, id);
        if (rs.next()) {
           stu = new Student();
           stu.setId(rs.getInt("id"));
           stu.setFname(rs.getString("First name"));
           stu.setLname(rs.getString("Last name"));
           stu.setGPA(rs.getDouble("GPA"));
       }
        return stu;
        
    }
    public static ArrayList<Student> findStudentByName(DatabaseHandler dbHandler, String Fname) throws SQLException {
        String sql = "select * from student where firstname = ?";
        ResultSet rs;
        ArrayList<Student> stuList = null;
        rs = dbHandler.query(sql, Fname);
        stuList = extractStudent(rs);
        return stuList;
        
    } 
    
    public static ArrayList<Student> findStudentByLastName(DatabaseHandler dbHandler, String Lname) throws SQLException {
        String sql = "select * from student where lastname = ?";
        ResultSet rs;
        ArrayList<Student> stuList = null;
        rs = dbHandler.query(sql, Lname);
        stuList = extractStudent(rs);
        return stuList;
        
    } 
    public static ArrayList<Student> findAllStudent(DatabaseHandler dbHandler) throws SQLException {
        String sql = "select * from student order by id";
        ResultSet rs; 
        ArrayList<Student> stuList = null;
        rs = dbHandler.query(sql);
        stuList = extractStudent(rs);
        return stuList;
    }
    private static ArrayList<Student> extractStudent(ResultSet rs) {
        ArrayList<Student> stuList = new ArrayList<>();
        try {
            while(rs.next()) {
                Student student = new Student();
                try {
                    student.setId(rs.getInt("id"));
                    student.setFname(rs.getString("firstname"));
                    student.setLname(rs.getString("lastname"));
                    student.setGPA(rs.getDouble("GPA"));
                } catch (SQLException ex) {
                    Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                stuList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(stuList.size() == 0) {
            stuList = null;
        }
        return stuList;
    }
}
