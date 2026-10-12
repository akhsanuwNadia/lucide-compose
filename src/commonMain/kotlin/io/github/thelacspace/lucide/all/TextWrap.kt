package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextWrap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(13.0f,19.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(17.5f,12.0f)
                curveTo(19.426888f,12.008617f,20.984383f,13.573094f,20.984383f,15.5f)
                curveTo(20.984383f,17.426907f,19.426888f,18.991383f,17.5f,19.0f)
                lineTo(13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(9.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
}

public val LucideIcons.All.TextWrapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextWrap: ImageVector
    @Composable get() = TextWrapDefinition.asImageVector()
