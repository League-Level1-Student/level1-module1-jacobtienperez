
public class backpuackrun {
	public static void main(String[] args) {
		Backpack pack = new Backpack();
		Pencil draw = new Pencil();
		Ruler king = new Ruler();
		Textbook overpriced = new Textbook();
		pack.putInBackpack(draw);
		pack.putInBackpack(king);
		pack.putInBackpack(overpriced);
		pack.goToSchool();
		overpriced.read();
		
	}


}
