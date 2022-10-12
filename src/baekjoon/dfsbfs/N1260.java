package baekjoon.dfsbfs;

import java.util.*;

public class N1260 {

    private static boolean[] dVisited;
    private static boolean[] bVisited;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        dVisited = new boolean[n + 1];
        bVisited = new boolean[n + 1];
        for (int i = 0; i < n+1 ; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 양쪽에 모두 더해주어야한다
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < n + 1; i++) {
            //정점 번호 작은것 부터 방문하므로 정렬
            Collections.sort(graph.get(i));
        }

        dfs(v);
        System.out.println();
        bfs(v);

    }

    private static void dfs(int v) {
        dVisited[v] = true;
        System.out.print(v + " ");
        for(int i = 0; i < graph.get(v).size(); i++){
            int x = graph.get(v).get(i);
            if(!dVisited[x]) dfs(x);
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        bVisited[v] = true;

        while(!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");

            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!bVisited[y]) {
                    q.offer(y);
                    bVisited[y] = true;
                }
            }
        }
    }

}
