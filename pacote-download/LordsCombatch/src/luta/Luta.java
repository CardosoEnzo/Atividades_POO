package luta;

import java.util.Random;

import Lutador.Lutador;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;
	private int rounds;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1 != l2 && l1.getCategoria() == l2.getCategoria()) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
		}	
			else {
				this.aprovada = false;
				this.desafiante = null;
				this.desafiado = null;
			}
	}
	
	public void lutar() {
		if(this.aprovada) {
			this.desafiante.apresentacao();
			System.out.println("----------------");
			this.desafiado.apresentacao();
			System.out.println("----------------");
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
			case 0:
				System.out.println("EMPATOUU");
				this.desafiado.empatouLuta();
				this.desafiante.empatouLuta();
				break;
			
			case 1:
				System.out.println("O desafiante " +this.desafiante.getNome()+ " ganhou a luta ");
				this.desafiante.ganhouLuta();
				this.desafiado.perdeuLuta();
				break;
			case 2:
				System.out.println("O desafiado "+this.desafiado.getNome()+ " ganhou a luta ");
				this.desafiado.ganhouLuta();
				this.desafiante.perdeuLuta();
				break;
			}
		}
		else {
			System.out.println("A luta não poderá acontecer");
		}
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	

}
