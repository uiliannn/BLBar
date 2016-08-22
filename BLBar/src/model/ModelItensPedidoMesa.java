package model;
/**
*
* @author BLSoft
*/
public class ModelItensPedidoMesa {

    private int codigo;
    private int codigoMesa;
    private int codigoProduto;
    private String statusPedido;
    private String observacao;
    private float quantidade;

    /**
    * Construtor
    */
    public ModelItensPedidoMesa(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return pk_codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de codigoMesa
    * @param pCodigoMesa
    */
    public void setCodigoMesa(int pCodigoMesa){
        this.codigoMesa = pCodigoMesa;
    }
    /**
    * return fk_codigoMesa
    */
    public int getCodigoMesa(){
        return this.codigoMesa;
    }

    /**
    * seta o valor de codigoProduto
    * @param pCodigoProduto
    */
    public void setCodigoProduto(int pCodigoProduto){
        this.codigoProduto = pCodigoProduto;
    }
    /**
    * return fk_codigoProduto
    */
    public int getCodigoProduto(){
        return this.codigoProduto;
    }

    /**
    * seta o valor de statusPedido
    * @param pStatusPedido
    */
    public void setStatusPedido(String pStatusPedido){
        this.statusPedido = pStatusPedido;
    }
    /**
    * return statusPedido
    */
    public String getStatusPedido(){
        return this.statusPedido;
    }

    /**
    * seta o valor de observacao
    * @param pObservacao
    */
    public void setObservacao(String pObservacao){
        this.observacao = pObservacao;
    }
    /**
    * return observacao
    */
    public String getObservacao(){
        return this.observacao;
    }

    @Override
    public String toString(){
        return "ModelItensPedidoMesa {" + "::codigo = " + this.codigo + "::codigoMesa = " + this.codigoMesa + "::codigoProduto = " + this.codigoProduto + "::statusPedido = " + this.statusPedido + "::observacao = " + this.observacao +  "}";
    }

    /**
     * @return the quantidade
     */
    public float getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
}