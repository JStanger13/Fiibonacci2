

import java.util.Scanner;
public class Fiibonacci {
	public static void main (String [] args){
		System.out.println("Please input a number! ");
        int userIn = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series up to " +  userIn +" numbers are ");
        for(int i = 1; i <= userIn; i++){
        
        	System.out.print(printFibonacci(i));
        	if(i < userIn){
        		System.out.print(", ");
        		
        	
        	}
        	}
        }
	public static int printFibonacci(int max){
		if (max == 1){
			return 0;
	
		}
		if (max == 2 || max == 3){
			return 1;
			
		}
		return printFibonacci (max - 1) + printFibonacci (max - 2);
	} 
}



