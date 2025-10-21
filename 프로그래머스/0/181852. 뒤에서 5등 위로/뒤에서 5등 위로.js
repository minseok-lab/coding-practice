function solution(num_list) {
    var answer = [];
    var index = 0;
    var sort_num_list = num_list.sort((a, b) => a - b);
    for (let i = 5; i < sort_num_list.length; i++) {
        answer[index] = sort_num_list[i];
        index++;
    }
    return answer;
}