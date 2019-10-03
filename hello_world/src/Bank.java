public class Bank {
    public static void main(String[] args) {
        //tworzymy osobę
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "123123123";

        //tworzymy adres
        Address address1 = new Address();
        address1.city = "Warszawa";
        address1.postalCode = "20-222";
        address1.street = "Woronicza";
        address1.home = 22;
        address1.flat = 43;
        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        //tworzymu konto
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000.50;

        //tworzymy kredyt
        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000.0;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);

        System.out.println("Adres: " + person1.livingAddress.city + " " + person1.livingAddress.postalCode + " " +
                person1.livingAddress.street + " " + person1.livingAddress.home + " m." + person1.livingAddress.flat);

        System.out.println("posiada konto bankowe z kwotą " + account1.balance);
        System.out.println("oraz kredyt na kwotę " + credit1.cashBorrowed);


    }
}
