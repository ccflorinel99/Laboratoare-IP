import java.util.ArrayList;
import java.util.List;

public class BoxingExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        for(int i=0; i<10;i++) {
            li.add(i);
            // Compilatorul va face autoboxing  la runtime pentru a converti valoarea primitiva
            // in obiect, inainte de a o adauga in lista
            // li.add(Integer.valueOf(i)); - ECHIVALENT
        }
        int sum = 0;
        for(Integer i: li) {
            sum += i;
            // Compilatorul va face unboxing la runtime, deoarece operatorul += nu se aplica la obiecte Integer
            // sum += i.intValue(); - ECHIVALENT
        }
        System.out.println("The sum is equal to " + sum);
    }
}