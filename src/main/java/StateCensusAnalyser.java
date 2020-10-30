import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class StateCensusAnalyser {
    public int loadDataFromCSV(String filepath) throws StateCensusAnalyserException {
        int count = 0;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filepath));
            CsvToBean<CSVStateCensus> csvToBean = new CsvToBeanBuilder<CSVStateCensus>(reader).withType(CSVStateCensus.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            Iterator<CSVStateCensus> itr = csvToBean.iterator();
            while (itr.hasNext()) {
                count++;
                CSVStateCensus csvdata = itr.next();
            }
            return count;
        } catch (Exception e) {
            throw new StateCensusAnalyserException("Incorrect File");
        }
    }
}
