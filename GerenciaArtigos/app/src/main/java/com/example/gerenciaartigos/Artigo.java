package com.example.gerenciaartigos;

import java.io.Serializable;

public class Artigo implements Serializable {

    private static final long serialVersionUID = 1633833011084400384L;

    int id;
    String revista;
    String nome;
    String edicao;
    int status;
    int pago;
}

