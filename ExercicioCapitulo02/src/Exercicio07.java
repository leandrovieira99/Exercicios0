import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
/*7) (opcional)Escrevaumprogramaque,dadaumavari�velxcomalgumvalorinteiro,temosumnovoxde acordocomaseguinteregra: 
 � sex�par,x = x / 2 � sex�impar,x = 3 * x + 1 � imprimex � Oprogramadevepararquandoxtiverovalorfinalde1.
 Porexemplo,parax = 13,asa�daser�: 40->20->10->5->16->8->4->2->1
 */

		String x;
		int valor;
		x = JOptionPane.showInputDialog("Digite um n�mero:");
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

