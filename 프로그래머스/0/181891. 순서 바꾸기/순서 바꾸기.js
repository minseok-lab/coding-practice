function solution(num_list, n) {
    var answer = [];
    var index = 0;
    for (let i = n; i < num_list.length; i++) {
        answer[index] = num_list[i];
        index++;
    }
    for (let i = 0; i < n; i++) {
        answer[index] = num_list[i];
        index++;
    }
    return answer;
}