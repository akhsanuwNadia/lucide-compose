package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(20.0f,2.0f)
                curveTo(21.10457f,2.0f,22.0f,2.8954306f,22.0f,4.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,9.104569f,21.10457f,10.0f,20.0f,10.0f)
                lineTo(15.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(2.5f,2.5f)
                curveTo(2.0f,2.0f,2.0f,2.5f,2.0f,5.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,9.104569f,2.8954306f,10.0f,4.0f,10.0f)
                lineTo(10.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,14.895431f,21.10457f,14.0f,20.0f,14.0f)
                lineTo(19.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                curveTo(2.8954306f,14.0f,2.0f,14.895431f,2.0f,16.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,21.10457f,2.8954306f,22.0f,4.0f,22.0f)
                lineTo(20.5f,22.0f)
                lineTo(21.5f,21.5f)
                lineTo(22.0f,22.0f)
                lineTo(14.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.ServerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerOff: ImageVector
    @Composable get() = ServerOffDefinition.asImageVector()
