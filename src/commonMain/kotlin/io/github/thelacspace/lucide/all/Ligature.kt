package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ligature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(16.0f,12.0f)
                lineTo(16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(18.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,20.0f)
                lineTo(8.0f,8.0f)
                curveTo(8.000079f,6.189647f,9.216046f,4.605035f,10.964711f,4.136475f)
                curveTo(12.713376f,3.6679153f,14.558745f,4.4322343f,15.464001f,6.0f)
            }
}

public val LucideIcons.All.LigatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ligature: ImageVector
    @Composable get() = LigatureDefinition.asImageVector()
