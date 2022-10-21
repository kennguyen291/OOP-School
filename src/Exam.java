public class Exam {
    private int id;
    private int studentId;
    private int subjectId;
    private int semesterId;
    private int examTypeId;
    private int yearId;
    private double point;
    private int heSo;

    private int count;

    public Exam() {
        super();
    }

    public Exam(int id, int studentId, int subjectId, int examTypeId, int semesterId, double point) {
        super();
        this.id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.semesterId = semesterId;
        this.examTypeId = examTypeId;
        this.point = point;
//        this.yearId = yearId;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public int getExamTypeId() {
        return examTypeId;
    }

    public double getPoint() {
        return point;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public void setExamTypeId(int examTypeId) {
        this.examTypeId = examTypeId;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
