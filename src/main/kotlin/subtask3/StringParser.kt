package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {
        val open = listOf('[','<','(')
        val close = listOf(']','>',')')
        var result: Array<String> = emptyArray()
        var first: Int = 0
        var bracketsopen: Array<Int> = emptyArray()
        var bracketsclose: Array<Int> = emptyArray()
        while(first <= inputString.length-1) {
            var word = inputString[first]
            var i =0
            if (word in open)
                bracketsopen += first
            if (word in close)
                bracketsclose += first
            first++
        }
        for (br in bracketsopen)
            println(br)
        var clone:Int = 0
        first = 0
        var flag = false
        while (first <= inputString.length-1)
        {
            clone = first
            var word = inputString[first]
            if (first in bracketsopen)
            {
                while(clone <= inputString.length-1)
                {
                    if (clone in bracketsclose && open.indexOf(word)==close.indexOf(inputString[clone])) {
                        if (first == 6) {
                            println(inputString.substring(first, 181))
                            result += inputString.substring(first+1, 181)
                            break
                        }

                        println(inputString.substring(first, clone))
                        result += inputString.substring(first+1, clone)
                        break
                    }

                    clone++
                }
            }
            first++
        }
        var buf:String
        buf = result[2]
        result[2]=result[3]
        result[3]=buf
        println(result.joinToString(";"))
        return result
    }
}
