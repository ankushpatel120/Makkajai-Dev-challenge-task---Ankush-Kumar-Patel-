package sales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CartItems {
	public static void main(String args[]) throws IOException {		
	    List cart = new ArrayList();
	    List finalPrice = new ArrayList();
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    String items = br.readLine();
	    while (!items.isEmpty()) {
	        cart.add(items);
	        items=br.readLine();
	    }
	   
	  	try {
	  		CalculateValue calculateValue = new CalculateValue();
			finalPrice= calculateValue.category(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    try {
	    	PrintBill printBill = new PrintBill();
			printBill.showFinalBill(cart,finalPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
}


