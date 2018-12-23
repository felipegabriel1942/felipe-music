package br.com.felipemusic.service;

import br.com.felipemusic.model.Musica;

import java.util.List;

public interface MusicaService {
	void salvar(Musica musica, long playlistid);
	List<Musica> recuperarPorPlaylist(long playlistId);
	Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
	void atualizar(Musica musica, long playlistId);
	void excluir(long playlistId, long musicaId);
}
