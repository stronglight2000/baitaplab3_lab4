package lab3.view;

import lab3.data.Data;
import lab3.entities.Workers;
import lab3.service.WorkerService;

import java.util.Scanner;

public class Menu {
    WorkerService workerService = new WorkerService();
    public void displayMenu(){
        System.out.println("1. Add worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information Salary");
        System.out.println("5. Exit");
    }
    public void selectMenu(Scanner scanner){
        do{
            displayMenu();
            System.out.println("Mơi bạn lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Workers workers = workerService.enterWorkers(scanner);
                    Data.workers.add(workers);
                    break;
                case 2:
                    workerService.upSalary(scanner);
                    break;
                case 3:
                    workerService.downSalary(scanner);
                    break;
                case 4:
                    workerService.displayInfor();
                    break;
                case 5:
                    System.exit(0);
            }
        }while(true);

    }
}
