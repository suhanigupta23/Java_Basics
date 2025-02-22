//MULTILEVEL INHERITANCE
class A{ //super class
    int a,b,c;
    void add()
    {
        a= 10; b=20;
        c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }
    void sub()
    {
        a= 200;
        b=100;
        c=a-b;
        System.out.println("Sub of two numbers: "+c);
    }
    
}
class B extends A {   //1st sub class
    void multi()
        {
            a= 10;
            b=20;
            c=a*b;
            System.out.println("Multiplication of two numbers: "+c);
        }
    void div(){
        a=10;
        b=2;
        System.out.println("Div of  two numbers: "+a/b);
    }
}
class C extends B{   //2nd sub class
    void rem(){
        a=10;
        b=3;
        c=a%b;
        System.out.println("Remainder of two numbers: "+c);
    }
}
class Multilevel_Inheritance{
    public static void main(String [] args){
        C r= new C();
        r.add(); r.sub(); r.multi(); r.div(); r.rem();
    }
}

//THE CHILD CLASS CAN DIRECTLY REUSE THE METHOD OF PARENTS , SO MAKE ONLY IBJECT OF THE CHILD CLASS SO TO ACCESS THE PARENT ,, CHILD CLASS METHODS ALL AT ONCE .
