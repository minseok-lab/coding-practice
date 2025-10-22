function solution(binomial) {
    var answer = 0;
    var splitBinomial = binomial.split(" ");
    if (splitBinomial[1] === "+") {
        answer = Number(splitBinomial[0]) + Number(splitBinomial[2]);
    } else if (splitBinomial[1] === "-") {
        answer = Number(splitBinomial[0]) - Number(splitBinomial[2]);
    } else {
        answer = splitBinomial[0] * splitBinomial[2];
    }
    return answer;
}