public class Year {
    private int id;
    private String yearName;

    public Year() {
        super();
    }

    public Year(int id, String yearName) {
        super();
        this.id = id;
        this.yearName = yearName;
    }

    public int getId() {
        return id;
    }

    public String getYearName() {
        return yearName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }
}
