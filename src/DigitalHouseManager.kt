class DigitalHouseManager () {


    private var listaDeAlunos = ArrayList<Aluno>()
    private var listaDeProfessores = ArrayList<Professor>()
    private var listaDeCursos = mutableListOf<Curso>()
    private var listaDeMatriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoDoCurso: Int, qtdMaxDeAlunos: Int) {
        listaDeCursos.forEach {
            if (codigoDoCurso.equals(it.codigoDoCurso)){
                throw Exception("Código do curso já esta em uso, escolha outro código")
                return
            }
        }
        listaDeCursos.add(Curso(nome, codigoDoCurso, qtdMaxDeAlunos))
        return
    }

}