
public class ducc {
	int freinds = 0;
	String favoritefood = "";
	String name = "scrooge";
	public void quack( ) {
		System.out.println(this.name +" quack");
	}
	public void waddle() {
		System.out.println(this.name+" hates his life");
	}
  public ducc(int freind, String favoritefood, String name) {
	  this.freinds=freinds;
	  this.favoritefood=favoritefood;
	  this.name=name;
  }
}
