function solution(my_string) {
    var answer = [];
    let index = 0;
    for (let i = 0; i < my_string.length; i++) {
        answer[index] = my_string.substring(i);
        index++;
    }
    answer.sort();
    return answer;
}