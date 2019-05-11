import java.time.LocalDate;

public class resourceObject {
    private final String rtitle;
    private final LocalDate rdateRaised;
    private final LocalDate rdateAssigned;
    private final String rpriority;
    private final String rseverity;
    private final String rpay;
    private final String rskill;

    public resourceObject(String rtitle, LocalDate rdateAssigned, LocalDate rdateRaised, String rpriority,
                          String rseverity, String rpay, String rskill) {

                              this.rtitle = rtitle;
                              this.rdateAssigned = rdateAssigned;
                              this.rdateRaised = rdateRaised;
                              this.rpriority = rpriority;
                              this.rseverity = rseverity;
                              this.rpay = rpay;
                              this.rskill = rskill;
    }

    public LocalDate getRdateAssigned() {
        return rdateAssigned;
    }

    public LocalDate getRdateRaised() {
        return rdateRaised;
    }

    public String getRpay() {
        return rpay;
    }

    public String getRpriority() {
        return rpriority;
    }

    public String getRseverity() {
        return rseverity;
    }

    public String getRskill() {
        return rskill;
    }

    public String getRtitle() {
        return rtitle;
    }

}
