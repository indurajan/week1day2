package week1.day2;

public class Fibbinocci {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int sum=0;
	int count;
	System.out.println(n1);
	for (int i = 1; i<=10; i++) {
		sum=n1+n2;
		System.out.println(sum);
		n1=n2;
		n2=sum;
	}
}
}
