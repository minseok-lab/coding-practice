function solution(rank, attendance) {
    var answer = 0;
    let temp = [];
    let index = 0;
    for (let i = 0; i < rank.length; i++) {
        if (attendance[i] == true) {
            temp[index] = rank[i]
            index++;
        }
    }
    temp.sort((a, b) => a - b);
    
    for (let i = 0; i < rank.length; i++) {
        if (temp[0] == rank[i]) {
            answer += 10000 * i;
        }
        if (temp[1] == rank[i]) {
            answer += 100 * i;
        }
        if (temp[2] == rank[i]) {
            answer += 1 * i;
        }
    }
    
    return answer;
}