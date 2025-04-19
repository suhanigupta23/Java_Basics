
class NestedCatch {
    public static void main(String[] args) {
        try{ 
            System.out.println(10/0);     //moves to catch block
        }
        catch(Exception e)
        {
            // System.out.println(e);        //if this written this will tell the exception type
            
            //no artihmetic exception displayed for the above try block as it will give the 
            try{
                String a= null;
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n)
            {
                System.out.println("Null value can't be converted");
            }
        }
        System.out.println("ye main method ka hei, chalega");
    }
}
