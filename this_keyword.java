// CALLING DEFAULT CONSTRUCTOR USINF PARAMTERISED CONSTRUCTOR 
/* public class this_keyword
{
    int a;
    
    //Calling default constructor through this keyword
    this_keyword(){
        System.out.println("Ekasu here");
    }
    
    
    //Parmeterised constructor
    this_keyword(int a){
        this();
        this.a = a; //a is the local variable here
        // using this we mean to say that the current object is referred, so the paramter passed value is taken.
        // if we do not write this , then JVM conufuses between the local variable value,, or instance variable taken
    }
    void show(){
        System.out.println(a);
    }
    
	public static void main(String[] args) {
		this_keyword r= new this_keyword(100);
		// as soon as paramterised is called , the first line takes to default constructor, then prints the default contructor line , then moves to print a value of paramterised constructor in the next line.
		r.show();
	}
}
*/
public class this_keyword
{ 
    //Default constructor calling paramterised constructor
    this_keyword(){
        this(10);
    }
    
    //Parmeterised constructor
    this_keyword(int a){
        System.out.println(a);
    }
    
	public static void main(String[] args) {
		//Calling default constructor
		this_keyword r= new this_keyword();
	}
}
