public class HarmonicNumber {
public static double harmonic;
    public static void main(String args[]) {
	int N=10;
        System.out.println("Enter Nth value Of Harmonic Number");
        if (N > 0) {
            for (int count = 1; count <= N; count++) {
		harmonic += 1/count;
                System.out.print(1 + "/" + count + " " + "+" + " ");
            }
        } 
 	else {
            System.out.println("Invalid Input ");
        }
    }
    }
