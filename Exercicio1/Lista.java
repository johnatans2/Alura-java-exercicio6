public class Lista{
	public static double[] adicionarElemento(double[] arrayOriginal,double elemento){
		double[] novoArray=new double[arrayOriginal.length+1];
		for(int iterador=0;iterador<arrayOriginal.length;iterador++){
			novoArray[iterador]=arrayOriginal[iterador];
		}
		novoArray[arrayOriginal.length]=elemento;
		return novoArray;
	}
	public static int[] adicionarElemento(int[] arrayOriginal,int elemento){
		int[] novoArray=new int[arrayOriginal.length+1];
		for(int iterador=0;iterador<arrayOriginal.length;iterador++){
			novoArray[iterador]=arrayOriginal[iterador];
		}
		novoArray[arrayOriginal.length]=elemento;
		return novoArray;
	}
	public static <T> T[] adicionarElemento(T[] arrayOriginal,T elemento){
		@SuppressWarnings("unchecked")
		T[] novoArray=(T[]) new Object[arrayOriginal.length+1];
		for(int iterador=0;iterador<arrayOriginal.length;iterador++){
			novoArray[iterador]=arrayOriginal[iterador];
		}
		novoArray[arrayOriginal.length]=elemento;
		return novoArray;
	}

	public static boolean verificarExistenciaElemento(double[] array,double elemento){
		boolean resultado=false;
		for(int iterador=0;iterador<array.length;iterador++){
			if(array[iterador]==elemento){
				resultado=true;
			}
		}
		return resultado;
	}

	public static int verificarQuantidadeElemento(double[] array,double elemento){
		int contador=0;
		if(verificarExistenciaElemento(array,elemento)){
			for(int iterador=0;iterador<array.length;iterador++){
				if(array[iterador]==elemento){
					contador++;
				}
			}
		}
		return contador;
	}

	public static int[] verificarIndiceElemento(double[] array,double elemento){
		int[] arrayIndice=new int[0];
		if(verificarExistenciaElemento(array,elemento)){
			for(int iterador=0;iterador<array.length;iterador++){
				if(array[iterador]==elemento){
					arrayIndice=adicionarElemento(arrayIndice,iterador);
				}
			}
		}
		return arrayIndice;
	}
	public static int[] ordenarIndices(int[] array){
		int[] novoArray=new int[array.length];
		for(int iterador=0;iterador<array.length;iterador++){
			novoArray[iterador]=array[iterador]+1;
		}
		return novoArray;
	}

	public static String retornarElementos(int[] array){
		String elementos="";
		if(array.length==0){
			elementos="O array em questão está vazio e, por isso, não há como exibir os seus elementos.";
		}else{
			for(int iterador=0;iterador<array.length;iterador++){
				elementos+=elementos.length()==0?array[iterador]:", "+array[iterador];
			}
		}
		return elementos;
	}
}