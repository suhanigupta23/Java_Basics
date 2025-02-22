//SUPER KEYWORD USE 
class A{ //super class
    int a= 10;
    /*
    void show()
    {
        System.out.println("Hello this is super class.");
    }*/
    A(){
        System.out.println("Hello This is super class display.");
    }
    
    //PARAMETERISED CONSTRUCTOR IN SUPER CLASS NEED SUPER KEYWORD IN SUB CLASS 
    A(int a){
        System.out.println("Here is the value of a: "+a);
    }
}
class B extends A {   //sub class
    int a= 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    /*
    void show(){
        super.show();
        System.out.println("Hello This is sub class display.");
    }
    */
    // IN OTHER METHODS WE NEED TO USE SUPER KEYWORD , BUT IN CONSTRUCTOR IT TAKES BY DEFUALT THE KEYWORD SUPER.

    B()
    {
        //by default super added , we do not need to add super keyword , message of constructor A in super class A called
        // super();     //zaroori nhi 
        //Use in Paramterised constructor need keyword super with paramter value
        super(100);
        System.out.println("Hello This is sub class display.");
        
    }
}
class Super_keyword
{
    public static void main(String [] args){
        B r= new B();
        r.show();
        
        /*the two void show () in the comments in the two sub classes are overriding: 
             B r= new B();
             r.show();        calls member of its own class
             super.show() in the class b takes to the message written in class a parent
        */
    }
}
