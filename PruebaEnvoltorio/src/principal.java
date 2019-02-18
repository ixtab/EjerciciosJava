
public class principal {

	public static void main(String[] args) {
		Integer objNumero = new Integer(65);
		Integer objNumero2 = new Integer(65);
		Character objCaracter = new Character('A');
		String objFrase = "96487563";
		System.out.println(objNumero.toString() + objNumero2.toString());
		System.out.println(Integer.parseInt(objFrase) * -2);
		System.out.println(Long.MIN_VALUE);
		System.out.println(objCaracter);
		
		char cha = 'a';
		System.out.println ( Character.isDigit(cha) );
		cha = '4';
		System.out.println ( Character.isDigit(cha) );
	}

}
