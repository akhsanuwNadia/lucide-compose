package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(20.0f,2.0f)
                curveTo(21.10457f,2.0f,22.0f,2.8954306f,22.0f,4.0f)
                lineTo(22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(19.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,16.0f)
                curveTo(2.0f,14.895431f,2.8954306f,14.0f,4.0f,14.0f)
                lineTo(12.5f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.01f,6.0f)
            }
}

public val LucideIcons.All.ServerPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerPlus: ImageVector
    @Composable get() = ServerPlusDefinition.asImageVector()
