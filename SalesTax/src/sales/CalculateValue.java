package sales;

import java.util.ArrayList;
import java.util.List;

import saleVar.Items;

public class CalculateValue {

	public List category(List items) {
		String val = "";
		List priceList = new ArrayList();
		for (int i = 0; i < items.size(); i++) {
			//For Each Individual Items
			Items itemsVal= new Items();
			
			val = (String) items.get(i);
			String ar[] = val.split(" ");
			char allGoodsExcept = val.charAt(val.length() - 1);
			double price = Double.parseDouble(ar[ar.length - 2]);
			
			//Setting The Values
			itemsVal.setEssentialOrNonEssentialGood(allGoodsExcept);
			itemsVal.setItemsPrice(price);
			itemsVal.setImportedOrNotImported(ar[1]);
			
			double finalPrice = calculatePrice(itemsVal);
			priceList.add(finalPrice);
		}
		return priceList;
	}

	public double calculatePrice(Items itemsVal) {
		if (itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported") && itemsVal.getEssentialOrNonEssentialGood() == 'y') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice()+(itemsVal.getItemsPrice()*0.15));
		} else if (itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported") && itemsVal.getEssentialOrNonEssentialGood() == 'n') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice()+(itemsVal.getItemsPrice()*0.05));	//price = price + (price * 0.05);
		} else if (!itemsVal.getImportedOrNotImported().equalsIgnoreCase("imported") && itemsVal.getEssentialOrNonEssentialGood() == 'y') {
			itemsVal.setItemsPrice(itemsVal.getItemsPrice()+(itemsVal.getItemsPrice()*0.1)); //price = price + (price * 0.1);
		}
		double rounded = Math.round(itemsVal.getItemsPrice() * 20.0) / 20.0;
		return rounded;

	}

}
