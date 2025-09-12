package com.bloomware.graze.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.wm.ToolWindowManager

/**
 * Action to open the Graze tool window.
 */
class OpenGrazeToolWindowAction : AnAction() {
    
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val toolWindowManager = ToolWindowManager.getInstance(project)
        val toolWindow = toolWindowManager.getToolWindow("Graze")
        
        toolWindow?.let {
            it.activate(null)
        }
    }
    
    override fun update(e: AnActionEvent) {
        e.presentation.isEnabledAndVisible = e.project != null
    }
}