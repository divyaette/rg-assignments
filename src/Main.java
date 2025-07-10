public class Main {
    public static void main(String[] args) {
        EmployeeCRUD obj = new EmployeeCRUD();
        obj.addEmployee(new Employee(1, "Ette", "Finance"));
        obj.addEmployee(new Employee(2, "Divya", "IT"));

       obj.viewAllEmployees();

        System.out.println("Get by ID 1: " + obj.getEmployeeById(1));

        obj.updateEmployee(2, "Nikitha", "Marketing");

        obj.deleteEmployee(1);

        obj.viewAllEmployees();
    }
}
