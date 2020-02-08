package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program2 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		System.out.println("Product data: " + produto.toString());
		
		System.out.print("Enter the number of products to be added in stock: ");
	
		produto.AddProducts(sc.nextInt());
		
		System.out.println("Updated data: " + produto.toString());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		
		produto.RemoveProducts(sc.nextInt());
		
		System.out.println("Updated data: " + produto.toString());
		
		
		sc.close();
		
	}
}
