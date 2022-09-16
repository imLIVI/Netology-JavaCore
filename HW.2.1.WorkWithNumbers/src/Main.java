import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        list.stream()
                .filter(num -> num > 0)
                .filter(num -> num % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }
}
