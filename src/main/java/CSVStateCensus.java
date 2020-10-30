import com.opencsv.bean.CsvBindByPosition;

public class CSVStateCensus {
    @CsvBindByPosition(position = 0)
    private String state;
    @CsvBindByPosition(position = 1)
    private String population;
    @CsvBindByPosition(position = 2)
    private String area;
    @CsvBindByPosition(position = 3)
    private String density;

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getPopulation() { return population; }

    public void setPopulation(String population) { this.population = population; }

    public String getArea() { return area; }

    public void setArea(String area) { this.area = area; }

    public String getDensity() { return density; }

    public void setDensity(String density) { this.density = density; }

    @Override
    public String toString() {
        return "State: " + this.state + " Population: " + this.population + " Area: " + this.area + " Density: " + this.density;
    }
}

