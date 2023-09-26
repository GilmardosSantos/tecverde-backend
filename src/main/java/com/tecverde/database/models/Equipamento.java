package com.tecverde.database.models;

public class Equipamento {
    private String nomeEquipamento;
    private String modeloEquipamento;
    private String marcaEquipamento;
    private String dataRetirada;
    private String dataDevolucao;
    private String serialEquipamento;

    /**
     * @return the nomeEquipamento
     */
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    /**
     * @param nomeEquipamento the nomeEquipamento to set
     */
    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    /**
     * @return the modeloEquipamento
     */
    public String getModeloEquipamento() {
        return modeloEquipamento;
    }

    /**
     * @param modeloEquipamento the modeloEquipamento to set
     */
    public void setModeloEquipamento(String modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }

    /**
     * @return the marcaEquipamento
     */
    public String getMarcaEquipamento() {
        return marcaEquipamento;
    }

    /**
     * @param marcaEquipamento the marcaEquipamento to set
     */
    public void setMarcaEquipamento(String marcaEquipamento) {
        this.marcaEquipamento = marcaEquipamento;
    }

    /**
     * @return the dataRetirada
     */
    public String getDataRetirada() {
        return dataRetirada;
    }

    /**
     * @param dataRetirada the dataRetirada to set
     */
    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the serialEquipamento
     */
    public String getSerialEquipamento() {
        return serialEquipamento;
    }

    /**
     * @param serialEquipamento the serialEquipamento to set
     */
    public void setSerialEquipamento(String serialEquipamento) {
        this.serialEquipamento = serialEquipamento;
    }

}
