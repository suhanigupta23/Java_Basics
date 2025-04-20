class NestedFinally {
    public static void main(String []args)
    {
        try {
            String a = "Mizaki";
            System.out.println(a.upperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
           try
           {
               System.out.println(10/0);
           }
           catch(ArithmeicException a)
           {
               System.out.println(a);
           }
           finally{
               System.out.println("Hi");
           }
        }
        System.out.println("main method mei hei abhi firse");
    }
}
