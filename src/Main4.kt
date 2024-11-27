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

    //metemos las variables en los metodos
    check(strArray1,charArray1)
    check(strArray2,charArray2)
    check(strArray3,charArray3)
    check(strArray4,charArray4)
    check(strArray5,charArray5)
    check(strArray6,charArray6)
    check(strArray7,charArray7)
    check(strArray8,charArray8)

}

//metodo que ordena los parametros de entrada en funcion de cual es mas largo para evitar errores
fun check(strArray:Array<String>,charArray:CharArray)
{
    if (strArray.size>charArray.size) str(strArray,charArray)
    else char(strArray,charArray)

}

//las dos funciones restantes son en esencia la misma funcion
//la primera contrasta las cadenas contra caracteres y la segunda a la inversa
//luego en caso de que no este en rango se pone el interrogante

fun str(strArray:Array<String>,charArray:CharArray)
{
    var bool = true
    for (i in strArray.indices)
    {
        if (i in charArray.indices)
        {
            when (strArray[i])
            {
                "correr" -> if (charArray[i]=='_') print('_') else {print('/') ; bool=false}
                "saltar" -> if (charArray[i]=='|') print('|') else {print('x') ; bool=false}
            }
        }
        else {print('?') ; bool=false}

    }
    println("   $bool")
}

fun char(strArray:Array<String>,charArray:CharArray)
{
    var bool = true
    for (i in charArray.indices)
    {
        if (i in strArray.indices)
        {
            when (charArray[i])
            {
                '_' -> if (strArray[i]=="correr") print('_') else {print('x') ; bool=false}
                '|' -> if (strArray[i]=="saltar") print('|') else {print('/') ; bool=false}
            }
        }
        else {print('?') ; bool=false}

    }
    println("   $bool")
}