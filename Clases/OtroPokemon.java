package Clases;

public class OtroPokemon extends Pokemon{

	public OtroPokemon(String nombre, String categoria, double altura, double peso, String habilidad, int exp,
			int nivel) {
		super(nombre, categoria, altura, peso, habilidad, exp, nivel);
	}

	@Override
	public String informacion() {
		return "Agua [Nombre: " + getNombre() + ", Categoria: " + getCategoria() + ", Hp: " + getHp()
		+ ", Nivel:" + getNivel() + ", Exp:" + getExp() + ", Ataque: " + getAtaque()
		+ ", Defensa:" + getDefensa() + ", Altura:" + getAltura() + ", Peso:" + getPeso()
		+ ", Habilidad:" + getHabilidad() + "]";
	}

}
