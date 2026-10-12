package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IndianRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(18.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(14.5f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                curveTo(15.667f,13.0f,15.667f,3.0f,9.0f,3.0f)
            }
}

public val LucideIcons.All.IndianRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IndianRupee: ImageVector
    @Composable get() = IndianRupeeDefinition.asImageVector()
