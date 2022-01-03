package arrays;

public class averagegrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculating the average
		int math=59;
		int science=66;
		int chem=55;
		int av=((59+66+55)/3);
		System.out.println("your grade average is " +av);
		
				//Calculating the grades
		
		if(av>=90 && av<=100) {
			System.out.println("your grade is A");
		}
		
		else if (av>=80 && av<=89) {
			System.out.println("your grade is B");
		}
		
		else if (av>=70 && av<=79) {
			System.out.println("your grade is C");
		}
		else if (av>=60 && av<=69) {
			System.out.println("your grade is D");
		}
		else {
			System.out.println("your grade is F");
			
		}

	}

}
