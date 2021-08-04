package calculateSales;

import java.util.ArrayList;
import java.util.List;

import saleVar.Items;
import utilMethods.NecessaryMethods;

public class CalculateValue {
	public List<Double> category(List<String> items) {
		List<Double> priceList = null;
		try {
			String val = "";
			priceList = new ArrayList<Double>();
			for (int i = 0; i < items.size(); i++) {
				// For Each Individual Items
				Items itemsVal = new Items();

				val = (String) items.get(i);
				String ar[] = val.split(" ");
				char allGoodsExcept = val.charAt(val.length() - 1);
				double price = Double.parseDouble(ar[ar.length - 2]);

				// Setting The Values
				itemsVal.setEssentialOrNonEssentialGood(allGoodsExcept);
				itemsVal.setItemsPrice(price);
				itemsVal.setImportedOrNotImported(ar[1]);

				double finalPrice = 0;
				NecessaryMethods necessaryMethods = new NecessaryMethods();
				try {
					finalPrice = (necessaryMethods).calculatePrice(itemsVal);
				} catch (Exception e) {
					e.printStackTrace();
				}
				priceList.add(finalPrice);
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return priceList;
	}

	public void showFinalBill(List<String> cart, List<Double> finalPrice) {

		NecessaryMethods necessaryMethods = new NecessaryMethods();
		double salesTax = 0;
		double totalPrice = 0;
		try {
			for (int i = 0; i < cart.size(); i++) {

				Items itemVal = new Items();

				String val = (String) cart.get(i);

				double itemPrice = (double) finalPrice.get(i);
				totalPrice = totalPrice + itemPrice;
				String[] ar = val.split(" ");
				double initialPrice = Double.parseDouble(ar[ar.length - 2]);

				// Setting Values
				itemVal.setItemsPrice(initialPrice);
				itemVal.setFinalPrice(itemPrice);

				salesTax = salesTax + necessaryMethods.salesTax(itemVal);

				necessaryMethods.showBill(itemVal, ar);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println(" Sales Taxes: " + Math.round(salesTax * 20.0) / 20.0);
		System.out.println(" Total: " + Math.round(totalPrice * 20.0) / 20.0);
	}

}
