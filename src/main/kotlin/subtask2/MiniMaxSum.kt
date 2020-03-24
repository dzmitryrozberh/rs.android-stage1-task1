package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var sumArray = arrayOf<Int>()
        for(i in input.indices)
        {
            val xArray = input.take(i) + input.takeLast(input.size - i - 1)
            sumArray += xArray.sum()
        }
        return intArrayOf(sumArray.min()!!,sumArray.max()!!)
    }
}
