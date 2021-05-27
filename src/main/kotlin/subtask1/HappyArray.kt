package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        fun convertToHappy(sadArray: IntArray): IntArray {
            var i = 1
            val happyArrayList = sadArray.toCollection(ArrayList())

            while (i < happyArrayList.size - 1) {
                //if (!isHappy(happyArrayList))
                if (happyArrayList[i] > happyArrayList[i + 1] + happyArrayList[i - 1]) {
                    happyArrayList.removeAt(i)
                    if (i != 1)
                        i--
                } else
                    i++
            }
            println(happyArrayList)
            return happyArrayList.toIntArray()
        }
    }
}
