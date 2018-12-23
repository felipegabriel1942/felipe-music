package br.com.felipemusic.service;

import br.com.felipemusic.dao.MusicaDao;
import br.com.felipemusic.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MusicaServiceImpl implements MusicaService{
	
	@Autowired
	private MusicaDao musicaDao;
	
	@Autowired
	private PlaylistService playlistService;
	
	
	@Override
	public void salvar(Musica musica, long playlistid) {
		musica.setPlaylist(playlistService.recuperarPorId(playlistid));
		musicaDao.salvar(musica);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Musica> recuperarPorPlaylist(long playlistId) {
		return musicaDao.recuperarPorPlaylist(playlistId);
	}
	
	@Override
	public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
		return musicaDao.recuperarPorPlaylistIdEMusicaId(playlistId, musicaId);
	}
	
	@Override
	public void atualizar(Musica musica, long playlistId) {
		musica.setPlaylist(playlistService.recuperarPorId(playlistId));
		musicaDao.atualizar(musica);
	}
	
	@Override
	public void excluir(long playlistId, long musicaId) {
		musicaDao.excluir(recuperarPorPlaylistIdEMusicaId(playlistId,musicaId).getId());
	}
}
