public class DocumentContent {
    private String content;
    private FontFamily fontFamily;
    private int fontSize;
    private Color fontColor;

    public DocumentContent(String content, FontFamily fontFamily, int fontSize, Color fontColor) {
        this.content = content;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
    }
    public DocumentContent(String content) {
        this.content = content;
        this.fontFamily = FontFamily.ARIAL;
        this.fontSize = 16;
        this.fontColor = Color.BLACK;
    }

    public Color getFontColor() {
        return fontColor;
    }
    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    public FontFamily getFontFamily() {
        return fontFamily;
    }
    public void setFontFamily(FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) throws Exception {
        if (fontSize < 0 || fontSize > 120) {
            throw new Exception("Font size must be between 0 and 120");
        }
        this.fontSize = fontSize;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void changeFormat(FontFamily fontFamily, int fontSize, Color fontColor) throws Exception {
        this.setFontSize(fontSize);
        this.setFontColor(fontColor);
        this.setFontFamily(fontFamily);

    }
}
