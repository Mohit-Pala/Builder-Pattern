package client;

import java.util.Random;
import java.util.Scanner;

import laptop.Laptop;
import laptop.LaptopBuilder;
import laptop.LaptopDirector;

public class Demo {
    private static Laptop[] builds = new Laptop[100];
    private static int buildIndex = 0;

    private static LaptopDirector director = new LaptopDirector();
    private static LaptopBuilder builder = new LaptopBuilder();
    private static Random random = new Random();

    public static void main(String[] args) {
/*         LaptopBuilder lb = new LaptopBuilder();
        lb.manufacturer("Dell");
        lb.CPU("Ryzen 7");
        lb.ramGB(16);
        lb.diskGB(1024);
        lb.laptopID(512990);

        Laptop dellLaptop = lb.build();
        System.out.println(dellLaptop);

        Random random = new Random();

        LaptopDirector ld = new LaptopDirector();
        LaptopBuilder build = new LaptopBuilder();
        ld.buildAsusGamingLaptop(build, random.nextInt(100000, 999999));
        Laptop asusGaming = build.build();
        System.out.println(asusGaming); */


        Scanner scan = new Scanner(System.in);
       

       boolean exit = false;

       
        
        while (!exit){
            System.out.println("0: About");
            System.out.println("1: BuildLaptop");
            System.out.println("2: ViewBuilds");
            System.out.println("3: Exit");
            int x = scan.nextInt();
            if(x == 0){
                printAbout();
            }
            else if(x == 1){
                buildLaptop();
            }
            else if(x == 2){
                viewBuilds();
            }
            else if(x == 3){
                exit = true;
            }
            else{
                System.out.println("Try Again");
            }
        }
    }

    private static void viewBuilds() {
        if(builds[0] == null){
            System.out.println("You have no builds");
            return;
        }

        for (Laptop laptop : builds) {
            if(laptop != null){
                System.out.println(laptop);
            }
        }
    }

    private static void buildLaptop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1: Dell AMD Laptop");
        System.out.println("2: Dell Intel Laptop");
        System.out.println("3: HP AMD Laptop");
        System.out.println("4: HP Intel Laptop");
        System.out.println("5: ASUS Gaming Laptop");
        System.out.println("6: Custom build");

        int x = scan.nextInt();

        if(x == 1){
            director.buildDellRyzenLaptop(builder, random.nextInt(100000, 999999));
            Laptop lap = builder.build();
            builds[buildIndex] = lap;
            buildIndex ++;
            return;
        }
        if(x == 2){
            director.buildDellIntelLaptop(builder, random.nextInt(100000, 999999));
            Laptop lap = builder.build();
            builds[buildIndex] = lap;
            buildIndex++;
            return;
        }

        if(x == 3){
            director.buildHPRyzenLaptop(builder, random.nextInt(100000, 999999));
            Laptop lap = builder.build();
            builds[buildIndex] = lap;
            buildIndex++;
            return;
        }

        if(x == 4){
            director.buildHPIntelLaptop(builder, random.nextInt(100000, 999999));
            Laptop lap = builder.build();
            builds[buildIndex] = lap;
            buildIndex++;
            return;
        }

        if(x == 5){
            director.buildAsusGamingLaptop(builder, random.nextInt(100000, 999999));
            Laptop lap = builder.build();
            builds[buildIndex] = lap;
            buildIndex++;
            return;
        }

        if(x == 6){
            Scanner tmp = new Scanner(System.in);
            LaptopBuilder lb = new LaptopBuilder();
            System.out.println("Enter manufacurer name");
            lb.manufacturer(tmp.nextLine());
            System.out.println("Enter cpu model");
            lb.CPU(tmp.nextLine());
            System.out.println("Enter ram amount in integers");
            lb.ramGB(tmp.nextInt());
            System.out.println("Enter disk amount in integers");
            lb.diskGB(tmp.nextInt());
            lb.laptopID(random.nextInt(100000, 999999));
            Laptop customLaptop = lb.build();
            builds[buildIndex] = customLaptop;
            buildIndex++;
            return;
        }
    }

    private static void printAbout() {
        System.out.println("Simple program to demonstrate the use of BUILDER PATTERN");
        System.out.println("Builder makes different types of objects using a similar consturction process");
        System.out.println("The Director class makes premade comfigurations for builder");
        System.out.println("laptop builder class allows the program to build complex laptop classes with a simple constructor");
    }
}
