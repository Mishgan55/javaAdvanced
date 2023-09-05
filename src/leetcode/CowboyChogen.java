package leetcode;
import java.util.*;

import java.util.*;

public class CowboyChogen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();
        long maxWeight = 0;

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            long w = scanner.nextLong();
            edges.add(new Edge(u, v, w));
            maxWeight = Math.max(maxWeight, w);
        }

        long left = 0;
        long right = maxWeight;

        while (left < right) {
            long mid = (left + right + 1) / 2;
            if (canPreserveStates(edges, mid, n)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(left);
    }

    private static boolean canPreserveStates(List<Edge> edges, long x, int n) {
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);
        int components = n;

        for (Edge edge : edges) {
            if (edge.weight <= x) {
                int u = edge.u;
                int v = edge.v;
                int pu = find(parent, u);
                int pv = find(parent, v);
                if (pu != pv) {
                    parent[pu] = pv;
                    components--;
                }
            }
        }

        return components == 1;
    }

    private static int find(int[] parent, int u) {
        if (parent[u] == -1) {
            return u;
        }
        return parent[u] = find(parent, parent[u]);
    }

    static class Edge {
        int u, v;
        long weight;

        Edge(int u, int v, long weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
}