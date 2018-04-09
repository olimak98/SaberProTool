package com.saberpro.dataaccess.dao;

import com.saberpro.dataaccess.api.Dao;

import com.saberpro.modelo.Usuario;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* Interface for   UsuarioDAO.
*
*/
public interface IUsuarioDAO extends Dao<Usuario, Long> {
	
	public Usuario findByCodigo(long codigo);
	public Usuario findByEmail(String email);
}