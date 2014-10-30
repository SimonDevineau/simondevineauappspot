package test;

public class Ville {

	protected String name = "";
	
	public Ville(String name) {

		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Est une ville ppelée " + this.name;
	}
}
