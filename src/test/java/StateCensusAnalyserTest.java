import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class StateCensusAnalyserTest {
    private static final String CENSUS_CSV_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCensusData.csv";
    private static final String INCORRECT_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataFileIO\\AddressBookData\\data.txt";
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
}
