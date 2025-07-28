/*Student Grade Management System*/
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int fail =0;
		int avg = 0;
		for(int i = 1;i<=6;i++) {
			System.out.print("enter subject" + i +" marks: ");
			int m = sc.nextInt();
			if(m<0 || m>100){
				System.out.println("invalid marks.!! enter correct marks");
				i--;
			}
			if(m<35) {
				fail++;
			}
			total +=m;
		}
			if(fail==0) {
				System.out.println("total marks:"+ total);
				System.out.println("AVG marks: " + (avg=total/6));
			if(avg>=85) {
				System.out.println("A grade");
				}
			else if(avg>=75) {
				System.out.println("B grade");
				}
			else if(avg>=65) {
				System.out.println("C grade");
				}
			else if(avg>=55) {
				System.out.println("D grade");
				}
			else{
				System.out.println("Pass");
				}
	}
	else {
				System.out.println("sorry!! You are Failed in "+ fail+" subject");
		}
}
}