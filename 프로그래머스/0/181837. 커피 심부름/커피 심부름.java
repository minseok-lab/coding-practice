class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int americano = 0;
        int latte = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("ameri")) {
                americano++;;
            } else if (order[i].contains("latte")) {
                latte++;
            } else {
                americano++;
            }
        }
        
        answer = americano * 4500 + latte * 5000;
        return answer;
    }
}