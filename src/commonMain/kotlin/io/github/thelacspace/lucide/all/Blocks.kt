package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blocks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(10.0f,7.0f)
                curveTo(10.0f,6.4477153f,9.552285f,6.0f,9.0f,6.0f)
                lineTo(4.0f,6.0f)
                curveTo(2.8954306f,6.0f,2.0f,6.8954306f,2.0f,8.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,21.10457f,2.8954306f,22.0f,4.0f,22.0f)
                lineTo(16.0f,22.0f)
                curveTo(17.10457f,22.0f,18.0f,21.10457f,18.0f,20.0f)
                lineTo(18.0f,15.0f)
                curveTo(18.0f,14.447715f,17.552284f,14.0f,17.0f,14.0f)
                lineTo(2.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(21.0f,2.0f)
                lineTo(22.0f,2.0f)
                lineTo(22.0f,10.0f)
                lineTo(21.0f,10.0f)
                lineTo(15.0f,10.0f)
                lineTo(14.0f,10.0f)
                lineTo(14.0f,2.0f)
                lineTo(15.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.BlocksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blocks: ImageVector
    @Composable get() = BlocksDefinition.asImageVector()
