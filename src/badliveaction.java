
public class badliveaction {
public static void main(String[] args) {
	Smurf hand = new Smurf("handy");
	hand.eat();
	hand.getName();
	hand.getHatColor();
	Smurf oldman =  new Smurf("Papa");
	oldman.getName();
	oldman.getHatColor();
	System.out.println(oldman.getName());
	System.out.println(oldman.getHatColor());
	System.out.println(oldman.isGirlOrBoy());
	Smurf girl = new Smurf("Smurfette");
	System.out.println(girl.getName());
	System.out.println(girl.getHatColor());
	System.out.println(girl.isGirlOrBoy());
}
}
