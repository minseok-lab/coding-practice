function solution(todo_list, finished) {
    var answer = [];
    let index = 0;
    for (let i = 0; i < todo_list.length; i++) {
        if (finished[i] === false) {
            answer[index] = todo_list[i];
            index++;
        }
    }
    return answer;
}