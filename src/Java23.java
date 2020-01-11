public class Java23 {
    public static void main(String[] args) {
        try
        {
            int num = Integer.parseInt(args[0]);
            System.out.println("You entered:\t" + num);
        }
        catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println("Integer argument required");
        }
        catch(NumberFormatException e )
        {
            System.out.println("Argument is wrong format");
        }
        finally {
            System.out.println("Program Ends");
        }
    }
}
