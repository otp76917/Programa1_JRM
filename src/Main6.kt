fun main()
{
    //definimos variables y rango del array
    var arrLength = 10
    println("¿Cuántos contactos quiere?")
    val newLength = readln()
    if (newLength!="")
    {
        arrLength=newLength.toInt()
    }
    var arrCon = arrayOfNulls<Contacto>(arrLength)

    //creamos el apartado del menu
    var op = 0
    while(op!=8)
    {
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        print("Escribe una de las opciones: ")

        op = readln().toInt()

        when(op)
        {
            1 -> op1(arrCon)
            2 -> op2(arrCon)
            3 -> op3(arrCon)
            4 -> op4(arrCon)
            5 -> op5(arrCon)
            6 -> op6(arrCon)
            7 -> op7(arrCon)
            8 -> break
            else -> println("Opción incorrecta")
        }
    }
}

//para algunas funciones no pondre comentarios porque son muy perecidas a otras o son faciles de entender

//crea un contacto y lo mete en el array
fun op1(arr:Array<Contacto?>)
{
    //comprobador de que la agenda esta llena
    var bool = false
    for (i in arr.indices)
    {
        if (arr[i]==null)
        {
            //introducimos el contacto
            println("Escribe un nombre")
            val nombre = readln()
            println("Escribe un teléfono")
            val telefono = readln()

            for (j in arr.indices)
            {
                //se comprueba que no exista, si no se añade
                if (arr[j]?.nombre?.equals(nombre) == true) {println("El contacto con ese nombre ya existe") ; break}
                else {arr[i] = Contacto(nombre, telefono) ; println("Contacto creado") ; break}
            }
            bool = false
            break
        }
        else bool = true
    }
    if (bool) println("La agenda esta llena, no se pueden meter más contactos")
}

//lista de contactos
fun op2(arr:Array<Contacto?>)
{
    var empty = false
    var nullCont = 0
    //contamos cuantos elementos son NULL, si es igual al tamaño del array, esta vacio
    for (i in arr.indices)
    {
        if (arr[i]==null) nullCont++
    }
    if (nullCont==arr.size) empty = true

    if (empty) println("No hay contactos que mostrar")
    else
    {
        for (i in arr.indices)
        {
            if (arr[i]!=null)
            {
                println("Nombre = ${arr[i]?.nombre}, Teléfono = ${arr[i]?.telefono}")
            }
        }
    }
}

//busca un contacto
fun op3(arr:Array<Contacto?>)
{
    println("Escribe un nombre")
    val nombre = readln()
    var existe = false
    for (i in arr.indices)
    {
        if (arr[i]?.nombre == nombre) {println("Su número de telefono es ${arr[i]?.telefono}") ; existe = true}
    }
    if (!existe) println("No se ha encontrado el contacto")
}

//comprueba que un contacto exista
fun op4(arr:Array<Contacto?>)
{
    println("Escribe un nombre")
    val nombre = readln()
    var existe = false
    for (i in arr.indices)
    {
        if (arr[i]?.nombre == nombre) {println("Existe contacto") ; existe = true}
    }
    if (!existe) println("No existe contacto")
}

//elimina un contacto
fun op5(arr:Array<Contacto?>)
{
    println("Escribe un nombre")
    val nombre = readln()
    var existe = false
    for (i in arr.indices)
    {
        if (arr[i]?.nombre == nombre) {arr[i]=null ; println("Contacto eliminado") ; existe = true}
    }
    if (!existe) println("No se ha eliminado contacto")
}

//dice cuantos contactos estan libres
fun op6(arr:Array<Contacto?>)
{
    var nullCont = arr.size
    for (i in arr.indices)
    {
        if (arr[i]==null) nullCont--
    }
    println("Hay ${arr.size-nullCont} contacto/s libre/s")
}

//muestra si la agenda esta llena
fun op7(arr:Array<Contacto?>)
{
    var nullCont = arr.size
    for (i in arr.indices)
    {
        if (arr[i]==null) nullCont--
    }
    if (nullCont==arr.size) println("La agenda está llena")
    else println("Aún se pueden meter contactos")
}

