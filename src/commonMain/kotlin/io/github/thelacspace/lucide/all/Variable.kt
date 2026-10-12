package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Variable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                curveTo(8.0,21.0,4.0,18.0,4.0,12.0)
                curveTo(4.0,6.0,8.0,3.0,8.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                curveTo(16.0,3.0,20.0,6.0,20.0,12.0)
                curveTo(20.0,18.0,16.0,21.0,16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(15.0,15.0)
            }
}

public val LucideIcons.All.VariableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Variable: ImageVector
    @Composable get() = VariableDefinition.asImageVector()
