package scott_p1;

import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in); 
		System.out.println("Enter text to decrypt: ");
		
		int encr = scnr.nextInt();
	    int dig1;
	    int dig2;
	    int dig3;
	    int dig4;
	    int swap;
	    
	    dig1 =encr / 1000;//thousands
		dig2 =encr / 100;//hundreds
		dig3 =encr / 10;//tens
		dig4 =encr /1;//ones
		
		 //swap 2 & 4 back
	    swap = dig4;
	    dig4 = dig2;
	    dig2 = swap;

		
	    //swap 1 & 3 back
	    swap = dig1;
	    dig1 = dig3;
	    dig3 = swap;
	     
	   
	    dig1 = (dig1+3)%10;
	    dig2 = (dig2+3)%10;
	    dig3 = (dig3+3)%10;
	    dig4 = (dig4+3)%10;

	    
		System.out.print("The result of decrypting is: "+ dig1 +"" + dig2 + "" + dig3 + "" + dig4);

	}

}
