package Game;

import javax.swing.JOptionPane;

public class NPC {
	private String name;

	public NPC(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say(String d) {
		Game.print(name.toUpperCase());
		Game.print(d);
	}
	
	public void talk() {
		Game.print("You can't talk to Bobo!");
	}
	
	public int getResponse(String[] d) {
		int num = 0;
		for (int x = 0; x < d.length; x++) {
			int option = x+1;
			Game.print(option + ") " + d[x]);
		}
		String input = JOptionPane.showInputDialog(null, "Choose an option:");
		num = Integer.parseInt(input);
		return num;
	}
	
	
}
