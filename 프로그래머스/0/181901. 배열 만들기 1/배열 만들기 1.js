function solution(n, k) {
    var answer = [];
    for (let i = 1; i <= (n / k); i++) {
        answer[i-1] = k * i;
    }
    return answer;
}