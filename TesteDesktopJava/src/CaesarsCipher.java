package TesteDesktopJava.src;

public class CaesarsCipher {
    /**
     * Caeser's Chipher Algorithm
     * @param a String that will be encrypted
     * @return  Encrypted String
     */
    public String Cipher(String a, int cifra)
	{
        if(a.length() == 0){
            System.out.println("A frase não pode ser vazia");
            return a;
        }else if(cifra < 0){
            System.out.println("Cifra não pode ser negativa");
            return a;
        }

		String s = "";
		
        for(int i = 0; i < a.length(); i++) 
            s += (char)(a.charAt(i) + cifra);
        return s;
	}
}
