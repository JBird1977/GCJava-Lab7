import java.util.Scanner;


public class Lab7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        String name; // Valid entries: [A-Z][A-Za-z]{1,29}
        String email; // ([A-Za-z0-9]{5,30})@([A-Za-z0-9]{5,10})\.[A-Za-z0-9]{2,3}
        String phone; // \d{3}-\d{3}-\d{4}
        String date; // \d{2}\/\d{2}\/\d{4}
   
        String input;
        
        boolean valid = false;
        
               
        
        do {  //name
            valid = false; //initialize to false to ensure no false positives
            System.out.println("What's your name: ");
            name = scan.nextLine();
            valid = validateName(scan, name);
            
                    System.out.println(valid ? "Valid!" : "Invalid :( " );
        
        } while (!valid); //close Name loop
        
        do { //emails
            valid = false;  //initialize to false to ensure no false positives
            System.out.println("What's your email: ");
            email = scan.nextLine();
            valid = validateEmail(scan, email);
            
                    System.out.println(valid ? "Valid!" : "Invalid :( " );
            
            
        } while (!valid);
        
        do { //phone numbers
            valid = false;  //initialize to false to ensure no false positives
            System.out.println("What's your phone number? Please use the format: ###-###-####: ");
            phone = scan.nextLine();
            valid = validatePhone(scan, phone);
            
                    System.out.println(valid ? "Valid!" : "Invalid :( " );
            
        } while (!valid);
        
        do { //dates
            valid = false;  //initialize to false to ensure no false positives
            System.out.println("What's the date? Please use the format: mm/dd/yyyy: ");
            date = scan.nextLine();
            valid = validateDate(scan, date);
            
                    System.out.println(valid ? "Valid!" : "Invalid :( " );
            
        } while (!valid);
        
        
        System.out.println("Your name is: " + name);
        System.out.println("Your email is: " + email);
        System.out.println("Your phone number is: " + phone);
        System.out.println("The date you entered is: " + date);
        
        System.out.println("Thanks for playing.");
        
        
   
        
        
        
        scan.close();
    }


public static boolean validateName(Scanner scan, String uName) {
    if (uName.matches("[A-Z][A-Za-z]{1,29}")) {
        return true;
    } else {
        System.out.println("Please enter a valid name. ");
        return false;
    }
    
    
}

public static boolean validateEmail(Scanner scan, String uEmail) {
    if (uEmail.matches("([A-Za-z0-9]{5,30})@([A-Za-z0-9]{5,10})\\.[A-Za-z0-9]{2,3}")) {
        return true;
    } else {
        System.out.println("Please enter a valid email. ");
        return false;
    }
    
    
}

public static boolean validatePhone(Scanner scan, String uPhone) {
    if (uPhone.matches("\\d{3}-\\d{3}-\\d{4}")) {
        return true;
    } else {
        System.out.println("Please enter a valid phone number. ");
        return false;
    }
    
    
}

public static boolean validateDate(Scanner scan, String uDate) {
    if (uDate.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
        return true;
    } else {
        System.out.println("Please enter a valid date. ");
        return false;
    }
    
    
}


}
