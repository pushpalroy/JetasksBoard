package com.jetapps.jettaskboard.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetapps.jettaskboard.DashboardViewModel
import com.jetapps.jettaskboard.component.WorkSpaceItem

@Composable
fun DrawerWorkSpaceComponent(
    viewModel: DashboardViewModel,
    modifier: Modifier,
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Workspaces",
            modifier = modifier.padding(bottom = 16.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.W500
        )

        viewModel.listOfBoards.forEach { items ->
            WorkSpaceItem(
                modifier = modifier,
                workSpaceHeading = items.title
            )
        }
    }
}