class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 + 1;           // 잘라낼 구간의 크기
        int[] answer = new int[size];         // 결과 배열 생성

        for (int i = 0; i < size; i++) {
            answer[i] = numbers[num1 + i];    // 순서대로 값을 복사
        }

        return answer;
    }
}