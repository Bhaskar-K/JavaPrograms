import java.util.Scanner;


public class trailingZeroInFactorial {
public static void main(String args[]){
	System.out.println("enter a number");
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	long fact=1;
	int count=0;
	while(n>0){
		fact=fact*n;
		n--;
	}
	String s= Long.toString(fact);
	for(int i=s.length()-1;i>=0;i--){
		if(s.charAt(i)=='0'){
			count++;
		}
		else break;
	}
	System.out.println(count);
}
}
