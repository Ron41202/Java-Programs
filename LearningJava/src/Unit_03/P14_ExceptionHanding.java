package Unit_03;
import java.util.Scanner;
/*
 *  100/0 (divide by 0) ->  this is arithmetic exception
 *  we handle exception with try and catch block
 *  there can we multiple catch block with a single try block
 * 
 * we cannot make the super class catch exception cuz the child class(exception handling block ** here arithmetic exception**
 * wont be able to catch the exception ,,,, there will be an compile time error
 * 
 * stackoverflow example -> infinite loop 
 * stackoverflow is an error
 * 
 * finally block always execute after the try and catch block
 * 
 * throw keyword is used to catch an exception that we want -> it means it catches specific exception that user wants
 * 
 *   "throws" is used on functions
 */
public class P14_ExceptionHanding {

	public static void main(String[] args) {

		abc obj= new abc();
		
		//obj.basicException();
		obj.handleException();
		obj.mutliplecatch();
		obj.inputMismatchException();
		obj.indexOutOfoundException();
		obj.NullPointerException();
		//obj.stackOverflowError();
		obj.useOfFinally_and_throws();
		try {
			obj.calcArea();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}

class abc{
	private
		int a=0;
		int b=10;
		int c;
	public
	void basicException() {
		c=b/a;	// basic exception ->divide by 0
		System.out.println(c);
	}
	void handleException() {
		try{
			c=b/a;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void mutliplecatch() {
		try{
			c=b/a;
			System.out.println(c);
		}
		catch(ArithmeticException e) // child class of exception class
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e) 	// super exception class -> it can catch all type of exception but not error
		{
			System.out.println(e.getMessage());
		}
		
	}
	void inputMismatchException() {
		Scanner obj1 = new Scanner(System.in);
		try{
			System.out.println("enter an integer value:");
			int a = obj1.nextInt();
			
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Input mismatch exception\n");
		}
	}
	void stackOverflowError() {
		try {
			while(1>0) {
				System.out.println("loading..\n");
			}
		}
		catch(Exception e) {
			System.out.println("StackOverflow condition..\n");
		}
	}
	void indexOutOfoundException() {
		int[] a= { 5,4,6,1,23};
		try {
			System.out.println(a[10]);
		}
		catch(Exception e){
			System.out.println("Index out of bound exception\n");
		}
	}
	void NullPointerException() {
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println("Null pointer exception\n");
		}
	}
	void useOfThrow() throws Exception {
			int age=16;
			if( age < 18)
				throw new Exception();
			else
				System.out.println("you are okay\n");
	}

	void useOfFinally_and_throws() {
		try {
			useOfThrow();
		}
		catch (Exception e) {
			System.out.println("you are below 18\n");
		}
		finally {
			System.out.println("code in finally always execute\n");
		}
}
	void checkedAndUncheckedException() {
		int x=0;
		int y=10;
		int z= y/x;
		System.out.println(z);
		try {
			useOfThrow();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void calcArea() throws manualException{
		int a;
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter the side of square:");
		a = obj1.nextInt();
		if (a<=0)
				throw new manualException();
		else
			System.out.println(a*a);
	}
}

class manualException extends Exception{
	
	
	public String getMessage() {
		String otherMessage = "Sqaure with side 0 cm or less doesnt exist\n";
		return otherMessage;
	}
}
