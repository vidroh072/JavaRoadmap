package Projects.BusManagement;

import java.security.Provider;
import java.util.Scanner;

// application - Interacts with user
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusService service = new BusService();

        while (true){
            System.out.println("===== 🚌 Management System =====");
            System.out.println("1. Add bus");
            System.out.println("2. Search buses");
            System.out.println("3. View all buses");
            System.out.println("4. Delete buses");
            System.out.println("0. Exit");
            System.out.println(" ----> ");
            int choice = sc.nextInt();
            sc.nextLine();
            Bus bus;
            switch (choice){

                case 1 :
                    System.out.println("Bus Number: ");
                    String busNo = sc.nextLine();
                    System.out.println("Drive Name: ");
                    String driverName = sc.nextLine();
                    System.out.println("Route: ");
                    String route = sc.nextLine();
                    System.out.println("Total Seats: ");
                    int seats = sc.nextInt();
                    sc.nextLine();
                    bus = new Bus(busNo,driverName,route,seats);
                    service.addBus(bus);
                    break;
                case 2:
                    System.out.println("Enter bus number: ");
                    String busNumber = sc.nextLine();
                    bus = service.searchBus(busNumber);
                    System.out.println(bus);
                    break;
                case 3:
                    service.viewAllBuses();
                    break;
                case 4:
                    System.out.println("Enter bus number: ");
                    String busNum = sc.nextLine();
                    service.deleteBus(busNum);
                    break;
                case 0:
                    System.out.println("Thank You ");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
