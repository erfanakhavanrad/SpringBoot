package session1;

public class InstituteDescription {
    String name;
    String address;
    String activity;

    public InstituteDescription(String name, String address, String activity) {
        this.name = name;
        this.address = address;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "InstituteDescription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
