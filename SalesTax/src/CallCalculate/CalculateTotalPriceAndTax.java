package CallCalculate;

import java.util.ArrayList;
import java.util.List;

import calculateSales.CalculateValue;

public class CalculateTotalPriceAndTax extends CalculateValue{
	
	public void calculateValues(List<String> cart) {
		List<Double> finalPrice=new ArrayList<Double>();
		 try {
			
			finalPrice = category(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			showFinalBill(cart, finalPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
