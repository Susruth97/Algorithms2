import java.io.*;
import java.util.*;

public class snl {
    private static final int N = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        while (total > 0) {
            total--;
            int[] store = new int[N + 1];
            int ladders = sc.nextInt();
            for (int i = 0; i < ladders; i++) {
                int from = sc.nextInt();
                store[from] = sc.nextInt() - from;
            }
            int snakes = sc.nextInt();
            for (int i = 0; i < snakes; i++) {
                int from = sc.nextInt();
                store[from] = sc.nextInt() - from;
            }
            QueueEntry entry = new QueueEntry(1, 0);
            Queue<QueueEntry> queue = new LinkedList<QueueEntry>();
            queue.add(entry);
            boolean[] visited = new boolean[N + 1];
            boolean hasRes = false;
            while (!queue.isEmpty()) {
                entry = queue.poll();
                if (entry.pos == N) {
                    System.out.println(entry.step);
                    hasRes = true;
                    break;
                }
                if (visited[entry.pos] == true) {
                    continue;
                }
                visited[entry.pos] = true;
                for (int i = 1; i <= 6 && entry.pos + i <= N; i++) {
                    int nextPos = entry.pos + i;
                    if (store[nextPos] != 0) {
                        QueueEntry nextEntry = new QueueEntry(nextPos + store[nextPos], entry.step + 1);
                        queue.offer(nextEntry);
                    } else {
                        QueueEntry nextEntry = new QueueEntry(nextPos, entry.step + 1);
                        queue.offer(nextEntry);
                    }
                }
            }
            if (hasRes == false) {
                System.out.println(-1);
            }
        }
    }
    static class QueueEntry {
        int pos;
        int step;
        public QueueEntry (int pos, int step) {
            this.pos = pos;
            this.step = step;
        }
    }
}