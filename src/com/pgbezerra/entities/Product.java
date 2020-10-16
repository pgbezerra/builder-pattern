package com.pgbezerra.entities;

public class Product {
	
	private Integer id;
	private String name;
	private Double value;
	private String category;
	
	private Product(Builder builder) {
		this.id  = builder.id;
		this.name = builder.name;
		this.value = builder.value;
		this.category = builder.category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", value=" + value + ", category=" + category + "]";
	}


	public static class Builder {
		
		private Integer id;
		private String name;
		private Double value;
		private String category;
		
		public Builder() {
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder id(Integer id) {
			this.id = id;
			return this;
		}
		
		public Builder value(Double value) {
			this.value = value;
			return this;
		}
		
		public Builder category(String category) {
			this.category = category;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
}
