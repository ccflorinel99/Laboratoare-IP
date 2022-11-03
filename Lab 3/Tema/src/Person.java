public class Person {
    protected String nume, prenume, acronim_facultate;
    protected int varsta;
    protected String materie;
    protected int an_de_studiu;

    protected String tip;

    Person(String nume, String prenume, String acronim_facultate, int varsta, int an_de_studiu)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.acronim_facultate = acronim_facultate;
        this.varsta = varsta;
        this.an_de_studiu = an_de_studiu;
        this.tip = "Sd.";
    }

    Person(String nume, String prenume, String acronim_facultate, int varsta, String materie)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.acronim_facultate = acronim_facultate;
        this.varsta = varsta;
        this.materie = materie;
        this.tip = "Prof.";
    }

    @Override
    public String toString()
    {
        String str = tip + " " + nume + " " + prenume + ", ";

        if(tip == "Sd.") // student
            str += "Anul " + an_de_studiu + ", Fac. " + acronim_facultate + ", Varsta " + varsta;
        else
            str += "Fac. " + acronim_facultate + ", Varsta " + varsta + ", Materia predata: " + materie;

        return str;
    }
}
