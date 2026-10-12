package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,13.4f)
                lineTo(7.0f,21.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,13.4f)
                lineTo(17.0f,21.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.024621f,19.752695f,6.494554f,21.97769f,12.0f,21.97769f)
                curveTo(17.505445f,21.97769f,21.97538f,19.752695f,22.0f,17.0f)
                lineTo(22.0f,9.0f)
            }
}

public val LucideIcons.All.DrumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drum: ImageVector
    @Composable get() = DrumDefinition.asImageVector()
