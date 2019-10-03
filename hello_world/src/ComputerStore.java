public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory1 = new ComputerFactory();
        ComputerUpgrade upgrade1 = new ComputerUpgrade();
        Computer comp1,comp2;

        comp1 = factory1.create("AMD Ryzen V3", 8192);
        comp2 = factory1.create("Intel i5", 4096);

        upgrade1.addMemory(comp1,2048);
        upgrade1.addMemory(comp2,1024);

        String desc = comp1.getInfo();
        System.out.println(desc);

        desc = comp2.getInfo();
        System.out.println(desc);

//        comp1.printInfo();
    }

}
