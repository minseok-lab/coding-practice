function solution(n_str) {
    var answer = '';
    for (let i = 0; i < n_str.length; i++) {
        if (n_str.charAt(i) === '0') {
            answer += '';
        } else {
            // 0이 아닌 지점을 만나면 끝까지 출력하고 반복문 탈출
            answer += n_str.substring(i, n_str.length);
            break;
        }
    }
    return answer;
}