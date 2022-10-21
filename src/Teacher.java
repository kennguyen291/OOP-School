public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private int bangChamCongId;

    public Teacher() {
        super();
    }

    public Teacher(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getBangChamCongId() {
        return bangChamCongId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBangChamCongId(int bangChamCongId) {
        this.bangChamCongId = bangChamCongId;
    }
}
