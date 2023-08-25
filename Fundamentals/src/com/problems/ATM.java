package com.problems;

import java.util.Scanner;

public class ATM {
	static int secretPin = 4521;
	static int amount = 500;
    static int bal = amount;
	
    public static void withdraw(Scanner sc) {
       System.out.println("Enter the amount to be withdrawn");
       int withdrawAmount = sc.nextInt();
       //int currentBal = balEnquiry();
       if((balEnquiry()-500)<withdrawAmount){
    	   System.out.println("Insufficient balance");
       }else{
    	   bal = balEnquiry() - withdrawAmount;
    	   System.out.println("Amount deducted");
       }
    }
	

	public static void deposit(Scanner sc) {
       System.out.println("Enter the amount to deposit");
       int depositAmount = sc.nextInt();
       if(depositAmount>100){
          bal = bal+depositAmount;
       System.out.println("Amount deposited successfully");
       }else{
    	   System.out.println("Minimum deposit should be more than 100");
       }
	}

	public static int balEnquiry() {
        return bal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC Bank ATM");
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
	    char input;
		if (pin == ATM.secretPin) {
			do{
				System.out.println("Select operation:(enter number)");
				System.out.println("1.withdraw  2.deposit 3.balEquiry");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					withdraw(sc);
					break;

				case 2:
					deposit(sc);
					break;

				case 3:
					int bal = balEnquiry();
					System.out.println("Current bal :"+bal);
					break;
				default:
					System.out.println("Invalid option");
				}
				System.out.println("Do you want to continue?");
				input = sc.next().charAt(0);
			}while(input=='y');
			
		}
		System.out.println("Thanks for using ABC Bank ATM");
	}

}
