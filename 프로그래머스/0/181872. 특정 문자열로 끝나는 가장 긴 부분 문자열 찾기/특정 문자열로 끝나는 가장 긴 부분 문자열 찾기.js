function solution(myString, pat) {
    var answer = '';
    for (let i = 0; i < myString.length - pat.length + 1; i++) {
        if (myString.substr(i, pat.length) == pat) {
            answer = myString.substring(0, i + pat.length)
        }
    }
    return answer;
}