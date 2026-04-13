import java.util.*;
public class kthHighest{  public int kthHighest(int[] salaries, int k) {
        Set<Integer> set = new HashSet<>();

        for (int salary : salaries) {
            set.add(salary);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        if (k > list.size()) return -1;

        return list.get(k - 1);
    }

    public static void main(String[] args) {
        kthHighest obj = new kthHighest();
        int[] salaries = {5000, 7000, 7000, 9000};
        int k = 2;

        System.out.println(obj.kthHighest(salaries, k)); // Output: 7000
    }
}