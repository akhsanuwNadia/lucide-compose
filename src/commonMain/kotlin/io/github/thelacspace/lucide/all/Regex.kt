package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Regex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(17.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.670000076293945,5.5)
                lineTo(21.329999923706055,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(12.670000076293945,10.5)
                lineTo(21.329999923706055,5.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                curveTo(9.0,15.895430564880371,8.104569435119629,15.0,7.0,15.0)
                lineTo(5.0,15.0)
                curveTo(3.895430564880371,15.0,3.0,15.895430564880371,3.0,17.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(7.0,21.0)
                curveTo(8.104569435119629,21.0,9.0,20.104570388793945,9.0,19.0)
                lineTo(9.0,17.0)
                close()
            }
}

public val LucideIcons.All.RegexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Regex: ImageVector
    @Composable get() = RegexDefinition.asImageVector()
