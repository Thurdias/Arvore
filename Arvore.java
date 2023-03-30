package Arvores;

public class Arvore {
	// Propriedades da classe
	No raiz = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		if(raiz == null) {
			raiz = new No(numero, null, null, null, null, null);
		} else {
			int numeroFilho = (1+((int)(5*Math.random())));
			switch(numeroFilho) {
			case 1:
				raiz.setFilho1(inserir(raiz.getFilho1(), numero));
				break;
			case 2:
				raiz.setFilho2(inserir(raiz.getFilho2(), numero));
				break;
			case 3:
				raiz.setFilho3(inserir(raiz.getFilho3(), numero));
				break;
			case 4:
				raiz.setFilho4(inserir(raiz.getFilho4(), numero));
				break;
			case 5:
				raiz.setFilho5(inserir(raiz.getFilho5(), numero));
				break;		
			}
		}
		return raiz;
	}
	
	public void mostrar() {
		mostrar(raiz, "", "(raiz)");
		if(raiz == null) {
			System.out.println("Árvore sem raiz(nula)");
		}
	}
	
	private void mostrar(No raiz, String espaco, String filho) {
		if(raiz != null) {
			System.out.println(espaco + raiz.getNumero() + filho);
			mostrar(raiz.getFilho1(), espaco + "\t", "-(F1)");
			mostrar(raiz.getFilho2(), espaco + "\t", "-(F2)");
			mostrar(raiz.getFilho3(), espaco + "\t", "-(F3)");
			mostrar(raiz.getFilho4(), espaco + "\t", "-(F4)");
			mostrar(raiz.getFilho5(), espaco + "\t", "-(F5)");
		}
	}
}
