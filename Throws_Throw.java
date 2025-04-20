//THROW VS THROWS 

class Throws_Throw {
    void div(int a, int b) throws ArithmeticException();
    {
        if(b==0)
        {
            // throw new ArithmeticException("hi exception..this is created by us.");
            
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Throws_Throw t= new Throws_Throw();
        
    }
}
