class Solution {
    public String solution(int age) {
        char[] abc = {'a','b','c','d','e','f','g','h','i','j'};
        String age_str = String.valueOf(age);
        String answer = "";

        for(int i=0; i<age_str.length(); i++) {
            answer += abc[age_str.charAt(i)-'0'];
        }

        return answer;
    }
}