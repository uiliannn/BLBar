package model;
/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class ModelVendasProdutos {

    private int codigo;
    private int codigoProduto;
    private int codigoVenda;
    private float quantidade;
    private double valorUnitario;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

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
    * seta o valor de codigoProduto
    * @param pCodigoProduto
    */
    public void setCodigo_produto(int pCodigoProduto){
        this.codigoProduto = pCodigoProduto;
    }
    /**
    * return codigoProduto
    */
    public int getCodigo_produto(){
        return this.codigoProduto;
    }

    /**
    * seta o valor de codigoVenda
    * @param pCodigoVenda
    */
    public void setCodigo_venda(int pCodigoVenda){
        this.codigoVenda = pCodigoVenda;
    }
    /**
    * return codigoVenda
    */
    public int getCodigo_venda(){
        return this.codigoVenda;
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
        return "ModelVendasProdutos {" + "::codigo = " + this.codigo + "::codigo_produto = " + this.codigoProduto + "::codigo_venda = " + this.codigoVenda + "::quantidade = " + this.quantidade +  "}";
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}