package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouthOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.074f, 7.417f)
                arcToRelative(2.6f, 2.6f, 0f, false, false, cf, 1.829f)
                arcToRelative(1.36f, 3.053f, 2.076f, false, false, af, 1f)
                arcToRelative(1f, 0f, 01.308f, true, false, 11.6f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 51f, 51f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.695f, 7.695f)
                curveToRelative(-1.7f, 1.247f, -2.92f, 1.967f, -5.238f, 3.464f)
                arcToRelative(1f, 1f, 0f, false, false, 1.369f, 11.6f)
            }
}

public val LucideIcons.All.MouthOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouthOff: ImageVector
    @Composable get() = MouthOffDefinition.asImageVector()
