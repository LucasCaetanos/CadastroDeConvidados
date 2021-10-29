fun main(args: Array<String>) {

    val opcoes = mutableListOf("Maria","Carlos","Roberto")

    while (true) {
        println("Digite sim para ver as opções, " +
                "se não deseja continuar digite não.")
        val simNao = readLine()!!

        if (simNao != "sim") {
            break
        }

        println("Digite 1, para adicionar um novo convidado, " +
                "digite 2 para saber como remover um convidado" +
                ", digite 3 para ver a lista de convidados")
        var escolha = readLine()!!.toInt()

        when (escolha) {
            1 -> {println("\nAdicione uma pessoa: ")
                var nome = readLine()!!

                opcoes.add(nome).toString()

                println("\nSegue lista atualizada: $opcoes")
            }
            2 -> {print("Remova uma pessoa: ")
                var nome = readLine()!!

                if (opcoes.contains(nome)) {
                    opcoes.remove(nome)
                    println("$nome foi removido")
                    println("\nSegue lista atualizada: $opcoes")
                }else {
                    println("$nome não existe na lista")
                }
            }
            3 -> {println("\n$opcoes") }
        }
    }
}

