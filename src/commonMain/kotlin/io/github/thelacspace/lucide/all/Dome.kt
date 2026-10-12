package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dome") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,21.0f)
                lineTo(10.0f,18.0f)
                curveTo(10.004924f,16.898922f,10.8989105f,16.008924f,12.0f,16.008924f)
                curveTo(13.1010895f,16.008924f,13.995076f,16.898922f,14.0f,18.0f)
                lineTo(14.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,13.0f)
                curveTo(2.0f,12.447715f,2.4477153f,12.0f,3.0f,12.0f)
                lineTo(21.0f,12.0f)
                curveTo(21.552284f,12.0f,22.0f,12.447715f,22.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(4.0196967f,7.5956874f,7.595643f,4.035697f,12.0f,4.035697f)
                curveTo(16.404356f,4.035697f,19.980303f,7.5956874f,20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(6.0f,21.0f)
            }
}

public val LucideIcons.All.DomeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dome: ImageVector
    @Composable get() = DomeDefinition.asImageVector()
