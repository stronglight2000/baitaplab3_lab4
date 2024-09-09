package lab4.service;

import lab4.data.Data;
import lab4.entities.Manager;
import lab4.entities.MarketingStaff;

import java.util.Scanner;

public class MarketingStaffService {
    public MarketingStaff inputMarketingStaff(Scanner scanner){
        System.out.println("Mời bạn nhập vào tên:");
        String fullname = scanner.nextLine();
        System.out.println("Mời bạn nhập vào lương cơ bản");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập doanh thu bán hàng:");
        double sales = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập vào hoa hồng");
        double commissionRate = Double.parseDouble(scanner.nextLine());
        double salary = (baseSalary + (sales * commissionRate)/100);
        MarketingStaff marketingStaff = new MarketingStaff(fullname,sales,commissionRate,salary);
        calculateTax(marketingStaff);
        Data.baseStaffs.add(marketingStaff);
        return marketingStaff;

    }
    public void calculateTax(MarketingStaff marketingStaff){
        if(marketingStaff.getSalary() >= 11000000){
            marketingStaff.setSalary(marketingStaff.getSalary()*0.9) ;
        }
    }
}
