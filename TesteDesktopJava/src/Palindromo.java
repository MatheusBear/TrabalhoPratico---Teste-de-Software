package TesteDesktopJava.src;

public class Palindromo {
    public Boolean IsPalindromo(String s){

        if(s.length() <= 0)
            throw new IllegalArgumentException("O tamanho da String não pode ser menor ou igual a 0");

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase(); //Removes everything that is not a character and makes the String lower case

        boolean isPalindrome = true;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
        
    }
}
