package br.com.felipemusic.dao;

import br.com.felipemusic.domain.Musica;
import java.util.List;

public interface MusicaDao {

    void salvar(Musica musica);
    List<Musica> recuperarPorPlaylist(long playlistid);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistid, long id);
    void atualizar(Musica musica);
    void excluir(long musicaid);


}
