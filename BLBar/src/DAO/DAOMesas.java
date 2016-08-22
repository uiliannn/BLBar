package DAO;

import model.ModelMesas;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class DAOMesas extends ConexaoMySql {

    /**
     * grava Mesas
     *
     * @param pModelMesas return int
     */
    public int salvarMesasDAO(ModelMesas pModelMesas) {
        try {
            this.conectar();
            int numeroMesa = 0;
            int sizeLista = pModelMesas.getNumeroMesa();
            for (int i = 0; i < sizeLista; i++) {
                numeroMesa = i + 1;
                this.insertSQL(
                        "INSERT INTO mesas ("
                        + "numero_mesa,"
                        + "situacao_mesa"
                        + ") VALUES ("
                        + "'" + numeroMesa + "',"
                        + "'" + pModelMesas.getSituacaoMesa() + "'"
                        + ");"
                );
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Mesas
     *
     * @param pCodigo return ModelMesas
     */
    public ModelMesas getMesasDAO(int pCodigo) {
        ModelMesas modelMesas = new ModelMesas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "numero_mesa,"
                    + "situacao_mesa"
                    + " FROM"
                    + " mesas"
                    + " WHERE"
                    + " pk_codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMesas.setCodigo(this.getResultSet().getInt(1));
                modelMesas.setNumeroMesa(this.getResultSet().getInt(2));
                modelMesas.setSituacaoMesa(this.getResultSet().getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMesas;
    }

    /**
     * recupera Mesas
     *
     * @param pNumeroMesa return ModelMesas
     */
    public ModelMesas getMesaDAO(int pNumeroMesa) {
        ModelMesas modelMesas = new ModelMesas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "situacao_mesa"
                    + " FROM"
                    + " mesas"
                    + " WHERE"
                    + " numero_mesa = '" + pNumeroMesa + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMesas.setCodigo(this.getResultSet().getInt(1));
                modelMesas.setNumeroMesa(pNumeroMesa);
                modelMesas.setSituacaoMesa(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMesas;
    }

    /**
     * recupera uma lista de Mesas return ArrayList
     */
    public ArrayList<ModelMesas> getListaMesasDAO() {
        ArrayList<ModelMesas> listamodelMesas = new ArrayList();
        ModelMesas modelMesas = new ModelMesas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "numero_mesa,"
                    + "situacao_mesa"
                    + " FROM"
                    + " mesas"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMesas = new ModelMesas();
                modelMesas.setCodigo(this.getResultSet().getInt(1));
                modelMesas.setNumeroMesa(this.getResultSet().getInt(2));
                modelMesas.setSituacaoMesa(this.getResultSet().getString(3));
                listamodelMesas.add(modelMesas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelMesas;
    }

    /**
     * atualiza Mesas
     *
     * @param pModelMesas return boolean
     */
    public boolean atualizarMesasDAO(ModelMesas pModelMesas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE mesas SET "
                    + "situacao_mesa = '" + pModelMesas.getSituacaoMesa() + "'"
                    + " WHERE "
                    + "numero_mesa = '" + pModelMesas.getNumeroMesa() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Mesas
     *
     * @param pCodigo return boolean
     */
    public boolean excluirMesasDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM mesas "
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
