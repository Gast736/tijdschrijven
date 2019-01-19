package nl.gemeente.groningen.tijdschrijven;

public enum Rol {
	AFDELINGSHOOFD("Afdelingshoofd"), COORDINATOR("Co�rdinator"), DIRECTEUR("Directeur"), MEDEWERKER("Medewerker");

	private String rol;

	private Rol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return rol;
	}
}
