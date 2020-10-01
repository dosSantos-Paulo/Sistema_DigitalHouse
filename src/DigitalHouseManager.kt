class DigitalHouseManager () {


    private var listaDeAlunos = ArrayList<Aluno>()
    private var listaDeProfessores = ArrayList<Professor>()
    private var listaDeCursos = mutableListOf<Curso>()
    private var listaDeMatriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxDeAlunos: Int) {
        val validador = procurarCurso(codigoCurso)
        if (validador == null){
            listaDeCursos.add(Curso(nome, codigoCurso, qtdMaxDeAlunos))
            return
        }
        throw Exception("Código do curso já esta em uso!")
        return
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = procurarCurso((codigoCurso))
        listaDeCursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {

        val novoProfessor = ProfessorAdjunto(nome,
                sobrenome,
                codigoProfessor,
                quantidadeDeHoras)

        listaDeProfessores.forEach {
            if (novoProfessor == it){
                throw Exception("Código do professor já esta em uso!")
                return
            }
        }
        listaDeProfessores.add(novoProfessor)
    }

    fun registrarProfessorTitular (nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

        val novoProfessor = ProfessorTitular(nome,
                sobrenome,
                codigoProfessor,
                especialidade)

        listaDeProfessores.forEach {
            if (novoProfessor == it){
                throw Exception("Código do professor já esta em uso!")
                return
            }
        }
        listaDeProfessores.add(novoProfessor)

    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professor = procurarProfessor(codigoProfessor)
        listaDeProfessores.remove(professor)
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val confirma = procurarAluno(codigoAluno)

        if (confirma == null) {
            val novoAluno = Aluno(nome, sobrenome, codigoAluno)
            listaDeAlunos.add(Aluno(nome, sobrenome, codigoAluno))
            return
        } else {
            throw Exception("Código do aluno já está em uso!")
        }

    }

    fun matricularAluno(codigoAluno: Int,  codigoCurso: Int) {
        val aluno = procurarAluno(codigoAluno)
        val curso = procurarCurso(codigoCurso)

        if (aluno == null || curso == null) {
            return
        }

        if(!curso.adicionarUmAluno(aluno)) {
            return
        }
        listaDeMatriculas.add(Matricula(aluno,curso))
        println("Matricula realizada")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        val curso = procurarCurso(codigoCurso)
        val titular = procurarProfessor(codigoProfessorTitular)
        val adjunto = procurarProfessor(codigoProfessorAdjunto)

        if (curso == null || titular == null || adjunto == null) {
            return
        }

        curso.professorTitular = titular
        curso.professorAdjunto = adjunto


    }

    fun procurarProfessor (codigoProfessor:Int): Professor? {

        listaDeProfessores.forEach {
            if (codigoProfessor == it.codigoDoProfessor) {
                return it
            }
        }
        return null
    }

    fun procurarAluno (codigoAluno: Int): Aluno? {

        listaDeAlunos.forEach {
            if (codigoAluno == it.codigoDoAluno) {
                return it
            }
        }
        return null

    }

    fun procurarCurso (codigoCurso: Int): Curso? {
        listaDeCursos.forEach {
            if (codigoCurso == it.codigoDoCurso) {
                return it
            }
        }
        return null
    }
}