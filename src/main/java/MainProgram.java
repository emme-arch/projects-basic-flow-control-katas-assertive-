public class MainProgram {
    static String[] word = {"....", "..", "/" ,"-", "....", ".", ".-.", "."};
    public static void main(String[] args) {
        System.out.println(Morse.lettersToMorseCode("Hi there"));
// should return
// ".... .. / - .... . .-. ."

        System.out.println(Morse.morseCodeToLetters(word));
    }
}
