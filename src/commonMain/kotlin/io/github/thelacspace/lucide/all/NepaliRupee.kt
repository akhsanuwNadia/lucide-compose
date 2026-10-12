package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NepaliRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 16.173f)
                arcTo(4.74f, 4.74f, 0f, false, false, 13.496f, 8.005f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                lineTo(20f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 13f)
                lineTo(13.5f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 13f)
                lineTo(9f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 13f)
                curveTo(15.5f, 13f, 14.667f, 3f, 8f, 3f)
            }
}

public val LucideIcons.All.NepaliRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NepaliRupee: ImageVector
    @Composable get() = NepaliRupeeDefinition.asImageVector()
