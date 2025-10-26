function solution(strArr) {
    var answer = 0;
    let answerArr = new Array(31).fill(0);
    for (let i = 0; i < strArr.length; i++) {
        answerArr[strArr[i].length]++;
    }
    for (let i = 0; i < answerArr.length; i++) {
        if (answer < answerArr[i]) {
            answer = answerArr[i];
        }
    }
    return answer;
}