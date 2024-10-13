public class Letter implements DocumentContent {
    private char letter;
    private String fontFamily;
    private String color;
    private int fontSize;

    public Letter(char letter) {
        this.letter = letter;
        this.fontFamily = "Courier New";
        this.color = "black";
    }
    public char getLetter() {
        return letter;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public String getFontFamily() {
        return fontFamily;
    }
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public void changeColor(String aColor) {
        this.color = aColor;
    }
    public void changeFontFamily(String aFontFamily) {
        this.fontFamily = aFontFamily;
    }
    public void changeFontSize(int aFontSize) {
        this.fontSize = aFontSize;
    }
}
