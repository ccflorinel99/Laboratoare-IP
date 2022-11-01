public class Carte implements Comparable<Carte>{
    protected String titlu, autor;
    protected int an_aparitie, nr_pagini;

    Carte(String titlu, String autor, int an_aparitie, int nr_pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.an_aparitie = an_aparitie;
        this.nr_pagini = nr_pagini;
    }

    @Override
    public String toString() {
        return titlu + " scrisa de " + autor + " publicata in anul " + an_aparitie;
    }

    @Override
    public int compareTo(Carte c)
    {
        if(nr_pagini == c.nr_pagini)
            return 1;
        else
            return 0;
    }
}
