package kz.challengeme.features.main.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

}

@Composable
fun MainScreenContent() {
    Scaffold { paddingValues ->
        paddingValues.calculateBottomPadding()
        Column(
            modifier = Modifier.background(color = Color.Gray)
        ) {
            Row(modifier = Modifier.padding(horizontal = 16.dp)) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},
                    modifier = Modifier.align(alignment = Alignment.CenterVertically).background(color = Color.Red)
                )
                Text(
                    text = "Подготовка к митапу",
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)
                )
            }


        }
    }
}

@Preview
@Composable
fun MainScreenContentPreview() {
    MainScreenContent()
}