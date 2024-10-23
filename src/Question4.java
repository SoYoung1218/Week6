//4. 문제: 배열의 최대값 찾기
//설명: 배열 3, 7, 2, 9, 4에서 가장 큰 값을 찾고
// 출력하는 프로그램을 작성

public class Question4 {
    public static void main(String[] args) {
        int [] numbers = {3,7,2,9,4};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
