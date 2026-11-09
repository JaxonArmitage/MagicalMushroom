package Game;

public class Birdsnest extends Item {
	private boolean usedBirdnest;

	public Birdsnest() {
		super("birdsnest");
		usedBirdnest = false;
	}

	@Override
	public void use() {
		if (usedBirdnest == true) {
			Game.print("You already pressed the button on the birdnest and found the key!");
		} else {
			int i = 0;
			while (i < Game.inventory.size()) {
				if ("birdnest".equals(Game.inventory.get(i).getItem())) {
					usedBirdnest = true;
					Game.inventory.add(new Item("magicalKey"));
					Game.print("You press the button on the birdnest and it exploded and left a floating magical key! You catch the key and put it in your pocket!");
					i++;
				} else {
					i++;
				}
			}
		}
	}
}