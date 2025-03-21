package Clases;

public class Pokedex {
	private final int cantidadPokemon = 10;
	private Object[] pokedex;

	public Pokedex() {
		this.pokedex = new Object[cantidadPokemon];
	}

	public void mostrarPokedex() {
		if(!llenoPokemon()) {
			System.out.print("No hay pokemones agregados!!\n");
			return;
		}
		else {
			for (Object pokemones : pokedex) {
				Pokemon pokemon = (Pokemon) pokemones;
				pokemon.informacion();
			}
		}
	}

	public void mostrarMasFOD() {
		if(!llenoPokemon()) {
			System.out.println("Se encuentra vacio la pokedex");
			return;
		}

		int indiceFuerte = 0;
		int indiceDebil = 0;
		int maxAtaque = 0;
		int minAtaque = 0;

		for (int i = 0; i < pokedex.length; i++) {
			Pokemon pokemon = (Pokemon) pokedex[i];
			int ataque = pokemon.getAtaque();

			if (ataque > maxAtaque) {
				indiceFuerte = i;
				maxAtaque = ataque;
			}

			if (ataque < minAtaque) {
				minAtaque = ataque;
				indiceDebil = i;
			}
		}

		if (indiceFuerte != 0 || indiceDebil != 0) {
			Pokemon pokemonFt = (Pokemon) pokedex[indiceFuerte];
			Pokemon pokemonDb = (Pokemon) pokedex[indiceDebil];
			System.out.println("============================================");
			System.out.println("El mas fuerte es: ");
			System.out.println(pokemonFt.informacion());
			System.out.println("============================================");
			System.out.println("El mas debil es: ");
			System.out.println(pokemonDb.informacion());
			System.out.println("============================================");

		}
	}

	public void registrarPokemon(Pokemon pokemon) {
		
		for (int i = 0; i < pokedex.length; i++) {
			if (pokedex[i] == null) {
				pokedex[i] = pokemon;
				System.out.println("Registro exitoso!!!");
				return;
			}
		}
		System.out.println("La Pokédex está llena. No se puede registrar más Pokémon.");
	}
	
	public boolean llenoPokemon() {
		int contarEspacios=0;
		
		for(int i=0; i<pokedex.length;i++) {
			if(pokedex[i]!=null) {
				contarEspacios+=1;
			}
		}
		return contarEspacios==pokedex.length;
	}
}
