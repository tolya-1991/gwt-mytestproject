package tolya.begin.testjwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class FirstAppJwt implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();

	private TextBox login = new TextBox();

	private PasswordTextBox password = new PasswordTextBox();

	private Button btnlogin = new Button("Login");

	@Override
	public void onModuleLoad() {
		mainPanel.add(login);
		mainPanel.add(password);
		mainPanel.add(btnlogin);
		btnlogin.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				try {
					if ("admin".equals(login) && password.equals("admin")) {
						mainPanel.add(new Label("Congratulations Admin have passed authentication"));
					} else if ("user".equals(login) && password.equals("user")) {
						mainPanel.add(new Label("Congratulations User have passed authentication"));
					} else {
						mainPanel.add(new Label("Login failed !"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		RootPanel.get("mainContainer").add(mainPanel);
	}
}
