class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 문자열을 문자 배열로 변환
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer += ch;
            }
        }

        return answer;
    }
}