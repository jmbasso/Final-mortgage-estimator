package mortgage_estimator;
import java.util.Scanner;
public class Mortgage_estimator {

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Total Gross Income: ");
  double total_gross_income = input.nextDouble(); 
  System.out.println("Enter Total Monthly Debt : ");
  Double Total_monthly_debt = input.nextDouble();
  System.out.println("Enter Mortage interest Rate  : ");
  Double Morgage_interest_Rate = input.nextDouble();
  System.out.println("Enter the term 10 years, or 15 years , or 30 years  : ");
  int term = input.nextInt();
  if (term==10||term==15||term==30)
	  term=term;
  else{
  while (term!=10|| term!=15||term!=30){
	  System.out.println(" You enter the Wrong Term Number  : ");
	  System.out.println(" Please Enter the term must be  10 years, or 15 years , or 30 years  : ");
	   term = input.nextInt();  
	   if (term==10||term==15||term==30)
		   break;
  }
  }
  System.out.println("Enter the Down Payment  : ");
  Double Down_payment = input.nextDouble();
 
double housing_payment=(total_gross_income/12)*0.18;// 18 % of the Gross income
double housing_and_other=((total_gross_income/12)*0.36)-Total_monthly_debt;//36 % of the Gross Income
double Max_payment_allowed;
if (housing_payment<housing_and_other)
	Max_payment_allowed=housing_payment;
else
	Max_payment_allowed=housing_and_other;	
	double c=(Morgage_interest_Rate/12)/100;// monthly interest rate
	double n=term*12;// Number of payment
	double montant_afford= (Max_payment_allowed*((Math.pow((1+c),n)-1))/(c*(Math.pow((1+c),n))));
	System.out.println(" housing payment (18 % of the gross income):$ " + housing_payment);
	System.out.println(" housing payment + other obligations (36 % of the gross income):$ " + housing_and_other);
	System.out.println(" Maximun payment allowed :$ " + Max_payment_allowed);
	System.out.println(" Amount of Mortgage that can be financed :$ " +Math.round ((montant_afford)*100.0)/100.0);
}
}

