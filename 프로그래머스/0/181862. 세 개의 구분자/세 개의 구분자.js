function solution(myStr) {
    var answer = myStr.split(/[abc]/).filter(Boolean);
    if (answer.length === 0) {
        answer[0] = "EMPTY";
    }
    return answer;
}