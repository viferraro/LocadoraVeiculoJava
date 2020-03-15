/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Vivian
 */
public class Locacao {

    private Integer codigo;
    private Date dataLocacao;
    private Date dataEntrega;
    private Integer qtdeDiasLocado;
    private Double valorTotalLocacao;
    private Carro carro;
    private Cliente cliente;
    private Boolean devolucao;
    private Date horaCadastro;

    public Locacao() {
        Random aleatorio = new Random();
        this.codigo = aleatorio.nextInt(999999);
        this.dataEntrega = new Date();
        this.devolucao = true;
    }

    public Long diasLocado() {
        return (this.dataEntrega.getTime() - this.dataLocacao.getTime()) / 86400000L;

    }

   public Double valorLocacao() {
       Double valor = 0.0;
        if (this.cliente instanceof PessoaFisica){
        valor =  (carro.getValorDiariaLocacao() * this.diasLocado());
    }
        else{
       
        Integer desconto = Integer.parseInt( this.cliente.getDtNascOuDesconto().replace("%", "").trim());
        valor =  ((carro.getValorDiariaLocacao() * this.diasLocado()) - ((carro.getValorDiariaLocacao() * this.diasLocado()) / desconto));
    } 
        return valor;
        }
    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataLocacao
     */
    public Date getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataEntrega
     */
    public Date getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /* @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the devolucao
     */
    public Boolean getDevolucao() {
        return devolucao;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Boolean devolucao) {
        this.devolucao = devolucao;
    }

    /**
     * @return the horaCadastro
     */
    public Date getHoraCadastro() {
        return horaCadastro;
    }

    /**
     * @param horaCadastro the horaCadastro to set
     */
    public void setHoraCadastro(Date horaCadastro) {
        this.horaCadastro = horaCadastro;
    }
}
