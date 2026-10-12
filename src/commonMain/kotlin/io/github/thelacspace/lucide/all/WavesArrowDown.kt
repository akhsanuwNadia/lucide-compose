package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(12.0f,10.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(2.6f,15.5f,3.2f,16.0f,4.5f,16.0f)
                curveTo(7.0f,16.0f,7.0f,14.0f,9.5f,14.0f)
                curveTo(12.1f,14.0f,11.9f,16.0f,14.5f,16.0f)
                curveTo(17.0f,16.0f,17.0f,14.0f,19.5f,14.0f)
                curveTo(20.8f,14.0f,21.4f,14.5f,22.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(2.6f,21.5f,3.2f,22.0f,4.5f,22.0f)
                curveTo(7.0f,22.0f,7.0f,20.0f,9.5f,20.0f)
                curveTo(12.1f,20.0f,11.9f,22.0f,14.5f,22.0f)
                curveTo(17.0f,22.0f,17.0f,20.0f,19.5f,20.0f)
                curveTo(20.8f,20.0f,21.4f,20.5f,22.0f,21.0f)
            }
}

public val LucideIcons.All.WavesArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesArrowDown: ImageVector
    @Composable get() = WavesArrowDownDefinition.asImageVector()
