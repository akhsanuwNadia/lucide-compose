package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.077f,10.615f)
                curveTo(3.94824f,10.923661f,3.9823053f,11.276258f,4.1677737f,11.554562f)
                curveTo(4.3532424f,11.832865f,4.6655583f,12.000028f,5.0f,12.0f)
                lineTo(19.0f,12.0f)
                curveTo(19.334442f,12.000028f,19.646757f,11.832865f,19.832226f,11.554562f)
                curveTo(20.017694f,11.276258f,20.05176f,10.923662f,19.923f,10.615f)
                lineTo(16.846f,3.231f)
                curveTo(16.535555f,2.485667f,15.807402f,2.0001006f,15.0f,2.0f)
                lineTo(9.0f,2.0f)
                curveTo(8.192841f,1.9999328f,7.4647565f,2.4850595f,7.1540003f,3.23f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,20.0f)
                curveTo(8.0f,18.89543f,8.895431f,18.0f,10.0f,18.0f)
                lineTo(14.0f,18.0f)
                curveTo(15.104569f,18.0f,16.0f,18.89543f,16.0f,20.0f)
                lineTo(16.0f,21.0f)
                curveTo(16.0f,21.552284f,15.552285f,22.0f,15.0f,22.0f)
                lineTo(9.0f,22.0f)
                curveTo(8.447715f,22.0f,8.0f,21.552284f,8.0f,21.0f)
                close()
            }
}

public val LucideIcons.All.LampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lamp: ImageVector
    @Composable get() = LampDefinition.asImageVector()
