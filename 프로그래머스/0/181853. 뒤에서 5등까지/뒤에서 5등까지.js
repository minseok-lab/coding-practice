function solution(num_list) {
    var answer = [];
    // 숫자 비교를 위해서 (a, b) => a - b 사용
    var sortList = num_list.sort((a, b) => a - b);
    var index = 0;
    for (let i = 0; i < 5; i++) {
        answer[index] = sortList[i];
        index++;
    }
    return answer;
}