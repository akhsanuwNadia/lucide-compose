package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.67f,8.0f)
                lineTo(18.0f,8.0f)
                curveTo(19.10457f,8.0f,20.0f,8.895431f,20.0f,10.0f)
                lineTo(20.0f,14.33f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(4.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(2.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(6.0f,8.0f)
                curveTo(4.8954306f,8.0f,4.0f,8.895431f,4.0f,10.0f)
                lineTo(4.0f,18.0f)
                curveTo(4.0f,19.10457f,4.8954306f,20.0f,6.0f,20.0f)
                lineTo(18.0f,20.0f)
                curveTo(18.53039f,19.999886f,19.039015f,19.789099f,19.414f,19.414f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.67f,4.0f)
                lineTo(12.0f,4.0f)
                lineTo(12.0f,6.33f)
            }
}

public val LucideIcons.All.BotOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotOff: ImageVector
    @Composable get() = BotOffDefinition.asImageVector()
