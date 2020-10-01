import java.time.LocalDateTime

data class Matricula (val aluno:Aluno,
                      val curso: Curso, ){

   val dataDeMatricula = LocalDateTime.now()

   override fun toString(): String {
      return "Matricula(aluno=$aluno, curso=$curso, dataDeMatricula=$dataDeMatricula)"
   }

}