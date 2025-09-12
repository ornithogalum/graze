package com.bloomware.graze.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

/**
 * Factory for creating the Graze tool window.
 */
class GrazeToolWindowFactory : ToolWindowFactory {
    
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val grazeToolWindow = GrazeToolWindow(project)
        val content = ContentFactory.getInstance().createContent(
            grazeToolWindow.getContent(),
            "",
            false
        )
        toolWindow.contentManager.addContent(content)
    }
    
    override fun shouldBeAvailable(project: Project): Boolean {
        return true
    }
}