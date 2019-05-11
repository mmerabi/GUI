import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class deliverableObject {
    private final SimpleStringProperty id;
    private final SimpleStringProperty name;
    private final LocalDate duedate;
    private final SimpleStringProperty description;

    public deliverableObject(String id, String name, LocalDate duedate, String description) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty(id);
        this.duedate = duedate;
        this.description = new SimpleStringProperty(description);
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public String getDescription() {
        return description.get();
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }
}