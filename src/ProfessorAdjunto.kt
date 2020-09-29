class ProfessorAdjunto (nome: String,
                        sobrenome: String,
                        idProfessor: Int,
                        private val horasDeMonitoria:Int ):
    Professor(nome, sobrenome, idProfessor) {

    override fun toString(): String {
        return super.toString() + " ProfessorAdjunto(horasDeMonitoria='$horasDeMonitoria')"
    }
}