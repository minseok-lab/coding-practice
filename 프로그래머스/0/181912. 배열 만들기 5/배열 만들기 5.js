function solution(intStrs, k, s, l) {
    var answer = [];
    for (let i = 0; i < intStrs.length; i++) {
        if (intStrs[i].substr(s, l) > k) {
            answer.push(parseInt(intStrs[i].substr(s, l)));
        }
    }
    return answer;
}