public final class NumerosPrimos{
	public static boolean verificarPrimalidade(int numero){
		boolean ePrimo=true;
		for(int iterador=2;iterador<numero;iterador++){
			if(numero%iterador==0){
				ePrimo=false;
			}
		}
		return ePrimo;
	}
	public static int[] listarPrimos(int numero){
		int[] arrayPrimos=new int[0];
		for(int iterador=2;iterador<=numero;iterador++){
			if(verificarPrimalidade(iterador)){
				arrayPrimos=Lista.adicionarElemento(arrayPrimos,iterador);
			}
		}
		return arrayPrimos;
	}
	public static int gerarPrimo(int numero){
		while(!(verificarPrimalidade(++numero))){}
		return numero;
	}
}