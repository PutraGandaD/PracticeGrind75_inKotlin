fun isValid(s: String): Boolean {
    val hashMap: HashMap<Char, Char> = HashMap<Char, Char>()
    val stack = ArrayDeque<Char>()
    hashMap.put(')', '(')
    hashMap.put('}', '{')
    hashMap.put(']', '[')

    for(char in s) {
        if(hashMap.containsValue(char)) {
            stack.add(char)
        } else if(stack.isNotEmpty() && stack.last() == hashMap[char]!!) {
            stack.removeLast()
        } else {
            return false
        }
    }

    return if(stack.isEmpty()) true else false
}

fun main() {
    println(isValid("()()"))
}