function solution(n, arr1, arr2) {
    var answer = [];
    let binaryStringArr1 = [];
    let binaryStringArr2 = [];
    
    for (let i = 0; i < n; i++) {
        binaryStringArr1.push(arr1[i].toString(2).padStart(n, 0));
        binaryStringArr2.push(arr2[i].toString(2).padStart(n, 0));
    }
    
    for (let i = 0; i < n; i++) {
        answer[i] = '';
        for (let j = 0; j < n; j++) {
            if (binaryStringArr1[i].charAt(j) === '1' || binaryStringArr2[i].charAt(j) === '1') {
                answer[i] += '#';
            } else {
                answer[i] += ' ';
            }
        }
    }
    return answer;
}