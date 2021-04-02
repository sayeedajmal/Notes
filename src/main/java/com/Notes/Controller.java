package com.Notes;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXListView;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
  @FXML
  public JFXListView<String> listview = new JFXListView<String>();
  ObservableList<String> names = FXCollections.observableArrayList("Julia", "Ian", "Sue", "Matthew", "Hannah",
      "Stephan", "Denise", "Cars:", "Bugaati", "Lamborgini", "Centenirio", "Favourite");

  @Override
  public void initialize(URL url, ResourceBundle rs) {
    listview.setItems(names);
    listview.getSelectionModel().selectFirst();

    // Add ChangeListener to the ListView
    listview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
      public void changed(ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
        System.out.println("Your Selection : " + newValue);
      }
    });
  }
}