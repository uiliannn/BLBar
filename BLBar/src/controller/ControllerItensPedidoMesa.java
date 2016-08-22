package controller;

import model.ModelItensPedidoMesa;
import DAO.DAOItensPedidoMesa;
import java.util.ArrayList;

/**
*
* @author BLSoft
*/
public class ControllerItensPedidoMesa {

    private DAOItensPedidoMesa daoItensPedidoMesa = new DAOItensPedidoMesa();

    /**
    * grava ItensPedidoMesa
    * @param pModelItensPedidoMesa
    * return int
    */
    public int salvarItensPedidoMesaController(ModelItensPedidoMesa pModelItensPedidoMesa){
        return this.daoItensPedidoMesa.salvarItensPedidoMesaDAO(pModelItensPedidoMesa);
    }
    
        /**
    * grava ItensPedidoMesa
    * @param pModelItensPedidoMesa
    * return int
    */
    public boolean salvarItensPedidoMesaController(ArrayList<ModelItensPedidoMesa> pListaModelItensPedidoMesas){
        return this.daoItensPedidoMesa.salvarItensPedidoMesaDAO(pListaModelItensPedidoMesas);
    }

    /**
    * recupera ItensPedidoMesa
    * @param pCodigo
    * return ModelItensPedidoMesa
    */
    public ModelItensPedidoMesa getItensPedidoMesaController(int pCodigo){
        return this.daoItensPedidoMesa.getItensPedidoMesaDAO(pCodigo);
    }

    /**
    * recupera uma lista deItensPedidoMesa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelItensPedidoMesa> getListaItensPedidoMesaController(){
        return this.daoItensPedidoMesa.getListaItensPedidoMesaDAO();
    }
    /**
    * recupera uma lista deItensPedidoMesa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelItensPedidoMesa> getListaItensPedidoMesaController(int pCodigoMesa){
        return this.daoItensPedidoMesa.getListaItensPedidoMesaDAO(pCodigoMesa);
    }

    /**
    * atualiza ItensPedidoMesa
    * @param pModelItensPedidoMesa
    * return boolean
    */
    public boolean atualizarItensPedidoMesaController(ModelItensPedidoMesa pModelItensPedidoMesa){
        return this.daoItensPedidoMesa.atualizarItensPedidoMesaDAO(pModelItensPedidoMesa);
    }

    /**
    * exclui ItensPedidoMesa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirItensPedidoMesaController(int pCodigo){
        return this.daoItensPedidoMesa.excluirItensPedidoMesaDAO(pCodigo);
    }
}