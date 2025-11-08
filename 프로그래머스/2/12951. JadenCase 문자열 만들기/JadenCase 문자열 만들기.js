function solution(s) {
    var answer = '';
    const lowerStr = s.toLowerCase();
    const splitStr = lowerStr.split(' ');
    
    for (let i = 0; i < splitStr.length; i++) {
        for (let j = 0; j < splitStr[i].length; j++) {
            if (splitStr[i].charAt(0) === '') {
                answer += '';
            } else if ('a'.charCodeAt(0) <= splitStr[i].charCodeAt(0) && splitStr[i].charCodeAt(0) <= 'z'.charCodeAt(0)) {
                if (j === 0) {
                    answer += splitStr[i].charAt(0).toUpperCase();
                } else {
                    answer += splitStr[i][j];
                }
            } else {
                answer += splitStr[i][j];
            }
        }
        answer += ' ';
    }
    
    return answer.slice(0, -1);
}