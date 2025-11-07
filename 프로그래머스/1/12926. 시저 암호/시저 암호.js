function solution(s, n) {
    var answer = '';
    for (let i = 0; i < s.length; i++) {
        
        if (s.charAt(i) === ' ') {
            answer += ' ';
        } 
        
        else if ('A'.charCodeAt(0) <= s.charCodeAt(i) && s.charCodeAt(i) <= 'Z'.charCodeAt(0)) {
            let newCode = s.charCodeAt(i) + n;
            if (newCode > 'Z'.charCodeAt(0)) {
                newCode -= 26;
            }
            answer += String.fromCharCode(newCode);
        } 
        
        else if ('a'.charCodeAt(0) <= s.charCodeAt(i) && s.charCodeAt(i) <= 'z'.charCodeAt(0)) {
            let newCode = s.charCodeAt(i) + n;
            if (newCode > 'z'.charCodeAt(0)) {
                newCode -= 26;
            }
            answer += String.fromCharCode(newCode);
        }
    }
    return answer;
}