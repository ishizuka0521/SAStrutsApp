package mySAStruts.action;

import org.seasar.struts.annotation.Execute;

public class IshiAction {

    @Execute(validator = false)
	public String index() {
        return "add.jsp";
	}
}
