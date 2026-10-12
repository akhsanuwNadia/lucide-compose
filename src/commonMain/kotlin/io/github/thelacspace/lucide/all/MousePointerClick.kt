package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointerClick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,4.1f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.1f,8.0f)
                lineTo(2.1999998f,7.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(4.1f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.2f,2.2f)
                lineTo(8.0f,5.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.037f,9.69f)
                curveTo(8.957675f,9.503131f,8.999721f,9.286818f,9.143269f,9.143269f)
                curveTo(9.286818f,8.999721f,9.503131f,8.957675f,9.69f,9.037f)
                lineTo(20.689999f,13.537f)
                curveTo(20.890862f,13.6194f,21.015594f,13.822007f,20.998716f,14.038458f)
                curveTo(20.981838f,14.254908f,20.827206f,14.435731f,20.616f,14.486f)
                lineTo(16.266998f,15.527f)
                curveTo(15.900914f,15.614443f,15.614936f,15.900035f,15.5269985f,16.266f)
                lineTo(14.486999f,20.616001f)
                curveTo(14.437265f,20.827953f,14.256101f,20.983364f,14.039049f,21.00027f)
                curveTo(13.821997f,21.017178f,13.618953f,20.891695f,13.536999f,20.69f)
                close()
            }
}

public val LucideIcons.All.MousePointerClickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointerClick: ImageVector
    @Composable get() = MousePointerClickDefinition.asImageVector()
