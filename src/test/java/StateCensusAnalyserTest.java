import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {
    private static final String CENSUS_CSV_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCensusData.csv";

    @Test
    public void checkNumberofRecords(){
        StateCensusAnalyser sca = new StateCensusAnalyser();
        Assert.assertEquals(30, sca.loadDataFromCSV(CENSUS_CSV_FILE));
    }
}
