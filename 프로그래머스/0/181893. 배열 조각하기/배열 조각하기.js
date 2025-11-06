function solution(arr, query) {
    for (let i = 0; i < query.length; i++) {
        if (i % 2 == 0) {
            // query[i] + 1 번째 인덱스부터 끝까지 삭제
            arr.splice(query[i] + 1);
            /*
            for (let j = 0; j < arr.length - query[i]; j++) {
                arr.pop();
            } */
        } else {
            // 0 번째 인덱스부터 query[i] 개수만큼 삭제
            arr.splice(0, query[i]);
            /*
            for (let j = 0; j < query[i]; j++) {
                arr.shift();
            } */
        }
    }
    return arr;
}