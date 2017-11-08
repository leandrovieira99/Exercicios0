import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
/*7) (opcional)Escrevaumprogramaque,dadaumavariávelxcomalgumvalorinteiro,temosumnovoxde acordocomaseguinteregra: 
 • sexépar,x = x / 2 • sexéimpar,x = 3 * x + 1 • imprimex • Oprogramadevepararquandoxtiverovalorfinalde1.
 Porexemplo,parax = 13,asaídaserá: 40->20->10->5->16->8->4->2->1
 */

		String x;
		int valor;
		x = JOptionPane.showInputDialog("Digite um número:");
        valor = Integer.parseInt(x);
        System.out.println(valor);
        while (valor >=1) {
        if(valor % 2 == 0) {
        	valor = valor / 2;
            System.out.println(valor);

        	}
        else {
        	valor = (3*valor + 1);    	
            System.out.println(valor);

        }  
	}
}}

