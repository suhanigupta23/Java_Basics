// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    Main(){
        System.out.println("This is default constructor.");
    }
    
    {
        System.out.println("This is instance block hi there!!");
    }
    static{     //OBJECT CREATION NOT NEEDED TO EXECUTE STATIC BLOCK
        System.out.println("Static block content this side!!");
    }
//STATIC SABSE PEHLE CHALEGA , THEN INSTANCE , THEN DEFAULT CONSTRUCTOR.
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //instance block called.
        Main r= new Main();
    }
}
