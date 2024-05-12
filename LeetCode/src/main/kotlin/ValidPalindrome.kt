fun isPalindrome(s: String) : Boolean  {
    var newStr = ""

    for (c in s) {
        if(c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9') {
            newStr += c.lowercaseChar()
            //println(newStr)
        }
    }

    return newStr == newStr.reversed()
}

fun main() {
    isPalindrome("A man, a plan, a canal: Panama")
}