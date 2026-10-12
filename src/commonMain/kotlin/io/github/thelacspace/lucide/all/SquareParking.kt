package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareParking") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(9.0f,7.0f)
                lineTo(13.0f,7.0f)
                curveTo(14.651617f,7.007386f,15.986613f,8.348366f,15.986613f,10.0f)
                curveTo(15.986613f,11.651634f,14.651617f,12.992614f,13.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
}

public val LucideIcons.All.SquareParkingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareParking: ImageVector
    @Composable get() = SquareParkingDefinition.asImageVector()
