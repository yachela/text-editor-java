import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private static TextEditor instance;
    private List<Document> documents;

    private TextEditor() {
        documents = new ArrayList<>();
    }
    public static TextEditor getInstance() {
        if (instance == null) {
            instance = new TextEditor();
        }
        return instance;
    }
    public List<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    public Document createDocument(String aTitle) {
        if (aTitle == null || aTitle.isEmpty()) {
            aTitle = "Untitled";
        }
        Document document = new Document(aTitle);
        documents.add(document);
        return document;
    }
    public void delete(Document aDocument) {
        documents.remove(aDocument);
    }
    public void writeDocument(Document aDocument, DocumentContent aContent) {
        aDocument.addContent(aContent);
    }

    public void changeFormat(DocumentContent aContent, FontFamily aFontFamily, int aFontSize, Color aColor ) throws Exception {
        try {
            aContent.changeFormat(aFontFamily, aFontSize, aColor);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}