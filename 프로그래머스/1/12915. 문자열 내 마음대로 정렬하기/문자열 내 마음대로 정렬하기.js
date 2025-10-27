function solution(strings, n) {
    strings.sort(function(a, b) {
        let charA = a.charAt(n);
        let charB = b.charAt(n);
        
        // charB가 더 클경우, a를 앞으로
        if (charA < charB) {
            return -1;
        }
        // charA가 더 클경우, b를 앞으로
        if (charA > charB) {
            return 1;
        }
        
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return 0;
    });
    
    return strings;
}