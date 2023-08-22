package br.com.alura.minhasMusicas.modelos;

public class PodCast extends Audio {

    private String apresentador;
    private String descricao;

    public String getHost() {
        return apresentador;
    }

    public void setHost(String host) {
        this.apresentador = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }

}
