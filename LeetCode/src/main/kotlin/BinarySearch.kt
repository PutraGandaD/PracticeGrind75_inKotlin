fun search(nums: IntArray, target: Int): Int {
    for(s in nums.indices) {
        if(target == nums[s]) {
            return s
        }
    }

    return -1
}

fun main() {

}