package program;

import java.util.Scanner;

import entities.Account;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Id there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter an initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			
		}
		else {
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc .nextDouble();
		account.deposit(depositValue);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdrow value: ");
		double withdrowValue = sc .nextDouble();
		account.withdraw(withdrowValue);
		System.out.println(account);
		
		
		sc.close();
		
		System.out.println("Finalizado");

	}

}
