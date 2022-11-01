public class ArrayExample {
    public static void main(String[] args) {

        String[] exampleArray = {
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Marocchino", "Ristretto"
        };
        String[] exampleArray1 = {
                "Cappuccino", "Corretto", "Cortado", "Doppio",
                "Espresso", "Frappucino", "Freddo"
        };
        String[] exampleArray2 = new String[10];

        /* Metodă de copiere a unui array */
        String[] copyTo = java.util.Arrays.copyOfRange(exampleArray, 2, 9);

        /* Metodă de căutare în cadrul unui array */
        System.out.println("Cheia cautata se afla la pozitia " +
                java.util.Arrays.binarySearch(exampleArray,"Cappuccino"));

        /* Metodă de afișare a unui array */
        System.out.println(java.util.Arrays.toString(copyTo));

        /*Metodă de sortare a unui array */
        java.util.Arrays.sort(copyTo);
        System.out.println(java.util.Arrays.toString(copyTo));

        /* Metodă de testare a egalității a două array-uri */
        System.out.println("Cele doua tablouri au acelasi continut: " +
                java.util.Arrays.equals(copyTo,exampleArray1));

        /* Metodă de umplere a unui array cu o valoare default */
        java.util.Arrays.fill(exampleArray2,"Test");
        System.out.println(java.util.Arrays.toString(exampleArray2));



    }
}