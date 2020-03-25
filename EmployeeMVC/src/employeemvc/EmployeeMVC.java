
package employeemvc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeeMVC{


    public static void main(String[] args) 
    {
       EmployeeController controller = new EmployeeController();
       controller.viewEmployeeDataAll();
       
       
    }
      
    
}
