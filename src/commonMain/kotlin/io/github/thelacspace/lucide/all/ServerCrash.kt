package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerCrash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(20.0f,2.0f)
                curveTo(21.10457f,2.0f,22.0f,2.8954306f,22.0f,4.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,9.104569f,21.10457f,10.0f,20.0f,10.0f)
                lineTo(18.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(4.0f,14.0f)
                curveTo(2.8954306f,14.0f,2.0f,14.895431f,2.0f,16.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,21.10457f,2.8954306f,22.0f,4.0f,22.0f)
                lineTo(20.0f,22.0f)
                curveTo(21.10457f,22.0f,22.0f,21.10457f,22.0f,20.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,14.895431f,21.10457f,14.0f,20.0f,14.0f)
                lineTo(18.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,6.0f)
                lineTo(9.0f,12.0f)
                lineTo(15.0f,12.0f)
                lineTo(11.0f,18.0f)
            }
}

public val LucideIcons.All.ServerCrashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerCrash: ImageVector
    @Composable get() = ServerCrashDefinition.asImageVector()
