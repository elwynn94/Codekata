import java.util.Arrays;

class Solution9 {
    double answer = 0;

    public double solution(int[] arr) {
        for (int i : arr) {
            answer = Arrays.stream(arr).average().getAsDouble();
        }
        return answer;
    }
}
