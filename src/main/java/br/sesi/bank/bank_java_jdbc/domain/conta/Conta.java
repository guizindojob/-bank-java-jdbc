package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private Integer numero;
    private BigDecimal saldo;
    private Cliente titular;
    private boolean ativo;

    public Conta (Integer numero, BigDecimal saldo, Cliente titular, Boolean ativo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ativo = ativo;
    }
    public boolean possuiSaldo(){
        return this.saldo.compareTo(BigDecimal.ZERO) != 0;
    }
    public void sacar(BigDecimal saldo){
        this.saldo = this.saldo.subtract(saldo);
    }
    public void depositar(BigDecimal saldo){
        this.saldo = this.saldo.add(saldo);
    }
    public Integer getNumero (){
        return numero;
    }
    public BigDecimal getSaldo (){
        return saldo;
    }
    public Cliente getTitular() {
        return titular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero.equals(conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
