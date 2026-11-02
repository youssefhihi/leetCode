function isPalindrome(x: number): boolean {
    var y = x.toString()
    return  Array.from(y).reverse().join("") == y;
};