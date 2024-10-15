public class Letter implements DocumentContent {
    private char letter;
    private Formato formato;
    
    public Letter(char letter, Formato formato) {
        this.letter = letter;
        this.formato = formato;
    }

    public Letter(String l, FontSize fontSize, FontFamily fontFamily, Color color) {
    }
}
