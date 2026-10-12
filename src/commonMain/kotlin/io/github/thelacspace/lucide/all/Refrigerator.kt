package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Refrigerator") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,6.0f)
                curveTo(5.0f,3.790861f,6.790861f,2.0f,9.0f,2.0f)
                lineTo(15.0f,2.0f)
                curveTo(17.209139f,2.0f,19.0f,3.790861f,19.0f,6.0f)
                lineTo(19.0f,20.0f)
                curveTo(19.0f,21.10457f,18.10457f,22.0f,17.0f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(5.8954306f,22.0f,5.0f,21.10457f,5.0f,20.0f)
                lineTo(5.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,7.0f)
                lineTo(15.0f,13.0f)
            }
}

public val LucideIcons.All.RefrigeratorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Refrigerator: ImageVector
    @Composable get() = RefrigeratorDefinition.asImageVector()
