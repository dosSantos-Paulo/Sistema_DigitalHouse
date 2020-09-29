data class Curso (private val nome: String,
             private val codigoDoCurso: Int,
             private var professorTitular:ProfessorTitular,
             private var qtdMaxDeAlunos: Int) {

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