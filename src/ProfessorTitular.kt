class ProfessorTitular (nome: String,
                        sobrenome: String,
                        codigoDoProfessor: Int,
                        private val especialidade: String):
    Professor(nome, sobrenome, codigoDoProfessor){

    override fun toString(): String {
        return "ProfessorAjunto(nome='$nome', " +
                "sobrenome='$sobrenome', " +
                "codigoDoProfessor=$codigoDoProfessor, " +
                "horasDeMonitoria=$especialidade)"
    }
}