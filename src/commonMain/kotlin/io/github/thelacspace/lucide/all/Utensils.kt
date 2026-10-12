package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Utensils") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(3.0,9.0)
                curveTo(3.0,10.100000381469727,3.9000000953674316,11.0,5.0,11.0)
                lineTo(9.0,11.0)
                curveTo(10.104569435119629,11.0,11.0,10.104569435119629,11.0,9.0)
                lineTo(11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(21.0,2.0)
                curveTo(18.238576889038086,2.0,16.0,4.238576412200928,16.0,7.0)
                lineTo(16.0,13.0)
                curveTo(16.0,14.100000381469727,16.899999618530273,15.0,18.0,15.0)
                lineTo(21.0,15.0)
                close()
                moveTo(21.0,15.0)
                lineTo(21.0,22.0)
            }
}

public val LucideIcons.All.UtensilsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Utensils: ImageVector
    @Composable get() = UtensilsDefinition.asImageVector()
