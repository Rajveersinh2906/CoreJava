package mypackage;

public class DefultExample {
	
	 void displayMessage() { // Default method
	        System.out.println("Hello! This is the default access modifier.");
	    }

	    public static void main(String[] args) {
	        DefaultExample obj = new DefaultExample(); // Allowed (same package)
	        obj.displayMessage(); // Allowed
	    }

}
