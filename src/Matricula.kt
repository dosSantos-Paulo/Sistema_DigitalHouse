import java.time.LocalDateTime

data class Matricula (val aluno:Aluno,
                      val curso: Curso){

   val dataDeMatricula = LocalDateTime.now()

}