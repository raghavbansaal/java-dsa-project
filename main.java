import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input;
        String mail="";
        String pswd;
        String inpmail;
        String inpswd;
        boolean che=true;
        while(che){
        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
        System.out.println("|                                                (START)                                                   |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                 **Here are options work through numbers                                  |");
        System.out.println("|                                  suppose for choosing option 1 press 1**                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                            PRESS 1 TO SIGNUP                                             |");
        System.out.println("|                                            PRESS 2 TO SIGNIN                                             |");
        System.out.println("|                                            PRESS 3 FOR ADMIN                                             |");
        System.out.println("| Type Below:                                                                                              |");
        System.out.println("|----------------------------------------------------------------------------------------------------------|");
        input=sc.nextInt();
        switch(input){
            case 1:
            sc.nextLine();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                               (SIGN UP)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                             Set Email ID:                                                |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            mail=sc.nextLine();
            if (!mail.matches("^[^@]+@[^@]+\\.com")) {
                System.out.println("Invalid mail format,Try Again!");
                break;
            }
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                               (SIGN UP)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                             Set Password:                                                |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            pswd=sc.nextLine();
            try {
                FileWriter writer = new FileWriter("users.txt", true);
                writer.write(mail + "," + pswd + "\n");
                writer.close();
                System.out.println("Sign UP Succesfull!");
                System.out.println("Press Enter to LOGIN!");
                input=2;
            } catch (Exception e) {
                System.out.println("Error try Again!");
            }

            case 2:
            sc.nextLine();
            Boolean gate=true;
            while(gate){
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                 (LOGIN)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                              Enter Email ID:                                             |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            inpmail=sc.nextLine();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                 (LOGIN)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                              Enter Password:                                             |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            inpswd = sc.nextLine();
            try {
                Scanner fileScanner = new Scanner(new File("users.txt"));
                boolean found = false;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts[0].equals(inpmail) && parts[1].equals(inpswd)) {
                            found = true;
                            mail=inpmail;
                            break;
                    }
                }
                if (found) {
                    System.out.println("|----Login successfull!----|");
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       ==>    |");
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       <==    |");
                    System.out.println("|--------------------------|");
                    System.out.println();
                    System.out.println();
                    gate=false;
                    che=false;
                } else {
                    System.out.println("Invalid credentials!");
                    System.out.println("Try Again!");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            }
            break;
            case 3:
            //admin profile
            break;
            default:
            System.out.println("Invalid Input Restart");
            break;
        }
    }
        int homeinp;
        boolean barr = true;
        while (barr){
        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
        System.out.println("|                                                  (HOME)                                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                 **Here are options work through numbers                                  |");
        System.out.println("|                                  suppose for choosing option 1 press 1**                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                        PRESS 1 : SEARCH FOR FLIGHT                                       |");
        System.out.println("|                                        PRESS 2 : BOOKINGS                                                |");
        System.out.println("|                                        PRESS 3 : CONTACT US                                              |");
        System.out.println("|                                        PRESS 4 : FEEDBACK                                                |");
        System.out.println("|                                        PRESS 5 : LOG OUT                                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("| Type Below:                                                                                              |");
        System.out.println("|----------------------------------------------------------------------------------------------------------|");
        homeinp=sc.nextInt();
        switch(homeinp){
            case 1:
            sc.nextLine();
            FlightSystem.searchFlight(sc);
            break;
            case 2:

            break;
            case 3:
            sc.nextLine();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                               (CONTACT US)                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                  You Can Contact Us at below References:                                 |");
                System.out.println("|                                            Ph: +917206170804                                             |");
                System.out.println("|                                          Mail: care@drag.com                                             |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
            break;
            case 4:
                sc.nextLine();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                               (FEEDBACK)                                                 |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                           Enter your FEEDBACK                                            |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                String feedback=sc.nextLine();
                try {
                    FileWriter writer = new FileWriter("feedback.txt", true);
                    writer.write(mail +" : "+ feedback+ "\n");
                    writer.close();
                    System.out.println("Thank you for your feedback!");
                } catch (Exception e) {
                    System.out.println("Error Saving Feedback,Try Again!");
                }
            break;
            case 5:
                System.out.println("You Logged Out Successfully!");
                System.out.println("Thank you for visiting DRAG");
                barr=false;
            break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    }
    public static class FlightSystem {
    
        static class Flight {
            String flightNumber, departure, destination, date, departureTime, arrivalTime;
            double price;
    
            Flight(String flightNumber, String departure, String destination, 
                  String date, double price, String departureTime, String arrivalTime) {
                this.flightNumber = flightNumber;
                this.departure = departure;
                this.destination = destination;
                this.date = date;
                this.price = price;
                this.departureTime = departureTime;
                this.arrivalTime = arrivalTime;
            }
        }
    
        public static void searchFlight(Scanner sc) {
            System.out.println("Enter Departure City:");
            String departure = sc.nextLine();
        
            System.out.println("Enter Destination City:");
            String destination = sc.nextLine();
        
            System.out.println("Enter Date (YYYY-MM-DD):");
            String date = sc.nextLine();
            
            System.out.println("Enter Number of Travelers:");
            int travelers = sc.nextInt();
            sc.nextLine();
            
            List<Flight> flights = loadFlights();
            List<Flight> matchingFlights = new ArrayList<>();
        
            for (Flight flight : flights) {
                if (flight.departure.equalsIgnoreCase(departure) &&
                    flight.destination.equalsIgnoreCase(destination) &&
                    flight.date.equals(date)) {
                    matchingFlights.add(flight);
                }
            }
            
            if (!matchingFlights.isEmpty()) {
                System.out.println("\nAvailable Flights:");
                System.out.println("-----------------------------------------------------------------");
                System.out.printf("| %-10s | %-8s | %-8s | %-10s | %-10s | %-7s |\n", 
                                "Flight No", "Depart", "Arrive", "Price", "Seats", "Total");
                System.out.println("-----------------------------------------------------------------");
                
                for (Flight flight : matchingFlights) {
                    double totalPrice = flight.price * travelers;
                    System.out.printf("| %-10s | %-8s | %-8s | INR%-8.2f | %-10d | INR%-6.2f |\n",
                                    flight.flightNumber,
                                    flight.departureTime,
                                    flight.arrivalTime,
                                    flight.price,
                                    travelers,
                                    totalPrice);
                }
                System.out.println("-----------------------------------------------------------------");
            } else {
                System.out.println("No flights available for the selected route and date.");
            }
        }
        
        public static List<Flight> loadFlights() {
            List<Flight> flights = new ArrayList<>();
            try {
                File file = new File("flights.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String[] data = sc.nextLine().split(",");
                    flights.add(new Flight(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), data[5], data[6]));
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("Error loading flights: " + e.getMessage());
            }
            return flights;
        }
    }
}