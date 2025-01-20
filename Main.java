import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<Integer> multiplesOf3 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            multiplesOf3.add(i * 3);
        }
        System.out.println("Original List of Multiples of 3:");
        System.out.println(multiplesOf3);

       
        for (int i = 0; i < multiplesOf3.size(); i++) {
            if (multiplesOf3.get(i) % 2 == 0) {
                multiplesOf3.remove(i);
                i--; 
            }
        }

        System.out.println("List After Removing Even Multiples of 3:");
        System.out.println(multiplesOf3);
    }
}
