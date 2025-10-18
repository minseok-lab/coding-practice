function solution(num_list, n) {
    var answer = [];
    for (let i = 0; i < num_list.length - n + 1; i++) {
        answer[i] = num_list[(n - 1) + i];
    }
    return answer;
}