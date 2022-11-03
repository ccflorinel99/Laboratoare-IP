public class Student implements Human{
    protected String full_name, acronim_facultate;
    protected int varsta;
    protected int an_de_studiu;

    Student(String nume, String prenume, String acronim_facultate, int varsta, int an_de_studiu)
    {
        this.full_name = nume + " " + prenume;
        this.acronim_facultate = acronim_facultate;
        this.varsta = varsta;
        this.an_de_studiu = an_de_studiu;
    }

    @Override
    public String toString()
    {
        String str = "Sd. " + full_name + ", Anul " + an_de_studiu + ", Fac. " + acronim_facultate + ", Varsta " + varsta;
        return str;
    }

    public void greeting()
    {
        System.out.println(this.toString());
    }
    public void doWork()
    {
        System.out.println("Sunt " + full_name + " si acum muncesc");
    }
}
