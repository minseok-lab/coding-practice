function solution(s) {
    var answer = [0, 0];
    
    while (s !== '1') {
        let newNum = 0;
        for (let i = 0; i < s.length; i++) {
            if (s.charAt(i) === '1') {
                newNum++;
            } else {
                answer[1]++;
            }
        }
        answer[0]++;
        s = newNum.toString(2);
    }
    return answer;
}