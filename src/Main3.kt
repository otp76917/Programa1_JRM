fun main()
{
    //creamos las variables
    val a1 = "{a + b [c] * (2x2)}}}}"
    val a2 = "{ [ a * ( c + d ) ] - 5 }"
    val a3 = "{ a * ( c + d ) ] - 5 }"
    val a4 = "{a^4 + (((ax4)}"
    val a5 = "{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
    val a6 = "{{{{{{(}}}}}}"
    val a7 = "(a"

    //las pasamos al metodo e imprimimos
    println("$a1 ¿está balanceada? ${check(a1.toCharArray())}")
    println("$a2 ¿está balanceada? ${check(a2.toCharArray())}")
    println("$a3 ¿está balanceada? ${check(a3.toCharArray())}")
    println("$a4 ¿está balanceada? ${check(a4.toCharArray())}")
    println("$a5 ¿está balanceada? ${check(a5.toCharArray())}")
    println("$a6 ¿está balanceada? ${check(a6.toCharArray())}")
    println("$a7 ¿está balanceada? ${check(a7.toCharArray())}")
}

//funcion para comprobar los array
fun check(a:CharArray) : Boolean
{
    var list:MutableList<Int> = mutableListOf()

    for (i in a.indices)
    {
        if (!list.contains(i))
        {
            //val c=
                //when
        }
    }
    return true  // temporary
}