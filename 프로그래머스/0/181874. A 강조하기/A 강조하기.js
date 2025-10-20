function solution(myString) {
    var answer = '';
    for (let i = 0; i < myString.length; i++) {
        if (myString.charAt(i) === " ") {
            answer += " ";
        } else if (myString.charAt(i) === "a" || myString.charAt(i) === "A") {
            answer += "A";
        } else {
            answer += myString.charAt(i).toLowerCase();
        }
    }
    return answer;
}