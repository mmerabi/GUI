import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.MenuButton;

import java.awt.*;
import java.time.LocalDate;

public class tasksObject {
    private final SimpleStringProperty ttitle;
    private final LocalDate tdueDate;
    private final LocalDate tcompletionDate;
    private final String tassignedResource;
    private final String tpriority;
    private final SimpleStringProperty tdescription;


    public tasksObject(String ttitle, LocalDate tdueDate, LocalDate tcompletionDate, String tassignedResource,
                       String tpriority, String tdescription) {
        this.ttitle = new SimpleStringProperty(ttitle);
        this.tdueDate = tdueDate;
        this.tcompletionDate = tcompletionDate;
        this.tassignedResource = tassignedResource;
        this.tpriority = tpriority;
        this.tdescription = new SimpleStringProperty(tdescription);

    }

    public LocalDate getTcompletionDate() {
        return tcompletionDate;
    }

    public LocalDate getTdueDate() {
        return tdueDate;
    }

    public String getTpriority() {
        return tpriority;
    }

    public String getTassignedResource() {
        return tassignedResource;
    }

    public String getTdescription() {
        return tdescription.get();
    }

    public String getTtitle() {
        return ttitle.get();
    }
}


