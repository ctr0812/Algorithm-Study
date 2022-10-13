package baekjoon.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N2606 {

    private static boolean[] bvisited;
    private static boolean[] dvisited;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int bcnt;
    private static int dcnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        bvisited = new boolean[n + 1];
        dvisited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        bfs(1);
        dfs(1);

//        System.out.println(bcnt -1);
        System.out.println(dcnt -1);
    }

    private static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        bvisited[x] = true;
        bcnt++;

        while (!q.isEmpty()) {
            int y = q.poll();
            for (int i = 0; i < graph.get(y).size(); i++) {
                int z = graph.get(y).get(i);
                if (!bvisited[z]) {
                    q.offer(z);
                    bvisited[z] = true;
                    bcnt++;
                }
            }
        }
    }

    private static void dfs(int x) {
        dvisited[x] = true;
        dcnt++;

        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!dvisited[y]) {
                dfs(y);
            }
        }
    }
}
