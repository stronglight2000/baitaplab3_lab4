package lab4.service;

import lab4.data.Data;
import lab4.entities.BaseStaff;
import lab4.entities.Manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BaseStaffService {
    public BaseStaff inputBaseStaff(Scanner scanner){
        System.out.println("Mời bạn nhập vào tên:");
        String fullName = scanner.nextLine();
        System.out.println("Mời bạn nhập vào lương:");
        double salary = Double.parseDouble(scanner.nextLine());
        BaseStaff baseStaff = new BaseStaff(fullName,salary);
        calculateTax(baseStaff);
        Data.baseStaffs.add(baseStaff);
        return baseStaff;

    }
    public void calculateTax(BaseStaff baseStaff){
        if(baseStaff.getSalary() >= 11000000){
            baseStaff.setSalary(baseStaff.getSalary()*0.9) ;
        }
    }
    public void printInfo(){
        System.out.println("==========================Display Information Staff============================");
        System.out.printf("%-1s \t %-20s %-30s \n","ID","Name","Salary");
        System.out.println("===============================================================================");
        for (BaseStaff baseStaff:Data.baseStaffs) {
            System.out.printf("%-1s \t %-20s %-30s \n",baseStaff.getId(),baseStaff.getFullname(),baseStaff.getSalary());
        }
    }
    public BaseStaff findStaffbyID(Scanner scanner) {
        System.out.println("Nhập ID nhân viên cần xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (BaseStaff baseStaff : Data.baseStaffs) {
            if (baseStaff.getId() == id) {
                return baseStaff;
            }
        }
        return null;
    }
    public void deleteStaffbyId(Scanner scanner){
            BaseStaff existedStaff = findStaffbyID(scanner);
            if(existedStaff != null){
                Data.baseStaffs.remove(existedStaff);
            }
            else{
                System.out.println("Không tìm thấy nhân viên nào.");
            }

        }

    public void updateStaffNamebyId(Scanner scanner){
        BaseStaff existedStaff = findStaffbyID(scanner);
        if(existedStaff != null){
            System.out.println("Mời bạn nhập vào tên nhân viên muốn sửa:");
            String newName = scanner.nextLine();
            existedStaff.setFullname(newName);
        }
        }
    public void updateStaffSalarybyId(Scanner scanner){
        BaseStaff existedStaff = findStaffbyID(scanner);
        if(existedStaff != null){
            System.out.println("Mời bạn nhập vào mức lương muốn sửa");
            double newSalary = Double.parseDouble(scanner.nextLine());
            existedStaff.setSalary(newSalary);
        }
    }
    public void findStaffbySalary(Scanner scanner) {
        System.out.println("Mời bạn nhập mức lương của nhân viên muốn tìm");
        double salary = Double.parseDouble(scanner.nextLine());
        boolean found = false;
        for (BaseStaff baseStaff : Data.baseStaffs) {
            if (baseStaff.getSalary() == salary) {
                System.out.println(baseStaff);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với mức lương bạn nhập.");

        }

    }
    public void sortStaffbySalaryandName(){
       Collections.sort(Data.baseStaffs, Comparator.comparing(BaseStaff::getFullname).thenComparing(BaseStaff::getSalary));

    }








    }

