
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class actionItemObject {
    private final SimpleStringProperty aititle;
    private final LocalDate aidateCreated;
    private final LocalDate aidueDate;
    private final String airesources;
    private final SimpleStringProperty aidescription;
    private final LocalDate aidateFinished;

    public actionItemObject(String aititle, LocalDate aidateCreated, LocalDate aidueDate, String airesources, String aidescription, LocalDate aidateFinished) {
        this.aititle = new SimpleStringProperty(aititle);
        this.aidateCreated = aidateCreated;
        this.aidueDate = aidueDate;
        this.aidescription = new SimpleStringProperty(aidescription);
        this.aidateFinished = aidateFinished;
        this.airesources = airesources;


    }

    public LocalDate getAidateCreated() {
        return aidateCreated;
    }

    public LocalDate getAidateFinished() {
        return aidateFinished;
    }

    public LocalDate getAidueDate() {
        return aidueDate;
    }

    public String getAidescription() {
        return aidescription.get();
    }

    public String getAititle() {
        return aititle.get();
    }

    public String getAiresources() {
        return airesources;
    }
}
