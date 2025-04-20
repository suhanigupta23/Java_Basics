class Throws{
    public static void main(String []args) // throws InterruptedException    //used when, we do not want to handle the exception and automatically handle the exception
    {
        // FIRST WAY 
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(i);
        //     Thread.sleep(1000);   //sleep 1s and execute after it and loops
            
        // }
        
        //SECOND WAY: TRY CATCH  
        for(int i=1;i<=10;i++){
            
            try {   
             System.out.println(i);
             Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
        
        
    }
}
