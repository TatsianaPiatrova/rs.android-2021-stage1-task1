package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {
        val open = listOf('[','<','(')
        val close = listOf(']','>',')')
        var result = ArrayList<String>()
        val input = StringBuilder(inputString)
        var clone:Int = 0
        for (i in input.length-1 downTo 0 )
        {
            if (input[i] in open)
            {
                var clone = 0
                for (j in i until input.length)
                {
                    if (input[j] in close && open.indexOf(input[i])==close.indexOf(inputString[j])) {
                        clone=j
                        input[i]=' '
                        input[clone]=' '
                        println(inputString.substring(i+1, clone))
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, clone))
            }
        }
        println(result.joinToString(";"))
        return result.toTypedArray()
    }
}
