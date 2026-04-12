import java.util.*;
public class maxCustomers{
    public static int maxCustomers(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int i = 0, j = 0;
        int currentCustomers = 0, maxCustomers = 0;

        while (i < arrivals.length && j < departures.length) {
            if (arrivals[i] < departures[j]) {
                currentCustomers++;
                maxCustomers = Math.max(maxCustomers, currentCustomers);
                i++;
            } else {
                currentCustomers--;
                j++;
            }
        }

        return maxCustomers;
    }

    public static void main(String[] args) {
        int[] arrivals = {1, 2, 3, 4};
        int[] departures = {2, 3, 4, 5};

        int result = maxCustomers(arrivals, departures);
        System.out.println("Maximum number of customers in the store at any time: " + result);
    }
}