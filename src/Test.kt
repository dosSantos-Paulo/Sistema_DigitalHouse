fun main () {
    val manager = DigitalHouseManager()

    manager.registrarAluno("Paulo", "1",1)
    manager.registrarAluno("Paulo", "2",2)
    manager.registrarAluno("Paulo", "3",3)
    manager.registrarAluno("Paulo", "4",4)
    manager.registrarAluno("Paulo", "5",5)
    manager.registrarCurso("Kotlin", 1, 5)

    manager.matricularAluno(1,1)
    manager.matricularAluno(2,1)
    manager.matricularAluno(3,1)
    manager.matricularAluno(4,1)
    manager.matricularAluno(5,1)

    manager.listaDeMatriculas.forEach { println(it) }

}