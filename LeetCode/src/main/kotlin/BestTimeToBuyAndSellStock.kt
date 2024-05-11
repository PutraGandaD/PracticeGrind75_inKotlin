import kotlin.math.max

fun maxProfit(prices: IntArray) : Int {
    var l = 0 //buy
    var r = 1 //sell
    var maxProfit = 0 // max profit

    while (r < prices.size) {
        if(prices[l] < prices[r]) {
            maxProfit = max(maxProfit, prices[r] - prices[l])
            r += 1
        } else {
            l = r
            r += 1
        }
    }

    return maxProfit
}

fun main() {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
}