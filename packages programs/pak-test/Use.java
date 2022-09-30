import arth.Sum;
import arth.Mul;
import arth.Sub;
import arth.Div;

class Use{

public static void main(String[] args){
     
      Sum s=new Sum(); // need Sum.class while creating Object 
      int x=s.sum(10,20);
      System.out.println("Sum is "+x);

      Mul m=new Mul();
       x=m.mul(10,2);
		 System.out.println("multiplecation is "+x);

		 Div d=new Div();
      x=d.div(100,2);
		 System.out.println("division is "+x);

     Sub ss=new Sub();
     x=ss.sub(90,5);

    System.out.println("substraction is "+x);



    
     

 }
}