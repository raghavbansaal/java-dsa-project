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
        String ticket_id;
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
            ticket_id=generateTicketID();
            try {
                FileWriter writer = new FileWriter("bookings.txt", true);
                writer.write("User: "+mail + " ,Booked Flight: " + inpflinum +",Passenger: "+ FlightSystem.travelers +",ID:"+ticket_id+"\n");
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
            veiwbooking(mail);
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
            boolean reloop = true;
            while(reloop){
            int admininp;
            String flightnum;
            String flightdest;
            String flightstart;
            String reachtime;
            String departime;
            String price;
            String date;
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
                sc.nextLine();
                System.out.println("Displaying Whole List of Registered Users of DRAG!");
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
                System.out.println("|Registered Users:");
                System.out.println("----------------------------------------------------------------------------");
                try{
                    File obk = new File ("users.txt");
                    Scanner rea = new Scanner(obk);
                    while(rea.hasNextLine()){
                        String data = rea.nextLine();
                        System.out.println(data);
                    }
                    if(obk.length()==0){
                        System.out.println("No User Found!");
                    }
                    rea.close();
                }catch(Exception e){
                    System.out.println("An Error Occured!");
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
                case 2:
                sc.nextLine();
                System.out.println("Finding All Bookings,Please Wait!");
                veiwbooking(mail);
                break;
                case 3:
                sc.nextLine();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                        ENTER FLIGHT NUMBER:                                              |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                flightnum=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                         ENTER START ROUTE:                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                flightstart=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                          ENTER END ROUTE:                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                flightdest=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                        ENTER DEPARTURE TIME:                                             |");
                System.out.println("|                                              (HH:MM)                                                     |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                departime=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                       ENTER DESTINATION TIME:                                            |");
                System.out.println("|                                             (HH:MM)                                                      |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                reachtime=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                       ENTER PRICE PER SEAT:                                              |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                price=sc.next();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                       ENTER DATE(YYYY-MM-DD):                                            |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                date=sc.next();
                try {
                    FileWriter writer = new FileWriter("flights.txt", true);
                    writer.write(flightnum+","+flightstart+","+flightdest+","+date+","+price+","+departime+","+reachtime+ "\n");
                    writer.close();
                    System.out.println("Flight Added Succesfully!");
                } catch (Exception e) {
                    System.out.println("Error try Again!");
                }
                break;
                case 4:
                sc.nextLine();
                FlightSystem.removeflight(sc);
                break;
                case 5:
                sc.nextLine();
                System.out.println("Work in Progress");
                break;
                case 6:
                sc.nextLine();
                try{
                    Thread.sleep(1500);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
                System.out.println("|User       |Feedback");
                System.out.println("----------------------------------------------------------------------------");
                try{
                    File obj = new File ("feedback.txt");
                    Scanner reader = new Scanner(obj);
                    while(reader.hasNextLine()){
                        String data = reader.nextLine();
                        System.out.println(data);
                    }
                    if(obj.length()==0){
                        System.out.println("No Feedback Found!");
                        try{
                            Thread.sleep(1000);
                        }
                        catch(Exception e){
                            System.out.println("Something Went Wrong!");
                        }
                    }
                    reader.close();
                }catch(Exception e){
                    System.out.println("An Error Occured!");
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
                case 7:
                sc.nextLine();
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong!");
                }
                System.out.println("Logged Out,Thank You For Maintaining DRAG");
                reloop=false;
                break;
            }
        }
    }
    }
    public static void veiwbooking(String email){
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
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("| %-30s | %-15s | %-10s | %-10s |\n", 
                             "Flight Number", "Passengers","Ticket ID", "Status");
            System.out.println("------------------------------------------------------------------------------");
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("User: " + email)) {
                    found = true;
                    try {
                        String flightNum = line.contains("Booked Flight: ") ? 
                            line.split("Booked Flight: ")[1].split(",")[0].trim() : "N/A";
                        
                        String passengers = line.contains("Passenger: ") ? 
                            line.split("Passenger: ")[1].split(",ID:")[0].trim() : "N/A";
                        
                        String tiid = line.contains("ID:") ? 
                            line.split("ID:")[1].trim() : "N/A";
                        
                        System.out.printf("| %-30s | %-15s | %-10s | %-10s |\n",
                            flightNum,
                            passengers,
                            tiid,
                            "Confirmed");
                    } catch (Exception e) {
                        System.out.println("Error processing booking data for line: " + line);
                    }
                }
            }
            if(!found){
                System.out.println("No Bookings found for this Account");
            }
        } catch (Exception e) {
            System.out.println("Error accessing bookings: " + e.getMessage());
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong!");
        }
    }
    public static String generateTicketID() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder ticketID = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 2; i++) {
            int index = random.nextInt(26);
            ticketID.append(chars.charAt(index));
        }
        for (int i = 0; i < 6; i++) {
            int index = 26 + random.nextInt(10);
            ticketID.append(chars.charAt(index));
        }
        return ticketID.toString();
    }
    public static class FlightSystem {
        public static int travelers;
        public static String date;
        public static String destination;
        public static String departure;
        public static boolean flightfound;
        public static String removeflightdate;
        public static String removestart;
        public static String removend;
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
        static void removeflight(Scanner sc) {
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                        (REMOVING A FLIGHT)                                               |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                         Enter Flight Date:                                               |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            removeflightdate = sc.next();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                        (REMOVING A FLIGHT)                                               |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                       Enter Start of Flight:                                             |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            removestart = sc.next();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                        (REMOVING A FLIGHT)                                               |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                    Enter Destination of Flight:                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            removend = sc.next();
            sc.nextLine();
            
            System.out.println("Searching for the flight you want to remove,Please Wait! ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Something Went Wrong!");
            }
            
            List<Flight> flights = loadFlights();
            List<Flight> matchingFlights = new ArrayList<>();
            
            for (Flight flight : flights) {
                if (flight.departure.equalsIgnoreCase(removestart) &&
                    flight.destination.equalsIgnoreCase(removend) &&
                    flight.date.equals(removeflightdate)) {
                    matchingFlights.add(flight);
                }
            }
            
            if (!matchingFlights.isEmpty()) {
                System.out.println("\nFound Flights:");
                System.out.println("----------------------------------------------------------");
                System.out.printf("| %-10s | %-8s | %-8s | %-10s |\n", 
                                "Flight No", "Depart", "Arrive", "Price");
                System.out.println("----------------------------------------------------------");
                
                for (Flight flight : matchingFlights) {
                    System.out.printf("| %-10s | %-8s | %-8s | INR%-8.2f |\n",
                                    flight.flightNumber,
                                    flight.departureTime,
                                    flight.arrivalTime,
                                    flight.price);
                }
                System.out.println("----------------------------------------------------------");
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Something Went Wrong!");
                }
                
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                        (REMOVING A FLIGHT)                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                    Enter Flight number to remove:                                        |");
                System.out.println("|                                      (Press n to cancel process)                                         |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                String reflightnum = sc.next();
                if(reflightnum.equals("n")){
                    System.out.println("Redirecting back!");
                    try{
                        Thread.sleep(1500);
                    }
                    catch(Exception e){
                        System.out.println("Something Went Wrong!");
                    }
                }
                else{
                try {
                    File file = new File("flights.txt");
                    List<String> fileContent = new ArrayList<>();
                    Scanner fileScanner = new Scanner(file);
                    
                    boolean found = false;
                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        String[] parts = line.split(",");
                        
                        if (parts[0].equalsIgnoreCase(reflightnum) && 
                            parts[1].equalsIgnoreCase(removestart) && 
                            parts[2].equalsIgnoreCase(removend) && 
                            parts[3].equals(removeflightdate)) {
                            found = true;
                            continue;
                        }
                        fileContent.add(line);
                    }
                    fileScanner.close();
                    
                    if (found) {
                        FileWriter writer = new FileWriter("flights.txt");
                        for (String line : fileContent) {
                            writer.write(line + "\n");
                        }
                        writer.close();
                        System.out.println("Flight Removed Successfully!");
                    } else {
                        System.out.println("No matching flight found with the given details.");
                    }
                } catch (Exception e) {
                    System.out.println("Error removing flight: " + e.getMessage());
                }
            } 
        }
            else {
                System.out.println("No flights found for the selected route and date.");
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
            System.out.println("|                                               (SEARCHING)                                                |");
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