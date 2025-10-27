function solution(arr, k) {
    var answer = [];
    let index = 0;
    answer.length = k;
    answer.fill(-1);
    
    for (let i = 0; i < arr.length; i++) {
        if (!answer.includes(arr[i])) {
            answer[index] = arr[i];
            index++;
        }
    }
    
    while (answer.length !== k) {
        answer.pop();
    }
    return answer;
}