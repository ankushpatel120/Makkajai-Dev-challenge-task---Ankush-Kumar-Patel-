package sales;

import java.util.List;

public class PrintBill {
	
	public void showFinalBill(List cart,List finalPrice) {
		
		double salesTax=0;
		double totalPrice=0;
		for(int i = 0;i<cart.size();i++) {
			String val=(String) cart.get(i);
			
			double itemPrice=(double) finalPrice.get(i);
			totalPrice=totalPrice+itemPrice;
			String[] ar= val.split(" ");
			double initialPrice=Double.parseDouble(ar[ar.length-2]);
			
			salesTax=salesTax+salesTax(itemPrice,initialPrice);
			
			String bill="";
			for(int j=0;j<ar.length-3;j++) {
				bill = bill+" "+ar[j];
			}
			bill=bill+":"+itemPrice;
			System.out.println(bill);
		}
		
		System.out.println(" Sales Taxes: "+ Math.round(salesTax * 20.0) / 20.0);
		System.out.println(" Total: "+ Math.round(totalPrice * 20.0) / 20.0);
	}
	
	public double salesTax(double finalPrice,double initialPrice) {
		double value=finalPrice-initialPrice;
		return value;
	}

}
