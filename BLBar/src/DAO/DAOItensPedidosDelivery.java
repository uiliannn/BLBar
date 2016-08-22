package DAO;

import model.ModelItensPedidosDelivery;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author BLSoft Desenvolvimento de Sistemas 
*/
public class DAOItensPedidosDelivery extends ConexaoMySql {

    /**
    * grava ItensPedidosDelivery
    * @param pModelItensPedidosDelivery
    * return int
    */
    public int salvarItensPedidosDeliveryDAO(ModelItensPedidosDelivery pModelItensPedidosDelivery){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO itens_pedidos_delivery ("
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                + ") VALUES ("
                    + "'" + pModelItensPedidosDelivery.getCodigo() + "',"
                    + "'" + pModelItensPedidosDelivery.getCodigoTelefone() + "',"
                    + "'" + pModelItensPedidosDelivery.getCodigoProduto() + "',"
                    + "'" + pModelItensPedidosDelivery.getObservacao() + "',"
                    + "'" + pModelItensPedidosDelivery.getQuantidade() + "',"
                    + "'" + pModelItensPedidosDelivery.getStatusPeido() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera ItensPedidosDelivery
    * @param pCodigo
    * return ModelItensPedidosDelivery
    */
    public ModelItensPedidosDelivery getItensPedidosDeliveryDAO(int pCodigo){
        ModelItensPedidosDelivery modelItensPedidosDelivery = new ModelItensPedidosDelivery();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                 + " FROM"
                     + " itens_pedidos_delivery"
                 + " WHERE"
                     + " pk_codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelItensPedidosDelivery.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidosDelivery.setCodigoTelefone(this.getResultSet().getString(2));
                modelItensPedidosDelivery.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidosDelivery.setObservacao(this.getResultSet().getString(4));
                modelItensPedidosDelivery.setQuantidade(this.getResultSet().getFloat(5));
                modelItensPedidosDelivery.setStatusPeido(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelItensPedidosDelivery;
    }

    /**
    * recupera uma lista de ItensPedidosDelivery
    * String pTelefone
        * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosDeliveryDAO(){
        ArrayList<ModelItensPedidosDelivery> listamodelItensPedidosDelivery = new ArrayList();
        ModelItensPedidosDelivery modelItensPedidosDelivery = new ModelItensPedidosDelivery();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                 + " FROM"
                     + " itens_pedidos_delivery"
                + ";"
            );

            while(this.getResultSet().next()){
                modelItensPedidosDelivery = new ModelItensPedidosDelivery();
                modelItensPedidosDelivery.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidosDelivery.setCodigoTelefone(this.getResultSet().getString(2));
                modelItensPedidosDelivery.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidosDelivery.setObservacao(this.getResultSet().getString(4));
                modelItensPedidosDelivery.setQuantidade(this.getResultSet().getFloat(5));
                modelItensPedidosDelivery.setStatusPeido(this.getResultSet().getString(6));
                listamodelItensPedidosDelivery.add(modelItensPedidosDelivery);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelItensPedidosDelivery;
    }
    
    /**
    * recupera uma lista de ItensPedidosDelivery
    * String pTelefone
        * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosAbertoDeliveryDAO(){
        ArrayList<ModelItensPedidosDelivery> listamodelItensPedidosDelivery = new ArrayList();
        ModelItensPedidosDelivery modelItensPedidosDelivery = new ModelItensPedidosDelivery();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                 + " FROM"
                     + " itens_pedidos_delivery"
                 + " WHERE"
                     + " status_pedido = 'Enviado para cozinha'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelItensPedidosDelivery = new ModelItensPedidosDelivery();
                modelItensPedidosDelivery.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidosDelivery.setCodigoTelefone(this.getResultSet().getString(2));
                modelItensPedidosDelivery.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidosDelivery.setObservacao(this.getResultSet().getString(4));
                modelItensPedidosDelivery.setQuantidade(this.getResultSet().getFloat(5));
                modelItensPedidosDelivery.setStatusPeido(this.getResultSet().getString(6));
                listamodelItensPedidosDelivery.add(modelItensPedidosDelivery);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelItensPedidosDelivery;
    }
    
    /**
    * recupera uma lista de ItensPedidosDelivery
        * return ArrayList
    */
    public ArrayList<ModelItensPedidosDelivery> getListaItensPedidosDeliveryDAO(String pTelefone){
        ArrayList<ModelItensPedidosDelivery> listamodelItensPedidosDelivery = new ArrayList();
        ModelItensPedidosDelivery modelItensPedidosDelivery = new ModelItensPedidosDelivery();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                 + " FROM"
                     + " itens_pedidos_delivery "
                 + " WHERE"
                     + " codigo_telefone = '" + pTelefone + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelItensPedidosDelivery = new ModelItensPedidosDelivery();
                modelItensPedidosDelivery.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidosDelivery.setCodigoTelefone(this.getResultSet().getString(2));
                modelItensPedidosDelivery.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidosDelivery.setObservacao(this.getResultSet().getString(4));
                modelItensPedidosDelivery.setQuantidade(this.getResultSet().getFloat(5));
                modelItensPedidosDelivery.setStatusPeido(this.getResultSet().getString(6));
                listamodelItensPedidosDelivery.add(modelItensPedidosDelivery);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelItensPedidosDelivery;
    }

    /**
    * atualiza ItensPedidosDelivery
    * @param pModelItensPedidosDelivery
    * return boolean
    */
    public boolean atualizarItensPedidosDeliveryDAO(ModelItensPedidosDelivery pModelItensPedidosDelivery){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE itens_pedidos_delivery SET "
                    + "pk_codigo = '" + pModelItensPedidosDelivery.getCodigo() + "',"
                    + "codigo_telefone = '" + pModelItensPedidosDelivery.getCodigoTelefone() + "',"
                    + "fk_codigo_produto = '" + pModelItensPedidosDelivery.getCodigoProduto() + "',"
                    + "observacao = '" + pModelItensPedidosDelivery.getObservacao() + "',"
                    + "quantidade = '" + pModelItensPedidosDelivery.getQuantidade() + "',"
                    + "status_pedido = '" + pModelItensPedidosDelivery.getStatusPeido() + "'"
                + " WHERE "
                    + "pk_codigo = '" + pModelItensPedidosDelivery.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui ItensPedidosDelivery
    * @param pCodigo
    * return boolean
    */
    public boolean excluirItensPedidosDeliveryDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM itens_pedidos_delivery "
                + " WHERE "
                    + "pk_codigo = '" + pCodigo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean excluirItensPedidosDeliveryDAO(String pNumeroTelefone) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM itens_pedidos_delivery "
                + " WHERE "
                    + "codigo_telefone = '" + pNumeroTelefone + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarItensPedidosDeliveryDAO(ArrayList<ModelItensPedidosDelivery> pListaModelItensPedidosDeliverys) {
       try {
            this.conectar();
            int sizeLista = pListaModelItensPedidosDeliverys.size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                "INSERT INTO itens_pedidos_delivery ("
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                + ") VALUES ("
                        + "'" + pListaModelItensPedidosDeliverys.get(i).getCodigoTelefone()+ "',"
                        + "'" + pListaModelItensPedidosDeliverys.get(i).getCodigoProduto() + "',"
                        + "'" + pListaModelItensPedidosDeliverys.get(i).getObservacao() + "',"
                        + "'" + pListaModelItensPedidosDeliverys.get(i).getQuantidade() + "',"
                        + "'" + pListaModelItensPedidosDeliverys.get(i).getStatusPeido()+ "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelItensPedidosDelivery getItensPedidosDeliveryDAO(String pTelefone) {
        ModelItensPedidosDelivery modelItensPedidosDelivery = new ModelItensPedidosDelivery();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "codigo_telefone,"
                    + "fk_codigo_produto,"
                    + "observacao,"
                    + "quantidade,"
                    + "status_pedido"
                 + " FROM"
                     + " itens_pedidos_delivery"
                 + " WHERE"
                     + " codigo_telefone = '" + pTelefone + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelItensPedidosDelivery.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidosDelivery.setCodigoTelefone(this.getResultSet().getString(2));
                modelItensPedidosDelivery.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidosDelivery.setObservacao(this.getResultSet().getString(4));
                modelItensPedidosDelivery.setQuantidade(this.getResultSet().getFloat(5));
                modelItensPedidosDelivery.setStatusPeido(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelItensPedidosDelivery;
    }
}