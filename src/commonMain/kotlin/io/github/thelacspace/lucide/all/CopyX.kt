package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CopyX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                curveTo(2.8954306f,16.0f,2.0f,15.104569f,2.0f,14.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.104569f,2.0f,16.0f,2.8954306f,16.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(22.0f,8.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(10.0f,22.0f)
                lineTo(8.0f,22.0f)
                lineTo(8.0f,8.0f)
                lineTo(10.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f,12.5f)
                lineTo(17.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f,17.5f)
                lineTo(17.5f,12.5f)
            }
}

public val LucideIcons.All.CopyXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CopyX: ImageVector
    @Composable get() = CopyXDefinition.asImageVector()
