fun main() {
    println("Colores Primarios")
    println("1) Amarillo")
    println("2) Azul")
    println("3) Rojo")

    val option = readln()

    when(option) {
        "1" -> println("Amarillo\n" +
                "\n" +
                "En el rincón del cielo brillante,\n" +
                "donde el sol juega su estampa,\n" +
                "resplandece el color amarillo,\n" +
                "como un cálido manto que abraza.")
        "2" -> println("Azul\n" +
                "\n" +
                "Bajo la vastedad del firmamento,\n" +
                "donde el mar encuentra su reflejo,\n" +
                "reposa sereno el color azul,\n" +
                "como un sueño en silente espejo.")
        "3" -> println("Rojo\n" +
                "\n" +
                "En el pulso de un corazón ardiente,\n" +
                "donde la pasión encuentra su fuego,\n" +
                "arde con fuerza el color rojo,\n" +
                "como una llama que no tiene ruego.")
        else -> println("Opción no válida")
    }
}