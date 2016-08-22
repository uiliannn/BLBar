package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
*/
public class ModelVendas {

    private int codigo;
    private int produtosCodigo;
    private int clientesCodigo;
    private Date dataVenda;
    private float quantidade;
    private Double valor;
    private Float valorTotal;
    private Float desconto;
    private int tipoPagamento;
    private ArrayList<ModelVendas> listamModelVendases;
    private int tipo;
    private String observacao;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de produtosCodigo
    * @param pProdutosCodigo
    */
    public void setProdutosCodigo(int pProdutosCodigo){
        this.produtosCodigo = pProdutosCodigo;
    }
    /**
    * return produtosCodigo
    */
    public int getProdutosCodigo(){
        return this.produtosCodigo;
    }

    /**
    * seta o valor de clientesCodigo
    * @param pClientesCodigo
    */
    public void setClientesCodigo(int pClientesCodigo){
        this.clientesCodigo = pClientesCodigo;
    }
    /**
    * return clientesCodigo
    */
    public int getClientesCodigo(){
        return this.clientesCodigo;
    }

    /**
    * seta o valor de dataVenda
    * @param pDataVenda
    */
    public void setDataVenda(Date pDataVenda){
        this.dataVenda = pDataVenda;
    }
    /**
    * return dataVenda
    */
    public Date getDataVenda(){
        return this.dataVenda;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(float pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * return quantidade
    */
    public float getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::codigo = " + this.codigo + "::produtosCodigo = " + this.produtosCodigo + "::clientesCodigo = " + this.clientesCodigo + "::dataVenda = " + this.dataVenda + "::quantidade = " + this.quantidade +  "}";
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the listamModelVendases
     */
    public ArrayList<ModelVendas> getListamModelVendases() {
        return listamModelVendases;
    }

    /**
     * @param listamModelVendases the listamModelVendases to set
     */
    public void setListamModelVendases(ArrayList<ModelVendas> listamModelVendases) {
        this.listamModelVendases = listamModelVendases;
    }

    /**
     * @return the valorTotal
     */
    public Float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public Float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the tipoPagamento
     */
    public int getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}