package org.assignment;

import java.util.Scanner;
import java.io.*;
public class ProductTest {
	String productID ;
    String productName;
    int price;
    int quantity;

	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "ProductTest [productID=" + productID + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		ProductLoader pt=new ProductLoader();
		ProductTest pt1=new ProductTest();
		pt.loadProduct();
		System.out.println("Enter a product id to be searched");
		String choice=sc.next();
		Product p=pt.searchProduct(choice);
		if(p!=null)
		{
			pt.searchProduct(choice);
			
			System.out.println("------------------------------------------");
			System.out.println("the size of array is: "+pt.getProductList().size());
		}
			
		else {
			System.out.println("Add new product-------------------");
			System.out.println("Enter product id:");
			String prodId=sc.next();
			System.out.println("Enter product name:");
			String prodName=sc.next();
			System.out.println("Enter the price:");
			int price=sc.nextInt();
			System.out.println("Enter the quantity:");
			int quant=sc.nextInt();
			pt1.setProductID(prodId);
			pt1.setPrice(price);
			pt1.setProductName(prodName);
			pt1.setQuantity(quant);
			File file = new File("product.txt");
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			br.write("\n"+pt1.getProductID()+","+pt1.getProductName()+","+pt1.getPrice()+","+pt1.getQuantity());
			BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\abhinav.katiyar\\eclipse-workspace\\HappiestMind\\product.txt")));
			br.close();
			fr.close();
			int count=0;
	        String line;
	        while((line=bf.readLine())!=null)
	        {
	            count++;
	            
	        }
			System.out.println("------------------------------------------");
			System.out.println("the size of array is: "+count);
			
			
			
		}
		
		
	}
}
