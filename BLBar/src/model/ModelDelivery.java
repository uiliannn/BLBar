package model;
/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class ModelDelivery {

    private int codigo;
    private int codigoCliente;
    private String situacao;
    private String codigoTelefone;

    /**
    * Construtor
    */
    public ModelDelivery(){}

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
    * seta o valor de codigoCliente
    * @param pCodigoCliente
    */
    public void setCodigoCliente(int pCodigoCliente){
        this.codigoCliente = pCodigoCliente;
    }
    /**
    * return fk_codigoCliente
    */
    public int getCodigoCliente(){
        return this.codigoCliente;
    }

    /**
    * seta o valor de situacao
    * @param pSituacao
    */
    public void setSituacao(String pSituacao){
        this.situacao = pSituacao;
    }
    /**
    * return situacao
    */
    public String getSituacao(){
        return this.situacao;
    }

    @Override
    public String toString(){
        return "ModelDelivery {" + "::codigo = " + this.codigo + "::codigoCliente = " + this.codigoCliente + "::situacao = " + this.situacao +  "}";
    }

    /**
     * @return the codigoTelefone
     */
    public String getCodigoTelefone() {
        return codigoTelefone;
    }

    /**
     * @param codigoTelefone the codigoTelefone to set
     */
    public void setCodigoTelefone(String codigoTelefone) {
        this.codigoTelefone = codigoTelefone;
    }
}