public class Semester {
    private int id;
    private String semesterName;
    private int yearId;

    public Semester() {
        super();
    }

    public Semester(int id, String semesterName, int yearId) {
        super();
        this.id = id;
        this.semesterName = semesterName;
        this.yearId = yearId;
    }

    public int getId() {
        return id;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }
}
