package org.example

fun main() {

}


fun maxProfit(prices: IntArray): Int {

    /*
    * input
    * 7 1 5 3 6 4
    * output
    * 5
    *
    * 미래에서부터 고점과 저점을 찾기
    *
    * */

    var minPrice = prices[0]
    var maxProfit = 0

    for(price in prices) {

        minPrice = price.coerceAtMost(minPrice)
        maxProfit = maxProfit.coerceAtLeast(price - minPrice)
    }

    return maxProfit
}
