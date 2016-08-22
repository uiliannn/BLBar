package model;
/**
*
* @author BLSoft Desenvolvimento de Sistemas 
*/
public class ModelItensPedidosDelivery {

    private int codigo;
    private String codigoTelefone;
    private int codigoProduto;
    private String observacao;
    private float quantidade;
    private String statusPeido;

    /**
    * Construtor
    */
    public ModelItensPedidosDelivery(){}

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
    * seta o valor de codigoTelefone
    * @param pCodigoTelefone
    */
    public void setCodigoTelefone(String pCodigoTelefone){
        this.codigoTelefone = pCodigoTelefone;
    }
    /**
    * return codigoTelefone
    */
    public String getCodigoTelefone(){
        return this.codigoTelefone;
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

    /**
    * seta o valor de statusPeido
    * @param pStatusPeido
    */
    public void setStatusPeido(String pStatusPeido){
        this.statusPeido = pStatusPeido;
    }
    /**
    * return statusPeido
    */
    public String getStatusPeido(){
        return this.statusPeido;
    }

    @Override
    public String toString(){
        return "ModelItensPedidosDelivery {" + "::codigo = " + this.codigo + "::codigoTelefone = " + this.codigoTelefone + "::codigoProduto = " + this.codigoProduto + "::observacao = " + this.observacao + "::quantidade = " + this.quantidade + "::statusPeido = " + this.statusPeido +  "}";
    }
}