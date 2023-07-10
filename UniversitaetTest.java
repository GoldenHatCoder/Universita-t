public class UniversitaetTest {
    public static void main(String[] args) {
        Universitaet universitaet = new Universitaet();

        universitaet.addStudent(new Student("Max", 20, Studiengang.INFORMATIK));
        universitaet.addStudent(new Student("Moritz", 21, Studiengang.INFORMATIK));
        universitaet.addStudent(new Student("Erika", 22, Studiengang.WIRTSCHAFTSINFORMATIK));
        universitaet.addStudent(new Student("Hans", 23, Studiengang.PHYSIK));
        universitaet.addStudent(new Student("Peter", 24, Studiengang.ARCHITEKTUR));
        universitaet.addStudent(new Student("Paul", 25, Studiengang.MASCHINENBAU));

        universitaet.printStudenten();
        System.out.println();
        System.out.println("Studenten im Studiengang Informatik:");
        universitaet.printStudentenNachStudiengang(Studiengang.INFORMATIK);

        universitaet.removeStudent(new Student("Max", 20, Studiengang.INFORMATIK));
        System.out.println();
        System.out.println("Studenten im Studiengang Informatik:");
        universitaet.printStudentenNachStudiengang(Studiengang.INFORMATIK);

        System.out.println();
        System.out.println("Studenten im Studiengang Wirtschaftsinformatik:");
        universitaet.printStudentenNachStudiengang(Studiengang.WIRTSCHAFTSINFORMATIK);

        System.out.println();
        System.out.println("Alle Studenten:");
        universitaet.printStudenten();
    }
}
