package br.com.usjt.aeroporto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.usjt.aeroporto.dao.AeronaveDAO;
import br.com.usjt.aeroporto.entity.Aeronave;

@Service
public class AeronaveService {

	@Autowired
	@Qualifier("AeronaveDAO")
	private AeronaveDAO dao;

	public java.util.List<Aeronave> consultaAeronave(Aeronave aeronave) {
		java.util.List<Aeronave> list = dao.findAllName(aeronave.getNome());
		return list;

	}

	public void salvarAeronave(Aeronave aeronave) {
		dao.save(aeronave);
	}

	public void removeAeronave(Aeronave aeronave) {
		dao.delete(aeronave);
	}

	public void atualizaAeronave(Aeronave aeronave) {
		dao.update(aeronave);
	}

}
