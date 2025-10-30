function solution(arr) {
    var answer = [];
    let length = 1;
    while (length < arr.length) {
        length *= 2;
    }
    
    for (let i = 0; i < length; i++) {
        if (i < arr.length) {
            answer.push(arr[i]);
        } else {
            answer.push(0);
        }
    }
    return answer;
}