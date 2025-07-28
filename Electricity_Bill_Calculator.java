import java.util.Scanner;
class Electricity_Bill_Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of Electricity Units Consumed : ");
		int u = sc.nextInt();
		System.out.println("Select Type Of Connection. \n1.Residential  \n2.Commercial");
		int t = sc.nextInt();
		int bill = 0;
		if(t==1) {
			if (u <= 100) {
				bill = u *3;
				System.out.println("The Generated Bill For Residential is: " + bill);
			}
			else if (u<=200) {
				bill = (100*3)+((u-100)*5);
				System.out.println("The Generated Bill For Residential is: " + bill);

			}
			else if(u<=300) {
				bill = (100*3)+(100*5)+((u-200)*7);
				System.out.println("The Generated Bill For Residential is: " + bill);
				
			}
			else {
				bill = (100*3)+(100*5)+(100*7)+((u-300)*10);
				System.out.println("The Generated Bill For Residential is: " + bill);

			}
		}
		else if (t==2) {
			if (u <= 100) {
				bill = u *5;
				System.out.println("The Generated Bill For Residential is: " + bill);
			}
			else if (u<=200) {
				bill = (100*5)+((u-100)*7);
				System.out.println("The Generated Bill For Residential is: " + bill);

			}
			else if(u<=300) {
				bill = (100*5)+(100*7)+((u-200)*10);
				System.out.println("The Generated Bill For Residential is: " + bill);
				
			}
			else {
				bill = (100*5)+(100*7)+(100*10)+((u-300)*15);
				System.out.println("The Generated Bill For Residential is: " + bill);

			}
		}
		else {
			System.out.println("Invalid Type..");
		}
	}
}