package week2.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int x= 0;
int y= 1;
int total= 0;

System.out.println(x +"\n"+ x); 
for (int i= 3; i<=10; i++) {
	int a1= x+y;
	x= y;
y = total;
	System.out.println(total);
	
}
	}

}
