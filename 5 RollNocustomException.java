import java.util.regex.*;
import java.util.Scanner;

class rollNoException extends Exception{
    
    // private static final long serialVersionUID = 1L;

    rollNoException(String s) {
        super(s);
    }
}

public class RollNocustomException {

    static void check(String roll) throws rollNoException{
       

       
        if(Pattern.matches("^90/MCA/1800(0?[1-9]|1[0-9]|2[0-5])$", roll)){
            System.out.println("\n ** Roll No accepted");
        } else {
            throw new rollNoException("\n Entered Roll No is not valid");            
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String roll;
            System.out.println("\n Enter Roll no according to the given pattern 90/MCA/1800** :");
            roll = sc.nextLine();
    
            check(roll);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception is here : "+e);
        }
    }
}