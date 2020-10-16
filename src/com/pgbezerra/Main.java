package com.pgbezerra;

import com.pgbezerra.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product.Builder().name("Product A").category("Movie").value(450.0).id(1).build();
		
		System.out.println(product.toString());

	}

}
