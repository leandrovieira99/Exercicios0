
public class ExercicioX {

	public static void main(String[] args) {
			
		//1) Imprimatodososnúmerosde150a300.
		int i;
		for (i = 150; i <= 300; ++i) {
			System.out.println("Os numeros entre 150 até 300 são :"+ i);
		}

		//2) Imprimaasomade1até1000. 
		int soma = 0;
		for (i = 1; i <=1000; i++) {
			soma = soma + i ;
		}
		System.out.println("Soma dos numeros de 1 até 1000 =" + soma);

		//3) Imprimatodososmúltiplosde3,entre1e100.
		for (i = 1; i <= 100; i++) {
			if (i / 3 == 0);
		System.out.println("Os mútiplos de 3 =" + i);

		}

		//4) Imprimaosfatoriaisde1a10. 
		int n;
		int fatorial = 1; 
		for (n = 1; n <= 10; n++) {
			fatorial = (fatorial * n) ;
				}
		System.out.println("Fatorial de 10 = "+fatorial);

	}

}
