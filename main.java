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
        String adminmail;
        String adminpswd;
        String inpflinum;
        int logger=1;
        boolean che=true;
        while(che){
        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
        System.out.println("|                                                (START)                                                   |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                 **Here our options work through numbers                                  |");
        System.out.println("|                                  suppose for choosing option 1 enter 1**                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                            PRESS 1 : SIGNUP                                              |");
        System.out.println("|                                            PRESS 2 : SIGNIN                                              |");
        System.out.println("|                                            PRESS 3 : ADMIN                                               |");
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
                    Thread.sleep(500);
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       <==    |");
                    System.out.println("|--------------------------|");
                    Thread.sleep(500);
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       ==>    |");
                    System.out.println("|--------------------------|");
                    Thread.sleep(500);
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
            sc.nextLine();
            logger=2;
            Boolean allow=true;
            while(allow){
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                           (ADMIN LOGIN)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                          Enter Email ID:                                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            inpmail=sc.nextLine();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                           (ADMIN LOGIN)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                          Enter Password:                                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            inpswd = sc.nextLine();
            try {
                Scanner fileScanner = new Scanner(new File("admin.txt"));
                boolean foun = false;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts[0].equals(inpmail) && parts[1].equals(inpswd)) {
                            foun = true;
                            break;
                    }
                }
                if (foun) {
                    System.out.println("|----Login successfull!----|");
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       ==>    |");
                    System.out.println("|--------------------------|");
                    Thread.sleep(500);
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       <==    |");
                    System.out.println("|--------------------------|");
                    Thread.sleep(500);
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       ==>    |");
                    System.out.println("|--------------------------|");
                    Thread.sleep(500);
                    System.out.println("|--------------------------|");
                    System.out.println("| Redirecting       <==    |");
                    System.out.println("|--------------------------|");
                    System.out.println();
                    System.out.println();
                    allow=false;
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
            default:
            System.out.println("Invalid Input Restart");
            break;
        }
    }
        if(logger==1){
        int homeinp;
        boolean barr = true;
        while (barr){
        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
        System.out.println("|                                                  (HOME)                                                  |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                 **Here are options work through numbers                                  |");
        System.out.println("|                                  suppose for choosing option 1 enter 1**                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("|                                        PRESS 1 : SEARCH FOR FLIGHT                                       |");
        System.out.println("|                                        PRESS 2 : BOOKINGS                                                |");
        System.out.println("|                                        PRESS 3 : MODIFY BOOKINGS                                         |");
        System.out.println("|                                        PRESS 4 : CONTACT US                                              |");
        System.out.println("|                                        PRESS 5 : FEEDBACK                                                |");
        System.out.println("|                                        PRESS 6 : LOG OUT                                                 |");
        System.out.println("|                                                                                                          |");
        System.out.println("| Type Below:                                                                                              |");
        System.out.println("|----------------------------------------------------------------------------------------------------------|");
        homeinp=sc.nextInt();
        switch(homeinp){
            case 1:
            sc.nextLine();
            FlightSystem.searchFlight(sc);
            if(FlightSystem.flightfound==true){
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                           (BOOKING)                                                      |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                     ENTER THE FLIGHT NUMBER                                              |");
            System.out.println("|                                        YOU WANT TO BOOK:                                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            inpflinum=sc.next();
            try {
                FileWriter writer = new FileWriter("bookings.txt", true);
                writer.write("User: "+mail + " ,Booked Flight: " + inpflinum +",Passenger: "+ FlightSystem.travelers +"\n");
                writer.close();
                System.out.println("Confirming Your Tickets,Please wait for a While!");
                try{
                    Thread.sleep(1500);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
                System.out.println("Congrats!,Your ticket booked succesfully");
            } catch (Exception e) {
                System.out.println("Error try Again!");
            }
            }
            break;
            case 2:
            sc.nextLine();
            System.out.println("Finding All Your Bookings,Please Wait!");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Something Went Wrong!");
            }
            try {
                File file = new File("bookings.txt");
                Scanner fileScanner = new Scanner(file);
                boolean found = false;
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("| %-30s | %-15s | %-10s |\n", 
                                 "Flight Number", "Passengers", "Status");
                System.out.println("----------------------------------------------------------------------");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.contains("User: " + mail)) {
                        found = true;
                        String flightNum = line.split("Booked Flight: ")[1].split(",")[0].trim();
                        String passengers = line.split("Passenger: ")[1].trim();

                        System.out.printf("| %-30s | %-15s | %-10s |\n",
                                        flightNum,
                                        passengers,
                                        "Confirmed");
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                    }
                }
                if (!found) {
                    System.out.println("| No bookings found for your account.                                |");
                    System.out.println();
                }
                fileScanner.close();
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
            } catch (Exception e) {
                System.out.println("Error accessing bookings: " + e.getMessage());
            }
            break;
            case 3:
            sc.nextLine();
            String cancel;
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                        (MODIFICATIONS)                                                   |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                 DO YOU WANT TO CANCEL YOUR TICKET?                                       |");
            System.out.println("|                                             (y/n)                                                        |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            cancel=sc.next();
            switch(cancel){
                case "y":
                sc.nextLine();
                System.out.println("Enter Flight Number to cancel:");
                String flightToCancel = sc.nextLine();
                try {
                    String fileContent = new Scanner(new File("bookings.txt")).useDelimiter("\\Z").next();
                    fileContent = fileContent.replaceAll("User: " + mail + " ,Booked Flight: " + flightToCancel + ".*(\\n|$)", "");
                    FileWriter writer = new FileWriter("bookings.txt");
                    writer.write(fileContent);
                    writer.close();
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){
                        System.out.println("Something Went Wrong!");
                    }
                    System.out.println("Booking cancelled!");
                } catch (Exception e) {
                    System.out.println("Error cancelling booking");
                }
                break;
                case "n":
                System.out.println("Redirecting Back to Home!");
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
                break;
            }
            break;
            case 4:
            sc.nextLine();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Something Went Wrong!");
            }
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                               (CONTACT US)                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                  You Can Contact Us at below References:                                 |");
                System.out.println("|                                            Ph: +917206170804                                             |");
                System.out.println("|                                          Mail: care@drag.com                                             |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
            break;
            case 5:
                sc.nextLine();
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
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
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
            break;
            case 6:
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
        else{
            int admininp;
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                (ADMIN)                                                   |");
            System.out.println("|                                      Hi Admin, Glad to See You here!                                     |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                 **Don't Share Admin login credentials                                    |");
            System.out.println("|                                  to maintain our user data privacy**                                     |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                 **Here our options work through numbers                                  |");
            System.out.println("|                                  suppose for choosing option 1 enter 1**                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                         PRESS 1 : REGISTERED USERS                                       |");
            System.out.println("|                                         PRESS 2 : BOOKED TICKETS                                         |");
            System.out.println("|                                         PRESS 3 : ADD A FLIGHT                                           |");
            System.out.println("|                                         PRESS 4 : REMOVE A FLIGHT                                        |");
            System.out.println("|                                         PRESS 5 : SEARCH FOR A TICKET                                    |");
            System.out.println("|                                         PRESS 6 : USER FEEDBACK                                          |");
            System.out.println("|                                         PRESS 7 : LOGOUT                                                 |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            admininp=sc.nextInt();
            switch(admininp){
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                break;
            }
        }
    }
    public static class FlightSystem {
        public static int travelers;
        public static String date;
        public static String destination;
        public static String departure;
        public static boolean flightfound;
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
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                             (SEARCHING)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                        Enter Departure City:                                             |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            departure = sc.nextLine();
        
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                             (SEARCHING)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                        Enter Destination City:                                           |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            destination = sc.nextLine();
        
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                             (SEARCHING)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                        Enter Date (YYYY-MM-DD):                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            date = sc.nextLine();
            
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                               (SEARCHING)                                                  |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                        Enter Number of Travellers:                                       |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            travelers = sc.nextInt();
            sc.nextLine();
            System.out.println("Searching the best available flight for you! ");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Something Went Wrong!");
            }
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
                System.out.println("----------------------------------------------------------------------------");
                System.out.printf("| %-10s | %-8s | %-8s | %-10s | %-10s | %-7s |\n", 
                                "Flight No", "Depart", "Arrive", "Price", "Seats", "Total");
                                System.out.println("----------------------------------------------------------------------------");
                
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
                flightfound=true;
                System.out.println("----------------------------------------------------------------------------");
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
            } else {
                flightfound=false;
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