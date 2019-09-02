package com.facebook.service;

import com.facebook.entity.FacebookEmployee;
import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;

public class FacebookService implements FacebookServiceInterface
{

	
	
	public int createProfile(FacebookEmployee fe)
	{
		FacebookDAOInterface fd=FacebookDAO.createObject("facebook");
		return fd.createProfileDAO(fe);
	}

	public static FacebookService createObject(String string) {
		// TODO Auto-generated method stub
		return new FacebookService();
	}

	@Override
	public int createProfile(FacebookEmployee fe) {
		// TODO Auto-generated method stub
		return 0;
	}
}
