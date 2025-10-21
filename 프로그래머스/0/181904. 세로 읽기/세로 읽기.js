function solution(my_string, m, c) {
    var answer = '';
    var splitStr = [];
    var index = 0;
    for (let i = 0; i < my_string.length / m; i++) {
        splitStr[index] = my_string.substring(i * m, (i + 1) * m)
        index++;
    }
    for (let i = 0; i < splitStr.length; i++) {
        answer += splitStr[i][c - 1];
    }
    return answer;
}