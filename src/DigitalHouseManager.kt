class DigitalHouseManager () {


    private var listaDeAlunos = ArrayList<Aluno>()
    private var listaDeProfessores = ArrayList<Professor>()
    private var listaDeCursos = mutableListOf<Curso>()
    private var listaDeMatriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxDeAlunos: Int) {
        listaDeCursos.forEach {
            if (codigoCurso == it.codigoDoCurso){
                throw Exception("Código do curso já esta em uso!")
                return
            }
        }
        listaDeCursos.add(Curso(nome, codigoCurso, qtdMaxDeAlunos))
        return
    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCursos.forEach {
            if (codigoCurso == it.codigoDoCurso){
                listaDeCursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int) {

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

    fun registrarProfessorTitular (nome: String,
                                      sobrenome: String,
                                      codigoProfessor: Int,
                                      especialidade: String) {

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
        listaDeProfessores.forEach {
            if (codigoProfessor == it.codigoDoProfessor) {
                listaDeProfessores.remove(it)
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val novoAluno = Aluno(nome, sobrenome, codigoAluno)

        listaDeAlunos.forEach {
            if (novoAluno == it) {
                throw Exception("Código do aluno já esta em uso!")
                return
            }
        }
        listaDeAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int,  codigoCurso: Int) {
        val aluno = procurarAluno(codigoAluno)
        val curso = procurarCurso(codigoCurso)

        if (aluno == null || curso == null) {
            return
        }

        curso.adicionarUmAluno(aluno)
    }



    fun procurarAluno (codigoAluno: Int): Aluno? {

        listaDeAlunos.forEach {
            if (codigoAluno == it.codigoDoAluno) {
                return it
            }
        }
        throw Exception("Aluno não encontrado!")
        return null

    }

    fun procurarCurso (codigoCurso: Int): Curso? {
        listaDeCursos.forEach {
            if (codigoCurso == it.codigoDoCurso) {
                return it
            }
        }
        throw Exception("Aluno não encontrado!")
        return null
    }
}