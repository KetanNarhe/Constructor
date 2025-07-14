//Parameterized Constuctor

package Constructor;

public class Shoe 
{ 
    String brand;
    double price;
    int size;
    String type;
    String color;
    
    
    public Shoe()
    {
    	  // No Argument Constructor 
    }
      
    
      public Shoe(String brand,double price,int size,String type,String color)
      {
    	  this.brand=brand;
    	  this.price=price;
    	  this.size=size;
    	  this.type=type;
    	  this.color=color;
    	  
      }
      
      public void display()
      {
    	  System.out.println(brand);
    	  System.out.println(price);
    	  System.out.println(size);
    	  System.out.println(type);
    	  System.out.println(color);
      }
    
}
