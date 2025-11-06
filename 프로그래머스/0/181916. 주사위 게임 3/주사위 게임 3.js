function solution(a, b, c, d) {
    let answer = 0;
    let dice = [a, b, c, d];
    
    // 카운팅 객체(맵) 생성
    let counts = {};
    
    // 2. dice 배열을 돌면서 각 숫자의 횟수를 셉니다.
    for (let num of dice) {
        // counts[num]이 있으면 1을 더하고, 없으면 (|| 0) 0에 1을 더합니다.
        counts[num] = (counts[num] || 0) + 1;
    }
    
    let count = 0;

    for (let i = 0; i < 4; i++) {
        for (let j = i + 1; j < 4; j++) {
            if (dice[i] === dice[j]) {
                count++;
            }
        }
    }
    
    if (count === 6) {
        answer = 1111 * a;
    } else if (count === 3) {
        let p, q;
        for (let key in counts) {
            if (counts[key] === 3) {
                p = Number(key);
            }
            if (counts[key] === 1) {
                q = Number(key);
            }
        }
        answer = (10 * p + q) ** 2;
    } else if (count === 2) {
        let keys = Object.keys(counts);
        let p = Number(keys[0]);
        let q = Number(keys[1]);
        answer = (p + q) * Math.abs(p - q);
    } else if (count === 1) {
        let q; // 1번 나온 숫자(q)를 저장할 변수
        let r; // 1번 나온 다른 숫자(r)를 저장할 변수

        for (let key in counts) {
            if (counts[key] === 1) {
            
                // key는 'q' 또는 'r'입니다.
                if (q === undefined) {
                    // q가 아직 비어있다면, 지금 찾은 key가 q
                    q = Number(key); // (key는 '5' 문자열이므로 숫자로 변환)
                } else {
                    // q에 이미 값이 있다면, 지금 찾은 key가 r
                    r = Number(key); // (key는 '6' 문자열이므로 숫자로 변환)
                }
            }
        }
        answer = q * r;
    } else {
        answer = Math.min(...dice);
    }
    
    return answer;
}