package week1.day2;

public class IsPrime {
public static void main(String[] args) {
//define limit
int n;
//Iterate through all numbers
for (int i=1;i<=20;i++) {
	n=0;
	for (int j=2; j <=i/2; j++) {
		
	
		if (i%j==0) {
			n++;
}
	}
		if (n==0)
			System.out.println(i + " This is a prime number");
		else
			System.out.println(i + " This is not a prime number");
		
		}

}
}


