package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Combine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                curveTo(14.552285f,3.0f,15.0f,3.4477153f,15.0f,4.0f)
                lineTo(15.0f,9.0f)
                curveTo(15.0f,9.552285f,14.552285f,10.0f,14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,3.0f)
                curveTo(19.552284f,3.0f,20.0f,3.4477153f,20.0f,4.0f)
                lineTo(20.0f,9.0f)
                curveTo(20.0f,9.552285f,19.552284f,10.0f,19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(10.0f,18.0f)
                lineTo(5.0f,18.0f)
                curveTo(3.8954306f,18.0f,3.0f,17.10457f,3.0f,16.0f)
                lineTo(3.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(21.0f,14.0f)
                lineTo(21.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,14.0f)
                lineTo(15.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
                lineTo(10.0f,10.0f)
                lineTo(9.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(3.0f,10.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.CombineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Combine: ImageVector
    @Composable get() = CombineDefinition.asImageVector()
