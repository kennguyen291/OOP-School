public class Class {
    private int id;
    private String className;
    private int primaryTeacherId;
    private int roomId;

    public Class() {
        super();
    }

    public Class(int id, String className) {
        super();
        this.id = id;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public int getPrimaryTeacherId() {
        return primaryTeacherId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setPrimaryTeacherId(int primaryTeacherId) {
        this.primaryTeacherId = primaryTeacherId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
