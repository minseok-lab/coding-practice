function solution(arr, queries) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < queries.length; j++) {
            let s = queries[j][0];
            let e = queries[j][1];
            
            if (s <= i && i <= e) {
                arr[i]++;
            }
        }
    }
    return arr;
}