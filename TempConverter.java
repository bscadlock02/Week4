import java.util.*;
public class TempConverter 
{  
    public static void main (String[] args){
    int TempF;
    int TempC;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Tempurture*F:");
    TempF = input.nextInt();

    TempC = (TempF - 32)/(9/5);
    System.out.println("The Tempurture*C Is: " + TempC);
}
}