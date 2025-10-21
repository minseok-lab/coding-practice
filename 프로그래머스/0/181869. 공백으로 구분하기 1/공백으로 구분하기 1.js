function solution(my_string) {
    var answer = [];
    var splitStr = my_string.split(" ");
    var index = 0;
    for (let i = 0; i < splitStr.length; i++) {
        answer[index] = splitStr[i];
        index++;
    }
    return answer;
}