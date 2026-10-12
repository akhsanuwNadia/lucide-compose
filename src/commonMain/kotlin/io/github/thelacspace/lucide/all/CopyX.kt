package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CopyX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                curveTo(2.895430564880371,16.0,2.0,15.104569435119629,2.0,14.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(20.0,8.0)
                lineTo(22.0,8.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(10.0,22.0)
                lineTo(8.0,22.0)
                lineTo(8.0,8.0)
                lineTo(10.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.5,12.5)
                lineTo(17.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5,17.5)
                lineTo(17.5,12.5)
            }
}

public val LucideIcons.All.CopyXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CopyX: ImageVector
    @Composable get() = CopyXDefinition.asImageVector()
