package FactoryPattern;
// Factory pattern -- you don't have to focus on creating object.
// You should focus on logic.
// There is factory which will object every thing.

interface Employee {
    public int getSalary();
}
class AndroidDeveloper implements Employee{
    @Override
    public int getSalary(){
        return 50_000;
    }
}

class WebDeveloper implements Employee{
    @Override
    public int getSalary(){
        return 70_000;
    }
}
class EmployeeFactory{
    //this is the class which will create the object for you
    public static Employee getEmployee(String EmpType){
        if (EmpType.trim().equalsIgnoreCase("AndroidDeveloper")) {
            return new AndroidDeveloper();
        }
        else if (EmpType.trim().equalsIgnoreCase("WebDeveloper")) {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        //Problem with factoryPattern
        Employee ee = EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println(ee.getSalary());
    }
}
