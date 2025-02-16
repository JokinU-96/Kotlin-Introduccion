//Crear un programa que vaya pidiendo números. Estos números se guardarán en una lista,
//y cuando el usuario no quiera insertar más le mostraremos un menú con las siguientes opciones.


fun main(){
    var numeros: MutableList<Int> = mutableListOf()//es posible introducir valores o crearla vacía.
    var respuesta: Boolean
    respuesta = true
    while(respuesta){
        try{
            println("1. Multiplicar por tres los números pares.\n2. Multiplicar por dos todos los números.\n3. Añadir un número al final." +
                    "\n4. Añadir un número al principio.\n5. Añadir un número en una posición concreta.\n6. Borrar el último elemento.\n" +
                    "7. Borrar el primer elemento.\n8. Borrar un elemento en una posición concreta.\n9. Buscar un elemento.\n10. Ordenar los elementos de la lista." +
                    "\n11. Salir.")
            respuesta = false

        }catch (e:Exception){
            respuesta = false
        }
    }
}