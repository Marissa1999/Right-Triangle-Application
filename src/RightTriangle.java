//Programmer: Marissa Gonçalves
//Date: Novemeber 3, 2017
//Purpose: This program allows to display various pattern of a diamond by using many methods.


public class RightTriangle 
{
    
    
    
   
    //initialize the necessary attributes
    private int size;
    private int mode;
    private char pen;
    private int setSize;
    private int setMode;
    private char setPen;

      
    
    
    
    
   //use normal constructors to classify the attributes 
    public  RightTriangle(int a_size, int a_mode, char a_pen) 
    {
        size = a_size;
        mode = a_mode;
        pen = a_pen;
    }

    
    
    
    
     
    
    //getters (accessors)
    public int getSize() 
    {
        return size;
    }
    
    public int getMode() 
    {
        return mode;
    }
    
    public char getPen() 
    {
        return pen;
    }
   
    
    
    
    
    
    //setters (mutators)
    public void setSize (int size)
    {
        this.size = size ;
    }
    
    
    public void setMode (int mode)
    {
        this.mode = mode;
    }
    
      
    public void setPen (char pen)
    {
        this.pen = pen;
    }
    
    
    
    
   
    
    
    
    //convert the methods into a string in order for the output to be displayed
     public String toString()
     { 
        String result = "";
        
        switch (mode) 
        {
            
            case 1:
            {
                
           
                
                for (int row = 1; row <= size; row++)
                {
                    for (int col = 1; col <= row; col++)
                    {
                        result += pen;
                    }
                    
                    result += "\n";
                }
                
                return result;
                
            }    
            
            
            
            case 2:
            {
 
                        
                for (int row = 1; row <= size; row++)
                {
                    for (int spaces = 1; spaces <= size - row; spaces++)
                    {
                        result += " ";
                    }
                    
                    for (int symbol = 1; symbol <= row; symbol++)
                    {
                        result += pen;
                    }
                    
                    result += "\n";
                }
                
                return result;
            }   
            
            
            
            case 3:
            {
              
                
                for (int row = size; row >= 1; row--)
                {
                    for (int spaces = 1; spaces <= size - row; spaces++)
                    {
                        result += " ";
                    }
                    
                    for (int symbol = 1; symbol <= row; symbol++)
                    {
                        result += pen;
                    }
                    
                    result += "\n";
                }
                
                return result;   
            }    
            
            
            
            case 4:
            {
                
                
                for (int row = size; row >= 1; row--)
                {
                    for (int col = row; col >= 1; col--)
                    {
                        result += pen;
                    }
                    
                    result += "\n";
                    
                }
                
                return result;
            }
        }
        
      return result;
     }
     
     
     
     
     
     
        //use a method to calculate the screen area for each of the rectangles
        public int screenArea()
        {      
            
               int sArea = 0;
               
               for (int num = 0; num <= size; num++)   
               {  
               sArea += size - num;
               }
               
          return sArea; 
        }
         
        
       
       
       
        
       
         
        
         //use a method to calculate the actual geometric area of the triangle
         public float geoArea()
        {
               float gArea = (float) (size * size) / 2;
               return gArea;          
        }

         
       
         
         
         
         
        //use a method to determine the screen perimeter of each shape
        public int screenPerimeter()
        {
               int sPerimeter = size + (size - 1) + (size - 2);
               return sPerimeter; 
        }
         
         
        
        
        
        
        //use a method to determine the geometric perimeter of every triangle
        public float geoPerimeter()
        {        
               float gPerimeter = (float) (size + size + (size * Math.sqrt(2)));
               return gPerimeter;
               
        }
        
        
        
        
        
        //print all the info needed for each triangle based on the three main constructors
        public String get_all_info()
        {
            
               String result = "";
            
               result += ("-----------------------------");
               result += ("\nPattern:\n");
               result += (toString());
               result += ("Name: Isosceles Right Triangle\n");
               result += ("Size: " + size + "\n");
               result += ("Mode: " + mode + "\n");
               result += ("Pen: " + pen + "\n");
               result += ("Geographical Area: ");
               result += geoArea();
               result += ("\n");
               result += ("Screen Area: ");
               result += screenArea();
               result += ("\n");
               result += ("Geographical Perimeter: ");
               result += geoPerimeter();
               result += ("\n");
               result += ("Screen Perimeter: ");
               result += screenPerimeter(); 
               result += ("\n");
               result += ("-----------------------------");
               result += ("\n");
               
               return result;
               
        }

               
        
        
        
         //use a method to allow the triangles to be flipped vertically
         public void flipVertical() 
        {
           
            switch (mode) 
            {
               case 1 : mode = 4; break;
               case 2 : mode = 3; break;
               case 3 : mode = 2; break;
               case 4 : mode = 1; break;
            }
               
        }

            
        
       
        //use a method to allow the traingles to be flipped horizontally
        public void flipHorizontal() 
        {
              switch (mode) 
            {
               case 1 : mode = 2; break;
               case 2 : mode = 1; break;
               case 3 : mode = 4; break;
               case 4 : mode = 3; break;
            }
        }
       
        
        
}
         