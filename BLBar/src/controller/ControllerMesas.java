package controller;

import model.ModelMesas;
import DAO.DAOMesas;
import java.util.ArrayList;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class ControllerMesas {

    private DAOMesas daoMesas = new DAOMesas();

    /**
     * grava Mesas
     *
     * @param pModelMesas return int
     */
    public int salvarMesasController(ModelMesas pModelMesas) {
        return this.daoMesas.salvarMesasDAO(pModelMesas);
    }

    /**
     * recupera Mesas
     *
     * @param pCodigo return ModelMesas
     */
    public ModelMesas getMesasController(int pCodigo) {
        return this.daoMesas.getMesasDAO(pCodigo);
    }

    /**
     * recupera uma lista deMesas
     *
     * @param pCodigo return ArrayList
     */
    public ArrayList<ModelMesas> getListaMesasController() {
        return this.daoMesas.getListaMesasDAO();
    }

    /**
     * atualiza Mesas
     *
     * @param pModelMesas return boolean
     */
    public boolean atualizarMesasController(ModelMesas pModelMesas) {
        return this.daoMesas.atualizarMesasDAO(pModelMesas);
    }

    /**
     * exclui Mesas
     *
     * @param pCodigo return boolean
     */
    public boolean excluirMesasController(int pCodigo) {
        return this.daoMesas.excluirMesasDAO(pCodigo);
    }

    /**
     * recupera Mesa pelo seu numero
     *
     * @param pNumeroMesa return ModelMesas
     */
    public ModelMesas getMesaController(int pNumeroMesa) {
        return this.daoMesas.getMesaDAO(pNumeroMesa);
    }
}
