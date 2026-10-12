package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lighthouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.066f,16.865f)
                lineTo(7.0f,22.0f)
                lineTo(9.0f,11.0f)
                lineTo(9.0f,6.0f)
                curveTo(9.007386f,4.348383f,10.348366f,3.0133865f,12.0f,3.0133865f)
                curveTo(13.651634f,3.0133865f,14.992614f,4.348383f,15.0f,6.0f)
                lineTo(15.0f,11.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.792f,4.5f)
                lineTo(20.657999f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.797f,13.5f)
                lineTo(20.663f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.0f)
                lineTo(22.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(2.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.203f,13.5f)
                lineTo(3.3370001f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.208f,4.5f)
                lineTo(3.342f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5f,22.0f)
                lineTo(18.5f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.932f,16.875f)
                lineTo(15.309f,12.6970005f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                lineTo(16.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.0f)
                lineTo(16.0f,7.0f)
            }
}

public val LucideIcons.All.LighthouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lighthouse: ImageVector
    @Composable get() = LighthouseDefinition.asImageVector()
