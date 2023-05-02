package laptop;

public class LaptopBuilder {
    private String manufacturer;
    private String CPU;
    private int ramGB;
    private int diskGB;
    private int laptopID;

    /**
     * @param manufacturer
     * @return current object
     */
    public LaptopBuilder manufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * @param CPU
     * @return current object
     */
    public LaptopBuilder CPU(String CPU){
        this.CPU = CPU;
        return this;
    }

    /**
     * @param ramGB
     * @return current object
     */
    public LaptopBuilder ramGB(int ramGB){
        this.ramGB = ramGB;
        return this;
    }

    /**
     * @param diskGB
     * @return current object
     */
    public LaptopBuilder diskGB(int diskGB){
        this.diskGB = diskGB;
        return this;
    }

    /**
     * @param laptopID
     * @return current object
     */
    public LaptopBuilder laptopID(int laptopID){
        this.laptopID = laptopID;
        return this;
    }

    /**
     * @return new laptop with builder specifications
     */
    public Laptop build() {
        return new Laptop(manufacturer, CPU, ramGB, diskGB, laptopID);
    }
}
