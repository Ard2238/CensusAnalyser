import com.opencsv.bean.CsvBindByName;

public class CSVStateCode {

    @CsvBindByName (column = "State")
    private String State;
    @CsvBindByName (column = "TIN")
    private String TIN;
    @CsvBindByName (column = "StateCode")
    private String StateCode;

    public String getState() { return State; }

    public void setState(String state) {State = state; }

    public String getTIN() { return TIN; }

    public void setTIN(String TIN) { this.TIN = TIN; }

    public String getStateCode() { return StateCode; }

    public void setStateCode(String stateCode) { StateCode = stateCode; }

    @Override
    public String toString() {
        return "State: " + this.State + " TIN: " + this.TIN + " StateCode: " + this.StateCode ;
    }
}
