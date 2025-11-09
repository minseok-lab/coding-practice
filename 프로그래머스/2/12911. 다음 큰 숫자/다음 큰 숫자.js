function solution(n) {
    var answer = 0;
    let count1 = 0;
    let binaryString = n.toString(2);
    
    for (let i = 0; i < binaryString.length; i++) {
        if (binaryString.charAt(i) === '1') {
            count1++;
        }
    }
    
    while (true) {
        let count2 = 0;
        n++;
        let compareNum = n.toString(2);
        for (let i = 0; i < compareNum.length; i++) {
            if (compareNum.charAt(i) === '1') {
                count2++;
            }
        }
        if (count1 === count2) {
            answer = parseInt(compareNum, 2);
            break;
        }
    }
    return answer;
}