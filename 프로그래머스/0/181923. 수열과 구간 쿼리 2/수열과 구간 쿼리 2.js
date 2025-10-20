function solution(arr, queries) {
    var answer = [];
    var smallNum; // 최솟값을 가질 변수
    for (let i = 0; i < queries.length; i++) {
        smallNum = Infinity; // 매 반복 시작 시 최댓값으로 초기화
        for (let j = queries[i][0]; j <= queries[i][1]; j++) {
            // arr 배열의 j값이 크거나 최솟값보다 작은
            if (queries[i][2] < arr[j] && arr[j] < smallNum) {
                smallNum = arr[j];
            }
        }
        // 여전히 최댓값이면 -1, 아니면 변경된 최솟값을 삽입
        if (smallNum === Infinity) {
            answer[i] = -1;
        } else {
            answer[i] = smallNum;
        }
    }
    return answer;
}