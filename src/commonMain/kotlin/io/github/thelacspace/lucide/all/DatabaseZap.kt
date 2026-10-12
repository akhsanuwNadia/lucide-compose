package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9886975f,19.975946f,4.402308f,20.892729f,6.7896357f,21.45773f)
                curveTo(9.176963f,22.02273f,12.239594f,22.165325f,15.0f,21.84f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(18.0f,17.0f)
                lineTo(22.0f,17.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0029306f,12.94801f,4.3499618f,13.839778f,6.6329646f,14.405112f)
                curveTo(8.915967f,14.970446f,11.866279f,15.142817f,14.59f,14.87f)
            }
}

public val LucideIcons.All.DatabaseZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseZap: ImageVector
    @Composable get() = DatabaseZapDefinition.asImageVector()
