/**
 * CossaDaniloClass
 * @author <b> Cossa Danilo </b> <u>4BI</u> <i> 13/05/2022 </i>
 * @version 0
 *
 */
public class CossaDaniloClass {
	/**
	 * 
	 * Costruttore vuoto della classe CossaDaniloClass
	 * 
	 */
	public CossaDaniloClass() {
		
	}
	
	/**
	 * Metodo che calcola la produttoria

	 * @param f valore massimo della produttoria
	 * @return risultato che viene ritornao dalla funzione
	 * 
	 * PRIMO ERRORE: r va inizializzato a 0
	 * SECONDO ERRORE: la prima condizione del ciclo for i deve essere uguale a 0
	 * 				   la seconda condizione "i<=f" per andare da 0 a f
	 * TERZO ERRORE: "r+=i", non "+"
	 */
	
	public int cossaMet(int s, int f) {
		int r = 0;
		for(int i=1;i<f;i++) {
			r = r + r;
		}
		return r;
	}
	
	/**
	 * metodo main
	 * @param args
	 */
	
	public static void main(String[] args) {
		CossaDaniloClass f = new CossaDaniloClass();
		System.out.println(f.cossaMet(5, 7));
	}
}