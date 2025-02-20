package sh.christian.ozone

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import sh.christian.ozone.app.AppWorkflow
import sh.christian.ozone.ui.workflow.WorkflowRendering

@Composable
fun App(
  workflow: AppWorkflow,
  onExit: () -> Unit,
) {
  WorkflowRendering(
    workflow = workflow,
    props = Unit,
    onOutput = { onExit() },
  ) { screen ->
    Box(Modifier.fillMaxSize()) {
      screen.Content()
    }
  }
}
