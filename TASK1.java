import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Please enter first array's length ");
        int N = imput.nextInt();

        System.out.println("Please enter second array's length ");
        int M = imput.nextInt();

        int A[] = new int[N];
        int B[] = new int[M];

        System.out.println("Please enter first array's element's you should enter " + N + " element");
        for (int i = 0; i < A.length; i++) {
            A[i] = imput.nextInt();
        }
        System.out.println("Please enter second array's element's you should enter " + M + " element");
        for (int i = 0; i < B.length; i++) {
            B[i] = imput.nextInt();
        }
        int total = 0;
        int times = 0;
        int C[] = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    C[i] = ++total;
                }
            }
            total = 0;

            for (int t = 0; t < B.length; t++) {
                if (B[i] == B[t]) {
                    ++times;
                }
                if (times > 1) {
                    C[t] = -1;
                }
            }
            times = 0;
        }
        int c = 0;
        for (int result : C) {
            System.out.print("B[" + c + "] = " + result + " ");
            c++;
        }
    }
}


