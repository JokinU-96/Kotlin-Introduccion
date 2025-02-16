//Diseña un programa que obtenga la calificación mayor y la calificación menor,
//de un grupo de 40 estudiantes, además de los nombres de dichos alumnos.

fun main(){
    var nota: Int
    var maxima = 0
    var minima = 10
    var nombre: String
    var nombreM = ""
    var nombrem = ""
    //etc

    for (i in 1..5){
        println(i)
        println("Introduce la nota: ")
        nota = readLine()?.toInt()as Int//Si mete una letra peta.
        println("Introduce el nombre del estudiante: ")
        nombre = readLine().toString()
        //aplica la lógica con condicionesd e tipo IF
        if (nota > maxima){
            maxima = nota
            nombreM = nombre
        }
        if (nota < minima){
            minima = nota
            nombrem = nombre
        }
    }

    println("La nota máxima es: $maxima y el nombre del estudiante es $nombreM")
    println("La nota mínima es $minima y el nombre del estudiante es $nombrem")
}