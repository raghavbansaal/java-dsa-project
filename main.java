import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int seats = 100;
        int reseats;
        int input;
        String mail = "";
        String pswd;
        String inpmail;
        String inpswd;
        String adminmail;
        String adminpswd;
        String inpflinum;
        String ticket_id;
        int logger = 1;
        boolean che = true;
        while (che) {
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                (START)                                                   |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                 **Here our options work through numbers                                  |");
            System.out.println("|                                  suppose for choosing option 1 enter 1**                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                            PRESS 1 : SIGNUP                                              |");
            System.out.println("|                                            PRESS 2 : SIGNIN                                              |");
            System.out.println("|                                            PRESS 3 : ADMIN                                               |");
            System.out.println("|                                            PRESS 4 : RESET                                               |");
            System.out.println("|                                            PRESS 5 : DELETE                                              |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            input = sc.nextInt();
            switch (input) {
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
                    mail = sc.nextLine();
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
                    pswd = sc.nextLine();
                    try {
                        FileWriter writer = new FileWriter("users.txt", true);
                        writer.write(mail + "," + pswd + "\n");
                        writer.close();
                        System.out.println("Sign UP Succesfull!");
                        System.out.println("Press Enter to LOGIN!");
                        input = 2;
                    } catch (Exception e) {
                        System.out.println("Error try Again!");
                    }
                    break;
                case 2:
                    sc.nextLine();
                    Boolean gate = true;
                    while (gate) {
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                                 (LOGIN)                                                  |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                              Enter Email ID:                                             |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        inpmail = sc.nextLine();
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
                        // Linear Search used to check user credentials
                        try {
                            Scanner fileScanner = new Scanner(new File("users.txt"));
                            boolean found = false;
                            while (fileScanner.hasNextLine()) {
                                String line = fileScanner.nextLine();
                                String[] parts = line.split(",");
                                if (parts[0].equals(inpmail) && parts[1].equals(inpswd)) {
                                    found = true;
                                    mail = inpmail;
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
                                gate = false;
                                che = false;
                            } else {
                                System.out.println("Invalid credentials!");
                                System.out.println("Try Again!");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    logger = 2;
                    Boolean allow = true;
                    while (allow) {
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                           (ADMIN LOGIN)                                                  |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                          Enter Email ID:                                                 |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        inpmail = sc.nextLine();
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
                        // Linear Search used to verify admin credentials
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
                                allow = false;
                                che = false;
                            } else {
                                System.out.println("Invalid credentials!");
                                System.out.println("Try Again!");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    String resetmail;
                    String resetpswd;
                    System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                    System.out.println("|                                               (RESET)                                                    |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                            Enter Email ID:                                               |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("| Type Below:                                                                                              |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------|");
                    resetmail = sc.nextLine();
                    System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                    System.out.println("|                                               (RESET)                                                    |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                           Enter New Password:                                            |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("|                                                                                                          |");
                    System.out.println("| Type Below:                                                                                              |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------|");
                    resetpswd = sc.nextLine();
                    // Linear Search used to verify admin email
                    if (loadadmin(resetmail)) {
                        System.out.println("Looks Like You Are Resetting Admin Credentials!");
                        System.out.println("Credentials Verified, Changing Password!");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        changeadminpswd(resetpswd);
                        System.out.println("Password Changed Successfully!");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                    }
                    else if (loaduser(resetmail)) {
                        System.out.println("Looks Like You Are Resetting User Credentials!");
                        System.out.println("Credentials Verified, Changing Password!");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        changeuserpswd(resetmail, resetpswd);
                        System.out.println("User Password Changed Successfully!");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                    } else {
                        System.out.println("Invalid Email! Not found in admin or user records.");
                    }
                    break;
                case 5:
                sc.nextLine();
                String deletemail;
                String deletepswd;
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                          (DELETE ACCOUNT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                            Enter Email ID:                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                deletemail = sc.nextLine();
                System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                System.out.println("|                                          (DELETE ACCOUNT)                                                |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                            Enter Password:                                               |");
                System.out.println("|                                                                                                          |");
                System.out.println("|                                                                                                          |");
                System.out.println("| Type Below:                                                                                              |");
                System.out.println("|----------------------------------------------------------------------------------------------------------|");
                deletepswd = sc.nextLine();
                // Linear Search used to verify email
                if (loadadmin(deletemail)) {
                    System.out.println("Admin accounts cannot be deleted!");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Something Went Wrong!");
                    }
                } else {
                    System.out.println("Verifying User Credentials, Please Wait!");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Something Went Wrong!");
                    }
                    if (deleteuser(deletemail, deletepswd)) {
                        System.out.println("User Account Deleted Successfully!");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                    } else {
                        System.out.println("Invalid Email or Password! Account not deleted.");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                    }
                }
                break;
                default:
                    System.out.println("Invalid Input Restart");
                    break;
            }
        }
        if (logger == 1) {
            int homeinp;
            boolean barr = true;
            while (barr) {
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
                homeinp = sc.nextInt();
                switch (homeinp) {
                    case 1:
                        sc.nextLine();
                        FlightSystem.searchFlight(sc);
                        if (FlightSystem.flightfound == true) {
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
                            inpflinum = sc.next();
                            ticket_id = generateTicketID();
                            // Linear Search used to check seat availability
                            boolean vacancy = isvacant(inpflinum);
                            if (vacancy) {
                                try {
                                    FileWriter writer = new FileWriter("bookings.txt", true);
                                    writer.write("User: " + mail + " ,Booked Flight: " + inpflinum + ",Passenger: " + FlightSystem.travelers + ",ID:" + ticket_id + "\n");
                                    writer.close();
                                    System.out.println("Confirming Your Tickets,Please wait for a While!");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {
                                        System.out.println("Something Went Wrong!");
                                    }
                                    System.out.println("Congrats!,Your ticket booked succesfully");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {
                                        System.out.println("Something Went Wrong!");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Error try Again!");
                                }
                            } else {
                                System.out.println("Flight Fully Booked!");
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception e) {
                                    System.out.println("Something Went Wrong!");
                                }
                            }
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Finding All Your Bookings,Please Wait!");
                        // Linear Search used to find user bookings
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
                        cancel = sc.next();
                        switch (cancel) {
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
                                    try {
                                        Thread.sleep(1000);
                                    } catch (Exception e) {
                                        System.out.println("Something Went Wrong!");
                                    }
                                    System.out.println("Booking cancelled!");
                                } catch (Exception e) {
                                    System.out.println("Error cancelling booking");
                                }
                                break;
                            case "n":
                                System.out.println("Redirecting Back to Home!");
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {
                                    System.out.println("Something Went Wrong!");
                                }
                                break;
                        }
                        break;
                    case 4:
                        sc.nextLine();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
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
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        break;
                    case 5:
                        sc.nextLine();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
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
                        String feedback = sc.nextLine();
                        try {
                            FileWriter writer = new FileWriter("feedback.txt", true);
                            writer.write(mail + " : " + feedback + "\n");
                            writer.close();
                            System.out.println("Thank you for your feedback!");
                        } catch (Exception e) {
                            System.out.println("Error Saving Feedback,Try Again!");
                        }
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        break;
                    case 6:
                        System.out.println("You Logged Out Successfully!");
                        System.out.println("Thank you for visiting DRAG");
                        barr = false;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
        } else {
            boolean reloop = true;
            while (reloop) {
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
                admininp = sc.nextInt();
                switch (admininp) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Displaying Whole List of Registered Users of DRAG!");
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        System.out.println("|Registered Users:");
                        System.out.println("----------------------------------------------------------------------------");
                        try {
                            File obk = new File("users.txt");
                            Scanner rea = new Scanner(obk);
                            while (rea.hasNextLine()) {
                                String data = rea.nextLine();
                                System.out.println(data);
                            }
                            if (obk.length() == 0) {
                                System.out.println("No User Found!");
                            }
                            rea.close();
                        } catch (Exception e) {
                            System.out.println("An Error Occured!");
                        }
                        System.out.println("----------------------------------------------------------------------------");
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Finding All Bookings,Please Wait!");
                        // Linear Search used to find bookings
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
                        flightnum = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                         ENTER START ROUTE:                                               |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        flightstart = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                          ENTER END ROUTE:                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        flightdest = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                        ENTER DEPARTURE TIME:                                             |");
                        System.out.println("|                                              (HH:MM)                                                     |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        departime = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                       ENTER DESTINATION TIME:                                            |");
                        System.out.println("|                                             (HH:MM)                                                      |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        reachtime = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                       ENTER PRICE PER SEAT:                                              |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        price = sc.next();
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                         (ADDING A FLIGHT)                                                |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                       ENTER DATE(YYYY-MM-DD):                                            |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        date = sc.next();
                        try {
                            FileWriter writer = new FileWriter("flights.txt", true);
                            writer.write(flightnum + "," + flightstart + "," + flightdest + "," + date + "," + price + "," + departime + "," + reachtime + "\n");
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
                        String stid;
                        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
                        System.out.println("|                                       (SEARCHING A TICKET)                                               |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                         ENTER TICKET ID:                                                 |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("|                                                                                                          |");
                        System.out.println("| Type Below:                                                                                              |");
                        System.out.println("|----------------------------------------------------------------------------------------------------------|");
                        stid = sc.next();
                        // Linear Search used to find ticket by ID
                        try {
                            Scanner fs = new Scanner(new File("bookings.txt"));
                            while (fs.hasNextLine()) {
                                String line = fs.nextLine();
                                String[] parts = line.split(",");
                                if (parts[3].equals("ID:" + stid)) {
                                    System.out.println("TICKET: " + parts[0] + parts[1] + " " + parts[2]);
                                    System.out.println();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {
                                        System.out.println("Something Went Wrong!");
                                    }
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Unable to Search Booking.txt");
                        }
                        break;
                    case 6:
                        sc.nextLine();
                        try {
                            Thread.sleep(1500);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        System.out.println("|User       |Feedback");
                        System.out.println("----------------------------------------------------------------------------");
                        try {
                            File obj = new File("feedback.txt");
                            Scanner reader = new Scanner(obj);
                            while (reader.hasNextLine()) {
                                String data = reader.nextLine();
                                System.out.println(data);
                            }
                            if (obj.length() == 0) {
                                System.out.println("No Feedback Found!");
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception e) {
                                    System.out.println("Something Went Wrong!");
                                }
                            }
                            reader.close();
                        } catch (Exception e) {
                            System.out.println("An Error Occured!");
                        }
                        System.out.println("----------------------------------------------------------------------------");
                        break;
                    case 7:
                        sc.nextLine();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println("Something Went Wrong!");
                        }
                        System.out.println("Logged Out,Thank You For Maintaining DRAG");
                        reloop = false;
                        break;
                }
            }
        }
    }
    public static boolean deleteuser(String email, String pswd) {
        try {
            File userFile = new File("users.txt");
            Scanner userScanner = new Scanner(userFile);
            List<String> userContent = new ArrayList<>();
            boolean deleted = false;
            // Linear Search used to verify email and password
            while (userScanner.hasNextLine()) {
                String line = userScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equalsIgnoreCase(email) && parts[1].equals(pswd)) {
                    deleted = true;
                    continue;
                }
                userContent.add(line);
            }
            userScanner.close();
            if (!deleted) {
                return false;
            }
            FileWriter userWriter = new FileWriter("users.txt");
            for (String line : userContent) {
                userWriter.write(line + "\n");
            }
            userWriter.close();
            try {
                File bookingFile = new File("bookings.txt");
                String fileContent = new Scanner(bookingFile).useDelimiter("\\Z").next();
                fileContent = fileContent.replaceAll("User: " + email + " ,Booked Flight: .*?(\\n|$)", "");
                FileWriter bookingWriter = new FileWriter("bookings.txt");
                bookingWriter.write(fileContent);
                bookingWriter.close();
            } catch (Exception e) {
                System.out.println("Error cancelling bookings: " + e.getMessage());
            }
    
            return true;
        } catch (Exception e) {
            System.out.println("Error deleting user account: " + e.getMessage());
            return false;
        }
    }
    public static boolean isvacant(String flnum) {
        int count = 0;
        // Linear Search used to count booked seats
        try {
            Scanner fs = new Scanner(new File("bookings.txt"));
            while (fs.hasNextLine()) {
                String line = fs.nextLine();
                String[] parts = line.split(",");
                if (parts[1].equals("Booked Flight: " + flnum)) {
                    String[] pass = parts[2].split("Passenger: ");
                    int alre = Integer.parseInt(pass[1]);
                    count = count + alre;
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to Search Booking.txt");
        }
        if (count >= 100) {
            return false;
        }
        return true;
    }

    public static void veiwbooking(String email) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
        // Linear Search used to find user bookings
        try {
            File file = new File("bookings.txt");
            Scanner fileScanner = new Scanner(file);
            boolean found = false;
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("| %-30s | %-15s | %-10s | %-10s |\n",
                    "Flight Number", "Passengers", "Ticket ID", "Status");
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
            if (!found) {
                System.out.println("No Bookings found for this Account");
            }
        } catch (Exception e) {
            System.out.println("Error accessing bookings: " + e.getMessage());
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
    }
    public static void changeuserpswd(String email, String pswd) {
        try {
            File file = new File("users.txt");
            Scanner fileScanner = new Scanner(file);
            List<String> fileContent = new ArrayList<>();
            boolean updated = false;
    
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(email)) {
                    fileContent.add(parts[0] + "," + pswd);
                    updated = true;
                } else {
                    fileContent.add(line);
                }
            }
            fileScanner.close();
    
            if (updated) {
                FileWriter writer = new FileWriter("users.txt");
                for (String line : fileContent) {
                    writer.write(line + "\n");
                }
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Unable to Change User Password");
        }
    }
    public static void changeadminpswd(String pswd) {
        try {
            File file = new File("admin.txt");
            Scanner fileScanner = new Scanner(file);
            List<String> fileContent = new ArrayList<>();
            boolean updated = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    fileContent.add(parts[0] + "," + pswd);
                    updated = true;
                } else {
                    fileContent.add(line);
                }
            }
            fileScanner.close();
            if (updated) {
                FileWriter writer = new FileWriter("admin.txt");
                for (String line : fileContent) {
                    writer.write(line + "\n");
                }
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Unable to Change Admin Password");
        }
    }
    public static boolean loaduser(String resetmail) {
        // Linear Search used to verify user email
        try {
            Scanner fileScanner = new Scanner(new File("users.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(resetmail)) {
                    fileScanner.close();
                    return true;
                }
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Unable to Fetch User Credentials");
        }
        return false;
    }
    public static boolean loadadmin(String resetmail) {
        // Linear Search used to verify admin email
        try {
            Scanner fileScanner = new Scanner(new File("admin.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(resetmail)) {
                    fileScanner.close();
                    return true;
                }
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Unable to Fetch Admin Credentials");
        }
        return false;
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

            // LinkedList used to load flights
            List<Flight> flights = loadFlights();
            // ArrayList used to store matching flights
            List<Flight> matchingFlights = new ArrayList<>();

            // Linear Search used to find matching flights
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
                if (reflightnum.equals("n")) {
                    System.out.println("Redirecting back!");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                        System.out.println("Something Went Wrong!");
                    }
                } else {
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
            } else {
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
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Something Went Wrong!");
            }

            // LinkedList used to load flights
            List<Flight> flights = loadFlights();
            // ArrayList used to store matching flights
            List<Flight> matchingFlights = new ArrayList<>();

            // Linear Search used to find matching flights
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
                flightfound = true;
                System.out.println("----------------------------------------------------------------------------");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println("Something Went Wrong!");
                }
            } else {
                flightfound = false;
                System.out.println("No flights available for the selected route and date.");
            }
        }

        public static List<Flight> loadFlights() {
            // LinkedList used to store flights
            List<Flight> flights = new LinkedList<>();
            try {
                File file = new File("flights.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String[] data = sc.nextLine().split(",");
                    flights.add(new Flight(data[0], data[1], data[2], data[3],
                            Double.parseDouble(data[4]), data[5], data[6]));
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("Error loading flights: " + e.getMessage());
            }
            return flights;
        }
    }
}