function solution(a, b) {
    const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
    const lcm = (a, b) => (a * b) / gcd(a, b);
    
    return [gcd(a, b), lcm(a, b)];
}