package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    void onMenuItemAboutAction(ActionEvent event) {
    	System.out.println("onMenuItemAboutAction");
    }

    @FXML
    void onMenuItemDepartmentAction(ActionEvent event) {
    	System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    void onMenuItemSellerAction(ActionEvent event) {
    	System.out.println("onMenuItemSellerAction");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
