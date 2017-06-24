package com.aula

class Aluno {
    String nome
    String email
    String ra
    String sexo
    String apelido

    static constraints = {
        nome blank:false, size:1..30
        email blank:false, email:true
        ra blank:false
    }
}
