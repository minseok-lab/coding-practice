function solution(phone_number) {
    var answer = '';
    for (var i = 0; i < phone_number.length; i++) {
        if (i >= phone_number.length - 4) {
            answer += phone_number.charAt(i);
        } else {
            answer += '*';
        }
    }
    return answer;
}