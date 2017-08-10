package com.sugarizer.view.device.cellfactory

import com.sugarizer.listitem.ListItemInstruction
import com.sugarizer.listitem.ListItemSpk
import com.sugarizer.listitem.ListItemSpkInstruction
import javafx.util.Callback
import org.controlsfx.control.GridCell
import org.controlsfx.control.GridView

class ListItemInstructionCellFactory : Callback<GridView<ListItemInstruction>, GridCell<ListItemInstruction>> {
    override fun call(param: GridView<ListItemInstruction>?): GridCell<ListItemInstruction> {
        return ListItemInstructionCell()
    }
}