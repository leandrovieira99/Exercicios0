
public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 1700;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gastos Trimestrais =" + gastosTrimestre);
		
		float mediaMensal = (gastosTrimestre / 3);
		System.out.println("Valor da média mensal = "+ mediaMensal);
		

	}

}
