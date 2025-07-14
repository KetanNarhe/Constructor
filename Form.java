// Constructor Overloading 

package Constructor;

public class Form 
{
  String name;
  int age;
  long phno;
  String email;
  String loc;
  String blood;
  long tel;
  String temploc;
  
  
  
  public Form()
  {
	  
  }



  public Form(String name, int age, long phno, String email, String loc)
  {
	
	this.name = name;
	this.age = age;
	this.phno = phno;
	this.email = email;
	this.loc = loc;
	
  }



  public Form(String name, int age, long phno, String email, String loc, String blood) {
	
	this.name = name;
	this.age = age;
	this.phno = phno;
	this.email = email;
	this.loc = loc;
	this.blood = blood;
	
  }
  
  public Form(String name,int age,long phno,String email,String loc,String blood,long tel,String temploc)
  {
	    this.name = name;
		this.age = age;
		this.phno = phno;
		this.email = email;
		this.loc = loc;
		this.blood = blood;
	    this.tel=tel;
	    this.temploc=temploc;
	  
  }
  
  public void displayForm()
  {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(phno);
	  System.out.println(email);
	  System.out.println(loc);
	  System.out.println(blood);
	  System.out.println(tel);
	  System.out.println(temploc);
	  System.out.println("---------------------------------------");
	  
  }
  
  
  
  
}
