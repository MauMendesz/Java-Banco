package Control;

import BancoDados.ConexaoBanco;
import Model.Imovel;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ImovelDAO {
    private Connection conecta;

    public ImovelDAO(){
        this.conecta = new ConexaoBanco().getConnection();
    }

    public void CadastrarImovel(Imovel dados){
        try {
            String sql = "INSERT INTO tb_imovel (tipo_imovel,categ_imovel,metros_imovel,valor_imovel)"
                    + "VALUES(?,?,?,?)";
            PreparedStatement inserir = conecta.prepareStatement(sql);
            inserir.setString(1,dados.getTipo());
            inserir.setString(2,dados.getCate());
            inserir.setDouble(3,dados.getMet());
            inserir.setDouble(4,dados.ValorReal());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null,"CADASTRO COM SUCESSO!!");
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null,"DEU MERDA " + erro);
        }
    }
}
