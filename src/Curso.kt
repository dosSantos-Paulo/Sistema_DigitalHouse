data class Curso (private val nome: String,
             val codigoDoCurso: Int,
             private var qtdMaxDeAlunos: Int) {

    init {
        var professorTitular:ProfessorTitular
    }


    var listaDeMatriculados = arrayListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        return if (listaDeMatriculados.size < qtdMaxDeAlunos){
            listaDeMatriculados.add(umAluno)
        }else false
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeMatriculados.remove(umAluno)
    }
}