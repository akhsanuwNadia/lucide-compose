package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignCenterHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(10.0f,20.0f)
                curveTo(10.0f,21.10457f,9.104569f,22.0f,8.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(10.0f,4.0f)
                curveTo(10.0f,2.8954306f,9.104569f,2.0f,8.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                lineTo(20.0f,17.0f)
                curveTo(20.0f,18.10457f,19.10457f,19.0f,18.0f,19.0f)
                lineTo(16.0f,19.0f)
                curveTo(14.895431f,19.0f,14.0f,18.10457f,14.0f,17.0f)
                lineTo(14.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,5.9f,14.9f,5.0f,16.0f,5.0f)
                lineTo(18.0f,5.0f)
                curveTo(19.10457f,5.0f,20.0f,5.8954306f,20.0f,7.0f)
                lineTo(20.0f,8.0f)
            }
}

public val LucideIcons.All.AlignCenterHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignCenterHorizontal: ImageVector
    @Composable get() = AlignCenterHorizontalDefinition.asImageVector()
