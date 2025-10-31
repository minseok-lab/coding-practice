function solution(arr) {
    var answer = 0;
    let currentArr = [...arr];
    while (true) {
        let prevArr = [...currentArr];
        
        for (let i = 0; i < currentArr.length; i++) {
            if (currentArr[i] >= 50 && currentArr[i] % 2 == 0) {
                currentArr[i] /= 2;
            }
            if (currentArr[i] < 50 && currentArr[i] % 2 !== 0) {
                currentArr[i] = (currentArr[i] * 2) + 1;
            }
        }
        
        // '이전 상태'와 '현재 상태'가 같은지 비교합니다.
        let isEqual = true;
        for (let i = 0; i < currentArr.length; i++) {
            if (prevArr[i] !== currentArr[i]) {
                isEqual = false; // 하나라도 다르면 false
                break; // 비교 중지
            }
        }

        // 만약 두 배열이 같다면 루프를 탈출합니다.
        if (isEqual) {
            break; 
        }
        
        answer++;
    }
    return answer;
}