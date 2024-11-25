fun main() {

    //creamos el bucle que se repita 100 veces
    for (i in 1..100)
    {
        //creamos los operadores lógicos que vamos a necesitar en este ejercicio
        val mul3 = i%3==0
        val mul5 = i%5==0

        //creamos las condiciones
        if (mul5 && mul3)
        {
            println("triqui")
        }
        else if (mul3)
        {
            println("tri")
        }
        else if (mul5)
        {
            println("qui")
        }
        else
        {
            println(i)
        }
    }

}