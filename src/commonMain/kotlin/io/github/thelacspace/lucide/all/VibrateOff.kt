package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VibrateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(4.0,10.0)
                lineTo(2.0,12.0)
                lineTo(4.0,14.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.0)
                lineTo(20.0,10.0)
                lineTo(22.0,12.0)
                lineTo(20.0,14.0)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(8.0,18.0)
                curveTo(8.0,18.549999237060547,8.449999809265137,19.0,9.0,19.0)
                lineTo(15.0,19.0)
                curveTo(15.550000190734863,19.0,16.0,18.549999237060547,16.0,18.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.34000015258789)
                lineTo(16.0,6.0)
                curveTo(16.0,5.449999809265137,15.550000190734863,5.0,15.0,5.0)
                lineTo(10.65999984741211,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.VibrateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VibrateOff: ImageVector
    @Composable get() = VibrateOffDefinition.asImageVector()
