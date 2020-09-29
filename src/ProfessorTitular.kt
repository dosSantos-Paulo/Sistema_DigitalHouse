class ProfessorTitular (nome: String,
                        sobrenome: String,
                        codigoDoProfessor: Int,
                        private val especialidade: String):
    Professor(nome, sobrenome, codigoDoProfessor){

    override fun toString(): String {
        return super.toString() + " ProfessorTitular(especialidade='$especialidade')"
    }
}