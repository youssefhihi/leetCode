function isPalindrome(x: number): boolean {
    var y = x.toString()
    return  y.split("").reverse().join("") == y;
};