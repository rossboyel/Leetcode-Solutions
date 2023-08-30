
public class MultiplesOfThreeOrFive {
    public static int solution(int number) {
        int answer = 0;
        for (int i = 0; i < number; i++ ) {
            if (i % 5 == 0 || i % 3 == 0) {
                answer+= i;
            }
        }
        return answer;
    }
}
