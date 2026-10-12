package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.670000076293945,8.0)
                lineTo(18.0,8.0)
                curveTo(19.104570388793945,8.0,20.0,8.895430564880371,20.0,10.0)
                lineTo(20.0,14.329999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(4.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.0)
                lineTo(22.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(2.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(6.0,8.0)
                curveTo(4.895430564880371,8.0,4.0,8.895430564880371,4.0,10.0)
                lineTo(4.0,18.0)
                curveTo(4.0,19.104570388793945,4.895430564880371,20.0,6.0,20.0)
                lineTo(18.0,20.0)
                curveTo(18.5303897857666,19.99988555908203,19.03901481628418,19.789098739624023,19.413999557495117,19.413999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.670000076293945,4.0)
                lineTo(12.0,4.0)
                lineTo(12.0,6.329999923706055)
            }
}

public val LucideIcons.All.BotOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotOff: ImageVector
    @Composable get() = BotOffDefinition.asImageVector()
