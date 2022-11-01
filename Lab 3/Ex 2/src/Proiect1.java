public class Proiect1 {
    public static void main(String[] args)
    {
        Biblioteca b1 = new Biblioteca(), b2 = new Biblioteca(), b3 = new Biblioteca();
        Carte c1 = new Carte("Strainul", "Albert Camus", 1942, 580);
        Carte c2 = new Carte("In cautarea timpului pierdut", "Marcel Proust", 1927, 719);
        Carte c3 = new Carte("La poalele vulcanului", "Malcolm Lowry", 1947, 136);
        Carte c4 = new Carte("Copiii din miez de noapte", "Salman Rushide", 1981, 136);

        b1.add(c1);
        b1.add(c2);
        b2.add(c3);
        b2.add(c4);

        System.out.println("Biblioteca nr 1: " + b1.toString());
        System.out.println("Biblioteca nr 2: " + b2.toString());
        System.out.println("Biblioteca nr 3: " + b3.toString());

        b3 = b1;
        System.out.println("Biblioteca nr 3: " + b3.toString());

        b3.combine(b2);
        System.out.println("Biblioteca nr 3: " + b3.toString());
    }
}
