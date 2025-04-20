//TRY CATCH BLOCK DIFFERENCE BETWEEN THROWS

class try_catch_and_throws {
    public static void Wait() throws InterruptedException{
        for (int i=1 ;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) // throws InterruptedException 
    {
        try{
            Wait();
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
        // Wait(); //BAHAR BHI LIKH SAKTE HEI ..TRY CATCH BLOCK KE ANDAR LE JAYENGE AGAR KUCH AUR BHI HANDLE KARNA HO TO 
        System.out.println("Sign of normal termination");
    }
    
}

 
