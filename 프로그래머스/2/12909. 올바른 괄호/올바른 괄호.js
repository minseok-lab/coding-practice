function solution(s){
    var answer = true;
    let list = [];
    
    if (s.charAt(0) === ')' || s.charAt(s.length - 1) === '(') {
        answer = false;
        return false;
    }
    
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === '(') {
            list.push(0);
        } else {
            if (list.length === 0) {
                answer = false;
                return answer
            } else {
                list.pop();
            }
        }
    }

    if (list.length !== 0) {
        answer = false;
    }
    
    return answer;
}