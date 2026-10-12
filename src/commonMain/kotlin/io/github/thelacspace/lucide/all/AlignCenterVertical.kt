package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignCenterVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,4.9f,2.9f,4.0f,4.0f,4.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(21.10457f,10.0f,22.0f,9.104569f,22.0f,8.0f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(16.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,20.0f)
                lineTo(7.0f,20.0f)
                curveTo(5.8954306f,20.0f,5.0f,19.10457f,5.0f,18.0f)
                lineTo(5.0f,16.0f)
                curveTo(5.0f,14.9f,5.9f,14.0f,7.0f,14.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(17.0f,14.0f)
                curveTo(18.10457f,14.0f,19.0f,14.895431f,19.0f,16.0f)
                lineTo(19.0f,18.0f)
                curveTo(19.0f,19.10457f,18.10457f,20.0f,17.0f,20.0f)
                lineTo(16.0f,20.0f)
            }
}

public val LucideIcons.All.AlignCenterVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignCenterVertical: ImageVector
    @Composable get() = AlignCenterVerticalDefinition.asImageVector()
