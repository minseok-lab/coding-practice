#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    while (n > 0) { // 정수값 n이 0보다 큰 경우 반복합니다.
        // n을 10으로 나눈 나머지(1의 자리)를 answer에 더합니다.
        answer += n % 10;
        // n을 10으로 나눈 값(1의 자리)를 제외한 값으로 초기화합니다.
        n /= 10;
    }
    
    return answer;
}