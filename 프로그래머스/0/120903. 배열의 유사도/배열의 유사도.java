class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        // 첫번째 for 문은 0부터 s1배열 길이만큼 하나씩 늘어나며 반복
        for (int first = 0; first < s1.length; first++) {
            // 두번째 for문은 0부터 s2배열 길이만큼 하나씩 늘어나며 반복
            for (int second = 0; second < s2.length; second++) {
                // 만약 s1의 배열과 s2 배열에서 같은 값이 있으면 count 1 증가
                if (s1[first].equals(s2[second])) {
                    count++;
                }
            }
        }
        return count;
    }
}