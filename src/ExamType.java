public class ExamType {
    private int id;
    private String name;
    private int heSo;

    public ExamType() {
        super();
    }

    public ExamType(int id, String name, int heSo) {
        super();
        this.id = id;
        this.name = name;
        this.heSo = heSo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
}
