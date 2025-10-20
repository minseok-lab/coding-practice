function solution(arr, delete_list) {
    var answer = [];
    var index = 0;
    // arr 배열을 순회
    for (let i = 0; i < arr.length; i++) {
        // 만약 arr[i]가 delete_list에 포함되어 있지 않다면
        if (!delete_list.includes(arr[i])) {
            // answer 배열에 추가하고 index 증가
            answer[index] = arr[i];
            index++;
        }
    }
    return answer;
}