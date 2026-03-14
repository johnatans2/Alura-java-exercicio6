class Carro{
	private double[] precosAnuais=new double[0];
	private String nomeModelo;
	private double precoMedioAnual;
	private double menorPreco;

	public void setNomeModelo(){
		System.out.println("Digite o nome do modelo do carro:");
		nomeModelo=Input.input.nextLine();
	}
	public void setPrecoMedioAnual(){
		System.out.println("Digite o valor do preço médio do carro no ano atual:");
		precoMedioAnual=Input.input.nextDouble();
		menorPreco=precosAnuais.length==0?precoMedioAnual:precoMedioAnual<menorPreco?precoMedioAnual:menorPreco;
		precosAnuais=Lista.adicionarElemento(precosAnuais,precoMedioAnual);
	}
	public void exibirMenorPreco(){
		if(Lista.verificarQuantidadeElemento(precosAnuais,menorPreco)>1){
			System.out.println(String.format("O menor preço foi o de R$%.2f, que se repetiu %d vezes, nos anos de...",menorPreco,Lista.verificarQuantidadeElementos(precosAnuais,menorPreco)));
		}else{
			System.out.println(String.format("O menor preço dentre os anos foi o de R$%.2f do %dº ano",menorPreco,precosAnuais.length));
		}
	}
	public void exibirPrecosAnuais(){
		for(int iterador=0;iterador<precosAnuais.length;iterador++){
			System.out.println(String.format("O preço médio do %dº ano foi de: R$%.2f",iterador+1, precosAnuais[iterador]));
		}
	}
}