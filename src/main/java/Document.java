import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Document {
    private String title;
    private LocalDate creationDate;
    private LocalDate lastModificationDate;
    private List<DocumentContent> content;

    public Document(String title, Date lastModificationDate, List<DocumentContent> content) {
        this.title = title;
        this.creationDate = LocalDate.now();
        this.lastModificationDate = creationDate;
        this.content = content;
    }




}
