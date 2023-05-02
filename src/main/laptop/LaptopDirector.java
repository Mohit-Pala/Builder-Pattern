package laptop;

public class LaptopDirector {
    public void buildDellRyzenLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Dell");
        lb.CPU("Ryzen 7");
        lb.ramGB(16);
        lb.diskGB(1024);
        lb.laptopID(id);
    }

    public void buildDellIntelLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Dell");
        lb.CPU("Core i7");
        lb.ramGB(16);
        lb.diskGB(1024);
        lb.laptopID(id);
    }

    public void buildHPRyzenLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("HP");
        lb.CPU("Ryzen 5");
        lb.ramGB(8);
        lb.diskGB(512);
        lb.laptopID(id);
    }

    public void buildHPIntelLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("HP");
        lb.CPU("Core i5");
        lb.ramGB(8);
        lb.diskGB(512);
        lb.laptopID(id);
    }

    public void buildAsusGamingLaptop(LaptopBuilder lb, int id){
        lb.manufacturer("Asus");
        lb.CPU("Ryzen 9");
        lb.ramGB(32);
        lb.diskGB(2048);
        lb.laptopID(id);
    }
}
