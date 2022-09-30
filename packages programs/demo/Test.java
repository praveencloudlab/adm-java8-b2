import p1.*; // imports all class of p1 package only. never imports sub package classes
import p1.p2.*;// imports all classes of p2 package only. No classes of p1 and p3 is imported
import p1.p2.p3.*; // imports only the classes of p3 package. p1 and p2 package classes never imported
public class Test{

public static void main(String[] args){
		
     C1 c1=new C1();
     C2 c2=new C2();
     C3 c3=new C3();
     c1.f1();
     c2.f2();
     c3.f3();


		
	
 }
}