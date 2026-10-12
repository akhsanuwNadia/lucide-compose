package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,8.32f)
                curveTo(7.3004675f,10.600995f,7.3004675f,13.399005f,6.0f,15.68f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.46f,6.21f)
                curveTo(11.492144f,9.802539f,11.492144f,14.197462f,9.46f,17.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.91f,4.1f)
                curveTo(15.713002f,8.992768f,15.716806f,15.003687f,12.92f,19.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.37f,2.0f)
                curveTo(19.909979f,8.196737f,19.909979f,15.803263f,16.37f,22.0f)
            }
}

public val LucideIcons.All.NfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nfc: ImageVector
    @Composable get() = NfcDefinition.asImageVector()
