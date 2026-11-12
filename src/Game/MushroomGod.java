package Game;

public class MushroomGod extends NPC {
	public MushroomGod() {
		super("mushroomgod");
	}

	@Override
	public void talk() {
		say("Hello little one. How may my mushrooms be of service to you?");
		String[] responses = { "Let me touch your cap!", "May I pray to you!", "How do I get out of here!" };
		int option = getResponse(responses);
		switch (option) {
		case 1:
			say("NO! A mushroom's cap is very sacred and can not be touched by just any peasant.");
			break;
		case 2:
			say("Ummm. You can just talk to me... I'm like right in front of you.");
			break;
		case 3:
			say("Why would you ever want to leave?");
			break;
		default:
			say("speak more fluently child!");
		}
	}
}
