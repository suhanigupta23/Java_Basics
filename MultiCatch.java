                        /*MULTI CATCH*/
class MultiCatch{
    public static void main(String []args)
    {
        try{
            int a=10, b=0, c;
            c=a/b;
            System.out.println(c);
            
            int arr[]= {10,20,30,40};
            System.out.println(a[4]);
            
            // String str= "Mizaki";
            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic exception");            
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Array exception");    
        }
        catch(NumberFormatException n){
            System.out.println("Number exception");    
        }
        catch(Exception x){
            System.out.println("All exception handled");    
        }
        
        //For Sub classes 
        // Exception x= new NullPointerException();
    }
}
