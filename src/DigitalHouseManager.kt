class DigitalHouseManager () {


    private var listaDeAlunos = ArrayList<Aluno>()
    private var listaDeProfessores = ArrayList<Professor>()
    private var listaDeCursos = mutableListOf<Curso>()
    private var listaDeMatriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxDeAlunos: Int) {
        listaDeCursos.forEach {
            if (codigoCurso.equals(it)){
                throw Exception("Código do curso já esta em uso!")
                return
            }
        }
        listaDeCursos.add(Curso(nome, codigoCurso, qtdMaxDeAlunos))
        return
    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCursos.forEach {
            if (codigoCurso.equals(it.codigoDoCurso)){
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
            if (novoProfessor.equals(it)){
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
            if (novoProfessor.equals(it)){
                throw Exception("Código do professor já esta em uso!")
                return
            }
        }
        listaDeProfessores.add(novoProfessor)

    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaDeProfessores.forEach {
            if (codigoProfessor.equals(it.codigoDoProfessor)) {
                listaDeProfessores.remove(it)
            }
        }
    }
}