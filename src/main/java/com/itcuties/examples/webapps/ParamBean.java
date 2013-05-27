package com.itcuties.examples.webapps;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ParamBean implements Serializable {

	private static final long serialVersionUID = 8541599579318786034L;

	/**
	 * This method returns the myParameter parameter value.
	 * @return
	 */
	public String getContextParameter() {
		return FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getInitParameter("myParameter");
	}
	
}
