//MULTIPLE INHERITANCE
//NOTE : INTERFACE KE ANDAR WALA METHOD HUMESHA ABSTRACT + PUBLIC HOGA , ISLIYE BAHAR EXTRACT KARTE SAMME WE HAVE TO USE PUBLIC KEYWORD

class A{
    void show()
    {
        System.out.println("This is class A");
    }
}
class B
{
    void show()
    {
        System.out.println("This is class B");
    }
}
// class Multiple extends A,B         //MULTIPLE INHERITANCE NOT ALLOWED, AS CONFUSING THE COMPILER
class Multiple_Inheritance implements A,B
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    public static void main(String []args)
    {
        Multiple m =new Multiple();
        m.show();
    }
}
