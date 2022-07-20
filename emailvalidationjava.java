import java.util.regex.*;    
import java.util.*;   
public class emailvalidationjava {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        
	        emails.add("mohit@email.com");  
	        emails.add("javeed236@gmail.com");  
	        emails.add("harsha#@lpu.in");  
	        emails.add("karuna@domain.com");  
	        emails.add("mahes_anna@lpu.co.in");  
	       
	        emails.add("@facebook.com");  
	        emails.add("tarun#%gmail.com");  
	        //Regular Expression   
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate email array list  
	        for(String email : emails){
	        	 //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  	
	        }
}
