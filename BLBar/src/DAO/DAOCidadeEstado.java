package DAO;

import model.ModelCidadeEstado;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCidade;
import model.ModelEstado;
/**
*
* @author BLSoft Desenvolvimento de Sistemas
*/
public class DAOCidadeEstado extends ConexaoMySql {

     /**
     * recupera uma lista de CidadeEstado return ArrayList
     */
    public ArrayList<ModelCidadeEstado> getListaCidadeEstadoDAO() {
        ArrayList<ModelCidadeEstado> listamodelCidadeEstado = new ArrayList();
        ModelCidadeEstado modelCidadeEstado = new ModelCidadeEstado();
        ModelCidade modelCidade = new ModelCidade();
        ModelEstado modelEstado = new ModelEstado();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "cidade.codigo,"
                    + "cidade.nome,"
                    + "cidade.fk_cod_estado,"
                    + "estado.codigo,"
                    + "estado.uf,"
                    + "estado.nome "
                    + " FROM"
                    + " cidade inner join estado on estado.codigo = cidade.fk_cod_estado"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCidade = new ModelCidade();
                modelEstado = new ModelEstado();
                modelCidadeEstado = new ModelCidadeEstado();
                modelCidade.setCodigo(this.getResultSet().getInt(1));
                modelCidade.setNome(this.getResultSet().getString(2));
                modelCidade.setFk_cod_estado(this.getResultSet().getInt(3));
                modelEstado.setCodigo(this.getResultSet().getInt(4));
                modelEstado.setUf(this.getResultSet().getString(5));
                modelEstado.setNome(this.getResultSet().getString(6));
                modelCidadeEstado.setModelCidade(modelCidade);
                modelCidadeEstado.setModelEstado(modelEstado);
                listamodelCidadeEstado.add(modelCidadeEstado);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCidadeEstado;
    }

}