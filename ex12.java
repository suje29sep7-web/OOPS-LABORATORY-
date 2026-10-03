
import java.util.Scanner;
class RailwayReservation {
static Scanner sc = new Scanner(System.in);
static boolean booked = false;
static String name;
static int age, seat;
static void booking() {
if (booked) {
System.out.println("Ticket already booked!");
return;
}
System.out.print("Enter Passenger Name: ");
name = sc.nextLine();
System.out.print("Enter Age: ");
age = sc.nextInt();
System.out.print("Enter Seat Number: ");
seat = sc.nextInt();
booked = true;
System.out.println("\nTicket Booked Successfully!");
System.out.println("Passenger: " + name);
System.out.println("Age: " + age);
System.out.println("Seat No: " + seat);
}
static void cancellation() {
if (!booked) {
System.out.println("No ticket to cancel.");
} else {
booked = false;
System.out.println("Ticket Cancelled Successfully!");
}
}
static void timing() {
System.out.println("\nTrain Timing");
System.out.println("Chennai - 06:00 AM");
System.out.println("Villupuram - 08:30 AM");
System.out.println("Cuddalore - 09:15 AM");
}
static void details() {
if (!booked) {
System.out.println("No booking available.");
} else {
System.out.println("\nPassenger Details");
System.out.println("Name : " + name);
System.out.println("Age : " + age);
System.out.println("Seat : " + seat);
}
}
public static void main(String[] args) {
int choice;
do {
System.out.println("\n--- RAILWAY RESERVATION ---");
System.out.println("1. Booking");
System.out.println("2. Cancellation");
System.out.println("3. Train Timing");
System.out.println("4. Detailed Information");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();
switch (choice) {
case 1: booking(); break;
case 2: cancellation(); break;
case 3: timing(); break;
case 4: details(); break;
case 5: System.out.println("Thank You!"); break;
default: System.out.println("Invalid Choice!");
}
} while (choice != 5);
}
}
OUTPUT
--- RAILWAY RESERVATION ---
1. Booking
2. Cancellation
3. Train Timing
4. Detailed Information
5. Exit
Enter your choice: 1
Enter Passenger Name: Sujeth
Enter Age: 19
Enter Seat Number: 25
Ticket Booked Successfully!
Passenger: Sujeth
Age: 19
Seat No: 25
Enter your choice: 4
Passenger Details
Name : Sujeth
Age : 19
Seat : 25
Enter your choice: 2
Ticket Cancelled Successfully!
Enter your choice: 5
Thank You!