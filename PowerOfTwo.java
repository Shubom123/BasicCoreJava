import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String args[]) {
        int N, powerOfTwo, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power Value Between 0 to 31: ");
        N = sc.nextInt();
        sc.close();
	if (N < 31) {
        for (i = 1; i <= N; i++) {
            powerOfTwo = (int) Math.pow(2, i);
            System.out.println(powerOfTwo + " ");
	}
	}
	else{
	    System.out.println("Invalid Number");
	}
    }
}