import java.math.BigDecimal;
import java.util.Vector;

public class MyOtherCode {
	public class TotalItems {
		int quantity = 0;
		String name = null;
		BigDecimal price = new BigDecimal(20.0);
		boolean imported = false;
		boolean taxable = false;
		
		BigDecimal sellingTax = new BigDecimal(0.1);
		BigDecimal importTax = new BigDecimal(0.05);
		
		public String toString() {
			return quantity + "" + name + ":" + price ;
			
		}
		
		public void calculateTax() {
			
			BigDecimal salesTax = null;
			
			BigDecimal total = null;
			
			BigDecimal finalImportTax = null;
			
			salesTax = price.multiply(sellingTax);
			
			finalImportTax = price.multiply(importTax);
			
			if (taxable = true) {
				//salesTax = salesTax + price.doubleValue();
				
				price = price.add(salesTax);
			}

			
			if (imported = true ) {
				
				price = price.add(finalImportTax).add(salesTax);
				
			}
			
			total = price;
			
			
			
			//System.out.println(price.toString());
			
			
			
			
		}
		public Vector<TotalItems> getItems() {
			return null;
		
		}
		
	}

}
