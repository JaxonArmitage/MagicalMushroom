package Game;

public class Wood extends Item{
	private boolean usedWood;
	
	public Wood() {
		super("wood");
		usedWood = false;
	}

	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("AbadondonedVillage")) {
			if (usedWood) {
				Game.print("You already rebuilt the ladder with the wood!");
			} else {
				Game.getCurrentRoom().getExit(4).setLock(false);
				usedWood = true;
				Game.print("You use the wood to fix the broken ladder! You can now head up to the treehouse!");
			}
		} else
			Game.print("You don't see any way to use the wood here.");
	}
}
