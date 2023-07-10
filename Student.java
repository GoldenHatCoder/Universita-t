public class Student {
    private String name;
    private int alter;
    private Studiengang studiengang;

    public Student(String name, int alter, Studiengang studiengang) {
        this.name = name;
        this.alter = alter;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", studiengang=" + studiengang +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Student && ((Student) obj).getName().equals(name);
    }
}
