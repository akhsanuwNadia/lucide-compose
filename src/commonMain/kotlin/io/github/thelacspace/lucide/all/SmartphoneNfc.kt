package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SmartphoneNfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                lineTo(8.0f,6.0f)
                lineTo(9.0f,6.0f)
                lineTo(9.0f,18.0f)
                lineTo(8.0f,18.0f)
                lineTo(3.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(2.0f,6.0f)
                lineTo(3.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,8.32f)
                curveTo(14.3004675f,10.600995f,14.3004675f,13.399005f,13.0f,15.68f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.46f,6.21f)
                curveTo(18.492142f,9.802539f,18.492142f,14.197462f,16.46f,17.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.91f,4.1f)
                curveTo(22.713001f,8.992768f,22.716806f,15.003687f,19.92f,19.9f)
            }
}

public val LucideIcons.All.SmartphoneNfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SmartphoneNfc: ImageVector
    @Composable get() = SmartphoneNfcDefinition.asImageVector()
