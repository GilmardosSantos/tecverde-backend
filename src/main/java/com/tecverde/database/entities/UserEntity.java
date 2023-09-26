package com.tecverde.database.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.tecverde.database.models.Endereco;
import com.tecverde.database.models.Equipamento;

@Document(collection = "usuarios")
public class UserEntity {
    @Id
    private String id;
    private String nome;
    private String numeroDocumento;
    private Endereco endereco;
    private List<Equipamento> equipamentos;

    @Override
    public String toString() {
        return "UserEntity [nome=" + nome + ", numeroDocumento=" + numeroDocumento + ", endereco=" + endereco
                + ", equipamentos=" + equipamentos + "]";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the equipamentos
     */
    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    /**
     * @param equipamentos the equipamentos to set
     */
    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

}
