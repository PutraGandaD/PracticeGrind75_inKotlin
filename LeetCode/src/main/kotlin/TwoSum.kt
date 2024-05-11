fun twoSum(nums: IntArray, target: Int) : IntArray {
    var hashMap = HashMap<Int, Int>()
    var result = intArrayOf()

    nums.forEachIndexed { index, element ->
        val requiredNum = target - element
        if(hashMap.containsKey(requiredNum)) {
            result = intArrayOf(hashMap[requiredNum]!!, index)
        } else {
            hashMap[element] = index
        }
    }

    return result
}

fun main() {
    val result = twoSum(intArrayOf(2,7,11,15), 9)
    result.forEach {
        println(it)
    }
}