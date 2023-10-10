import java.util.Scanner;
class ComplexNumbers {
	int real, imaginery;
	ComplexNumbers(){
		this.real =0;
		this.imaginery = 0;
	}
	
	// Write your code here
	ComplexNumbers(int real, int imaginery){
		this.real = real;
		this.imaginery = imaginery;
	}

	 void plus(ComplexNumbers c2){
		this.real = this.real + c2.real;
		this.imaginery = this.imaginery + c2.imaginery;
	}
	 void multiply(ComplexNumbers c2){
		int re = (this.real * c2.real) - (this.imaginery * c2.imaginery);
		int im = (this.real* c2.imaginery) + (this.imaginery * c2.real);
		this.real = re;
		this.imaginery = im;
	}
	 void print(){
		System.out.println(this.real + " + i"+this.imaginery);
	}
}

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int real1 = sc.nextInt();
		int imaginery1 = sc.nextInt();
		ComplexNumbers cn1 = new ComplexNumbers(real1, imaginery1);
		int real2 = sc.nextInt();
		int imaginery2 = sc.nextInt();
		ComplexNumbers cn2 = new ComplexNumbers(real2, imaginery2);
	    int operation = sc.nextInt();
		switch(operation){
			case 1:
				cn1.plus(cn2);
				cn1.print();
				break;
			case 2:
				cn1.multiply(cn2);
				cn1.print();
				break;
		}
	}
}
		