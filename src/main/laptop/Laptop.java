package laptop;

public class Laptop {
    private String manufacturer;
    private String CPU;
    private int ramGB;
    private int diskGB;
    private int laptopID;

    /**
     * @param manufacturer
     * @param cPU
     * @param ramGB
     * @param diskGB
     * @param laptopID
     */
    public Laptop(String manufacturer, String CPU, int ramGB, int diskGB, int laptopID) {
        this.manufacturer = manufacturer;
        this.CPU = CPU;
        this.ramGB = ramGB;
        this.diskGB = diskGB;
        this.laptopID = laptopID;
    }


    

}