package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KazakhTenge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.KazakhTengeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KazakhTenge: ImageVector
    @Composable get() = KazakhTengeDefinition.asImageVector()
