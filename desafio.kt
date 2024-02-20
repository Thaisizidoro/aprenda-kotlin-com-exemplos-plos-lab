enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} matriculado na formação ${nome}.")
    }
    
}

fun main() {
    println("Criando os usuários")
    val usuario1 = Usuario("Thais")
    val usuario2 = Usuario("Henrique")
	val usuario3 = Usuario("Júlia")
    println("Criando os conteúdos")
    val conteudo1 = ConteudoEducacional("Introdução à Kotlin", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Funções em Kotlin", 120, Nivel.INTERMEDIARIO)
    println("Criacao as Formações")
    val formacao1 = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))
	val formacao2 = Formacao("Introdução Kotlin", listOf(conteudo2))
	println("Matriculando os usuários")
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
	formacao2.matricular(usuario3)