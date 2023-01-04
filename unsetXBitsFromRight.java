import java.util.*;

public class unsetXBitsFromRight {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter a number: ");
        long A = sc.nextLong();
        System.out.println();
        System.out.println("Enter the length to unset bits: ");
        int B = sc.nextInt();
        for (int i=0; i<B; i++) {
            if (checkBit(A, i) == true) {
                A = A & ~ (1 << i);
            }
        }
        System.out.println();
        System.out.println("Updated number becomes: " + A);
        System.out.println();
        sc.close();
    }
    public static boolean checkBit (long A, int B) {
        if ((A & (1 << B)) == 0){
            return false;
        }
        else return true;
    }
}