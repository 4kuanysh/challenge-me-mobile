package kz.challengeme.features.main.presentation.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {

}

@Composable
fun MainScreenContent() {
    Scaffold { paddingValues ->
        paddingValues.calculateBottomPadding()
    }
}

@Preview
@Composable
fun MainScreenContentPreview() {
    MainScreenContent()
}