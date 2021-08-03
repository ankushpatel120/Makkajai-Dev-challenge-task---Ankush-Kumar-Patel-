package sales;

import java.util.List;

import saleVar.Items;

public class PrintBill {

	public void showFinalBill(List cart, List finalPrice) {

		double salesTax = 0;
		double totalPrice = 0;
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

			salesTax = salesTax + salesTax(itemVal);

			showBill(itemVal, ar);
		}

		System.out.println(" Sales Taxes: " + Math.round(salesTax * 20.0) / 20.0);
		System.out.println(" Total: " + Math.round(totalPrice * 20.0) / 20.0);
	}

	private double salesTax(Items items) {
		double value = items.getFinalPrice() - items.getItemsPrice();
		return value;
	}

	private void showBill(Items item, String ar[]) {
		String bill = "";
		for (int j = 0; j < ar.length - 3; j++) {
			bill = bill + " " + ar[j];
		}
		bill = bill + ":" + item.getFinalPrice();
		System.out.println(bill);
	}

}
