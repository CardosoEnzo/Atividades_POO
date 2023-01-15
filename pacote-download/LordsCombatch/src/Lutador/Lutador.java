package Lutador;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private double altura;
	private int idade;
	private double peso;
	private int vitoria;
	private int empate;
	private int derrota;
	private String categoria;
	
	public Lutador (String nome, String nacionalidade, double altura, int idade, double peso, int vitoria, int derrota, int empate) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.idade = idade;
		this.setPeso(peso);
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
				
	}
	
	public void apresentacao() {
		System.out.println("O Lutador se chama "+this.getNome());
		System.out.println("Ele é "+this.getNacionalidade());
		System.out.println("Possui "+this.getAltura()+ " metros de altura");
		System.out.println("Tem a idade de "+this.getIdade()+" anos");
		System.out.println("Tem o peso de "+this.getPeso()+ " kg");
		System.out.println("Possui "+this.getVitoria()+" vitórias");
		System.out.println("Possui "+this.getDerrota()+" derrotas");
		System.out.println("Possui "+this.getEmpate()+" empates");
		System.out.println("----------------");
	}
	
	public void status() {
		System.out.println("Categoria "+this.getCategoria());
	}
	
	public void ganhouLuta() {
		this.setVitoria(this.getVitoria()+1);
	}
	
	public void perdeuLuta() {
		this.setDerrota(this.getDerrota()+1);
	}
	
	public void empatouLuta() {
		this.setEmpate(this.getEmpate()+1);
	}
	

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria(categoria);
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
		if(this.peso>=52.2 && this.peso<=62.1) {
			this.categoria = "leve";
		}
		else if(this.peso>=62.2 && this.peso<=72.1) {
			this.categoria = "médio";
		}
		else if(this.peso>=72.2 && this.peso<=82.1) {
			this.categoria = "pesado";
		}
		else {
			this.categoria = "inválido";
		}
	}
}
