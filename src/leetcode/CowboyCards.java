package leetcode;
import java.util.*;

public class CowboyCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // Необходимая сумма
        int m = scanner.nextInt(); // Количество номиналов купюр
        List<Long> denominations = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            denominations.add(scanner.nextLong());
        }

        Map<Long, Integer> count = new HashMap<>();
        for (long denomination : denominations) {
            count.put(denomination, count.getOrDefault(denomination, 0) + 1);
        }

        List<Long> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (n <= 0) {
                break;
            }
            if (count.containsKey(n)) {
                result.add(n);
                count.put(n, count.get(n) - 1);
                if (count.get(n) == 0) {
                    count.remove(n);
                }
                n = 0;
            } else {
                long maxDenomination = Collections.max(denominations);
                if (n >= maxDenomination) {
                    result.add(maxDenomination);
                    n -= maxDenomination;
                } else {
                    denominations.remove(maxDenomination);
                }
            }
        }

        if (n == 0) {
            System.out.println(result.size());
            for (long value : result) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

}