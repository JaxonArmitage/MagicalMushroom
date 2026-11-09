package Game;

import java.util.Scanner;

public class World {

	public static void main(String[] args) {
	}

	public static Room buildWorld() {
		Room tent = new Room("Tent");
		Room mossLands = new Room("MossLands");
		Room pond = new Room("Pond");
		Room abandonedVillage = new Room("AbandonedVillage");
		Room treehouse = new Room("Treehouse");
		Room fog = new Room("Fog");
		Room mushroomForest = new Room("MushroomForest");
		Item fan = new Item("fan"); 
		Item sleepingBag = new Item("sleepingbag");
		Item lantern = new Item("Lantern");
		Item fish = new Item("fish");
		Item chair = new Item("chair");
		Item tacklebox = new Tacklebox();
		Item batteries = new Item("batteries");
		Item birdnest = new Birdsnest();
		tent.addItem(sleepingBag);
		tent.addItem(lantern);
		pond.addItem(fish);
		pond.addItem(chair);
		pond.addItem(tacklebox);
		treehouse.addItem(batteries);
		treehouse.addItem(birdnest);
		treehouse.addItem(fan);
		tent.addExit(mossLands, 3); // 5 down
		mossLands.addExit(tent, 2); // 4 up
		mossLands.addExit(fog, 1); // 3 south
		mossLands.addExit(pond, 0); // 1 west
		mossLands.addExit(abandonedVillage, 3);
		fog.addExit(mossLands, 0); // 2 north
		fog.addExit(mushroomForest, 1);
		pond.addExit(mossLands, 1); // 0 east
		abandonedVillage.addExit(mossLands, 2);
		abandonedVillage.addExit(treehouse, 4);
		treehouse.addExit(abandonedVillage, 5);
		mushroomForest.addExit(fog, 0);
		fish.setWeight("h");
		chair.setWeight("h");
		tacklebox.setWeight("h");
		mushroomForest.setLock(true);
		treehouse.setLock(true);
		return tent;
	}
}
