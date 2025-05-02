import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
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
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                              SIGN UP                                                     |");
            System.out.println("|                                            Set Email ID:                                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            String mail=sc.nextLine();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                              SIGN UP                                                     |");
            System.out.println("|                                            Set Password:                                                 |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            String pswd=sc.nextLine();
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
            
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                             Enter Email ID:                                              |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            String inpmail=sc.nextLine();
            System.out.println("|------------------------------WELCOME TO DRAG - BOOK YOUR TICKETS ON THE GO!------------------------------|");
            System.out.println("|                                                                                                         |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                             Enter Password:                                              |");
            System.out.println("|                                                                                                          |");
            System.out.println("|                                                                                                          |");
            System.out.println("| Type Below:                                                                                              |");
            System.out.println("|----------------------------------------------------------------------------------------------------------|");
            String inpswd = sc.nextLine();
            try {
                Scanner fileScanner = new Scanner(new File("users.txt"));
                boolean found = false;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts[0].equals(inpmail) && parts[1].equals(inpswd)) {
                            found = true;
                            break;
                    }
                }
                if (found) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid credentials!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            break;
        }
    }
}