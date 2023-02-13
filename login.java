import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String firstName;
      String secondName;
      String fourDigits;
      
      firstName = scnr.next();
      secondName = scnr.next();
      fourDigits = scnr.next();
      
      if (secondName.length() >= 5) {
         System.out.print("Your login name: ");
         System.out.print(secondName.charAt(0));
         System.out.print(secondName.charAt(1));
         System.out.print(secondName.charAt(2));
         System.out.print(secondName.charAt(3));
         System.out.print(secondName.charAt(4));
         System.out.print(firstName.charAt(0));
         System.out.print(fourDigits.charAt(2));
         System.out.println(fourDigits.charAt(3));
      }
      else if (secondName.length() == 4) {
               System.out.print("Your login name: ");
               System.out.print(secondName.charAt(0));
               System.out.print(secondName.charAt(1));
               System.out.print(secondName.charAt(2));
               System.out.print(secondName.charAt(3));
               System.out.print(firstName.charAt(0));
               System.out.print(fourDigits.charAt(2));
               System.out.println(fourDigits.charAt(3));
            }
            else if (secondName.length() == 3) {
                     System.out.print("Your login name: ");
                     System.out.print(secondName.charAt(0));
                     System.out.print(secondName.charAt(1));
                     System.out.print(secondName.charAt(2));
                     System.out.print(firstName.charAt(0));
                     System.out.print(fourDigits.charAt(2));
                     System.out.println(fourDigits.charAt(3));
                  }
	}
}
