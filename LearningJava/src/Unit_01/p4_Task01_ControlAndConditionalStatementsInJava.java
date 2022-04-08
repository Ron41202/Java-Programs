package Unit_01;
/*
Control Statements and Conditional Statements:
		
		- java provides 3 types of control flow statements:
				
				- Decision making statements:
						- if statement
						- switch statement
				- Loop statements:
						- do while loop
						- while loop
						- for loop
						- for-each loop
				- Jump statements:
						- break statement
						- continue statement
*/
public class p4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
		
	}
}

class Statements{
	void DecisionMakingStatements(){
		
		int x=10;
		int y=12;
		if(x+y<10)
			System.out.println("x+y is less than 10");
		else
			System.out.println("x+y is greater than 10");
		
		int num=2;
//		Q=can we use char instead of int as num?
//		ans= yes we can use char instead of int.It will consider the integer ASCII value
		
		switch(num) {
		case 0:System.out.println("num=0");
				break;
		case 1:System.out.println("num=1");
				break;
		case 2:System.out.println("num=2");
				break;
		default:System.out.println("num="+num);
		}
	}
	
	void LoopStatements() {
		//for
		int sum=0;
		for(int j=1;j<=10;j++)
			sum+=j;
		System.out.println("sum of 1st 10 natural number= "+sum);
		
		
		//for-each
		String[] names={"java","c","c++","python"};
		System.out.println("string names=");
		for(String name:names)
				System.out.println(name);
		
		//while
		int i=0;
		System.out.println("even numbers b/w 0-10");
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		
		//do while
		i=1;
		System.out.println("odd numbers b/w 0-10");
		do
		{
			System.out.println(i);
			i+=2;
		}while(i<=10);
	}
	
	void JumpStatements() {
		//break
		System.out.println("using break statement:");
		for(int i=0;i<=10;i++)
		{
			if(i==6)
				break;
			System.out.println(i);
		}
		
		//continue
		System.out.println("using continue statement:");
		for(int i=0;i<=10;i++)
		{
			if(i==6)
				continue;
			System.out.println(i);
		}
	}
}