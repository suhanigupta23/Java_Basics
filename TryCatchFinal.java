//  TRY CATCH FINALLY BLOCKS
class Handling {
    public static void main(String[] args) {
       try{
            System.out.println("Hi");
            int a= 20, b=0,c;
            c=a/b;    //here exception occurs and the next statement is not executed and gos to catch block .
            System.out.println(c);
            System.out.println("Hello world");
       }
       catch(ArithmeticException a)
       {
            System.out.println("can't divide by zero");
       }
       finally()
       {
            System.out.println("This is final block statement and for sure is printed.");
       }
       System.out.println("main method ended");
    }
}


/*
    try{
            System.out.println("Hi");
            int a= 20, b=0,c;
            c=a/b;    //here exception occurs and the next statement is not executed and gos to catch block .
            System.out.println(c);
            System.out.println("Hello world");
       }
       catch(ArithmeticException a)
       {
            int x= 20, y=0,z;
            z= x/y;                 //agli statement se execution nhi hoga as catch block ke paas koi apna try -catch block nhi hei jisse vo apna exception handle kar paaye.
            System.out.println(z);
            System.out.println("can't divide by zero");
       }
       finally()
       {
            System.out.println("This is final block statement and for sure is printed.");
       }
       System.out.println("main method ended");
    }
*/
