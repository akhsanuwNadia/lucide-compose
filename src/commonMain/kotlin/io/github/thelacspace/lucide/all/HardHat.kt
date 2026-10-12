package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(10.0f,5.0f)
                curveTo(10.0f,4.4477153f,10.447715f,4.0f,11.0f,4.0f)
                lineTo(13.0f,4.0f)
                curveTo(13.552285f,4.0f,14.0f,4.4477153f,14.0f,5.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                curveTo(17.31371f,6.0f,20.0f,8.686292f,20.0f,12.0f)
                lineTo(20.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,15.0f)
                lineTo(4.0f,12.0f)
                curveTo(4.0f,8.686292f,6.6862917f,6.0f,10.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,15.0f)
                lineTo(21.0f,15.0f)
                lineTo(22.0f,15.0f)
                lineTo(22.0f,19.0f)
                lineTo(21.0f,19.0f)
                lineTo(3.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,15.0f)
                lineTo(3.0f,15.0f)
                close()
            }
}

public val LucideIcons.All.HardHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardHat: ImageVector
    @Composable get() = HardHatDefinition.asImageVector()
