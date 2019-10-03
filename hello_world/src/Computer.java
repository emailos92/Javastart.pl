public class Computer {
    String processor;
    int memory;

    //Computer(){
    //    System.out.println("Tworzę nowy komputer");
    //}

    Computer(int a){
        System.out.println("Tworzę nowy komputer" + a);
        System.out.println(a = 10);
    }

    void printInfo(){
        System.out.println(processor + " " + memory);
    }

    String getInfo(){
        return processor + " " + memory;
    }
}
