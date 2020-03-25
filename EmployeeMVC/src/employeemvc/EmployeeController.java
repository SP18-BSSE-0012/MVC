
package employeemvc;

public class EmployeeController 
{
    private EmployeeModel model;
    private EmployeeView view;
    
    public EmployeeController()
    {
        this.model = new EmployeeModel();
        this.view = new EmployeeView();
    }
    
    public void insertEmployeeData(int employeeId,String firstName,String lastName,String gender,String hiredDate,int salary)
    {
        model.insertData(employeeId, firstName, lastName, gender, hiredDate, salary);
    }
    
    public void updateEmployeeData(int oldEmployeeId,int newId,String newfirstName,String newlastName,String newGender,String newHiredDate,int newSalary)
    {
        model.updateData(oldEmployeeId, newId, newfirstName, newlastName, newGender, newHiredDate, newSalary);
    }
    
    public void deleteEmployeeData(int employeeId)
    {
        model.deleteData(employeeId);
    }
    
    public void viewEmployeeDataField(String field,int employeeId)
    {
        view.viewDataField(model.selectData(field, employeeId), field);
    }
    
    public void viewEmployeeDataAll()
    {
        view.viewAllData(model.selectAllData());
    }
}
