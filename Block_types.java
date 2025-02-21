class Block_types {
    
   Block_types(){
        System.out.println("This is default constructor.");
    }
    
    {
        System.out.println("This is instance block hi there!!");
    }
    static{     //OBJECT CREATION NOT NEEDED TO EXECUTE STATIC BLOCK
        System.out.println("Static block content this side!!");
    }
    static void show{
        System.out.println("Hello there this is static but printed at last.As called at last .");
    }
//STATIC SABSE PEHLE CHALEGA , THEN INSTANCE , THEN DEFAULT CONSTRUCTOR.
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //instance block called.
        Block_types r= new Block_types();
        
        //IF STATIC TO CALL LATER THEN : 
        Block_types.show();
    }
}
