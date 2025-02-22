//MULTILEVEL INHERITANCE
class A{ //super class
    void input(){
        System.out.println("Enter your name: ");
    }
}
class B extends A {   //1st sub class
    void show()
        {
            System.out.println("My name is Ekasu");
        }
}
class C extends A{   //2nd sub class
    void disp()
        {
            System.out.println("My name is Suhani");
        }
}
class Heirarchial_Inheritance{
    public static void main(String [] args){
        B r1= new B();
        C r= new C();
        
        r1.input(); r1.show();
        r.input(); r.disp();
    }
}

//THE CHILD CLASS CAN DIRECTLY REUSE THE METHOD OF PARENTS , SO MAKE ONLY IBJECT OF THE CHILD CLASS SO TO ACCESS THE PARENT ,, CHILD CLASS METHODS ALL AT ONCE .
