function solution(a, b) {
    var answer = '';
    let daysTemp = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let day = b - 1;
    for (let i = 0; i < a - 1; i++) {
        day += daysTemp[i];
    }
    if (day % 7 == 0) {
        answer = 'FRI';
    } else if (day % 7 == 1) {
        answer = 'SAT';
    } else if (day % 7 == 2) {
        answer = 'SUN';
    } else if (day % 7 == 3) {
        answer = 'MON';
    } else if (day % 7 == 4) {
        answer = 'TUE';
    } else if (day % 7 == 5) {
        answer = 'WED';
    } else {
        answer = 'THU';
    }
    return answer;
}