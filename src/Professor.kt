abstract class Professor (protected open val nome: String,
                          protected open val sobrenome: String,
                          open val codigoDoProfessor: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        if (codigoDoProfessor != other.codigoDoProfessor) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoDoProfessor
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', codigoDoProfessor=$codigoDoProfessor)"
    }


}