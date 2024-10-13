import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(100);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);

            for (Integer integer : set) {
                if ((integer%2 == 0) & (integer > 15)) {
                    System.out.println(integer);
                } else {
                    System.out.println(integer/2);
                }
            }
        }


    }