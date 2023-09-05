package leetcode;
import java.io.*;
import java.util.*;

public class CowboyRobbery {
    static int n, m;
    static List<List<Edge>> adj;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        adj = new ArrayList<>();
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int maxEdgeWeight = 0;

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            maxEdgeWeight = Math.max(maxEdgeWeight, w);
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }

        int left = 0;
        int right = maxEdgeWeight;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDivideIntoStates(mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    static boolean canDivideIntoStates(int x) {
        int components = 0;
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, x);
            }
        }

        return components == 1;
    }

    static void dfs(int u, int x) {
        visited[u] = true;

        for (Edge edge : adj.get(u)) {
            if (!visited[edge.v] && edge.w <= x) {
                dfs(edge.v, x);
            }
        }
    }

    static class Edge {
        int v, w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}
