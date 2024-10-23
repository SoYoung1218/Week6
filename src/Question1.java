//1. 문제: 배열의 선언 및 초기화
// 정수형 배열을 선언하고
//크기를 5로 지정한 뒤, 각 요소를 1, 2, 3, 4, 5로 초기화
// 모든 요소를 출력하는 프로그램을 작성//

public class Question1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
