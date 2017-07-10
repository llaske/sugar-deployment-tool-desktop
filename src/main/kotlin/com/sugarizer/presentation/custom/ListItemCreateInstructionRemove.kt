package com.sugarizer.presentation.custom

import javafx.beans.property.StringProperty
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.GridPane
import javafx.stage.DirectoryChooser
import java.io.IOException

class ListItemCreateInstructionRemove : GridPane() {
    @FXML lateinit var addButton: ImageView
    @FXML lateinit var title: Label

    init {
        val loader = FXMLLoader(javaClass.getResource("/layout/list-item-creation-instruction-remove.fxml"))

        loader.setRoot(this)
        loader.setController(this)

        try {
            loader.load<GridPane>()

            maxWidth = Double.MAX_VALUE

            addButton.fitHeight = 25.0
            addButton.fitWidth = 25.0

            addButton.onMouseClicked = EventHandler {
                println("Test")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun setTitleTest(title: String){
        this.title.text = title
    }

    fun getTitleTest(): String {
        return title.text
    }

    fun titlePropertyTest(): StringProperty {
        return title.textProperty()
    }
}