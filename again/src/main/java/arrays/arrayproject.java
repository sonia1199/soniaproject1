package arrays;

public class arrayproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fruits=new int[10]; //declare the size of array
		fruits[0]=45;
		fruits[1]=50;
		fruits[2]=55;
		fruits[3]=60;
		fruits[4]=65;
		fruits[5]=70;
		fruits[6]=75;
		fruits[7]=80;
		fruits[8]=85;
		fruits[9]=90;
		System.out.println(fruits[1]);
		
		int length=fruits.length;
		for (int g=0; g<length;g++) {
			
		System.out.println(fruits[g]); //printing the values of an array

		for(int i=0;i<=9;i++) {
			System.out.println(fruits[i]);
		}
		
		for (int i:fruits) {
	System.out.println(i);


	}

}
	}
}
