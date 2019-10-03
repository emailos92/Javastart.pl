public class ComputerFactory {
    Computer create(String processor, int memory) {
        Computer computer = new Computer(1);
        //Computer computer1 = new Computer();
        computer.processor = processor;
        computer.memory = memory;

        return computer;
    }
}
