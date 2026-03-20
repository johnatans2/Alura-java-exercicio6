abstract class ContaBancaria{
	protected double saldo;

	public void depositar(){
		System.out.println("Digite o valor que você deseja depositar:");
		saldo+=Input.input.nextDouble();
		operacaoEfetuada();
		consultarSaldo();
	}
	public void consultarSaldo(){
		System.out.println(String.format("O seu saldo atual é de: R$%.2f",saldo));
	}
	public void sacar(){
		System.out.println("Digite o valor que você deseja sacar:");
		double valorSaque=Input.input.nextDouble();
		if(valorSaque>saldo){
			System.out.println("O valor de saque é maior que o saldo atual, a operação foi cancelada.");
		}else{
			saldo-=valorSaque;
			operacaoEfetuada();
			consultarSaldo();
		}
	}
	private void operacaoEfetuada(){
		System.out.println("A operação foi realizada com sucesso.");
	}
}