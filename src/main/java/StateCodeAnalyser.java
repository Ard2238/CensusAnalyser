import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCodeAnalyser {
    public int loadDataFromCSVStateCode(String filepath) throws StateCensusAnalyserException {
        int count = 0;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filepath));
            CsvToBean<CSVStateCode> csvToBean = new CsvToBeanBuilder<CSVStateCode>(reader).withType(CSVStateCode.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            Iterator<CSVStateCode> itr = csvToBean.iterator();
            while (itr.hasNext()) {
                count++;
                CSVStateCode csvdata = itr.next();
            }
            return count;
        } catch (Exception e) {
            throw new StateCensusAnalyserException("Incorrect File");
        }
    }
}
