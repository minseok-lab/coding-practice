function solution(n) {
    /*
    var answer = 1;
    for (let i = 1; i < n / 2; i++) {
        let sum = 0;
        let now = i;
        
        while (sum < n) {
            sum += now;
            
            if (sum === n) {
                answer++;
                break;
            }
            now++;
        }
    }
    */
    
    let answer = 0; 
    
    // 2. 1부터 n까지 모든 수를 확인
    for (let i = 1; i <= n; i++) {
        
        // 3. i가 n의 약수(n % i === 0)이면서
        //    동시에 홀수(i % 2 !== 0)인지 확인
        if (n % i === 0 && i % 2 !== 0) {
            answer++;
        }
    }
    
    return answer;
}