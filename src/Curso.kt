import java.lang.Exception

data class Curso (private val nome: String,
                  val codigoDoCurso: Int,
                  private var qtdMaxDeAlunos: Int) {

    init {
        var professorTitular:ProfessorTitular
    }

    var listaDeMatriculados = arrayListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{

        listaDeMatriculados.forEach {
            if (umAluno == it){
                println("Aluno já esta matriculado")
                return false
            }
        }

        if (listaDeMatriculados.size < qtdMaxDeAlunos){
            listaDeMatriculados.add(umAluno)
            return true
        }else {
            println("Curso já esta lotado")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeMatriculados.remove(umAluno)
    }
}