
import java.util.Scanner;

public class DomJudge17A {

	/**
	 * 
	 * @author Carlos Bernal
	 * @version 1.0
	 * @since 1.0
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ample=0,llarg=0;
		
		ample=sc.nextInt();
		llarg=sc.nextInt();
		
		contaPeces(ample,llarg);
	}
	
	
	/**
	 * Conta el numero de peces que conté una piramide com la especificada a l'enunciat
	 * 
	 * @param ample amplaria de la base de la piramide
	 * @param llarg llargaria de la base de la piramide
	 * 
	 * @return Retorna el numero de peces de l'ultim cas
	 */
	
	public static int contaPeces(int ample, int llarg) {
		
		int  peces = 0;

			peces = ample * llarg;
			while (ample >= 2 && llarg >= 2) {

				if (ample > 2 && llarg > 2) {
					peces = peces + ((llarg - 1) * (ample - 1));
				}

				else if (ample == 2) {
					peces = peces + (llarg - 1);
				}

				else {
					peces = peces + (ample - 1);
				}
				ample--;
				llarg--;
			}

			System.out.println(peces);
		
		
		return peces;
	}
}