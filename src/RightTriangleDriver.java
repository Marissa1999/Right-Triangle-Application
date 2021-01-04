//Programmer: Marissa Gonçalves
//Date: Novemeber 3, 2017
//Purpose: This program allows to displays the information from all the methods stored in RightTriangle.java.


public class RightTriangleDriver 

{
       public static void main (String[] args)
            
    {
        //test the contructor method
        RightTriangle t = new RightTriangle(5, 1, '*');
        
        
        
        //test the toString() method
        System.out.println(t);
        
        
        
        //test the setMode() method
        t.setMode(2); System.out.println ("Change mode to 2:\n" + t);
        t.setMode(3); System.out.println ("Change mode to 3:\n" + t);
        t.setMode(4); System.out.println ("Change mode to 4:\n" + t);
        
        
       
        //test the flipHorizontal() method
        t.flipHorizontal(); 
        System.out.println ("Flip Horizontal:\n" + t);
        

        
        
        //test the flipVertical() method
        t.flipVertical(); 
        System.out.println ("Flip Vertical:\n" + t);
              
      
        
       //print a message about the constructed triangle
       System.out.printf("Here is all about the default-constructed triangle: \n%s\n", t.get_all_info());
       
        
        
        
        //test non-default (normal) constructors
        RightTriangle t1 = new RightTriangle(4, 1, '0');
        RightTriangle t2 = new RightTriangle(6, 2, '*');
        RightTriangle t3 = new RightTriangle(5, 3, 'z');
        RightTriangle t4 = new RightTriangle(7, 4, '☐');
        
        
       
          //test all other methods in get_all_info()
         System.out.println (t1.get_all_info());
         System.out.println (t2.get_all_info());
         System.out.println (t3.get_all_info());
         System.out.println (t4.get_all_info());
         return;        
        
    }
}
