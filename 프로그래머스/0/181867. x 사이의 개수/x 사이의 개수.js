function solution(myString) {
    let answer = [];
    let index = 0;
    const splitStr = myString.split("x");
    for (let i = 0; i < splitStr.length; i++) {
        answer[index] = splitStr[i].length;
        index++;
    }
    return answer;
}