package com.devmountain;

import com.devmountain.objects.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Files
        //txt files
        File cases = new File("./data/txt/Case.txt");
        File cpus = new File("./data/txt/CPU.txt");
        File cpuCoolers = new File("./data/txt/CPU_COOLER.txt");
        File gpus = new File("./data/txt/GPU.txt");

        //csv files
        File motherboards = new File("./data/csv/motherboard.csv");
        File psus = new File("./data/csv/psu.csv");
        File ram = new File("./data/csv/ram.csv");
        File storage = new File("./data/csv/storage.csv");

//        openFileAndPrint(cases);

//        seedCases(cases);
        System.out.println(seedCases(cases));
//        System.out.println(seedCpus(cpus));
//        System.out.println(seedCpuCoolers(cpuCoolers));
//        System.out.println(seedGpus(gpus));
//        System.out.println(seedMotherboards(motherboards));
//        System.out.println(seedPsus(psus));
//        System.out.println(seedRam(ram));
//        System.out.println(seedStorage(storage));
    }

    //Simple open and print to console
    public static void openFileAndPrint(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            System.out.println(Arrays.toString(values));
        }
    }

    //Data Seeding Methods

    //All Args Constructor method
    public static List<Case> seedCases(File file) throws IOException {
        List<Case> caseList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            String brand = values[0];
            String name = values[1];
            String type = values[2];
            String color = values[3];
            String price = values[4];

            Case pcCase = new Case(brand, name, type, color, price);
            System.out.println(pcCase);
            caseList.add(pcCase);
        }
        return caseList;
    }

    public static List<Cpu> seedCpus(File file) throws IOException {
        List<Cpu> cpuList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            String brand = values[0];
            String level = values[1];
            String name = values[2];
            String cores = values[3];
            String threads = values[4];
            String coreClock = values[5];
            String boostClock = values[6];
            String watts = values[7];
            String intGraphics = values[8];
            String socket = values[9];
            String price = values[10];

            Cpu cpu = new Cpu(brand, level, name, cores, threads, coreClock,
                    boostClock, watts, intGraphics, socket, price);
            cpuList.add(cpu);
        }
        return cpuList;
    }

    public static List<CpuCooler> seedCpuCoolers(File file) throws IOException {
        List<CpuCooler> coolerList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            String brand = values[0];
            String name = values[1];
            String type = values[2];
            String radiator = values[3];
            String price = values[4];

            CpuCooler cooler = new CpuCooler(brand, name, type, radiator, price);
            coolerList.add(cooler);
        }
        return coolerList;
    }

    //No Args Constructor + Setter Usage method
    public static List<Gpu> seedGpus(File file) throws IOException {
        List<Gpu> gpuList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            Gpu gpu = new Gpu();

            gpu.setBrand(values[0]);
            gpu.setName(values[1]);
            gpu.setChipset(values[2]);
            gpu.setMemory(values[3]);
            gpu.setCoreClock(values[4]);
            gpu.setBoostClock(values[5]);
            gpu.setPrice(values[6]);

            gpuList.add(gpu);
        }
        return gpuList;
    }

    public static List<Motherboard> seedMotherboards(File file) throws IOException {
        List<Motherboard> motherboardList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split(",");
            Motherboard motherboard = new Motherboard();

            motherboard.setBrand(values[0]);
            motherboard.setName(values[1]);
            motherboard.setSocket(values[2]);
            motherboard.setRamSlots(Integer.parseInt(values[3]));
            motherboard.setPrice(values[4]);

            motherboardList.add(motherboard);
        }
        return motherboardList;
    }

    public static List<Psu> seedPsus(File file) throws IOException {
        List<Psu> psuList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split(",");
            Psu psu = new Psu();

            psu.setBrand(values[0]);
            psu.setName(values[1]);
            psu.setType(values[2]);
            psu.setEfficiency(values[3]);
            psu.setWattage(values[4]);
            psu.setModular(values[5]);
            psu.setPrice(values[6]);

            psuList.add(psu);
        }
        return psuList;
    }

    //Custom Constructor methods
    public static List<Ram> seedRam(File file) throws IOException {
        List<Ram> ramList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split(",");

            Ram ram = new Ram(values);
            ramList.add(ram);
        }
        return ramList;
    }

    public static List<Storage> seedStorage(File file) throws IOException {
        List<Storage> storageList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while((line = bufferedReader.readLine()) != null){
            List<String> values = List.of(line.split(","));

            Storage storage = new Storage(values);
            storageList.add(storage);
        }
        return storageList;
    }
}
