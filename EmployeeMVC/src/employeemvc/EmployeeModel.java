
package employeemvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeeModel
{
    private int employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String hiredDate;
    private int salary;
    
    public void insertData(int employeeId,String firstName,String lastName,String gender,String hiredDate,int salary)
    {
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"; 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO Employee VALUES ('" + employeeId + "','" + firstName + "','" + lastName + "','" + gender + "','" + hiredDate + "','" + salary + "')"); 
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
    public void deleteData(int employeeId)
    {
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"; 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("Delete from Employee where EmployeeID=" + employeeId); 
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
    public void updateData(int oldEmployeeId,int newId,String newfirstName,String newlastName,String newGender,String newHiredDate,int newSalary)
    {
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"; 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("update Employee set EmployeeID=" + newId + ",FirstName='" + newfirstName + "',LastName='" + newlastName + "',Gender='" + newGender + "',HiredDate='" + newHiredDate + "',Salary=" + newSalary + " where EmployeeID=" + oldEmployeeId); 
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
    public ResultSet selectData(String field,int employeeId)
    {
        ResultSet hs = null;
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"; 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"); 
            Statement st = conn.createStatement(); 
           ResultSet rs=st.executeQuery("Select " + field + " from Employee where EmployeeId=" + employeeId ); 
           hs=rs;
             
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
        return hs;
        
    }
    
    public ResultSet selectAllData()
    {
        ResultSet hs = null;
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"; 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-11E320S:1433;databaseName=MVC","FaiziPc","1234"); 
            Statement st = conn.createStatement(); 
           ResultSet rs=st.executeQuery("Select * from Employee"); 
           hs=rs;
             
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
        return hs;
        
    }
    
}
