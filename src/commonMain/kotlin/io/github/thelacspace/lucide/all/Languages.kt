package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Languages") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(11.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(10.0,8.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,5.0)
                lineTo(14.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(8.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(17.0,12.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(20.0,18.0)
            }
}

public val LucideIcons.All.LanguagesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Languages: ImageVector
    @Composable get() = LanguagesDefinition.asImageVector()
