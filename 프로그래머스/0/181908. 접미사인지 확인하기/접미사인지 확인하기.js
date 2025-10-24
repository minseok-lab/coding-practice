function solution(my_string, is_suffix) {
    var answer = 0;
    for (let i = 0; i < my_string.length; i++) {
        let tempStr = my_string;
        if (tempStr.substring(i) === is_suffix) {
            answer = 1;
            break;
        }
    }
    return answer;
}