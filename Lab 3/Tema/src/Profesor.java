import java.io.PrintWriter;

public class Profesor implements Human{
    protected String full_name, acronim_facultate, materie;
    protected int varsta;

    Profesor(String nume, String prenume, String acronim_facultate, int varsta, String materie)
    {
        this.full_name = nume + " " + prenume;
        this.acronim_facultate = acronim_facultate;
        this.varsta = varsta;
        this.materie = materie;
    }

    @Override
    public String toString()
    {
        String str = "Prof. " + full_name + "Fac. " + acronim_facultate + ", Varsta " + varsta + ", Materia predata: " + materie;
        return str;
    }

    public String greeting()
    {
        return this.toString();
    }
    public String doWork()
    {
        return "Sunt " + full_name + " si acum muncesc";
    }
}
