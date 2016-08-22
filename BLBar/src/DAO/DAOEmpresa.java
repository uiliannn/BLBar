package DAO;

import model.ModelEmpresa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class DAOEmpresa extends ConexaoMySql {

    /**
    * grava Empresa
    * @param pModelEmpresa
    * return int
    */
    public int salvarEmpresaDAO(ModelEmpresa pModelEmpresa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO empresa ("
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone, "
                    + "cnpj "
                + ") VALUES ("
                    + "'" + pModelEmpresa.getCodigo() + "',"
                    + "'" + pModelEmpresa.getRazaoSocial() + "',"
                    + "'" + pModelEmpresa.getNomeFantasia() + "',"
                    + "'" + pModelEmpresa.getEndereco() + "',"
                    + "'" + pModelEmpresa.getBairro() + "',"
                    + "'" + pModelEmpresa.getCodCidade() + "',"
                    + "'" + pModelEmpresa.getCodEstado() + "',"
                    + "'" + pModelEmpresa.getCep() + "',"
                    + "'" + pModelEmpresa.getTelefone() + "',"
                    + "'" + pModelEmpresa.getCnpj()+ "'"
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
    * recupera Empresa
    * @param pCodigo
    * return ModelEmpresa
    */
    public ModelEmpresa getEmpresaDAO(int pCodigo){
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "cnpj "
                 + " FROM"
                     + " empresa"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEmpresa.setCodigo(this.getResultSet().getInt(1));
                modelEmpresa.setRazaoSocial(this.getResultSet().getString(2));
                modelEmpresa.setNomeFantasia(this.getResultSet().getString(3));
                modelEmpresa.setEndereco(this.getResultSet().getString(4));
                modelEmpresa.setBairro(this.getResultSet().getString(5));
                modelEmpresa.setCodCidade(this.getResultSet().getInt(6));
                modelEmpresa.setCodEstado(this.getResultSet().getInt(7));
                modelEmpresa.setCep(this.getResultSet().getString(8));
                modelEmpresa.setTelefone(this.getResultSet().getString(9));
                modelEmpresa.setCnpj(this.getResultSet().getString(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEmpresa;
    }

    /**
    * recupera uma lista de Empresa
        * return ArrayList
    */
    public ArrayList<ModelEmpresa> getListaEmpresaDAO(){
        ArrayList<ModelEmpresa> listamodelEmpresa = new ArrayList();
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "cnpj "
                 + " FROM"
                     + " empresa"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEmpresa = new ModelEmpresa();
                modelEmpresa.setCodigo(this.getResultSet().getInt(1));
                modelEmpresa.setRazaoSocial(this.getResultSet().getString(2));
                modelEmpresa.setNomeFantasia(this.getResultSet().getString(3));
                modelEmpresa.setEndereco(this.getResultSet().getString(4));
                modelEmpresa.setBairro(this.getResultSet().getString(5));
                modelEmpresa.setCodCidade(this.getResultSet().getInt(6));
                modelEmpresa.setCodEstado(this.getResultSet().getInt(7));
                modelEmpresa.setCep(this.getResultSet().getString(8));
                modelEmpresa.setTelefone(this.getResultSet().getString(9));
                modelEmpresa.setCnpj(this.getResultSet().getString(10));
                listamodelEmpresa.add(modelEmpresa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelEmpresa;
    }

    /**
    * atualiza Empresa
    * @param pModelEmpresa
    * return boolean
    */
    public boolean atualizarEmpresaDAO(ModelEmpresa pModelEmpresa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE empresa SET "
                    + "codigo = '" + pModelEmpresa.getCodigo() + "',"
                    + "razao_social = '" + pModelEmpresa.getRazaoSocial() + "',"
                    + "nome_fantasia = '" + pModelEmpresa.getNomeFantasia() + "',"
                    + "endereco = '" + pModelEmpresa.getEndereco() + "',"
                    + "bairro = '" + pModelEmpresa.getBairro() + "',"
                    + "cod_cidade = '" + pModelEmpresa.getCodCidade() + "',"
                    + "cod_estado = '" + pModelEmpresa.getCodEstado() + "',"
                    + "cep = '" + pModelEmpresa.getCep() + "',"
                    + "telefone = '" + pModelEmpresa.getTelefone() + "',"
                    + "cnpj = '" + pModelEmpresa.getCnpj()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelEmpresa.getCodigo() + "'"
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
    * exclui Empresa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirEmpresaDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM empresa "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
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