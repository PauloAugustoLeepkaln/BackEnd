package ProjetoCaixadAgua

import java.math.BigDecimal

fun main() {
    val instalacao : Servico = Servico(
        Funcionario(
            "nome",
            10,
            1.80,
            20.0,
            BigDecimal("2000.00"),
            "00000000",
            "000000",
            10,
            'm'
        ),
        "reforma",
        BigDecimal("10000"),
        10
    )
}