package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToyBrick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(21.0f,8.0f)
                lineTo(21.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(3.0f,20.0f)
                lineTo(3.0f,8.0f)
                lineTo(4.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(10.0f,5.0f)
                curveTo(10.0f,4.4f,9.6f,4.0f,9.0f,4.0f)
                lineTo(6.0f,4.0f)
                curveTo(5.4477153f,4.0f,5.0f,4.4477153f,5.0f,5.0f)
                lineTo(5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,8.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,4.4f,18.6f,4.0f,18.0f,4.0f)
                lineTo(15.0f,4.0f)
                curveTo(14.447715f,4.0f,14.0f,4.4477153f,14.0f,5.0f)
                lineTo(14.0f,8.0f)
            }
}

public val LucideIcons.All.ToyBrickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToyBrick: ImageVector
    @Composable get() = ToyBrickDefinition.asImageVector()
