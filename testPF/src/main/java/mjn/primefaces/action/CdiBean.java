package mjn.primefaces.action;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class CdiBean implements Serializable{

	private String doteString = "";

	/**
	 * @return doteString
	 */
	public String getDoteString() {
		return doteString;
	}

	/**
	 * @param doteString セットする doteString
	 */
	public void setDoteString(String doteString) {
		this.doteString = doteString;
	}

}
