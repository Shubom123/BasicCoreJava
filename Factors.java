import java.util.Scanner;

public class Factors {
    public static void main(String args[]) {
    int n, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    n =sc.nextInt();
    for(i = 2; i<n; i++)
    {
        while (n % i == 0) {
            System.out.println(i);
            n = n / i;
        }
    }
      if(n>2)
      {
        System.out.println(n);
      }
}
}
