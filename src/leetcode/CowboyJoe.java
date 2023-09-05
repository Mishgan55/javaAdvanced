import java.io.*;
import java.util.*;

public class CowboyJoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        String result = canGetWinningSequence(n, a, b);
        System.out.println(result);
    }

    public static String canGetWinningSequence(int n, int[] a, int[] b) {
        int l = 0;
        int r = n - 1;

        // Находим начальный индекс l
        while (l < n && a[l] == b[l]) {
            l++;
        }

        // Если l достигло конца массива, то последовательность уже выигрышная
        if (l == n) {
            return "YES";
        }

        // Находим конечный индекс r
        while (r >= 0 && a[r] == b[r]) {
            r--;
        }

        // Сортируем подотрезок a[l:r+1]
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Проверяем, равен ли подотрезок b[l:r+1] отсортированному подотрезку a[l:r+1]
        for (int i = l; i <= r; i++) {
            if (a[i] != b[i]) {
                return "NO";
            }
        }

        return "YES";
    }
}
