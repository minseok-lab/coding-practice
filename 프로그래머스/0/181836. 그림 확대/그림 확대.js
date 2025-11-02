function solution(picture, k) {
    var answer = [];
    let index = 0;
    for (let i = 0; i < picture.length; i++) {
        for (let b = 0; b < k; b++) {
            answer[index] = '';
            for (let l = 0; l < picture[i].length; l++) {
                for (let a = 0; a < k; a++) {
                    answer[index] += picture[i].charAt(l);
                }
            }
            index++;
        }
    }
    return answer;
}