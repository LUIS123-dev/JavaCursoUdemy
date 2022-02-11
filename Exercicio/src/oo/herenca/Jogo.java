package oo.herenca;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x=10;
		monstro.y=10;
		
		Heroi heroi = new Heroi(10,11);
		
		
		System.out.println("Monstro tem => "+monstro.vida);
		System.out.println("Herói tem => "+heroi.vida);

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => "+monstro.vida);
		System.out.println("Herói tem => "+heroi.vida);
	}
}
