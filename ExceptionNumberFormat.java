//NUMBER FORMAT EXCEPTION
//Shows exception when string can be converted to number , but not all string so then give error.
class ExceptionNumberFormat{
    public static void main(String[] args) {
        
        String str= "ekasu"; //catch block works 
        String str= "123";   //works for this  
        try
        {
            int a= Integer.parseInt(str);     //skipped part
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("String "+str+ " can't be converted to Integer");
        }
    }
}
