function solution(arr) {
    var answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < 50) {
            if (arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        } else {
            if (arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else {
                answer[i] = arr[i];
            }
        }
    }
    return answer;
}