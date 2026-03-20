abstract class Carro{
	private double[] precosAnuais=new double[0];
	private String nomeModelo;
	private double precoMedioAnual;
	private double menorPreco;
	private double maiorPreco;

	protected void setNomeModelo(){
		System.out.println("Digite o nome do modelo do carro:");
		nomeModelo=Input.input.nextLine();
	}
	protected void exibirModelo(){
		System.out.println(String.format("O nome do modelo do carro é: %s.",nomeModelo));
	}
	protected void setPrecoMedioAnual(){
		System.out.println("Digite o valor do preço médio do carro no ano atual:");
		precoMedioAnual=Input.input.nextDouble();
		menorPreco=precosAnuais.length==0?precoMedioAnual:precoMedioAnual<menorPreco?precoMedioAnual:menorPreco;
		maiorPreco=precosAnuais.length==0?precoMedioAnual:precoMedioAnual>maiorPreco?precoMedioAnual:maiorPreco;
		precosAnuais=Lista.adicionarElemento(precosAnuais,precoMedioAnual);
	}
	protected void exibirMenorPreco(){
		if(Lista.verificarQuantidadeElemento(precosAnuais,menorPreco)>1){
			System.out.println(String.format("O menor preço foi o de R$%.2f, que se repetiu %d vezes, nos anos: %s.",menorPreco,Lista.verificarQuantidadeElemento(precosAnuais,menorPreco),Lista.retornarElementos(Lista.ordenarIndices(Lista.verificarIndiceElemento(precosAnuais,menorPreco)))));
		}else{
			System.out.println(String.format("O menor preço dentre os anos foi o de R$%.2f do %sº ano.",menorPreco,Lista.retornarElementos(Lista.ordenarIndices(Lista.verificarIndiceElemento(precosAnuais,menorPreco)))));
		}
	}
	protected void exibirMaiorPreco(){
		if(Lista.verificarQuantidadeElemento(precosAnuais,maiorPreco)>1){
			System.out.println(String.format("O maior preço foi o de R$%.2f, que se repetiu %d vezes, nos anos: %s.",maiorPreco,Lista.verificarQuantidadeElemento(precosAnuais,maiorPreco),Lista.retornarElementos(Lista.ordenarIndices(Lista.verificarIndiceElemento(precosAnuais,maiorPreco)))));
		}else{
			System.out.println(String.format("O maior preço dentre os anos foi o de R$%.2f do %sº ano.",maiorPreco,Lista.retornarElementos(Lista.ordenarIndices(Lista.verificarIndiceElemento(precosAnuais,maiorPreco)))));
		}
	}
	protected void exibirPrecosAnuais(){
		for(int iterador=0;iterador<precosAnuais.length;iterador++){
			System.out.println(String.format("O preço médio do %dº ano foi de: R$%.2f",iterador+1, precosAnuais[iterador]));
		}
	}
}