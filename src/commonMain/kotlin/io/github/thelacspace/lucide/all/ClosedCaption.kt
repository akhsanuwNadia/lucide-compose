package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClosedCaption") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.17f)
                curveTo(8.757191f,8.732803f,7.374578f,9.157606f,6.5916533f,10.217203f)
                curveTo(5.8087287f,11.2768f,5.8087287f,12.7232f,6.5916533f,13.782797f)
                curveTo(7.374578f,14.842394f,8.757191f,15.267197f,10.0f,14.83f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,9.17f)
                curveTo(15.757191f,8.732803f,14.374578f,9.157606f,13.591653f,10.217203f)
                curveTo(12.808728f,11.2768f,12.808728f,12.7232f,13.591653f,13.782797f)
                curveTo(14.374578f,14.842394f,15.757191f,15.267197f,17.0f,14.83f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(20.0f,5.0f)
                lineTo(22.0f,5.0f)
                lineTo(22.0f,19.0f)
                lineTo(20.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,5.0f)
                lineTo(4.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.ClosedCaptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClosedCaption: ImageVector
    @Composable get() = ClosedCaptionDefinition.asImageVector()
