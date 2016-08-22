package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelContaPagar;
/**
*
* @author contato@blsoft.com.br
*/
public class DAOContaPagar extends ConexaoMySql {

    /**
    * grava ContaPagar
    * @param pModelContaPagar
    * return int
    */
    public int salvarContaPagarDAO(ModelContaPagar pModelContaPagar){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO contas_pagar ("
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor "
                + ") VALUES ("
                    + "'" + pModelContaPagar.getCodigoPessoa() + "',"
                    + "'" + pModelContaPagar.getDescricao() + "',"
                    + "'" + pModelContaPagar.getData() + "',"
                    + "'" + pModelContaPagar.getVencimento() + "',"
                    + "'" + pModelContaPagar.getPagamento() + "',"
                    + "'" + pModelContaPagar.getTipoPagamento() + "',"
                    + "'" + pModelContaPagar.getObservacao() + "',"
                    + "'" + pModelContaPagar.isSituacao() + "',"
                    + "'" + pModelContaPagar.getValor() + "'"
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
    * recupera ContaPagar
    * @param pCodigo
    * return ModelConta
    */
    public ModelContaPagar getContaPagarDAO(int pCodigo){
        ModelContaPagar modelContaPagar = new ModelContaPagar();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor"
                 + " FROM"
                     + " contas_pagar"
                 + " WHERE"
                     + " pk_codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelContaPagar.setCodigo(this.getResultSet().getInt(1));
                modelContaPagar.setCodigoPessoa(this.getResultSet().getInt(2));
                modelContaPagar.setDescricao(this.getResultSet().getString(3));
                modelContaPagar.setData(this.getResultSet().getDate(4));
                modelContaPagar.setVencimento(this.getResultSet().getDate(5));
                modelContaPagar.setPagamento(this.getResultSet().getDate(6));
                modelContaPagar.setTipoPagamento(this.getResultSet().getInt(7));
                modelContaPagar.setObservacao(this.getResultSet().getString(8));
                modelContaPagar.setSituacao(this.getResultSet().getInt(9));
                modelContaPagar.setValor(this.getResultSet().getFloat(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelContaPagar;
    }

    /**
    * recupera uma lista de ContaPagar
        * return ArrayList
    */
    public ArrayList<ModelContaPagar> getListaContaPagarDAO(){
        ArrayList<ModelContaPagar> listamodelConta = new ArrayList();
        ModelContaPagar modelContaPagar = new ModelContaPagar();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor"
                 + " FROM"
                     + " contas_pagar"
                + ";"
            );

            while(this.getResultSet().next()){
                modelContaPagar = new ModelContaPagar();
                modelContaPagar.setCodigo(this.getResultSet().getInt(1));
                modelContaPagar.setCodigoPessoa(this.getResultSet().getInt(2));
                modelContaPagar.setDescricao(this.getResultSet().getString(3));
                modelContaPagar.setData(this.getResultSet().getDate(4));
                modelContaPagar.setVencimento(this.getResultSet().getDate(5));
                modelContaPagar.setPagamento(this.getResultSet().getDate(6));
                modelContaPagar.setTipoPagamento(this.getResultSet().getInt(7));
                modelContaPagar.setObservacao(this.getResultSet().getString(8));
                modelContaPagar.setSituacao(this.getResultSet().getInt(9));
                modelContaPagar.setValor(this.getResultSet().getFloat(10));
                listamodelConta.add(modelContaPagar);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelConta;
    }

    /**
    * recupera uma lista de ContaPagar
        * return ArrayList
    */
    public ArrayList<ModelContaPagar> getListaContaPagarDAO(int pStatus){
        ArrayList<ModelContaPagar> listamodelContaPagar = new ArrayList();
        ModelContaPagar modelContaPagar = new ModelContaPagar();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor "
                 + " FROM"
                     + " contas_pagar where situacao = '"+pStatus+"'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelContaPagar = new ModelContaPagar();
                modelContaPagar.setCodigo(this.getResultSet().getInt(1));
                modelContaPagar.setCodigoPessoa(this.getResultSet().getInt(2));
                modelContaPagar.setDescricao(this.getResultSet().getString(3));
                modelContaPagar.setData(this.getResultSet().getDate(4));
                modelContaPagar.setVencimento(this.getResultSet().getDate(5));
                modelContaPagar.setPagamento(this.getResultSet().getDate(6));
                modelContaPagar.setTipoPagamento(this.getResultSet().getInt(7));
                modelContaPagar.setObservacao(this.getResultSet().getString(8));
                modelContaPagar.setSituacao(this.getResultSet().getInt(9));
                modelContaPagar.setValor(this.getResultSet().getFloat(10));
                listamodelContaPagar.add(modelContaPagar);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelContaPagar;
    }
    
    
    /**
    * recupera uma lista de ContaPagar
        * return ArrayList
    */
    public ArrayList<ModelContaPagar> getListaContasDAO(int pStatus){
        ArrayList<ModelContaPagar> listamodelContaPagar = new ArrayList();
        ModelContaPagar modelContaPagar = new ModelContaPagar();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor "
                 + " FROM"
                     + " contas_pagar where situacao = '"+pStatus+"'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelContaPagar = new ModelContaPagar();
                modelContaPagar.setCodigo(this.getResultSet().getInt(1));
                modelContaPagar.setCodigoPessoa(this.getResultSet().getInt(2));
                modelContaPagar.setDescricao(this.getResultSet().getString(3));
                modelContaPagar.setData(this.getResultSet().getDate(4));
                modelContaPagar.setVencimento(this.getResultSet().getDate(5));
                modelContaPagar.setPagamento(this.getResultSet().getDate(6));
                modelContaPagar.setTipoPagamento(this.getResultSet().getInt(7));
                modelContaPagar.setObservacao(this.getResultSet().getString(8));
                modelContaPagar.setSituacao(this.getResultSet().getInt(9));
                modelContaPagar.setValor(this.getResultSet().getFloat(10));
                listamodelContaPagar.add(modelContaPagar);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelContaPagar;
    }
    
    /**
    * recupera uma lista de ContaPagar por data
        * return ArrayList
    */
    public ArrayList<ModelContaPagar> getListaContasDAO(ModelContaPagar pModelConta){
        ArrayList<ModelContaPagar> listamodelContaPagar = new ArrayList();
        ModelContaPagar modelContaPagar = new ModelContaPagar();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "fk_codigo_pessoa,"
                    + "descricao,"
                    + "data,"
                    + "vencimento,"
                    + "pagamento,"
                    + "fk_tipo_pagamento,"
                    + "observacao,"
                    + "situacao,"
                    + "valor "
                 + " FROM"
                     + " contas_pagar where situacao = '"+pModelConta.isSituacao() +"' AND pagamento = '"+pModelConta.getPagamento() +"'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelContaPagar = new ModelContaPagar();
                modelContaPagar.setCodigo(this.getResultSet().getInt(1));
                modelContaPagar.setCodigoPessoa(this.getResultSet().getInt(2));
                modelContaPagar.setDescricao(this.getResultSet().getString(3));
                modelContaPagar.setData(this.getResultSet().getDate(4));
                modelContaPagar.setVencimento(this.getResultSet().getDate(5));
                modelContaPagar.setPagamento(this.getResultSet().getDate(6));
                modelContaPagar.setTipoPagamento(this.getResultSet().getInt(7));
                modelContaPagar.setObservacao(this.getResultSet().getString(8));
                modelContaPagar.setSituacao(this.getResultSet().getInt(9));
                modelContaPagar.setValor(this.getResultSet().getFloat(10));
                listamodelContaPagar.add(modelContaPagar);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelContaPagar;
    }
    
    /**
    * atualiza ContaPagar
    * @param pModelContaPagar
    * return boolean
    */
    public boolean atualizarContaPagarDAO(ModelContaPagar pModelContaPagar){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE contas_pagar SET "
                    + "pk_codigo = '" + pModelContaPagar.getCodigo() + "',"
                    + "fk_codigo_pessoa = '" + pModelContaPagar.getCodigoPessoa() + "',"
                    + "descricao = '" + pModelContaPagar.getDescricao() + "',"
                    + "data = '" + pModelContaPagar.getData() + "',"
                    + "vencimento = '" + pModelContaPagar.getVencimento() + "',"
                    + "pagamento = '" + pModelContaPagar.getPagamento() + "',"
                    + "fk_tipo_pagamento = '" + pModelContaPagar.getTipoPagamento() + "',"
                    + "observacao = '" + pModelContaPagar.getObservacao() + "',"
                    + "situacao = '" + pModelContaPagar.isSituacao() + "',"
                    + "valor = '" + pModelContaPagar.getValor() + "'"
                + " WHERE "
                    + "pk_codigo = '" + pModelContaPagar.getCodigo() + "'"
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
    * exclui ContaPagar
    * @param pCodigo
    * return boolean
    */
    public boolean excluirContaPagarDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM contas_pagar "
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
    
    public boolean pagarContaPagarDAO(ModelContaPagar pModelContaPagar) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE contas_pagar SET "
                    + "pagamento = '" + pModelContaPagar.getPagamento() + "',"
                    + "situacao = '" + pModelContaPagar.isSituacao() + "'"
                + " WHERE "
                    + "pk_codigo = '" + pModelContaPagar.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
}