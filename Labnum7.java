
package lab;
import java.util.Scanner; //importing scanner
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Labnum7 { 

private static Object emailPattern;

//this program validates input
	
    public static void main(String[] args) {   //main method
    	
    	Scanner scnr = new Scanner(System.in); //scanner
        boolean emailPattern;		
    	
    	System.out.println("Please enter valid name: "); //prompt user for valid name
		String name = scnr.next();
        
		if (name.matches("[A-z ]{3,50}") ) {
        	System.out.println("Name is valid! "); //Successful output
        }else {
        	System.out.println("Sorry name is not valid  "); }//output for invalid name
        
            System.out.println("Please enter email: "); //prompt for user email
            boolean email = scnr.hasNext();
            
            System.out.println("Please enter valid number: "); //prompt for user number
            int num = scnr.nextInt();
            
            
            
    	
    	
    	
    	
    } public static String validEmail(String email) {
    	
    	String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(emailPattern);
        Matcher m = p.matcher(email);
    	
		if (email.equals(emailPattern)) {
			System.out.println("Email valid");
		}else {
			
		}   System.out.println("Email not valid");
		
        
        
        return emailPattern; } 
        
    	
    		
    		
    	
    public static void validNumber(int num) {
    	
    	
    	

    }
    
    public static void validDate(int date) {
    
    	
    	
    	
    }

	

}
