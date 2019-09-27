public class Company {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.firstName = "Emil";
        emp1.lastName = "Arkita";
        emp1.age = 27;
        emp1.seniority =  5;

        emp2.firstName = "Dawid";
        emp2.lastName = "Arkita";
        emp2.age = 25;
        emp2.seniority =  3;

        emp3.firstName = "Karol";
        emp3.lastName = "Petela";
        emp3.age = 20;
        emp3.seniority =  0;

        String infoEmp1 = emp1.firstName + " " + emp1.lastName + " " + emp1.age + ",seniority = " + emp1.seniority;
        String infoEmp2 = emp2.firstName + " " + emp2.lastName + " " + emp2.age + ",seniority = " + emp2.seniority;
        String infoEmp3 = emp3.firstName + " " + emp3.lastName + " " + emp3.age + ",seniority = " + emp3.seniority;

        System.out.println(infoEmp1);
        System.out.println(infoEmp2);
        System.out.println(infoEmp3);

    }
}
