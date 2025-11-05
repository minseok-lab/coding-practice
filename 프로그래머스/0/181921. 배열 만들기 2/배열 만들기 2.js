function solution(l, r) {
    let answer = [];
    let queue = [5]; // 5부터 시작
    
    // 큐에 처리할 작업(숫자)이 남아있는 동안 루프를 계속 실행
    while (queue.length != 0) {
        // 큐의 첫번째 값 탐색
        let current = queue.shift();
        // 첫번째 값이 조건 범위 안쪽이면 정답 배열에 추가
        if (l <= current && current <= r) {
            answer.push(current);
        }
        // 0붙은 값과 5붙은 값 추가
        let next_0 = current * 10;
        let next_5 = current * 10 + 5;
        
        // 각각의 값이 범위를 넘지 않았는지 검사하고 그렇다면 큐에 숫자 추가
        if (next_0 <= r) {
            queue.push(next_0);
        }
        if (next_5 <= r) {
            queue.push(next_5);
        }
    }
    
    // 정답 배열 길이가 0이면 -1 삽입
    if (answer.length === 0) {
        answer.push(-1);
    }
    return answer;
}