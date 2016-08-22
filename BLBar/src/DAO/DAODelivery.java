package DAO;

import model.ModelDelivery;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class DAODelivery extends ConexaoMySql {

    /**
     * grava Delivery
     *
     * @param pModelDelivery return int
     */
    public int salvarDeliveryDAO(ModelDelivery pModelDelivery) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO delivery ("
                    + "fk_codigo_cliente,"
                    + "situacao, "
                    + "codigo_telefone "
                    + ") VALUES ("
                    + "'" + pModelDelivery.getCodigoCliente() + "',"
                    + "'" + pModelDelivery.getSituacao() + "',"
                    + "'" + pModelDelivery.getCodigoTelefone() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Delivery
     *
     * @param pCodigo return ModelDelivery
     */
    public ModelDelivery getDeliveryDAO(int pCodigo) {
        ModelDelivery modelDelivery = new ModelDelivery();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_cliente,"
                    + "situacao, "
                    + "codigo_telefone "
                    + " FROM"
                    + " delivery"
                    + " WHERE"
                    + " pk_codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelDelivery.setCodigo(this.getResultSet().getInt(1));
                modelDelivery.setCodigoCliente(this.getResultSet().getInt(2));
                modelDelivery.setSituacao(this.getResultSet().getString(3));
                modelDelivery.setCodigoTelefone(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelDelivery;
    }
    
    /**
     * recupera Delivery
     *
     * @param pTelefone return ModelDelivery
     */
    public ModelDelivery getDeliveryDAO(String pTelefone) {
        ModelDelivery modelDelivery = new ModelDelivery();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_cliente,"
                    + "situacao, "
                    + "codigo_telefone "
                    + " FROM"
                    + " delivery"
                    + " WHERE"
                    + " codigo_telefone = '" + pTelefone + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelDelivery.setCodigo(this.getResultSet().getInt(1));
                modelDelivery.setCodigoCliente(this.getResultSet().getInt(2));
                modelDelivery.setSituacao(this.getResultSet().getString(3));
                modelDelivery.setCodigoTelefone(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelDelivery;
    }

    /**
     * recupera uma lista de Delivery return ArrayList
     */
    public ArrayList<ModelDelivery> getListaDeliveryDAO() {
        ArrayList<ModelDelivery> listamodelDelivery = new ArrayList();
        ModelDelivery modelDelivery = new ModelDelivery();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_cliente,"
                    + "situacao,"
                    + "codigo_telefone "
                    + " FROM"
                    + " delivery"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelDelivery = new ModelDelivery();
                modelDelivery.setCodigo(this.getResultSet().getInt(1));
                modelDelivery.setCodigoCliente(this.getResultSet().getInt(2));
                modelDelivery.setSituacao(this.getResultSet().getString(3));
                modelDelivery.setCodigoTelefone(this.getResultSet().getString(4));
                listamodelDelivery.add(modelDelivery);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelDelivery;
    }

    /**
     * atualiza Delivery
     *
     * @param pModelDelivery return boolean
     */
    public boolean atualizarDeliveryDAO(ModelDelivery pModelDelivery) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE delivery SET "
                    + "pk_codigo = '" + pModelDelivery.getCodigo() + "',"
                    + "fk_codigo_cliente = '" + pModelDelivery.getCodigoCliente() + "',"
                    + "situacao = '" + pModelDelivery.getSituacao() + "',"
                    + "codigo_telefone = '" + pModelDelivery.getCodigoTelefone() + "'"
                    + " WHERE "
                    + "pk_codigo = '" + pModelDelivery.getCodigo() + "'"
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
     * exclui Delivery
     *
     * @param pCodigo return boolean
     */
    public boolean excluirDeliveryDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM delivery "
                    + " WHERE "
                    + "pk_codigo = '" + pCodigo + "'"
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
     * Excluir delivery por telefone
     * @param pNumeroTelefone
     * @return 
     */
    public boolean excluirDeliveryDAO(String pNumeroTelefone) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM delivery "
                    + " WHERE "
                    + "codigo_telefone = '" + pNumeroTelefone + "'"
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
