package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.3100004196167,9.3100004196167)
                lineTo(5.0,21.0)
                lineTo(12.0,17.0)
                lineTo(19.0,21.0)
                lineTo(17.829999923706055,17.829999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(14.529999732971191,8.880000114440918)
                lineTo(12.0,2.0)
                lineTo(10.829999923706055,5.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.Navigation2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2Off: ImageVector
    @Composable get() = Navigation2OffDefinition.asImageVector()
