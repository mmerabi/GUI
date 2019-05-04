import javafx.beans.property.SimpleStringProperty;

public class deliverableObject {
    private final SimpleStringProperty id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty duedate;
    private final SimpleStringProperty description;

    public deliverableObject(String id, String name, String duedate, String description) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty(id);
        this.duedate = new SimpleStringProperty(duedate);
        this.description = new SimpleStringProperty(description);
    }

    public String getDuedate() {
        return duedate.get();
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