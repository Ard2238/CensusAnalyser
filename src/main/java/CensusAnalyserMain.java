
public class CensusAnalyserMain {
    private static final String CENSUS_CSV_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCensusData.csv";

    public static void main(String[] args) throws StateCensusAnalyserException {
        System.out.println("Welcome to the Indian States Census Analyser Program");
        StateCensusAnalyser sca = new StateCensusAnalyser();
        System.out.println(sca.loadDataFromCSV(CENSUS_CSV_FILE));
    }
}
