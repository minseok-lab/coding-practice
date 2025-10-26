function solution(my_string, s, e) {
    var answer = '';
    for (let i = 0; i < my_string.length; i++) {
        if (i < s || e < i) {
            answer += my_string.charAt(i);
        } else {
            answer += my_string.charAt(s + e - i);
        }
    }
    return answer;
}