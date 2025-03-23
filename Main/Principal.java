package Main;

import java.util.Scanner;
import Clases.Agua;
import Clases.Electrico;
import Clases.Fuego;
import Clases.OtroPokemon;
import Clases.Pokedex;
import Clases.Pokemon;

public class Principal {
	private static void limpiarPantalla() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}

	private static int eligeOpcion(Scanner lector) {
		int numero = 0;
		try {
			System.out.println("==========================================================");
			System.out.println("Bienvenido al sistema de Pokendex");
			System.out.println("==========================================================");
			System.out.println("1.Registrar Pokémon");
			System.out.println("2.Mostrar Pokedex");
			System.out.println("3.Mostrar Pokémon más fuerte y el más débil de la pokendex");
			System.out.println("4.Salir del sistema");
			System.out.println("==========================================================");
			System.out.println("Elige opcion: ");
			numero = lector.nextInt();

			return numero;
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
			lector.nextLine();
		}
		return 0;
	}

	private static void switchOption(int opcion, Scanner lector,Pokedex miPokedex) {
		switch (opcion) {
		case 1:
			limpiarPantalla();
			if (miPokedex.llenoPokemon()) {
				System.out.println("Se encuentra lleno la pokedex");
				return;
			} else {
				System.out.println("Elige el tipo de pokemon agregar: ");
				System.out.println("==========================================================");
				System.out.println("1.Agua\n2.Electrico\n3.Fuego\n4.Otro tipo de pokemon");
				System.out.println("==========================================================");
				System.out.println("Ingrese opcion: ");
				int tipo = lector.nextInt();
				
				limpiarPantalla();
				miPokedex.registrarPokemon(crearPokemon(tipo, lector));
			}
			break;
		case 2:
			limpiarPantalla();
			System.out.println("==========================================================");
			miPokedex.mostrarPokedex();
			break;
		case 3:
			limpiarPantalla();
			miPokedex.mostrarMasFOD();
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

	private static Pokemon crearPokemon(int tipo, Scanner lector) {
	    System.out.println("Ingrese los datos correctamente");
	    System.out.println("==========================================================");
	    
	    lector.nextLine();
	    System.out.println("Nombre: ");
	    String nombre = lector.nextLine();

	    System.out.println("Altura: ");
	    double altura = lector.nextDouble();
	    lector.nextLine();

	    System.out.println("Peso: ");
	    double peso = lector.nextDouble();
	    lector.nextLine();

	    System.out.println("Habilidad Especial: ");
	    String habilidad = lector.nextLine(); 

	    System.out.println("Cantidad de experiencia: ");
	    int cantidadXP = lector.nextInt();
	    lector.nextLine();

	    System.out.println("Ingrese su nivel: ");
	    int nivel = lector.nextInt();
	    lector.nextLine();
	
	    limpiarPantalla();
	    switch (tipo) {
	        case 1:
	            return new Agua(nombre, "Agua", altura, peso, habilidad, cantidadXP, nivel);
	        case 2:
	            return new Electrico(nombre, "Electrico", altura, peso, habilidad, cantidadXP, nivel);
	        case 3:
	            return new Fuego(nombre, "Fuego", altura, peso, habilidad, cantidadXP, nivel);
	        case 4:
	            return new OtroPokemon(nombre, "Otro tipo de Pokémon", altura, peso, habilidad, cantidadXP, nivel);
	        default:
	            System.out.println("Error: Número mal ingresado.");
	            return null;
	    }
	}

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		 Pokedex miPokedex = new Pokedex();
		 
		while (true) {
			int opcion = eligeOpcion(lector);
			
			if (opcion == 4) {
				limpiarPantalla();
				System.out.println("Adioss!!!!");
				break;
			}
			switchOption(opcion, lector,miPokedex);
		}
	}

}
