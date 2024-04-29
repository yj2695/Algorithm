class Solution {
    public String solution(String phone_number) {
		String star = "*";
		String answer = star.repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4);

        return answer;
    }
}