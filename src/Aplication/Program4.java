package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee salario = new Employee();

		System.out.print("Name: ");
		salario.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		salario.tax = sc.nextDouble();

		System.out.println("Employee: " + salario);

		System.out.print("Which percentage to increase salary? ");
		salario.increaseSalary(sc.nextDouble());

		System.out.println("Updated data: " + salario);

		sc.close();

	}

}
