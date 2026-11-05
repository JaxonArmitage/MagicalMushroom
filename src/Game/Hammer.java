package Game;

public class Hammer extends Item{
	private boolean usedHammer;
	
	public Hammer() {
		super("hammer");
		usedHammer = false;
	}

	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("Pond")) {
			if (usedHammer) {
				Game.print("You already used the hammer to break the wooden chair!");
			} else {
				Game.print("You use the hammer on the chair and break it up into nice wood pieces!");
				Game.getCurrentRoom().addItem(new Item("wood"));
				Game.getCurrentRoom().removeItem("chair");
				usedHammer = true;
			}
		} else
			Game.print("You don't see any way to use the tool here.");
	}
}