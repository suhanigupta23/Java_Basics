// EXTENDING INTERFACE : INHERITANCE IN INTERFACE 
interface Gill
{
    void add();
}
interface Ekasu extends Gill
{
    void sub();
}
class S implements Ekasu
{
    @Override
    public void add()
    {
        int a=10, b=20, c;
        c = a + b;
        System.out.println("Addition: "+c);
    }
    @Override
    public void sub()
    {
        int a= 20, b=10,c;
        c=a-b;
        System.out.println("Subtarction "+c);
    }
}
class Extending_Interface
{
   public static void main(String[] args)
   {
        Ekasu r= new S();
        r.add(); r.sub();
   }
}
