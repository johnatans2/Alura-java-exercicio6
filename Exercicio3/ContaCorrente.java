public class ContaCorrente extend ContaBancaria{
	private double tarifa=10;

	public void cobrarTarifaMensal(){
		saldo-=tarifa;
	}
}