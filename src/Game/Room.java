package Game;

import java.io.Serializable;
import java.util.HashMap;

public class Room implements Serializable {

	private String name;
	public static HashMap<String, Item> items;
	private Room room[];
	private Boolean lock;
	private static HashMap<String, Room> rooms;
	private NPC npc;

	// Constructor Method
	public Room(String n) {
		name = n;
		items = new HashMap<>();
		room = new Room[6];
		rooms = new HashMap<>();
		rooms.put(name, this);
		lock = false;
		npc = null;
	}

	public String getName() {
		return name;
	}

	public String getDescription(String name) {
		return Game.descriptions.get(name);
	}

	public static HashMap<String, Room> getRooms() {
		return rooms;
	}

	public boolean getLock() {
		return lock;
	}

	public void setLock(Boolean x) {
		lock = x;
	}

	public void setName(String n) {
		name = n;
	}

	public static void setRooms(HashMap<String, Room> r) {
		rooms = r;
	}

	// Special Method
	public String toString() {
		String s = name;
		s += "\n\t" + Game.descriptions.get(name);
		return s;
	}

	public void addExit(Room x, int a) {
		room[a] = x;
	}

	public Room getExit(int a) {
		return room[a];
	}

	public void addItem(Item x) {
		items.put(x.getItem(), x);
	}

	public void removeItem(String n) {
		items.remove(n);
	}

	public Item getItem(String n) {
		return items.get(n);
	}

	public void addNPC(NPC x) {
		npc = x;
	}

	public void removeNPC(String n) {
		npc = null;
	}

	public NPC getNpc() {
		return npc;
	}

	public void setNpc(NPC npc) {
		this.npc = npc;
	}

}
