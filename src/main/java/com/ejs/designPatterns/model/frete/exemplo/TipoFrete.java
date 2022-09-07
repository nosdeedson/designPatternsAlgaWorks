package com.ejs.designPatterns.model.frete.exemplo;

public enum TipoFrete {

    NORMAL(1){
        @Override
        public Frete obterFrete(){
            return new Normal();
        }
    },
    SEDEX(2){
        @Override
        public  Frete obterFrete(){
            return new Sedex();
        }
    };

    private Integer codigo;

    TipoFrete(Integer codigo) {
        this.codigo = codigo;
    }

    public abstract Frete obterFrete();
}
