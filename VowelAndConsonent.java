import java.util.Scanner;

public class VowelAndConsonent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your alphabet");
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'a', 'A':
            case 'e', 'E':
            case 'i', 'I':
            case 'o', 'O':
            case 'u', 'U':
                System.out.println("This  is vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
                    System.out.println("This is a consonant");
                } else {
                    System.out.println("please enter alphabet");
                }
	}
		sc.close();
    }
}
