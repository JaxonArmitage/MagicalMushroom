package Game;

public class Tacklebox extends Item {
	private boolean openTacklebox;
	private boolean keyAppear;
	private boolean hammerAppear;

	public Tacklebox() {
		super("tacklebox");
		openTacklebox = false;
	}

	@Override
	public void open() {
		if (Game.getCurrentRoom().getName().equals("Pond")) {
			if (openTacklebox == false) {
				Game.print("You open the super heavy tacklebox! It starts to float away but as it is flying it flips and drops out a hammer and a not magical key!");
				Game.getCurrentRoom().addItem(new Hammer());
				Game.getCurrentRoom().addItem(new Item("notMagicalKey"));
				openTacklebox = true;
			} else {
				Game.print("The tacklebox flew away remember!");
			}
		} else {
			Game.print("You can't open anything here!");
		}
	}

}
