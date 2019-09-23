package scott_p1;

import java.util.Scanner;
public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in); 
		System.out.print("Enter a 4-digit code integer to encrypt: ");
	     
		int original = scnr.nextInt();
	    int dig1;
	    int dig2;
	    int dig3;
	    int dig4;
	    int swap;
	    int reformed = 0;
		//System.out.print("2");
	     
	    dig1 =original / 1000;//thousands
		dig2 =(original % 1000) / 100;//hundreds
		dig3 =(original % 100) / 10;//tens
		dig4 =original % 10;//ones
	    
	    //turn all into remainders, adding 7 then div by 10
	    dig1 = (dig1+7)%10;
	    dig2 = (dig2+7)%10;
	    dig3 = (dig3+7)%10;
	    dig4 = (dig4+7)%10;
		//System.out.print("3");
	    
	    //swap 1 & 3
	    swap = dig1;
	    dig1 = dig3;
	    dig3 = swap;
	     
	    //swap 2 & 4
	    swap = dig4;
	    dig4 = dig2;
	    dig2 = swap;
	     
	    //put back together into int
	   
		System.out.print("The result of encrypting is: "+ dig1 +"" + dig2 + "" + dig3 + "" + dig4);
		scnr.close();
	}

}
