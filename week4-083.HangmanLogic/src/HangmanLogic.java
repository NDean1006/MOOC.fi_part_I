
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
            return;
        }
        if (this.word.contains(letter) == false) {
            numberOfFaults++;

        }
        this.guessedLetters = this.guessedLetters + letter;
        
        
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";//sets string to empty for hidden word to be constructed
        int counter = 0;// loop counter
        String s = "";// sets string to empty for hidden caracters 
        while (counter < this.word.length()) {//initiates program loop for each character in the word
            s = "" + this.word.charAt(counter); // blank string needed for var to be type string
            if (this.guessedLetters.contains(s)) {//check for character guessed in word
                hiddenWord = hiddenWord + s; // if in the word character is appended
            } else {
                hiddenWord = hiddenWord + "_";// if character is not it is replaced with an _
            }
            counter++;
        }
        return hiddenWord;
    }
}
        