package br.com.felipemusic.service;

import br.com.felipemusic.domain.Playlist;

import java.util.List;

public interface PlaylistService {
	
	void salvar(Playlist playlist);
	List<Playlist> recuperar();
	Playlist recuperarPorId(long id);
	void atualizar(Playlist playlist);
	void excluir(long id);
	
}
