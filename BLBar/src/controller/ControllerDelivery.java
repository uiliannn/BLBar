package controller;

import model.ModelDelivery;
import DAO.DAODelivery;
import java.util.ArrayList;

/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class ControllerDelivery {

    private DAODelivery daoDelivery = new DAODelivery();

    /**
    * grava Delivery
    * @param pModelDelivery
    * return int
    */
    public int salvarDeliveryController(ModelDelivery pModelDelivery){
        return this.daoDelivery.salvarDeliveryDAO(pModelDelivery);
    }

    /**
    * recupera Delivery
    * @param pCodigo
    * return ModelDelivery
    */
    public ModelDelivery getDeliveryController(int pCodigo){
        return this.daoDelivery.getDeliveryDAO(pCodigo);
    }
    
    /**
    * recupera Delivery
    * @param pTelefoneCliente
    * return ModelDelivery
    */
    public ModelDelivery getDeliveryController(String pTelefoneCliente){
        return this.daoDelivery.getDeliveryDAO(pTelefoneCliente);
    }

    /**
    * recupera uma lista deDelivery
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelDelivery> getListaDeliveryController(){
        return this.daoDelivery.getListaDeliveryDAO();
    }

    /**
    * atualiza Delivery
    * @param pModelDelivery
    * return boolean
    */
    public boolean atualizarDeliveryController(ModelDelivery pModelDelivery){
        return this.daoDelivery.atualizarDeliveryDAO(pModelDelivery);
    }

    /**
    * exclui Delivery
    * @param pCodigo
    * return boolean
    */
    public boolean excluirDeliveryController(int pCodigo){
        return this.daoDelivery.excluirDeliveryDAO(pCodigo);
    }

    public boolean excluirDeliveryController(String pNumeroTelefone) {
        return this.daoDelivery.excluirDeliveryDAO(pNumeroTelefone);
    }
}