//9. 문제: 배열 복사하기
//설명: 배열 1, 2, 3, 4, 5를 다른 배열로 복사한 후,
// 복사된 배열을 출력하는 프로그램을 작성

public class Question9 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int [] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " / " +  numbers[i]);
        }
    }
}