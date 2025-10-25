function solution(myString) {
    var answer = [];
    let splitStr = myString.split("x").sort();
    let index = 0;
    for (let i = 0; i < splitStr.length; i++) {
        if (splitStr[i] !== "") {
            answer[index] = splitStr[i];
            index++;
        }
    }
    return answer;
}