function solution(arr1, arr2) {
    var answer = 0;
    let sumArr1 = 0;
    let sumArr2 = 0;
    if (arr1.length !== arr2.length) {
        if (arr1.length > arr2.length) {
            answer = 1;
        } else {
            answer = -1;
        }
    } else {
        for (let i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }
        if (sumArr1 === sumArr2) {
            answer = 0;
        } else if (sumArr1 > sumArr2) {
            answer = 1;
        } else {
            answer = -1;
        }
    }
    return answer;
}