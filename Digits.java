public class Digits {
    public static void main(String[] args){
    int num;
    num = 526;
    int hundred;
    int ten;
    int one;
    one = (num % 1);
    ten = (num % 10);
    hundred = (num % 100);
    System.out.println("The hundreds-place digit is:" + hundred);
    System.out.println("The tens-place digit is:" + ten);
    System.out.println("The ones-place digit is:" + one);
    }
}