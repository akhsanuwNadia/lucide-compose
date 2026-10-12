package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VibrateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(4.0f,10.0f)
                lineTo(2.0f,12.0f)
                lineTo(4.0f,14.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                lineTo(20.0f,10.0f)
                lineTo(22.0f,12.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(8.0f,18.0f)
                curveTo(8.0f,18.55f,8.45f,19.0f,9.0f,19.0f)
                lineTo(15.0f,19.0f)
                curveTo(15.55f,19.0f,16.0f,18.55f,16.0f,18.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.34f)
                lineTo(16.0f,6.0f)
                curveTo(16.0f,5.45f,15.55f,5.0f,15.0f,5.0f)
                lineTo(10.66f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.VibrateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VibrateOff: ImageVector
    @Composable get() = VibrateOffDefinition.asImageVector()
