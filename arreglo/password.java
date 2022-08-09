package arreglo;
import java.util.*;
import java.util.Scanner;

public class password {
    public static void main(String []args){
         
        // Specify the maximum number of letters in a password
        final int MAX=8;
                     
    
// Specifying the number of uppercase letters in password
        final int MIN_Uppercase=2;
        // Specifying the minimum lowercase letters in password
        final int MIN_Lowercase=2;
        // Specifying the number of digits in a password
        final int NUM_Digits=2;
        // Specify the minimum number of special case letters
        final int Special=2;
        // Count number of uppercase letters in a password
        int uppercaseCounter=0;
        // Counter lowercase letters in a password
        int lowercaseCounter=0;
        // Count digits in a password
        int digitCounter=0;
        // count special case letters in a password
        int specialCounter=0;
        
        // Take input of password from the user
       
System.out.println("Enter the password\n");
       
Scanner input = new Scanner(System.in);

        // Take password input from the user and save it in the string password
       
String password = input.nextLine();
        
        for (int i=0; i < password.length(); i++ ) {
               char c = password.charAt(i);
               if(Character.isUpperCase(c)) 
                     uppercaseCounter++;
               else if(Character.isLowerCase(c)) 
                     lowercaseCounter++;
               else if(Character.isDigit(c)) 
                     digitCounter++;     
                if(c>=33&&c<=46||c==64){
                 specialCounter++;
             }
               
        }
        
        if (password.length() >= MAX && uppercaseCounter >= MIN_Uppercase 
&& lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) { 
               System.out.println("Valid Password");
        }
        else {
System.out.println("Your password does not contain the following:");
               if(password.length() < MAX)
                     System.out.println(" atleast 8 characters");
               if (lowercaseCounter < MIN_Lowercase) 
                     System.out.println("Minimum lowercase letters");
               if (uppercaseCounter < MIN_Uppercase) 
                     System.out.println("Minimum uppercase letters");
               if(digitCounter < NUM_Digits) 
                     System.out.println("Minimum number of numeric digits");
               if(specialCounter < Special)
System.out.println("Password should contain at lest 3 special characters");
               
        }
        
   
}
}