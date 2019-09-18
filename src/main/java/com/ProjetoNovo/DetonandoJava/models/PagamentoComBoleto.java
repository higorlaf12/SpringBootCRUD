package com.ProjetoNovo.DetonandoJava.models;

import java.util.Date;

public class PagamentoComBoleto extends Pagamento{

    private static final long serialVersionUID = 1L;

//    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, Integer estado, Date dataVencimento, Date dataPagamento) {
        super(id, estado);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
