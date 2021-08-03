package sales;

import java.util.ArrayList;
import java.util.List;

public class CalculateValue {

	public List category(List items) {
		String val = "";
		List priceList = new ArrayList();
		for (int i = 0; i < items.size(); i++) {
			val = (String) items.get(i);
			String ar[] = val.split(" ");
			char allGoodsExcept = val.charAt(val.length() - 1);
			double price = Double.parseDouble(ar[ar.length - 2]);
			double finalPrice = calculatePrice(ar, price, allGoodsExcept);
			priceList.add(finalPrice);
		}
		return priceList;
	}

	public double calculatePrice(String ar[], double price, char allGoodsExcept) {
		if (ar[1].equalsIgnoreCase("imported") && allGoodsExcept == 'y') {
			price = price + (price * 0.15);
		} else if (ar[1].equalsIgnoreCase("imported") && allGoodsExcept == 'n') {
			price = price + (price * 0.05);
		} else if (!ar[1].equalsIgnoreCase("imported") && allGoodsExcept == 'y') {
			price = price + (price * 0.1);
		}
		double rounded = Math.round(price * 20.0) / 20.0;
		return rounded;

	}

}
