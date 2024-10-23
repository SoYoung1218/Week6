//10. 문제: 배열 요소의 평균 구하기
//설명: 배열 20, 30, 50, 70, 90의 요소들의 평균을 구하고 출력하는 프로그램을 작성

public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {20,30,50,70,90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println(average);
    }
}
