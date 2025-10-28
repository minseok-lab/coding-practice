function solution(my_string) {
    var answer = [];
    let index = 0;
    let splitStr = my_string.split(" ");
    for (let i =0; i < splitStr.length; i++) {
        if (splitStr[i] !== "") {
            answer[index] = splitStr[i];
            index++;
        }
    }
    return answer;
}