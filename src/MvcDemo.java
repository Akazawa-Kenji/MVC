/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crazian
 */
public class MvcDemo {

    public static void main(String[] args) {

        //fetch student data based on ID
        Employee model = fetchEmployee();

        //creates view to show employee data
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        
        controller.setEmployeeName("Kenny G");
        controller.setEmployeeId("54321");
        
        //using controller to update view
        controller.updateView();
    }

    private static Employee fetchEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId("12345");
        employee.setName("Kenji");
        
        return employee;
    }
}
