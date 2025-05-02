import java.io.File;
import java.io.FileWriter;
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
}