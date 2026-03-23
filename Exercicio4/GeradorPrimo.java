public class GeradorPrimo extends NPrimos{
	public void gerarProximoPrimo(){
		System.out.println("Digite a partir de qual número você deseja gerar o próximo número:");
		System.out.println(String.format("O próximo número primo a partir do número que você digitou é: %d.",NumerosPrimos.gerarPrimo(Input.input.nextInt())));
	}
}