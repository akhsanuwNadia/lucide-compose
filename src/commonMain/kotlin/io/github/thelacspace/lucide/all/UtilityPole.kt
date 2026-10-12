package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UtilityPole") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,5.0)
                lineTo(22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(7.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(17.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(12.0,12.0)
                lineTo(5.0,5.0)
            }
}

public val LucideIcons.All.UtilityPoleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UtilityPole: ImageVector
    @Composable get() = UtilityPoleDefinition.asImageVector()
