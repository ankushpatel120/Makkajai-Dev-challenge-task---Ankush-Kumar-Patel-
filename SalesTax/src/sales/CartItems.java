package sales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import CallCalculate.CalculateTotalPriceAndTax;

public class CartItems {
	
public static void main(String args[]) throws IOException {
		
		List<String> cart = new ArrayList<String>();
		
		CalculateTotalPriceAndTax cartVal= new CalculateTotalPriceAndTax();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String items = br.readLine();
		while (!items.isEmpty()) {
			cart.add(items);
			items = br.readLine();
		}
		cartVal.calculateValues(cart);
		
	}
}
//1 imported box of chocolates at 10.00 n
//1 imported bottle of perfume at 47.50 y
