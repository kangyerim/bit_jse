package com.jse.swing;

public class ItemService {
	private ItemBean[] items;
	private int count;
	
	public ItemService() {
		items = new ItemBean[3];
		count = 0;
	}
	
	public void setItems(ItemBean[] items) {
		this.items = items;
	}
	public ItemBean[] getItems() {
		return items;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	
	public void add(ItemBean item) {
		items[count] = item;
		count++;
	}
}
