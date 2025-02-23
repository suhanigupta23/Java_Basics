//MULTIPLE INHERITANCE 
interface A 
{
    void show();
}
interface B
{
    void show();
}

class Multiple extends A,B
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    
    public static void main(String [] args)
    {
        Multiple m = new Multiple;
        m.Show(); m.Disp();
    }
}
