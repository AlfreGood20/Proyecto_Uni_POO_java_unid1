package Clases;

public abstract class Pokemon {
	private String nombre;
	private String categoria;
	private int hp;

	private int nivel;
	private int exp;
	private int ataque;
	private int defensa;

	private double altura;
	private double peso;
	private String habilidad;

	public Pokemon() {
		this.nombre = "";
		this.categoria = "";
		this.hp = calcularHp(); // CALCULA LA VIDA DEL POKEMON
		this.nivel = (nivel > 100) ? 100 : nivel;
		this.altura = 0.0;
		this.peso = 0.0;
		this.habilidad = "";
		this.exp = 0;
		this.ataque = calcularAtaque();
		this.defensa = calcularDefensa();
	}

	public Pokemon(String nombre, String categoria, double altura, double peso, String habilidad, int exp, int nivel) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.nivel = (nivel > 100) ? 100 : nivel;
		this.hp = calcularHp();
		this.exp = exp;
		this.ataque = calcularAtaque();
		this.defensa = calcularDefensa();
		this.altura = altura;
		this.peso = peso;
		this.habilidad = habilidad;
	}

	private int calcularHp() {
		return 10 * hp;
	}

	private int calcularAtaque() {
		return 2 * nivel;
	}

	private int calcularDefensa() {
		return (int) (1.5 * nivel);
	}

	public abstract void subirNivel();

	public abstract void habilidadEspecial();

	public abstract String informacion();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

}
