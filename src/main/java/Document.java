import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Document {
    private String title;
    private LocalDate creationDate;
    private LocalDate lastModificationDate;
    private List<DocumentContent> content;

    public Document(String title) {
        this.title = title;
        this.creationDate = LocalDate.now();
        this.lastModificationDate = creationDate;
        this.content = new ArrayList<>();
    }

    public void addContent(DocumentContent aContent){
        this.content.add(aContent);
        this.lastModificationDate = LocalDate.now();

    }
    public void removeContent(DocumentContent aContent){

        this.content.remove(aContent);
        this.lastModificationDate = LocalDate.now();
    }

}
