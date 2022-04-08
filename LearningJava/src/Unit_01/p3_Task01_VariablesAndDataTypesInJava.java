package Unit_01;

/*
- Variable in Java is a data container that saves the data values during Java Program execution
Types of Variables :
	In Java, there are three types of variables :
		- local variables - declared inside the body of a method
		- Instance Variables - Instance variables are defined the body of a method
			- They are defined Outside a method declaration
			- They are object specific and are known as instance variables
			
		- Static variables -
			- static variables are defined with the STATIC keyword0
			- Static variables are initialized only once, at the start of the program execution.
			- these static variables should be initialized first , before the initialization of any 
*/
public class p3_Task01_VariablesAndDataTypesInJava {


	static int q = 11;//static variable
	
	int p = 10;//instance variable
	

	public static void main(String[] args) {
		//local variables
        int myNum=5; //integer(whole no)
        float myFloatNum = 5.99f; // floating point no
        char myLetter = 'D';//character
        boolean myBool = true; // Boolean
        String myText = "Hello"; //String
        
         System.out.println("myNum="+myNum);
         System.out.println("myFloatNum="+myFloatNum);
         System.out.println("myLetter="+myLetter);
         System.out.println("myBool="+myBool);
         System.out.println("myText="+myText);
         
         
         double f;
         int i = 10;
         f = i; //int to float TypeConversion
         
         double g = 10;
         int j;
         j = (int) g;//TypeCasting
         
         System.out.println(f);
         System.out.println(i);
         System.out.println(g);
         System.out.println(j);
         
         
        System.out.println(CBA.j);//static variable of class ABC
        
        CBA obj1 = new CBA();
        System.out.println(obj1.i++);//instance variable of  class ABC
        System.out.println(obj1.i);
        
        CBA obj2 = new CBA();
        System.out.println(obj2.i);
        
        
        System.out.println(CBA.j++);
        System.out.println(CBA.j);
        
        CBA.typeconversionAndTypecasting();
        
        
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; //local variable
		System.out.println(" This Is Display Method!");
		System.out.println(a);
	
	}

}
class CBA {
static int j = 10;// class variable/static variable
int i = 10;// Instance variable

static void display() {
	
	int a = 5; //local variable
	System.out.println("This is Display Method!");
	System.out.println(a);
}

static void typeconversionAndTypecasting()
{
	
	/*
	 * Double f; //8 bytes = 64 bits/slots int i=10;//4 bytes=32 bits/slots 
	 * f=i; // Type conversion system.outprintln(f);
	 *
	 *double g = 10 ; // 64 int j; //32 j = (int)g;
	 */
	
	double f; //64 slots
	int i = 10; //32 slots
	f = i; //Type Conversion
	System.out.println(f);
	
	double g = 10; //64
	int j; //32
	j = (int)g;//Type Casting
	
	//32 bits = 64 bits
	
	System.out.println("i="+i);
	System.out.println("j="+j);
}
}