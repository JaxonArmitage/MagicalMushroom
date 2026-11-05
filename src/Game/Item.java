package Game;

import java.io.Serializable;

public class Item implements Serializable {
	
	private String name;
	private String weight;
	
	public Item(String n) {
		name = n;
		weight = "l";
	}
	
	public void setWeight(String x) {
		weight = x;
	}
	
	public String getItem() {
		return name;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setItem(String n)  {
		name = n;
	}
	
	public String toString() {
		String s = name;
		return s;
	}
	
	public void use() {
		Game.print("You can not use this item!");
	}
	
	public void open() {
		Game.print("You can not open this item!");
	}
	
	public void close() {
		Game.print("You can not close this item!");
	}
	
	public void read() {
		Game.print("You can not read this item!");
	}
}