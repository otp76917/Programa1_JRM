fun main()
{
    //pedimos los valores
    print("Introduzca una palabra: ")
    val p1 = readln()
    print("Introduzca otra palabra: ")
    val p2 = readln()

    //los convertimos a array
    val arr1 = p1.toCharArray()
    val arr2 = p2.toCharArray()
    //creamos el boolean de retorno
    var boolean = false
    //creamos una lista de nnumeros mutable para guardar las letras ya recorrias
    var list:MutableList<Int> = mutableListOf()

    //creamos la lógica
    if (arr1.size==arr2.size && !(arr1.contentEquals(arr2)))
    {
        list.clear()
        for (i in arr1.indices)
        {
            boolean=false
            for (j in arr2.indices)
            {
                if (arr1[i]==arr2[j])
                {
                    if (!list.contains(j))
                    {
                        boolean=true
                        list.add(j)
                        break
                    }
                }
            }
            if (!boolean)
            {
                break
            }
        }
    }
    println(boolean)
}