package stringUtils;
import org.apache.commons.lang.StringUtils;
public class StringUtilsLista {
	String palavra;
	public StringUtilsLista(String nome1) {
		this.palavra = nome1;		
	}
	public static void repetir(String nome1,int quant) {
		String repeated = nome1.repeat(quant);
		System.out.print(repeated);

		/**int i=0;
		for(i=0;i<=repet;i++)
		{
			System.out.print("nome1");
		}**/
	}
	public static void contaRepeticao(String palavra,char letra) {
		int conta = StringUtils.countMatches(palavra, letra);

		
	}

}
