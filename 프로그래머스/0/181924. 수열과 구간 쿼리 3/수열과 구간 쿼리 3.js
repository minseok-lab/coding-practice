function solution(arr, queries) {
    var answer = [];
    var tempNum = 0;
    for (let i = 0; i < queries.length; i++) {
        tempNum = arr[queries[i][0]];
        arr[queries[i][0]] = arr[queries[i][1]];
        arr[queries[i][1]] = tempNum;
    }
    for (let i = 0; i < arr.length; i++) {
        answer[i] = arr[i];
    }
    return answer;
}