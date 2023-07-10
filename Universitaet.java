import java.util.ArrayList;
import java.util.HashMap;

public class Universitaet {
    private ArrayList<Student> studenten = new ArrayList<>();
    private HashMap<Studiengang, ArrayList<Student>> studentenNachStudiengang = new HashMap<>();

    
    public void addStudent(Student student) {
        studenten.add(student);
        studentenNachStudiengang.putIfAbsent(student.getStudiengang(), new ArrayList<>());
        studentenNachStudiengang.get(student.getStudiengang()).add(student);
    }

    public void removeStudent(Student student) {
        for(Student s : studenten){
            if(s.getName().equals(student.getName())){
                studenten.remove(s);
                break;
            }
        }

        for(Student s : studentenNachStudiengang.get(student.getStudiengang())){
            if(s.getName().equals(student.getName())){
                studentenNachStudiengang.get(student.getStudiengang()).remove(s);
                break;
            }
        }
    }

    /*
     * Diese Version der removeStudent-Methode kann nur genutzt werden, wenn die equals-Methode in Student überschrieben wurde.
     * Wäre die equals-Methode nicht überschrieben, würde die remove-Methode nicht funktionieren. Die default equals-Methode
     * checkt nämlich die Identität der Objekte, nicht aber deren Inhalte. Identität bedeutet, dass zwei Objekte die gleiche
     * Speicheradresse haben. Inhaltlich können zwei Objekte komplett identisch sein, aber trotzdem unterschiedliche
     * Speicheradressen haben. Deshalb muss die equals-Methode überschrieben werden, damit die remove-Methode funktioniert.
     */
    public void removeStudentVersionB(Student student) {
        studenten.remove(student);
        studentenNachStudiengang.get(student.getStudiengang()).remove(student);
    }

    public void printStudenten() {
        for (Student student : studenten) {
            System.out.println(student);
        }
    }

    public void printStudentenNachStudiengang(Studiengang studiengang) {
        for (Student student : studentenNachStudiengang.get(studiengang)) {
            System.out.println(student);
        }
    }
}
