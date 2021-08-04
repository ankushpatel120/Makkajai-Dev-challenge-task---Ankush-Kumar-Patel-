package saleVar;

public class Items {

	private double itemsPrice;
	private char essentialOrNonEssentialGood;
	private String importedOrNotImported;
	private double finalPrice;

	public double getItemsPrice() {
		return itemsPrice;
	}

	public void setItemsPrice(double itemsPrice) {
		this.itemsPrice = itemsPrice;
	}

	public char getEssentialOrNonEssentialGood() {
		return essentialOrNonEssentialGood;
	}

	public void setEssentialOrNonEssentialGood(char essentialOrNonEssentialGood) {
		this.essentialOrNonEssentialGood = essentialOrNonEssentialGood;
	}

	public String getImportedOrNotImported() {
		return importedOrNotImported;
	}

	public void setImportedOrNotImported(String importedOrNotImported) {
		this.importedOrNotImported = importedOrNotImported;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Items [itemsPrice=");
		builder.append(itemsPrice);
		builder.append(", essentialOrNonEssentialGood=");
		builder.append(essentialOrNonEssentialGood);
		builder.append(", importedOrNotImported=");
		builder.append(importedOrNotImported);
		builder.append(", finalPrice=");
		builder.append(finalPrice);
		builder.append("]");
		return builder.toString();
	}

}
