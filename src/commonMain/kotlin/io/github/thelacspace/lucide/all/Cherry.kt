package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cherry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                curveTo(2.0123105f,19.752695f,4.2472773f,21.97769f,7.0f,21.97769f)
                curveTo(9.752723f,21.97769f,11.98769f,19.752695f,12.0f,17.0f)
                curveTo(12.0f,14.24f,9.5f,12.0f,7.0f,14.0f)
                curveTo(4.5f,12.0f,2.0f,14.24f,2.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                curveTo(12.01231f,19.752695f,14.247277f,21.97769f,17.0f,21.97769f)
                curveTo(19.752724f,21.97769f,21.98769f,19.752695f,22.0f,17.0f)
                curveTo(22.0f,14.24f,19.5f,12.0f,17.0f,14.0f)
                curveTo(14.5f,12.0f,12.0f,14.24f,12.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                curveTo(10.22f,11.09f,11.29f,5.25f,12.0f,2.0f)
                curveTo(13.66f,4.38f,16.94f,11.0f,17.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,9.0f)
                curveTo(17.71f,9.0f,14.860001f,6.67f,12.0f,2.0f)
                curveTo(17.71f,2.0f,22.0f,6.67f,22.0f,9.0f)
                close()
            }
}

public val LucideIcons.All.CherryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cherry: ImageVector
    @Composable get() = CherryDefinition.asImageVector()
