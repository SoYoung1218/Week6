//7. 문제: 배열 역순 출력하기
//설명: 배열 5, 10, 15, 20, 25를 역순으로 출력하는 프로그램을 작성

public class Question7 {
    public static void main(String[] args) {

        int[] numbers = {5,10,15,20,25};

        for (int i = 4; i < numbers.length; i--) {
            System.out.println(numbers[i]);
        }
    }
}
