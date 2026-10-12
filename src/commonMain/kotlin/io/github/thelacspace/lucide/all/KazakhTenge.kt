package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KazakhTenge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
            }
}

public val LucideIcons.All.KazakhTengeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KazakhTenge: ImageVector
    @Composable get() = KazakhTengeDefinition.asImageVector()
