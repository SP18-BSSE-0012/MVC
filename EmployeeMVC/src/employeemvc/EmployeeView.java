
package employeemvc;

import java.sql.ResultSet;

public class EmployeeView 
{
    public void viewDataField(ResultSet rs,String field)
    {
        try
        {
            while(rs.next())
            {
                String data = rs.getString(field);
                System.out.println(field + "=" + data);
            }
                
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void viewAllData(ResultSet rs)
    {
        try
        {
            while(rs.next())
            {
            int employeeId = rs.getInt("EmployeeID");
            String FirstName = rs.getString("FirstName");
            String LastName = rs.getString("LastName");
            String Gender = rs.getString("Gender");
            String HiredDate = rs.getString("HiredDate");
            int Salary = rs.getInt("Salary");
            System.out.println("EmployeeID=" + employeeId);
            System.out.println("FirstName=" + FirstName);
            System.out.println("LastName=" + LastName);
            System.out.println("Gender=" + Gender);
            System.out.println("HiredDate=" + HiredDate);
            System.out.println("Salary=" + Salary);
            System.out.println(" ");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
                    
        }
    }
}
