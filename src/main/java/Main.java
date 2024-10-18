public class Main {
    public static void main(String[] args) throws Exception {
        TextEditor editor = TextEditor.getInstance();
        Document doc1 = editor.createDocument("document1");
        Document doc2 = editor.createDocument("document2");
        editor.delete(doc1);
        DocumentContent hello = new DocumentContent("Hello");
        DocumentContent world = new DocumentContent("world");
        doc1.addContent(hello);
        doc1.addContent(world);
        hello.changeFormat(FontFamily.ROBOTO, 16, Color.BLACK);
        doc1.ctrlZ();
        System.out.println(doc1.getContent().size());
        doc1.ctrlZ();
        System.out.println(doc1.getContent().size());
    }
}
