fun main()
{
    // creamos los array que vamos a necesitar
    val strArray1 = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    val charArray1 = "_|_|_".toCharArray()

    val strArray2 = arrayOf("correr", "correr", "correr", "saltar", "correr")
    val charArray2 = "_|_|_".toCharArray()

    val strArray3 = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val charArray3 = "_|_|_".toCharArray()

    val strArray4 = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val charArray4 = "_|_|_|_".toCharArray()

    val strArray5 = arrayOf("correr", "saltar", "correr", "saltar")
    val charArray5 = "_|_|_".toCharArray()

    val strArray6 = arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    val charArray6 = "_|_|_".toCharArray()

    val strArray7 = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    val charArray7 = "|||||".toCharArray()

    val strArray8 = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    val charArray8 = "||_||".toCharArray()


}

//metodo con la logica
fun check(strArray:Array<String>,charArray:CharArray)
{
    if (strArray.size>charArray.size) str(strArray,charArray)
    else char(strArray,charArray)

}

fun str(strArray:Array<String>,charArray:CharArray)
{
    var bool = true
    for (i in strArray.indices)
    {
        when (strArray[i])
        {
            "correr" ->if ;
            "saltar" ->
        }
    }
    println("   "+bool)
}

fun char(strArray:Array<String>,charArray:CharArray)
{
    
}