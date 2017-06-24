package com.aula

class Aluno {
    String nome
    String email
    String ra

    static constraints = {
        nome blank:false, size:1..30
        email blank:false, email:true
        ra blank:false
    }
}
