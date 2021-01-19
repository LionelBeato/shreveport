package com.tts.main.factory;

public class DepartmentFactory {

    // this is a static method that we can directly call
    // and it accepts an enum of type DepartmentName
    public static Department createDepartment(DepartmentName name, String managerName){

        // we need to define and initialize a Department instance
        Department department = null;

        // this switch statement takes care of our factory logic
        switch(name) {
            case SALES -> department = new Department("Sales", managerName);
            case FINANCE -> department = new Department("Finance", managerName);
            case SERVICE -> department = new Department("Service", managerName);
            default -> System.out.println("invalid");
        }
        
        return department;
        
    }
}
