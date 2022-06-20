import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest=0;
        sc.close();
        if (a > b && a > c){
		largest = a;
	}
	else if (b > a && b > c){
            largest = b;
	}
        else {
            largest = c;
	}
	System.out.println("Largest Among the three is : " + largest);
    }
}
