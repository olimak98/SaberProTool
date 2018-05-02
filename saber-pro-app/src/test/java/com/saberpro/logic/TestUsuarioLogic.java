package com.saberpro.logic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.saberpro.modelo.control.IUsuarioLogic;
import com.saberpro.presentation.backingBeans.LoginView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@Rollback(false)

public class TestUsuarioLogic {
	
	private static final Logger log = LoggerFactory.getLogger(TestUsuarioLogic.class);
	
	@Autowired
	IUsuarioLogic usuarioLogic;
	
	@Test
	public void test() {
		try {
			//usuarioLogic.resetByEmail("jhonypk18@gmail.com");
			User user = usuarioLogic.loadByCodigo(9999999L);
			
			log.info(user.getUsername());
			log.info(user.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
