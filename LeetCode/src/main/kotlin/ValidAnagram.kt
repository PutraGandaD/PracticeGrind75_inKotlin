fun isAnagram(s: String, t: String) : Boolean  {
    val target = t.toMutableList()

    if(s.length == t.length) {
        for (char in s) {
            target.remove(char)
        }
    } else {
        return false
    }

    return target.isEmpty()
}

fun main() {
    println(isAnagram("ab", "a"))
}