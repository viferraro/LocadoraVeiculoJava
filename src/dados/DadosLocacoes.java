/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Locacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Vivian
 */
public class DadosLocacoes {

    public static List<Locacao> lstLocacao = new ArrayList<>();

    public static Locacao obterLocacaoPeloCodigo(Integer codigo, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {
            if (Objects.equals(locacao.getCodigo(), codigo)) {
                return locacao;
            }
        }
        return null;
    }

    public static List<Locacao> obterLocacaoPelaPlaca(String placa, List<Locacao> locacoes) {
        List<Locacao> listaLocacoes = new ArrayList<>();
        for (Locacao locacao : locacoes) {
            if (locacao.getCarro().getPlaca().toLowerCase().equals(placa.toLowerCase())) {
                listaLocacoes.add(locacao);
            }
        }
        return listaLocacoes;
    }

    public static List<Locacao> obterLocacaoPeloCpfOuCnpj(String cpfOuCnpj, List<Locacao> locacoes) {
        List<Locacao> listaLocacoes = new ArrayList<>();
        for (Locacao locacao : locacoes) {
            if (locacao.getCliente().getCfpOuCnpj().equals(cpfOuCnpj)) {
                 listaLocacoes.add(locacao);
            }
        }
        return listaLocacoes;
    }

    public static List<Locacao> obterLocacaoPelaData(Date data1, Date data2, List<Locacao> locacoes) {
        List<Locacao> listaLocacoes = new ArrayList<>();
        for (Locacao locacao : locacoes) {

            if (locacao.getDataLocacao().getTime() >= data1.getTime() && locacao.getDataLocacao().getTime() <= data2.getTime()
                    || locacao.getDataEntrega().getTime() >= data1.getTime() && locacao.getDataEntrega().getTime() <= data2.getTime()) {
                listaLocacoes.add(locacao);
            }
        }
        return listaLocacoes;
    }

    public static Double SomaLocacoes(List<Locacao> locacoes) {
        Double soma = 0.0;
        for (Locacao locacao : locacoes) {
            soma += locacao.valorLocacao();
        }
        return soma;
    }
}
