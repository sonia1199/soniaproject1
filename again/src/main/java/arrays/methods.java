package arrays;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profit();
		email("soniaghad0621@gmail.com");   //method with argument
		profitwitharg(10000,6000);
	}
	
	//methods without arguments
	public static void profit() {
		int income= 10000;
		int expenses= 6000;
		int profit= income-expenses;
		System.out.println("profit is " + profit);
	}
	
	//methods with arguments
	public static void email(String emailid) {
		System.out.println("enter email " + emailid);
		
	}
	
	//methods with return type
	public static int profitwitharg(int income, int expenses) {
		int saving= income-expenses;  
		System.out.println(saving);  //you have to print something in the return method, put it here before the "return" statement for it to execute
      return saving;
	}
	

}
