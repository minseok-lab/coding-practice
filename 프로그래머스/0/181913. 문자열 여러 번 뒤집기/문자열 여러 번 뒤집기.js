function solution(my_string, queries) {
    let splitStr = my_string.split('');

    for (let i = 0; i < queries.length; i++) {
        let s = queries[i][0];
        let e = queries[i][1];

        // s 이전 부분
        let prefix = splitStr.slice(0, s);

        // s부터 e까지의 중간 부분
        let segment = splitStr.slice(s, e + 1);
        segment.reverse();

        // e 이후 부분
        let suffix = splitStr.slice(e + 1);

        // 세 조각을 합쳐서 splitStr을 갱신
        splitStr = [...prefix, ...segment, ...suffix];
    }

    // 마지막에 합치기
    return splitStr.join('');
}