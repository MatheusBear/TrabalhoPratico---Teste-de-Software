package TesteDesktopJava.src;

public class CaesarsCipher {
    /**
     * Caeser's Chipher Algorithm
     * @param a String that will be encrypted
     * @return  Encrypted String
     */
    public String Cipher(String a, int cifra)
	{
		String s = "";
		
        for(int i = 0; i < a.length(); i++) 
            s += (char)(a.charAt(i) + cifra);
        return s;
	}
}
