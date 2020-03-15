/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vivian
 */
public class DadosClientes {

    public static List<Cliente> lstClientes = new ArrayList<Cliente>();

    public static Cliente obterClientePeloNomeExato(String nome, List<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }

        return null;
    }

    public static List<Cliente> obterClientePeloNomeParcial(String nome, List<Cliente> clientes, boolean caseSenstive) {

        List<Cliente> clientesTemp = new ArrayList<>();

        for (Cliente cliente : clientes) {
            //if(pessoa.getNome().indexOf(nome) >= 0){
            if (caseSenstive) {
                if (cliente.getNome().contains(nome)) {
                    clientesTemp.add(cliente);
                }
            } else {
                if (cliente.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    clientesTemp.add(cliente);
                }
            }
        }

        return clientesTemp;
    }

    public static List<Cliente> obterClientePeloCpfOuCnpj(String nome, List<Cliente> clientes) {

        List<Cliente> clientesTemp = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getCfpOuCnpj().equals(nome)) {
                clientesTemp.add(cliente);
                return clientesTemp;
            }
        }

        return null;
    }
}
