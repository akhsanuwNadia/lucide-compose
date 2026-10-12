package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UtilityPole") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,5.0f)
                lineTo(22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(7.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(12.0f,12.0f)
                lineTo(5.0f,5.0f)
            }
}

public val LucideIcons.All.UtilityPoleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UtilityPole: ImageVector
    @Composable get() = UtilityPoleDefinition.asImageVector()
