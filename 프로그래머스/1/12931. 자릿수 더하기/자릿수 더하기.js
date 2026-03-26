function solution(n)
{
    var answer = 0;
    
    while (true) {
        if (n < 1) {
            break;
        }
        answer += n % 10;
        n = Math.floor(n / 10);
    }    

    console.log(n);
    
    return answer;
}