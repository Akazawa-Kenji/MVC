/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crazian
 */
public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String empId) {
        model.setEmployeeId(empId);
    }

    public String getEmployeeId() {
        return model.getEmpId();
    }

    public void updateView() {
        view.printEmployeeInfo(model.getName(), model.getEmpId());
    }
}
