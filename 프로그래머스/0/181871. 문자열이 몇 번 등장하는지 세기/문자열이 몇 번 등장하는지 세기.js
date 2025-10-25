function solution(myString, pat) {
    var answer = 0;
    for (let i = 0; i < myString.length - pat.length + 1; i++) {
        if (myString.substring(i,i + pat.length).includes(pat)) {
            answer++;
        }
    }
    return answer;
}