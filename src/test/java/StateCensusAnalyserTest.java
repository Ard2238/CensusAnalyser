import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class StateCensusAnalyserTest {
    private static final String CENSUS_CSV_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCensusData.csv";
    private static final String INCORRECT_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataFileIO\\AddressBookData\\data.txt";
    private static final String TYPE_INCORRECT_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCensusData.txt";
    StateCensusAnalyser sca;

    @Before
    public void initialize(){
        sca = new StateCensusAnalyser();
    }

    @Test
    public void checkNumberofRecords() throws StateCensusAnalyserException {
        Assert.assertEquals(30, sca.loadDataFromCSV(CENSUS_CSV_FILE));
    }

    @Test
    public void checkIncorrectFile() throws StateCensusAnalyserException {
        try{
            sca.loadDataFromCSV(INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }

    @Test
    public void checkTypeIncorrectFile() throws StateCensusAnalyserException {
        try{
            sca.loadDataFromCSV(TYPE_INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }
}
