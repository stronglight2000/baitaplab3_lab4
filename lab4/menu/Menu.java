package lab4.menu;

import lab4.service.BaseStaffService;
import lab4.service.ManagerService;
import lab4.service.MarketingStaffService;

import java.util.Scanner;

public class Menu {
    String choice1;
    BaseStaffService baseStaffService = new BaseStaffService();
    ManagerService managerService = new ManagerService();
    MarketingStaffService marketingStaffService = new MarketingStaffService();

    public void menuStaff() {

        System.out.println("1. Base Staff");
        System.out.println("2. Manager");
        System.out.println("3. Marketing Staff");
    }

    public void selectMenuStaff(Scanner scanner) {
        do {
            menuStaff();
            System.out.println("Please Enter");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    baseStaffService.inputBaseStaff(scanner);
                    break;
                case 2:
                    managerService.inputManager(scanner);
                    break;
                case 3:
                    marketingStaffService.inputMarketingStaff(scanner);
                    break;
            }
            System.out.println("Do you want to continue(Y/N)");
            choice1 = scanner.nextLine();
        } while (choice1.equalsIgnoreCase("Y"));
        selectMenuFeature(scanner);

    }

    public void menuFeature() {
        System.out.println("1. Insert Staff");
        System.out.println("2. Print Information");
        System.out.println("3. Remove Staff");
        System.out.println("4. Update Staff");
        System.out.println("5. Search for employees by salary");
        System.out.println("6. Sort employees by name and income");
        System.out.println("7. Export the 5 highest-earning employees in the company");
        System.out.println("8. Exit");
    }

    public void memnuUpdate() {
        System.out.println("1. Update Staff Name");
        System.out.println("2. Update Staff Salary");
    }

    public void selectMenuUpdate(Scanner scanner) {
        memnuUpdate();
        System.out.println("Please choose");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                baseStaffService.updateStaffNamebyId(scanner);
                break;
            case 2:
                baseStaffService.updateStaffSalarybyId(scanner);
                break;
        }

    }

    public void selectMenuFeature(Scanner scanner) {
        while (true) {
            menuFeature();
            System.out.println("Please Enter");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    selectMenuStaff(scanner);
                    break;
                case 2:
                    baseStaffService.printInfo();
                    break;
                case 3:
                    baseStaffService.deleteStaffbyId(scanner);
                    break;
                case 4:
                    selectMenuUpdate(scanner);
                    break;
                case 5:
                    baseStaffService.findStaffbyID(scanner);
                    break;
                case 6:
                    baseStaffService.sortStaffbySalaryandName();
                    baseStaffService.printInfo();
                    break;
                case 7:

                    break;
                case 8:
                    System.exit(0);

            }
        }

    }

}
