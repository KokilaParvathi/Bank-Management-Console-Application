package Booking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            BookingService service = new BookingService(new Bus(5));
            int choice;
            
            do {
                System.out.println("\n--- BUS BOOKING SYSTEM ---");
                System.out.println("1. Book Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. View Passengers");
                System.out.println("4. View Seats");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    
                    case 1 -> {
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Gender: ");
                        String gender = sc.nextLine();
                        System.out.print("Phone: ");
                        String phone = sc.nextLine();
                        
                        service.bookPassenger(
                                new Passenger(age, name, gender, phone)
                        );
                    }
                        
                    case 2 -> {
                        System.out.print("Enter Seat Number: ");
                        int seatNo = sc.nextInt();
                        service.cancelBooking(seatNo);
                    }
                        
                    case 3 -> service.showPassengers();
                        
                    case 4 -> service.showSeats();
                        
                    case 5 -> System.out.println("Thank you!");
                        
                    default -> System.out.println("Invalid choice");
                }
            } while (choice != 5);
        }
    }
}
