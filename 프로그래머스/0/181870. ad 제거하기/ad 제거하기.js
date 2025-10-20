function solution(strArr) {
    var answer = [];
    var index = 0;
    for (let i = 0; i < strArr.length; i++) {
        if (!strArr[i].includes("ad")) {
            answer[index] = strArr[i];
            index++;
        }
    }
    return answer;
}