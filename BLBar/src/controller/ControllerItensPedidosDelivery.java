package controller;

import model.ModelItensPedidosDelivery;
import DAO.DAOItensPedidosDelivery;
import java.util.ArrayList;

/**
*
* @author BLSoft Desenvolvimento de Sistemas 
*/
public class ControllerItensPedidosDelivery {

    private DAOItensPedidosDelivery daoItensPedidosDelivery = new DAOItensPedidosDelivery();

    /**
    * grava ItensPedidosDelivery
    * @param pModelItensPedidosDelivery
    * return int
    */
    public int salvarItensPedidosDeliveryController(ModelItensPedidosDelivery pModelItensPedidosDelivery){
        return this.daoItensPedidosDelivery.salvarItensPedidosDeliveryDAO(pModelItensPedidosDelivery);
    }

    /**
    * recupera ItensPedidosDelivery
    * @param pCodigo
    * return ModelItensPedidosDelivery
    */
    public ModelItensPedidosDelivery getItensPedidosDeliveryController(int pCodigo){
        return this.daoItensPedidosDelivery.getItensPedidosDeliveryDAO(pCodigo);
    }
    
    /**
     * Telefone cliente
     * @param pTelefone
     * @return 
     */
     public ModelItensPedidosDelivery getItensPedidosDeliveryController(String pTelefone){
        return this.daoItensPedidosDelivery.getItensPedidosDeliveryDAO(pTelefone);
    }   

    /**
    * recupera uma lista deItensPedidosDelivery
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosDeliveryController(){
        return this.daoItensPedidosDelivery.getListaItensPedidosDeliveryDAO();
    }
    /**
    * recupera uma lista deItensPedidosDelivery
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosDeliveryAbertoController(){
        return this.daoItensPedidosDelivery.getListaItensPedidosAbertoDeliveryDAO();
    }

    /**
    * recupera uma lista deItensPedidosDelivery
    * @param String pTelefone
    * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosDeliveryController(String pTelefone){
        return this.daoItensPedidosDelivery.getListaItensPedidosDeliveryDAO(pTelefone);
    }
    
    /**
    * atualiza ItensPedidosDelivery
    * @param pModelItensPedidosDelivery
    * return boolean
    */
    public boolean atualizarItensPedidosDeliveryController(ModelItensPedidosDelivery pModelItensPedidosDelivery){
        return this.daoItensPedidosDelivery.atualizarItensPedidosDeliveryDAO(pModelItensPedidosDelivery);
    }

    /**
    * exclui ItensPedidosDelivery
    * @param pCodigo
    * return boolean
    */
    public boolean excluirItensPedidosDeliveryController(int pCodigo){
        return this.daoItensPedidosDelivery.excluirItensPedidosDeliveryDAO(pCodigo);
    }

    /**
     * Excluir itens do pedido passando telefone estring
     * @param pNumeroTelefone 
     */
    public boolean excluirItensPedidosDeliveryController(String pNumeroTelefone) {
        return this.daoItensPedidosDelivery.excluirItensPedidosDeliveryDAO(pNumeroTelefone);
    }

    /**
     * Salva lista de produtos delivery
     * @param pListaModelItensPedidosDeliverys
     * @return 
     */
    public boolean salvarItensPedidosDeliveryController(ArrayList<ModelItensPedidosDelivery> pListaModelItensPedidosDeliverys) {
        return this.daoItensPedidosDelivery.salvarItensPedidosDeliveryDAO(pListaModelItensPedidosDeliverys);
    }

}