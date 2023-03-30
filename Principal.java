package Arvores;

public class Principal {
	public static void main(String[] args) {
		Arvore objArvore = new Arvore();
		
//		System.out.println("========================");
//		objArvore.mostrar();
//		System.out.println("========================");
//		
//		objArvore.inserir(1);
//		
//		objArvore.mostrar();
//		System.out.println("========================");
//		
//		objArvore.inserir(2);
//		objArvore.inserir(3);
//		objArvore.inserir(4);
//		objArvore.inserir(5);
//		objArvore.inserir(6);
//		objArvore.mostrar();
//		System.out.println("========================");
//
//		
//		objArvore.mostrar();
//		System.out.println("========================");
//		objArvore.inserir(3);
//		objArvore.mostrar();
//		System.out.println("========================");
		
		objArvore.mostrar();
		for(int i = 0; i <= 100000000; i++) {
			objArvore.inserir((int)(100*(Math.random())));
		}
		objArvore.mostrar();

	}
}
