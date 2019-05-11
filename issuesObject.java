import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.MenuButton;

import java.awt.*;
import java.time.LocalDate;

public class issuesObject {
    private final SimpleStringProperty ititle;
    private final LocalDate idateRaised;
    private final LocalDate idateAssigned;
    private final String iseverity;
    private final String ipriority;
    private final SimpleStringProperty idescription;
    private final SimpleStringProperty iraisedBy;

        public issuesObject(String ititle, LocalDate idateRaised, LocalDate idateAssigned, String iseverity,
                            String ipriority, String idescription, String iraisedby){
            this.ititle = new SimpleStringProperty(ititle);
            this.idateRaised = idateRaised;
            this.idateAssigned = idateAssigned;
            this.iseverity =  iseverity;
            this.ipriority = ipriority;
            this.idescription = new SimpleStringProperty(idescription);
            this.iraisedBy = new SimpleStringProperty(iraisedby);
    }

    public LocalDate getIdateAssigned() {
        return idateAssigned;
    }

    public LocalDate getIdateRaised() {
        return idateRaised;
    }

    public String getIpriority() {
        return ipriority;
    }

    public String getIseverity() {
        return iseverity;
    }

    public String getIdescription() {
        return idescription.get();
    }

    public String getIraisedBy() {
        return iraisedBy.get();
    }

    public String getItitle() {
        return ititle.get();
    }
}
