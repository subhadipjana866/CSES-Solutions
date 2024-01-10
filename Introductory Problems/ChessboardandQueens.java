import java.util.Scanner;

public class ChessboardandQueens {
    static int N = 8;
    static String[] board = new String[N];
    static boolean[] col = new boolean[N];
    static boolean[] rightDiag = new boolean[2 * (N - 1)+1];
    static boolean[] leftDiag = new boolean[2 * (N - 1)+1];
    static int count = 0;

    static void putNext(int r) {
        if (r == N) {
            count++;
            return;
        }

        for (int c = 0; c < N; c++) {

            if (col[c] == false && leftDiag[r - c + N - 1] == false && rightDiag[r + c] == false
                    && board[r].charAt(c) == '.') {
                col[c] = leftDiag[r - c + N - 1] = rightDiag[r + c] = true;
                putNext(r + 1);
                col[c] = leftDiag[r - c + N - 1] = rightDiag[r + c] = false;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine();
        }
        sc.close();
        putNext(0);
        System.out.println(count);
    }
}