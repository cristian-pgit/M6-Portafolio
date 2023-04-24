package cl.vrol.vrolsite.dao;

import java.util.List;

import cl.vrol.vrolsite.model.Mesa;

public interface MesaDao {
	
	public Mesa getUsuarioById(String idMesa);
	public List<Mesa> getAllMesas();
	public void updateMesa(Mesa mesa, int idMesa);
	public void insertMesa(Mesa mesa);

}
