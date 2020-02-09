package mjn.primefaces.action;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="testAction")
public class BaseAction implements Serializable{

	@ManagedProperty(value = "#{testBean}")
	private BaseJavaBean bean;

	public BaseJavaBean getBean() {
		return bean;
	}

	public void setBean(BaseJavaBean bean) {
		this.bean = bean;
	}

	public BaseAction(){

	}

	@PostConstruct
	public void init() {
		bean.setTestString("初期化しました。");
		bean.setShowFlg(false);
	}

	public String doDaialogShow() {
		bean.setShowFlg(true);
		bean.setTestString("一回目はいりました。");
		return null;
	}
	public String doTest() {
		bean.setTestString("普通のイベントです。");
		return null;

	}
	public String doDialogEnd () {
		bean.setTestString("二回目はいりました。");
		return null;

	}


}
