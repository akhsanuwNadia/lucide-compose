package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwissFranc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,21.0f)
                lineTo(10.0f,3.0f)
                lineTo(18.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(15.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.5f)
                lineTo(17.0f,9.5f)
            }
}

public val LucideIcons.All.SwissFrancDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwissFranc: ImageVector
    @Composable get() = SwissFrancDefinition.asImageVector()
