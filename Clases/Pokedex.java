package Clases;

public class Pokedex {
	private final int cantidadPokemon = 10;
	private Object[] pokedex;

	public Pokedex() {
		this.pokedex = new Object[cantidadPokemon];
	}

	public void mostrarPokedex() {
        boolean hayPokemones = false;

        for (Object pokemones : pokedex) {
            if (pokemones != null) {
                Pokemon pokemon = (Pokemon) pokemones;
                System.out.println(pokemon.informacion());
                hayPokemones = true;
            }
        }

        if (!hayPokemones) {
            System.out.println("No hay pokémones agregados!!");
        }
    }

	public void mostrarMasFOD() {
		 int totalPokemones = 0;
		    int indiceFuerte = -1;
		    int indiceDebil = -1;
		    int maxAtaque = Integer.MIN_VALUE;
		    int minAtaque = Integer.MAX_VALUE;

		    for (int i = 0; i < pokedex.length; i++) {
		        if (pokedex[i] != null) {
		            totalPokemones++;
		            Pokemon pokemon = (Pokemon) pokedex[i];
		            int ataque = pokemon.getAtaque();

		            if (ataque > maxAtaque) {
		                maxAtaque = ataque;
		                indiceFuerte = i;
		            }

		            if (ataque < minAtaque) {
		                minAtaque = ataque;
		                indiceDebil = i;
		            }
		        }
		    }

		    if (totalPokemones == 0) {
		        System.out.println("La Pokédex está vacía.");
		        return;
		    }

		    System.out.println("==========================================================");
		    if (totalPokemones == 1) {
		        System.out.println("Solo hay un Pokémon en la Pokédex.");
		        Pokemon unicoPokemon = (Pokemon) pokedex[indiceFuerte];
		        System.out.println(unicoPokemon.informacion());
		    } 
		    else {
		        System.out.println("El más fuerte es: ");
		        System.out.println(((Pokemon) pokedex[indiceFuerte]).informacion());
		        System.out.println("==========================================================");
		        System.out.println("El más débil es: ");
		        System.out.println(((Pokemon) pokedex[indiceDebil]).informacion());
		    }
		    System.out.println("==========================================================");
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
