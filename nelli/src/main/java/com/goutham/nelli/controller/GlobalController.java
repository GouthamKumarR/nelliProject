package com.goutham.nelli.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.goutham.nelli.model.UserModel;
import com.goutham.nelliBackend.dao.UserDetailsDao;
import com.goutham.nelliBackend.dto.UserDetails;


@ControllerAdvice
public class GlobalController {
	
	
	@Autowired
	private UserDetailsDao userDAO;
	
	@Autowired
	private HttpSession session;
	
	private UserModel userModel = null;
	private UserDetails user = null;	
	
	
	@ModelAttribute("userModel")
	public UserModel getUserModel() {		
		if(session.getAttribute("userModel")==null) {
			// get the authentication object
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			
			if(!authentication.getPrincipal().equals("anonymousUser")){
				// get the user from the database
				user = userDAO.getByEmail(authentication.getName());
				
				if(user!=null) {
					// create a new model
					userModel = new UserModel();
					// set the name and the id
					userModel.setId(user.getId());
					userModel.setFullName(user.getUserName());
					userModel.setRole(user.getRole());
					
					session.setAttribute("userModel", userModel);
					return userModel;
				}			
			}
		}
		
		return (UserModel) session.getAttribute("userModel");		
	}
		
}
