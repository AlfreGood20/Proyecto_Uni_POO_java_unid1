package Clases;

public class Fuego extends Pokemon{
	
	public Fuego(String nombre, String categoria, double altura, double peso, String habilidad, int exp, int nivel) {
		super(nombre, categoria, altura, peso, habilidad, exp, nivel);
	}

	@Override
	public String informacion() {
		return "Fuego [Nombre: " + getNombre() + ", Categoria: " + getCategoria() + ", Hp: " + getHp()
		+ ", Nivel:" + getNivel() + ", Exp:" + getExp() + ", Ataque: " + getAtaque()
		+ ", Defensa:" + getDefensa() + ", Altura:" + getAltura() + ", Peso:" + getPeso()
		+ ", Habilidad:" + getHabilidad() + "]";
	}
	
}
