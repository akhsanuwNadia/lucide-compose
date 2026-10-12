package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PcCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(17.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(19.0f,22.0f)
                lineTo(17.0f,22.0f)
                lineTo(7.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(5.0f,2.0f)
                lineTo(7.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                lineTo(15.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(15.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(15.0f,10.0f)
            }
}

public val LucideIcons.All.PcCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PcCase: ImageVector
    @Composable get() = PcCaseDefinition.asImageVector()
