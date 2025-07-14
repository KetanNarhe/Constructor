package Constructor;

public class FormConstructorChaning 
{
	String name;
	  int age;
	  long phno;
	  String email;
	  String loc;
	  String blood;
	  long tel;
	  String temploc;
	  
	  public FormConstructorChaning()
	  {
	
	  }

	  public FormConstructorChaning(String name, int age, long phno, String email, String loc) 
	  {
		
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.email = email;
		this.loc = loc;
		
	  }
	  
	  public FormConstructorChaning(String name, int age, long phno, String email, String loc,String blood)
	  {
		  this(name,age,phno,email,loc);
		  this.blood=blood;
	  }
	  
	  public FormConstructorChaning(String name, int age, long phno, String email, String loc,String blood,long tel)
	  {
		  this(name,age,phno,email,loc,blood);
		  this.tel=tel;
	  }
	  
	  
	  public FormConstructorChaning(String name, int age, long phno, String email, String loc,String blood,long tel,String temploc)
	  {
		  this(name,age,phno,email,loc,blood,tel);
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
		  System.out.println("--------------------------------------------");
		 
	  }
	  
	  
	  
	  
	  
	  
	  
}
