package Program.Password_Checker;

import java.util.Scanner;

public class main{

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        String password = "java123";
        boolean value = true;
        int count = 3;

        while (value && count >= 1) {

            System.out.print("Enter Password : ");
            
            String userValue = input.next();
            //System.out.println("Count : " + count);

            if (userValue.equals(password)) {
                 
                System.out.println("Correct Password.");
                System.out.println("Account Unlocked Successfully.");

                value = false;
                
            }
            else if (!userValue.equals(password) && count > 1 ){
                
                System.out.println("Please try again");
                System.out.println("You have " + (count - 1) + "attempt left.");


            }else{
                System.out.println("Account Locked");
                value = false;

            };

            count--;

            
        };

        input.close();


    };

};