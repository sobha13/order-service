package com.uttara.aws.cicd.example;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {
 
	public Order(int i, String string, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	private int id;
    private String name;
    private int quantity;
    private long price;
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getQuantity() { return quantity; } public void
	 * setQuantity(int quantity) { this.quantity = quantity; } public long
	 * getPrice() { return price; } public void setPrice(long price) { this.price =
	 * price; }
	 */

}
