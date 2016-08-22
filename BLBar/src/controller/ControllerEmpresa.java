package controller;

import model.ModelEmpresa;
import DAO.DAOEmpresa;
import java.util.ArrayList;

/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class ControllerEmpresa {

    private DAOEmpresa daoEmpresa = new DAOEmpresa();

    /**
    * grava Empresa
    * @param pModelEmpresa
    * return int
    */
    public int salvarEmpresaController(ModelEmpresa pModelEmpresa){
        return this.daoEmpresa.salvarEmpresaDAO(pModelEmpresa);
    }

    /**
    * recupera Empresa
    * @param pCodigo
    * return ModelEmpresa
    */
    public ModelEmpresa getEmpresaController(int pCodigo){
        return this.daoEmpresa.getEmpresaDAO(pCodigo);
    }

    /**
    * recupera uma lista deEmpresa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelEmpresa> getListaEmpresaController(){
        return this.daoEmpresa.getListaEmpresaDAO();
    }

    /**
    * atualiza Empresa
    * @param pModelEmpresa
    * return boolean
    */
    public boolean atualizarEmpresaController(ModelEmpresa pModelEmpresa){
        return this.daoEmpresa.atualizarEmpresaDAO(pModelEmpresa);
    }

    /**
    * exclui Empresa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirEmpresaController(int pCodigo){
        return this.daoEmpresa.excluirEmpresaDAO(pCodigo);
    }
}