function solution(strArr) {
    let answer = [];
    let index = 0;
    for (let i = 0; i < strArr.length; i++) {
        if (i % 2 == 0) {
            answer[index] = strArr[i].toLowerCase();
            index++;
        } else {
            answer[index] = strArr[i].toUpperCase();
            index++;
        }
    }
    return answer;
}