import java.util.*;
import java.io.*;

public class Test33_矩阵取数 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      int N = Integer.parseInt(reader.readLine());
      int[][] a = new int[N][N];
      for (int i = 0; i < N; i++) { // 层数
        StringTokenizer stk = new StringTokenizer(reader.readLine());
        for (int j = 0; j < N; j++) { // 每一层读取的个数
          int tmp = Integer.parseInt(stk.nextToken());
          if (i == 0 && j == 0) {
            a[i][j] = tmp;
            continue;
          }
          if (j == 0) {
            a[i][j] = a[i - 1][j] + tmp;
          } else {
            if (i == 0) { // 第一行
              a[i][j] = a[i][j - 1] + tmp;
            } else { // 其余行
              a[i][j] = Math.max(a[i][j - 1], a[i - 1][j]) + tmp;
            }
          }
        }
      }
      System.out.println(a[N - 1][N - 1]);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
