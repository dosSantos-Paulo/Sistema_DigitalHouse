class ProfessorAdjunto (nome: String,
                        sobrenome: String,
                        idProfessor: Int,
                        private val horasDeMonitoria:Int ):
    Professor(nome, sobrenome, idProfessor) {

    override fun toString(): String {
        return "ProfessorAjunto(nome='$nome', " +
                "sobrenome='$sobrenome', " +
                "codigoDoProfessor=$codigoDoProfessor, " +
                "horasDeMonitoria=$horasDeMonitoria)"
    }
}