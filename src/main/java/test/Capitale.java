package test;

import javax.management.InstanceAlreadyExistsException;

public class Capitale extends Ville {

	protected String country;

	public Capitale(String name, String country) {
		super(name);
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "capitale " + super.getName();
	}

	public static void main(String[] args) {

		Ville ville = new Capitale("Paris", "France");
		System.out.println("Ville " + ville.getName());
		String instance = ville instanceof Capitale ? "capitale" : "ville";
		String instance1 = ville instanceof Ville ? "ville" : "capitale";

		System.out.println("instcane of  " + instance);

		System.out.println("instcane of  " + instance1);
}
}
