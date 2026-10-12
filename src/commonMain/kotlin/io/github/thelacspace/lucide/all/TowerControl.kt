package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowerControl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.2f,12.27f)
                lineTo(20.0f,6.0f)
                lineTo(4.0f,6.0f)
                lineTo(5.8f,12.27f)
                curveTo(5.919724f,12.697094f,6.30648f,12.994286f,6.75f,13.0f)
                lineTo(17.25f,13.0f)
                curveTo(17.697237f,12.99872f,18.089247f,12.70063f,18.21f,12.27f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,13.0f)
                lineTo(8.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                lineTo(16.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(10.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(14.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,2.0f)
                lineTo(11.0f,2.0f)
            }
}

public val LucideIcons.All.TowerControlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowerControl: ImageVector
    @Composable get() = TowerControlDefinition.asImageVector()
