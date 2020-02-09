/**
 *
 */
package mjn.primefaces.action;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 * @author MA
 *
 */
@ViewScoped
@ManagedBean(name="testBean")
public class BaseJavaBean implements Serializable{

	private String testString = "初期化";
    private boolean showFlg = false;
	public BaseJavaBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return testString
	 */
	public String getTestString() {
		return testString;
	}

	/**
	 * @param testString セットする testString
	 */
	public void setTestString(String testString) {
		this.testString = testString;
	}

	/**
	 * @return showFlg
	 */
	public boolean getShowFlg() {
		return showFlg;
	}

	/**
	 * @param showFlg セットする showFlg
	 */
	public void setShowFlg(boolean showFlg) {
		this.showFlg = showFlg;
	}

}
