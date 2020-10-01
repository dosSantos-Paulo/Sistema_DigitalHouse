fun main () {
    val manager = DigitalHouseManager()

    manager.registrarCurso("Kotlin", 1, 5)
    manager.registrarCurso("Java", 2, 5)
    manager.registrarProfessorTitular("Felipe", "J.", 1, "Android")
    manager.registrarProfessorAdjunto("Lucas", "A.", 2, 20)
    manager.registrarProfessorAdjunto("fake", "F.", 3, 20)


    println("Registre 5 alunos")
    var contador = 0
    do {
        print("nome: ")
        val nome = readLine()!!
        print("Sobrenome: ")
        val sobrenome = readLine()!!
        print("id: ")
        val id = readLine()!!.toInt()

        manager.registrarAluno(nome, sobrenome, id)
        manager.matricularAluno(id,1)

        contador++

    } while (contador < 5)

    manager.excluirProfessor(3)
    manager.excluirCurso(2)
    manager.alocarProfessores(1,1,2)

    print(manager.procurarCurso(1))
}