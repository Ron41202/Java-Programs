package Unit_02; //Inside this package we can create many classes:
/*
 - A java package is a group of similar types of classes , interface and sub-packages.
 - Package in java can be categorized in two form
   - built - in package{lang , awt , javax , swing , net , io , util ,  sql}
   - user-defined package
  
 - Package also helps to avoid calss name collision
 - Package also helps to maintain access protection in Java
 - Packages are named in reverse order to domain names
  - Unit_01.javaproject.com -> "com.javaproject.Unit-01"
    
  import java.util.vector; //import the Vector class from util package 
  import java.util.util.*; //import all the classes form util package
  
  Static Import : 
   - static import is a feature introduced in Java programming language (versions 5 and above )
   that allows members (fields and methods ) defined in a class as public static
   , to be used in Java code without specifying the class in which the field is defined
 */
import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1 ;
public class p11_Task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
	  System.out.println("Welcome to package");
      
	  out.println("Welcome to package");
	  System.out.println(pow(2 , 2));
	  System.out.println(abs(6.3));
	  
	SampleClass1 obj = new  SampleClass1();
	  System.out.println(obj.a);
	}
}