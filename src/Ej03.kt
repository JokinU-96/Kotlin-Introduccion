//Crear un programa que vaya pidiendo números. Estos números se guardarán en una lista,
//y cuando el usuario no quiera insertar más le mostraremos un menú con las siguientes opciones.

import kotlin.math.sin
import kotlin.random.Random

fun main(){
    var numeros: MutableList<Int> = mutableListOf()//es posible introducir valores o crearla vacía.
    var respuesta: Boolean

    for (i in 0..20){
        numeros.add(Random.nextInt(0,50))
    }
    for (numero in numeros){
        print("$numero, ")
    }
    print("\n")

    respuesta = true
    while(respuesta){
        try{
            println("1. Multiplicar por tres los números pares.\n2. Multiplicar por dos todos los números.\n3. Añadir un número al final." +
                    "\n4. Añadir un número al principio.\n5. Añadir un número en una posición concreta.\n6. Borrar el último elemento.\n" +
                    "7. Borrar el primer elemento.\n8. Borrar un elemento en una posición concreta.\n9. Buscar un elemento.\n10. Ordenar los elementos de la lista." +
                    "\n11. Salir.")
            print("Opción: ")

            var opcion: Int

            opcion = readLine()?.toInt() as Int
            when (opcion) {
                1 -> {
                    for (i in 0..<numeros.count()){
                        if (numeros[i] % 2 == 0){
                            numeros[i] *= 3
                        }
                    }
                    visualizarLista(numeros)
                }
                2 -> {
                    for (i in 0..<numeros.count()){
                            numeros[i] *= 2
                    }
                    visualizarLista(numeros)
                }
                3 -> {
                    numeros.add(Random.nextInt(1,50))
                }
                4 -> {
                    numeros.addFirst(Random.nextInt(1,50))
                }
                5 -> {
                    println("Indique la posición donde quiere insertar un valor nuevo (de 0 en adelante): ")
                    var ind = readLine()?.toInt()as Int
                    var c = 0
                    numeros.add(1) //Hago espacio dentro de mi lista para más tarde insertar el valor.
                    for (c in 0..<numeros.count() - 1){//El último valor no hace falta pasarlo porque lo cambio antes.
                        if (c >= ind){
                           numeros[c + 1] = numeros[c]//A partir de la posición indicada traslado el resto de valores una posición hacia delante.
                        }
                    }
                    numeros[ind] = Random.nextInt(1,50)//Finalmente escribo el valor donde el usuario lo indique.
                    visualizarLista(numeros)
                }
                6 -> {
                    numeros.removeLast()
                    visualizarLista(numeros)
                }
                7 -> {
                    numeros.removeFirst()
                    visualizarLista(numeros)
                }
                8 -> {
                    println("Indique la posición donde quiere eliminar un valor (de 0 en adelante): ")
                    var ind = readLine()?.toInt()as Int
                    var nuevaLista: MutableList<Int> = mutableListOf()
                    for (i in 0..<numeros.count()){
                        if (i != ind){
                            nuevaLista.add(Random.nextInt(1,50))
                        }
                    }
                    numeros = nuevaLista
                    visualizarLista(numeros)
                }
                9 -> {
                    println("Escriba el número que quieras buscar en la lista: ")
                    val buscar = readLine()?.toInt() as Int

                    if (numeros.contains(buscar)){
                        for (i in 0..<numeros.count()){
                            if (numeros[i] == buscar){
                                print("Posición: $i\n")
                            }
                        }
                    }

                }
                10 -> {
                    numeros.sort()
                }
                11 -> {
                    print("Saliendo")
                    respuesta = false
                }
                else -> print("No has introducido una opción válida.")
            }

        }catch (e:Exception){
            print("Ha habido un error al introducir los datos.")
            respuesta = false
        }
    }
}

fun visualizarLista(numeros: List<Int>){
    print("Su lista ha cambiado: ")
    for (numero in numeros){
        print("$numero, ")
    }
    print("\n")
}