function solution(arr) {
    var answer = [];
    
    if (arr.length === 1) {
        answer[0] = -1;
    } else {
        let minNum = Math.min(...arr);
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] !== minNum) {
                answer.push(arr[i]);
            }
        }
    }
    
    return answer;
}