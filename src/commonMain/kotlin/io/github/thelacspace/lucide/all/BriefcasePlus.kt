package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.354f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                lineTo(20.0f,6.0f)
                curveTo(21.10457f,6.0f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,11.354f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,11.354f)
                lineTo(16.0f,4.0f)
                curveTo(16.0f,2.8954306f,15.104569f,2.0f,14.0f,2.0f)
                lineTo(10.0f,2.0f)
                curveTo(8.895431f,2.0f,8.0f,2.8954306f,8.0f,4.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(19.0f,20.0f)
            }
}

public val LucideIcons.All.BriefcasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcasePlus: ImageVector
    @Composable get() = BriefcasePlusDefinition.asImageVector()
