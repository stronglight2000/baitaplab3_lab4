package lab4.service;

import lab4.data.Data;
import lab4.entities.BaseStaff;
import lab4.entities.Manager;

import java.util.Scanner;

public class ManagerService {
    public Manager inputManager(Scanner scanner){
        System.out.println("Mời bạn nhập vào tên trưởng phòng:");
        String fullName = scanner.nextLine();
        System.out.println("Mời bạn nhập vào lương cơ bản:");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập vào lương trách nhiệm:");
        double responSalary = Double.parseDouble(scanner.nextLine());
        double salary = baseSalary + responSalary;
        Manager manager = new Manager(fullName,responSalary,salary);
        calculateTax(manager);
        Data.baseStaffs.add(manager);
        return manager;
    }
    public void calculateTax(Manager manager){
        if(manager.getSalary() >= 11000000){
            manager.setSalary(manager.getSalary()*0.9) ;
        }
    }

}
