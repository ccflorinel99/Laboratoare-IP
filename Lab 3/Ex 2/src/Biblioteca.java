import java.util.ArrayList;

public class Biblioteca {
    protected ArrayList<Carte> carti;

    Biblioteca()
    {
        this.carti = new ArrayList<>();
    }

    public void add(Carte c)
    {
        carti.add(c);
    }

    public void combine(Biblioteca b)
    {
        for (Carte c2: b.carti)
        {
            int gasit = 0;
            for (Carte c: carti)
            {
                if(c.compareTo(c2) == 1)
                    gasit = 1;
            }

            if(gasit == 0)
                add(c2);
        }
    }
    @Override
    public String toString() {
        if(carti.isEmpty())
            return "Biblioteca este goala";
        else {
            StringBuilder builder = new StringBuilder();
            int no = carti.size();
            int counter = 0;
            for (Carte carte : carti) {
                builder.append(carte.toString());
                counter++;

                if (counter < no)
                    builder.append(", ");
            }

            return builder.toString();
        }
    }
}
