public class Profesor {
    protected Person p;

    Profesor(String nume, String prenume, String acronim_facultate, int varsta, String materie)
    {
        p = new Person(nume, prenume, acronim_facultate, varsta, materie);
    }

    @Override
    public String toString()
    {
        return p.toString();
    }
}
