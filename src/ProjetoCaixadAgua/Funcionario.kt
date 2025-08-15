package ProjetoCaixadAgua

import java.math.BigDecimal

class Funcionario (
    nome: String,
    idade: Int,
    val altura: Double,
    val peso: Double,
    val salario: BigDecimal,
    CPF: String,
    telefone: String,
    var experiencia: Int, //anos
    sexo: Char,

): Pessoa(
nome = nome,
idade = idade,
CPF = CPF,
telefone = telefone,
sexo = sexo
){

}
