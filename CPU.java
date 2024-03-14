public class CPU {
    private double price;
    private Processor processor;
    private RAM ram;

    public CPU(double price, Processor processor, RAM ram) {
        this.price = price;
        this.processor = processor;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("CPU Price: $" + price);
        System.out.println("Processor Info:");
        System.out.println("   Cores: " + processor.getCores());
        System.out.println("   Manufacturer: " + processor.getManufacturer());
        System.out.println("RAM Info:");
        System.out.println("   Memory: " + ram.getMemory() + " GB");
        System.out.println("   Manufacturer: " + ram.getManufacturer());
    }

    public static class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public int getCores() {
            return cores;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static void main(String[] args) {
        CPU.Processor processor = new CPU.Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        CPU cpu = new CPU(300, processor, ram);
        cpu.displayInfo();
    }
}