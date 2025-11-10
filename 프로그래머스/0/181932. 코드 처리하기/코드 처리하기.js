function solution(code) {
    var answer = '';
    let mode = 0; 
    
    for (let idx = 0; idx < code.length; idx++) {
        if (code[idx] === '1') {
            mode = 1 - mode;
        } else {
            if (mode === 0) {
                if (idx % 2 === 0) {
                    answer += code[idx];
                }
            } else {
                if (idx % 2 !== 0) {
                    answer += code[idx];
                }
            }
        }
    }
    
    if (answer.length === 0) {
        answer = "EMPTY";
    }
    return answer;
}