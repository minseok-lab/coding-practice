function solution(arr) {
    var answer = [];
    let maxNum = arr.length; // 최대 배열값 초기화
    
    // 원본 배열을 탐색하며 내부 배열이 최대 길이일 경우 탐색
    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length > maxNum) {
            maxNum = arr[i].length;
        }
    }
    
    // answer 배열에 값 추가
    for (let i = 0; i < maxNum; i++) {
        // answer[i] 정의 (배열)
        answer[i] = [];
        // 만약 arr.length의 길이가 i보다 크거나 같다면
        if (i >= arr.length) {
            // 모든 값에 0 추가
            for (let j = 0; j < maxNum; j++) {
                answer[i][j] = 0;
            }
        }
        // 그 외 (기존 배열 크기일 경우)
        else {
            // 기존 내부 배열을 탐색
            for (let j = 0; j < maxNum; j++) {
                // 만약 기존 내부 배열 길이보다 크거나 같다면 0 추가
                if (j >= arr[i].length) {
                    answer[i][j] = 0;
                } else { // 그 외에는 원래 값 추가
                    answer[i][j] = arr[i][j];
                }
            }
        }
    }
    return answer;
}