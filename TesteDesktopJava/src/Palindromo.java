package TesteDesktopJava.src;

public class Palindromo {
    public Boolean IsPalindromo(String s){
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
