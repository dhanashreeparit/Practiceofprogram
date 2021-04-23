package practice.testing;

import java.util.Scanner;

public class CompiletimeExceptionprob  {
    public static void ageEvalution(int age)throws ValidvoteException {
    	if(age>18) {
    		System.out.println(" valid for voting");
    	}
    	else {
    		throw new ValidvoteException("invalid");
    		
    		
    		
    	}
    }
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age of the candidate");
		int age = s.nextInt();
		try {
		ageEvalution(age);
		}
		catch(ValidvoteException e) {
			System.out.println(e.addressing());
		}
		
	}
	
	}
class ValidvoteException extends Exception{
	static String msg;
	ValidvoteException(String word){
		msg=word;		
	}
	public static String  addressing(){
		return msg;
	}
}