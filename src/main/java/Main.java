public class Main {
    public static void main(String[] args) {
        TextEditor editor = TextEditor.getInstance();
        Document doc1 = editor.createDocument("document1");
        Document doc2 = editor.createDocument("document2");
        editor.delete(doc1);
    }
}