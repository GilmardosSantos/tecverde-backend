package com.tecverde.database.models;

import java.util.List;

public interface Usuario {
    String getNome();

    void setNome(String nome);

    String getNumeroDocumento();

    void setNumeroDocumento(String numeroDocumento);

    Endereco getEndereco();

    void setEndereco(Endereco endereco);

    List<Equipamento> getEquipamentos();

    void setEquipamentos(Equipamento equipamento);

}
