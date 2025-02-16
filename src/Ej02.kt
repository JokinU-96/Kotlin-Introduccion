//Realizar un programa que a través de un menú permita realizar operaciones de
//sumar, restar. multiplicar, dividir y salir.
//Las operaciones constarán de dos operandos y cada una tendrá su propio procedimiento.

fun main(){
    var salir = true
    while (salir){
        print("Haga su elección;\n1.Suma\n2.Resta\n3.Multiplica\n4.Divide\n5.Salir\nOpcion:")
        var opcion: Int
        opcion = readLine()?.toInt() as Int

        var numeroUno = 0
        var numeroDos = 0

        if (opcion != 5){
            print("Primer número: ")
            numeroUno = PedirNumero()
            print("Segundo número: ")
            numeroDos = PedirNumero()
        }

        when (opcion) {
            1 -> {
                sumar(numeroUno, numeroDos)
            }
            2 -> {
                restar(numeroUno, numeroDos)
            }
            3 -> {
                multiplicar(numeroUno, numeroDos)
            }
            4 -> {
                dividir(numeroUno, numeroDos)
            }
            5 -> {
                print("Salir")
                salir = false
            }
            else -> print("No has introducido una opción válida.")
        }
    }
}

fun PedirNumero(): Int{
    var pasa = false
    var numero = 0
    while (!pasa){
        try {
            numero = readLine()?.toInt() as Int
            pasa = true
        } catch (e: Exception) {
            println("Inserte un número válido por favor.")
            pasa=false
        }
    }
    return numero
}

fun sumar(a: Int, b:Int){
    println(a + b)
}
fun restar(a: Int, b: Int){
    println(a - b)
}
fun multiplicar(a: Int, b:Int){
    println(a * b)
}
fun dividir(a:Int, b:Int){
    println(a / b)
}