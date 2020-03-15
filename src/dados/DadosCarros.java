/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Carro;
import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vivian
 */
public class DadosCarros {

    public static List<Carro> lstCarros = new ArrayList<Carro>();

    public static Carro obterCarroPelaPlaca(String placa, List<Carro> carros) {

        for (Carro carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }

        return null;
    }

}
