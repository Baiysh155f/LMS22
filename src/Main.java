import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
        }
        System.out.println(numbers);
        ArrayList<Integer> taksan = new ArrayList<>();
        taksan.addAll(numbers);
        int counter1 = 1;
        for (Integer taksandar : taksan) {
            if (taksandar % 2 == 1) {
                System.out.println(counter1+++":"+"taksandar = " + taksandar);
            }
        }
        System.out.println("_______________________________");
        ArrayList<Integer> jupsan= new ArrayList<>();
        jupsan.addAll(numbers);
        int counter = 1;
        for (Integer jupsandar:jupsan) {
            if (jupsandar%2==0){
                System.out.println(counter+++":"+"jupsandar = "+ jupsandar);
            }
        }
        System.out.println();
        System.out.println("total nambers :"+50);
    }

}


