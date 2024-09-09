package lab3;

import lab3.service.WorkerService;
import lab3.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService workerService = new WorkerService();
        Menu menu = new Menu();
        menu.selectMenu(scanner);
    }
}
