public class Main {
    public static void main(String[] args) {
        TextEditor editor = TextEditor.getInstance();
        Document doc1 = editor.createDocument("document1");
        Document doc2 = editor.createDocument("document2");
        editor.delete(doc1);
        editor.writeDocument(doc1,
                new Letter("l", FontSize.LARGE, FontFamily.ARIAL, Color.BLACK));
    }
}
