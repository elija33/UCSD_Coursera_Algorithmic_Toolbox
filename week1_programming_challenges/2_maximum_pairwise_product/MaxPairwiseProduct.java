import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    public static int getMaxPairwiseProduct(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }

    public static int getMaxPairwiseProductNeed(int number[]){
        int size = number.length;

        int max_number = -1;
        for(int i = 0; i<size; i++){
            if((max_number == -1) || (number[i] > number[max_number])){
                max_number = i;
            }

            int max_number2 = -1;
            for(int j = 0; j<size; j++){
                if((j != max_number) && ((max_number2 == -1) || (number[j] > number[max_number2]))){
                    max_number2 = j;
                }
            }
        }
        return number[max_number] * number[max_number];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
