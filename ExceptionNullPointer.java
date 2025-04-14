//NULL POINTER EXCEPTION
class ExceptionNullPointer {
    public static void main(String[] args) {
        
        String str= null;
        
        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(NuLLPointerException n)
        {
            System.out.println("null can't be casted");
        }
    }
}
