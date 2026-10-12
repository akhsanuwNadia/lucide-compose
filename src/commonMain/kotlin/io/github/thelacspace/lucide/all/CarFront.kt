package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(19.0f,10.0f)
                lineTo(17.5f,6.3f)
                curveTo(17.210428f,5.5248623f,16.473421f,5.0080824f,15.646f,5.0f)
                lineTo(8.4f,5.0f)
                curveTo(7.5655103f,4.980834f,6.8068743f,5.4819403f,6.4969997f,6.257f)
                lineTo(5.0f,10.0f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                lineTo(7.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(19.0f,10.0f)
                lineTo(21.0f,10.0f)
                lineTo(21.0f,18.0f)
                lineTo(19.0f,18.0f)
                lineTo(5.0f,18.0f)
                lineTo(3.0f,18.0f)
                lineTo(3.0f,10.0f)
                lineTo(5.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(5.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,18.0f)
                lineTo(19.0f,20.0f)
            }
}

public val LucideIcons.All.CarFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarFront: ImageVector
    @Composable get() = CarFrontDefinition.asImageVector()
