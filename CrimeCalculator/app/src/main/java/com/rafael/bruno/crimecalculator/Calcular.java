package com.rafael.bruno.crimecalculator;

import java.util.Random;

/**
 * Created by Alunos on 07/12/2016.
 */

public class Calcular {

    private String suspeito1;
    private String suspeito2;

    public Calcular() {
    }

    public String getSuspeito1() {
        return suspeito1;
    }

    public void setSuspeito1(String suspeito1) {
        this.suspeito1 = suspeito1;
    }

    public String getSuspeito2() {
        return suspeito2;
    }

    public void setSuspeito2(String suspeito2) {
        this.suspeito2 = suspeito2;
    }

    public int gerarPorcentagemCriminal(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public int chanceDeCaptura(){
        Random random = new Random();
        return random.nextInt(100);
    }
    @Override
    public String toString() {
        return "\nSuspeito 1:"+suspeito1+
                "\nSuspeito 2:"+suspeito2
                +"\nChance de Crime:"+gerarPorcentagemCriminal()+"%"+
                "\nChance de Captura: "+chanceDeCaptura()+"%";

    }
}
