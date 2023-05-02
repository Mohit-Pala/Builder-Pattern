package laptop;

public class LaptopBuilder {
    private String manufacturer;
    private String CPU;
    private int ramGB;
    private int diskGB;
    private int laptopID;

    public LaptopBuilder manufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public LaptopBuilder CPU(String CPU){
        this.CPU = CPU;
        return this;
    }

    public LaptopBuilder ramGB(int ramGB){
        this.ramGB = ramGB;
        return this;
    }

    public LaptopBuilder diskGB(int diskGB){
        this.diskGB = diskGB;
        return this;
    }

    public LaptopBuilder laptopID(int laptopID){
        this.laptopID = laptopID;
        return this;
    }

    public Laptop build() {
        return new Laptop(manufacturer, CPU, ramGB, diskGB, laptopID);
    }
}
