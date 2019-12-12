public class Morse {
    private static char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    private static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};

    static StringBuilder lettersToMorseCode(String word){
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<word.length();i++){
            for (int j=0;j<letters.length;j++) if (word.toLowerCase().charAt(i) == letters[j]) ans.append(morse[j]) ;
            ans.append(" ");
        }
        assert word.length() == ans.toString().split(" ").length;
        return ans;
    }
    static StringBuilder morseCodeToLetters(String[] word){
        StringBuilder ans = new StringBuilder();
        for (String s : word) {
            for (int i=0;i<morse.length;i++){
                if (s.equals(morse[i])){
                    ans.append(letters[i]);
                }
            }
        }
        assert word.length == ans.toString().split(" ").length;
        return ans;
    }
}
