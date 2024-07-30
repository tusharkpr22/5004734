class Computer {
    // Attributes of the Computer
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String powerSupply;
    private String motherboard;

    // Private constructor to ensure object creation only through Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.powerSupply = builder.powerSupply;
        this.motherboard = builder.motherboard;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String CPU;
        private String RAM;

        // Optional parameters
        private String storage;
        private String GPU;
        private String powerSupply;
        private String motherboard;

        // Constructor for Builder with required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional parameters
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        // Method to build the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", GPU=" + GPU + ", powerSupply=" + powerSupply + ", motherboard=" + motherboard + "]";
    }
}

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating a Computer with only required parameters
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println(basicComputer);

        // Creating a Computer with required and some optional parameters
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();
        System.out.println(gamingComputer);

        // Creating a fully configured Computer
        Computer workstation = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGPU("AMD Radeon RX 6800")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .build();
        System.out.println(workstation);
    }
}
