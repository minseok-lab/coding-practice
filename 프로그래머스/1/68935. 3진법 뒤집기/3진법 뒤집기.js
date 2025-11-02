function solution(n) {
    // 1. 10진법 -> 3진법 문자열로 (45 -> "1200")
    let triple = n.toString(3);
    
    // 2. 문자열 뒤집기 ("1200" -> "0021")
    let reversedTriple = triple.split('').reverse().join('');
    
    // 3. 뒤집힌 3진법 문자열 -> 10진법 숫자로
    // "0021" 문자열을 3진법으로 해석해서 10진법(7)으로 바꿔라
    let answer = parseInt(reversedTriple, 3);
    return answer;
}