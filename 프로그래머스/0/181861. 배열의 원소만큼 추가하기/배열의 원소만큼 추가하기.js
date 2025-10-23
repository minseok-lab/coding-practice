function solution(arr) {
    let answer = [];
    let index = 0;
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i]; j++) {
            answer[index] = arr[i];
            index++;
        }
    }
    return answer;
}