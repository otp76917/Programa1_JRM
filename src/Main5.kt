fun main()
{
    //creamos las matrices
    val matriz1 = arrayOf(arrayOf("X", "O", "X"), arrayOf("O", "X", "O"), arrayOf("O", "O", "X"))
    val matriz2 = arrayOf(arrayOf("", "O", "X"), arrayOf("", "X", "O"), arrayOf("", "O", "X"))
    val matriz3 = arrayOf(arrayOf("O", "O", "O"), arrayOf("O", "X", "X"), arrayOf("O", "X", "X"))
    val matriz4 = arrayOf(arrayOf("X", "O", "X"), arrayOf("X", "X", "O"), arrayOf("X", "X", "X"))

    //metemos las matrices en el metodo
    println(check(matriz1))
    println(check(matriz2))
    println(check(matriz3))
    println(check(matriz4))
}

//comprueba que la cantidad de movimientos no sea ilegal
//comprueba todas las posiciones de victoria, si no se cumplen, da empate
fun check(matriz:Array<Array<String>>) : String
{
    var totalX = 0
    var totalO = 0

    for (i in 0..2)
    {
        for (j in 0..2)
        {
            if (matriz[i][j]=="X") totalX++
            if (matriz[i][j]=="O") totalO++
        }
    }

    if (totalO>(totalX+1) || totalX>(totalO+1))
    {
        return "NULL"
    }
    else
    {
        for (i in 0..2)
        {
            if (matriz[0][i]==matriz[1][i] && matriz[0][i]==matriz[2][i]) if (matriz[0][i]!="") return matriz[0][i]
            if (matriz[i][0]==matriz[i][1] && matriz[i][0]==matriz[i][2]) if (matriz[0][i]!="") return matriz[0][i]
        }
        if (matriz[0][0]==matriz[1][1] && matriz[0][0]==matriz[2][2]) if (matriz[0][0]!="") return matriz[0][0]
        if (matriz[0][2]==matriz[1][1] && matriz[0][2]==matriz[2][0]) if (matriz[0][2]!="") return matriz[0][2]
    }
    return "EMPATE"
}