package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasMusicas.modelos.Musicas;
import br.com.alura.minhasMusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("BolhaDev ");
        meuPodcast.setHost("Marcus Mendes ");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
