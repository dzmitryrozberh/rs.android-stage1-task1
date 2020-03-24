package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val xArray = bill.take(k) + bill.takeLast(bill.size - k - 1)
        val xbill = xArray.sum() / 2
        if (xbill == b)
        {
            return "Bon Appetit"
        }else
            return (b - xbill).toString()
    }
}
