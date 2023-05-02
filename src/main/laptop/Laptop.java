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


    /**
     * @return manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * @return cpu model
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * @return ram in GB
     */
    public int getRamGB() {
        return this.ramGB;
    }

    /**
     * @return storage in GB
     */
    public int getDiskGB() {
        return this.diskGB;
    }

    /**
     * @return laptops id
     */
    public int getLaptopID() {
        return this.laptopID;
    }


    @Override
    public String toString() {
        return "{" +
            " manufacturer='" + getManufacturer() + "'" +
            ", CPU='" + getCPU() + "'" +
            ", ramGB='" + getRamGB() + "GB'" +
            ", diskGB='" + getDiskGB() + "GB'" +
            ", laptopID='" + getLaptopID() + "'" +
            "}";
    }
    
}
