import java.util.Scanner;
public class CoinFlip {
public static void main(String args[]) {
int a;
int count;
int headCount=0;
int tailCount=0;
double b;
double c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of times coin flip");
a = sc.nextInt();
sc.close();
for(count=0;count<a;++count) {
double n = Math.floor(Math.random()*10)%2;
if(n<0.5){
System.out.println("It is Head.");
headCount++;
}
else {
System.out.println("It is Tail.");
tailCount++;
}
}
b = (headCount*100)/a;
c = (tailCount*100)/a;
System.out.println("Head Count :" + headCount );
System.out.println("Tail Count :" +tailCount );
System.out.println("Head Count Percentage : " + b );
System.out.println("tailCountPercentage : " + c );
}
}
