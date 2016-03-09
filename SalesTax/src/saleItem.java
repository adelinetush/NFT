public class saleItem {
	
	public double price;
	public int quantity;
	public String item_name;
	public String type;
	public double taxValue;
	public double total;
	
	public saleItem(double price, int quantity, String name) {
		this.price = price;
		this.quantity = quantity;
		this.item_name = name;
		taxValue= 0;
		total = price;
		type = "";

	}

	public void TaxItem(){
		if(item_name.contains("imported")){
			taxValue = taxValue + this.price*0.05;
		}
		if(type.equals("Food")||type.equals("Book")||type.equals("Medical Product")){

		}else{
			taxValue += this.price*0.1;
		}
		total += taxValue;
	}

}