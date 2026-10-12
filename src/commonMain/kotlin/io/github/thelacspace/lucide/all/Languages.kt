package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Languages") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(11.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(10.0f,8.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,5.0f)
                lineTo(14.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(8.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(17.0f,12.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(20.0f,18.0f)
            }
}

public val LucideIcons.All.LanguagesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Languages: ImageVector
    @Composable get() = LanguagesDefinition.asImageVector()
