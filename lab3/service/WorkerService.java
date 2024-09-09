package lab3.service;

import lab3.data.Data;
import lab3.entities.Workers;

import java.util.Scanner;

public class WorkerService {
    public Workers enterWorkers(Scanner scanner){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Salary:");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter work location");
        String workPlace = scanner.nextLine();
        Workers workers = new Workers(name,age,salary,workPlace);
        return workers;
    }
    public void displayInfor(){
        System.out.println("====================Display Information Salary============================");
        System.out.printf("%-1s \t %-20s %-3s \t\t %-20s %-6s \t %-30s\n","ID","Name","Age","Salary","Status","Work Location");
        System.out.println("==========================================================================");
        for (Workers workers : Data.workers) {
            System.out.printf("%-1s \t %-20s %-3s \t\t %-20s %-6s \t %-30s\n", workers.getId(),workers.getName(),workers.getAge(),workers.getSalary(),workers.getStatus(),workers.getWorkPlace());
        }
    }
    public void upSalary(Scanner scanner) {
        Workers existedWorker = findWorkerByID(scanner);
        if (existedWorker != null) {
            System.out.println("Enter Salary:");
            double salary = Double.parseDouble(scanner.nextLine());
            existedWorker.setSalary(salary);
            existedWorker.setStatus("UP");
            System.out.println("Successful salary increase");
        }
    }
    public void downSalary(Scanner scanner) {
        Workers existedWorker = findWorkerByID(scanner);
        if (existedWorker != null) {
            System.out.println("Enter Salary:");
            double salary = Double.parseDouble(scanner.nextLine());
            existedWorker.setSalary(salary);
            existedWorker.setStatus("DOWN");
            System.out.println("Successful salary reduction");
        }
    }

    public Workers findWorkerByID(Scanner scanner) {
        System.out.println("Enter ID code");
        int id = Integer.parseInt(scanner.nextLine());
        for (Workers workers : Data.workers) {
            if(id == workers.getId()){
                return workers;
            }
        }
        return null;
    }




    }
