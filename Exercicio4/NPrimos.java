abstract class NPrimos{
	protected void verificarPrimalidade(){
		System.out.println("Digite o número na qual você deseja verificar se é primo:");
		if(NumerosPrimos.verificarPrimalidade(Input.input.nextInt())){
			System.out.println("O número é primo.");
		}else{
			System.out.println("O número não é primo.");
		}
	}
	protected void listarPrimos(){
		System.out.println("Diga até qual número você deseja verificar os números que são primos:");
		System.out.println(String.format("Os números que são primos até o número digitado são os números: %s",Lista.retornarElementos(NumerosPrimos.listarPrimos(Input.input.nextInt()))));
	}
}