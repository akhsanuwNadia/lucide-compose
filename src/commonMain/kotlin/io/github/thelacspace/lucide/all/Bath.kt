package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bath") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(7.621f,3.621f)
                curveTo(7.0302134f,3.027469f,6.1455026f,2.8371227f,5.362893f,3.135167f)
                curveTo(4.5802836f,3.4332113f,4.0463114f,4.1638403f,4.0f,5.0f)
                lineTo(4.0f,17.0f)
                curveTo(4.0f,18.10457f,4.8954306f,19.0f,6.0f,19.0f)
                lineTo(18.0f,19.0f)
                curveTo(19.10457f,19.0f,20.0f,18.10457f,20.0f,17.0f)
                lineTo(20.0f,12.0f)
            }
}

public val LucideIcons.All.BathDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bath: ImageVector
    @Composable get() = BathDefinition.asImageVector()
