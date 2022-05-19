package revisaoRecursao;

import java.util.Objects;

public class MetodosRecursivos {
	
	

	public static void main(String[] args) {
		Object nulos[] = {1,null,null,null,5,2,1,2};
		System.out.println("n! = " + calcularFatorial(6));
		System.out.println("e-nesimo = " +calcularFibonnaci(7));
		int posicao = 0;
		int contagem  = 0;
		System.out.println("Não nulos = " + countNotNull(nulos,posicao, contagem));
		int calculo = 2;
		System.out.println(potenciade2(3,calculo));

	}
	
	public static int calcularFatorial(int n) {
		
		if(n == 0) {
			return 1;
		}else
			return n * calcularFatorial(n-1);
	}
	
	public static int calcularFibonnaci(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}
		return calcularFibonnaci(n-1) + calcularFibonnaci(n-2);
	}
	
	/*
	 * SEM RECURSAO.
	public static int countNotNull(Object[] nulos) {
		int nnulos = 0;
		for(int i = 0;i<nulos.length;i++) {
			if (Objects.isNull(nulos[i]) == false) {
				nnulos++;
			}
		}
		return nnulos;
	}
	*/
	
	public static int countNotNull(Object[] nulos, int posicao,int contagem) {
		if(posicao == nulos.length) {
			return contagem;
		}
		else if (Objects.isNull(nulos[posicao]) == false) {
			return contagem+=1 + countNotNull(nulos, posicao+1,contagem);	
		}
		return countNotNull(nulos, posicao+1,contagem);
	}
	//dps termino, erro
	public static int potenciade2(int expoente,int calculo) {
		if(expoente == 0)return calculo;
		return calculo *= potenciade2(expoente-1, calculo);
	}

}
