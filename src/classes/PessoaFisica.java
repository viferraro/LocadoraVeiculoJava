/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vivian
 */
public class PessoaFisica extends Cliente {

    private String CPF;
    private String CNH;
    private Date dataNascimento;

    public PessoaFisica() {
        super();
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the CNH
     */
    public String getCNH() {
        return CNH;
    }

    /**
     * @param CNH the CNH to set
     */
    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getCfpOuCnpj() {
        return this.CPF;
    }

    @Override
    public String getCnh2() {
        return this.CNH;
    }

    @Override
    public String getDtNascOuDesconto() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(this.dataNascimento);
    }

    @Override
    public String informacao() {
        return this.getNome() + " / " + this.CPF;
    }
}
