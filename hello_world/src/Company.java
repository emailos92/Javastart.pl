public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[20];

        employees[0] = new Employee("Jan", "Nowak", 4500);
        employees[1] = new Employee("Krzysztof", "Stary", 2000);
        employees[2] = new Employee("Kacper", "Lis", 1500);

        for (int employeeIndex = 0; employeeIndex < employees.length; employeeIndex++) {
            System.out.println(employees[employeeIndex].getFirstName() + " " +
                    employees[employeeIndex].getLastName() + " " +
                    employees[employeeIndex].getSalary() + " zł");
        }
    }
}
