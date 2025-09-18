#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len, int height) {
    int answer = 0; // 정답을 0으로 선언합니다.
    
    for (int i = 0; i < array_len; i++) { // i는 배열의 최대 길이까지 하나씩 늘어납니다.
        if (array[i] > height) { // 배열의 i번째 정수가 height 보다 클 경우
            answer++; // answer를 하나 늘립니다.
        }
    }
    
    return answer;
}