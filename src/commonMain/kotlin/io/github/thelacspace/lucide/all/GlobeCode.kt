package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5f, 10f)
                lineTo(13f, 7.5f)
                lineTo(15.5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.861f, 14f)
                arcTo(14.5f, 14.5f, 0f, false, false, af, 14.48f)
                arcTo(14.48f, 0f, 010f, false, false, 10f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f, 5f)
                lineTo(22f, 7.5f)
                lineTo(19.5f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(8.5f)
            }
}

public val LucideIcons.All.GlobeCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeCode: ImageVector
    @Composable get() = GlobeCodeDefinition.asImageVector()
