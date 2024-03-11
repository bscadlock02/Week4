import java.util.*;
public class GradeAve {
    public static void main (String[] args){
    
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    int average;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your 1st Grade");
    grade1 = input.nextInt();
    System.out.println("Enter Your 2nd Grade");
    grade2 = input.nextInt();
    System.out.println("Enter Your 3rd Grade");
    grade3 = input.nextInt();
    System.out.println("Enter Your 4th Grade");
    grade4 = input.nextInt();
    System.out.println("Enter Your 5th Grade");
    grade5 = input.nextInt();
    average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
    System.out.println("Your Grade Averge is " + average);

}
}