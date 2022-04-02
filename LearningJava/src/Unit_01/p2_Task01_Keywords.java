package Unit_01;
public class p2_Task01_Keywords {
	public static void main(String[] args) {
		/*
		 	*50 keywords
		 	*reserved words (meanings are already defined by the compiler)
		 	*we are not supposed to use keywords as:
		 		*method name
		 		*variables
		 		*objects 
		*/
		void int() { //keywords can not be used as method name 
			System.out.println("hello");
		}
		
		int int=124; //keywords can not be used as variable name
		
		abc int=new abc();//keywords can not be used as object name 
		int.a=10;
		System.out.println(int.a);
	}
}
class int //keywords can not be used as class name
{
	int a;
}
class abc
{
	int a;
}
