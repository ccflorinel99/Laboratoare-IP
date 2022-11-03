public class Student {
    protected Person p;

    Student(String nume, String prenume, String acronim_facultate, int varsta, int an_de_studiu)
    {
        p = new Person(nume, prenume, acronim_facultate, varsta, an_de_studiu);
    }

    @Override
    public String toString()
    {
        return p.toString();
    }
}
