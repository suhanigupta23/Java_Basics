                        /*MULTIPLE TRY CATCH*/
class Handling
{
    public static void main(String args[])
    {
        try
        {
            int a=10, b=0;
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Arithmetic exception ,can't divide by zero");
        }
        try 
        {
            int a[]= {10,20,30,40};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Beyond the array limit");
        }
    }
}
