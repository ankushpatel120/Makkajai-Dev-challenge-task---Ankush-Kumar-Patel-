package utilMethods;

import saleVar.Items;

public class NecessaryMethods {

	public double calculatePrice(Items itemsVal) {
		if (itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported")
				&& itemsVal.getEssentialOrNonEssentialGood() == 'y') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice() + (itemsVal.getItemsPrice() * 0.15));
		} else if (itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported")
				&& itemsVal.getEssentialOrNonEssentialGood() == 'n') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice() + (itemsVal.getItemsPrice() * 0.05)); // price = price +
																									// (price * 0.05);
		} else if (!itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported")
				&& itemsVal.getEssentialOrNonEssentialGood() == 'y') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice() + (itemsVal.getItemsPrice() * 0.1)); // price = price +
																									// (price * 0.1);
		}
		double rounded = Math.round(itemsVal.getItemsPrice() * 20.0) / 20.0;
		return rounded;

	}

	public double salesTax(Items items) {
		double value = items.getFinalPrice() - items.getItemsPrice();
		return value;
	}

	public void showBill(Items item, String ar[]) {
		String bill = "";
		for (int j = 0; j < ar.length - 3; j++) {
			bill = bill + " " + ar[j];
		}
		bill = bill + ":" + item.getFinalPrice();
		System.out.println(bill);
	}

}
