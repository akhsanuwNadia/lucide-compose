package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sunrise") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,10.93f)
                lineTo(6.3399997f,12.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(4.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.07f,10.93f)
                lineTo(17.66f,12.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                curveTo(15.990151f,15.797844f,14.202178f,14.017849f,12.0f,14.017849f)
                curveTo(9.797822f,14.017849f,8.009849f,15.797844f,8.0f,18.0f)
            }
}

public val LucideIcons.All.SunriseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sunrise: ImageVector
    @Composable get() = SunriseDefinition.asImageVector()
