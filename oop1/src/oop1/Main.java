package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oran�";
		Product product1 = new Product();
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jpg");
		
		
		Product [] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05551112233");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("Fatih");
		individualCustomer.setLastName("Sevim");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("hfscoding");
		corporateCustomer.setPhone("05551112233");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		;
	}

}
