function solution(num_list, n) {
    var answer = [];
    var index = 0;
    for (let i = 0; i < num_list.length; i += n) {
        answer[index] = num_list[i];
        index++;
    }
    return answer;
}