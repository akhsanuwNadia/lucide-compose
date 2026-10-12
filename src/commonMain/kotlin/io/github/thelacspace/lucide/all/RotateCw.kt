package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.0,16.970561981201172,16.970561981201172,21.0,12.0,21.0)
                curveTo(7.029437065124512,21.0,3.0,16.970561981201172,3.0,12.0)
                curveTo(3.0,7.029437065124512,7.029437065124512,3.0,12.0,3.0)
                curveTo(14.520000457763672,3.0,16.93000030517578,4.0,18.739999771118164,5.739999771118164)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(21.0,8.0)
                lineTo(16.0,8.0)
            }
}

public val LucideIcons.All.RotateCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCw: ImageVector
    @Composable get() = RotateCwDefinition.asImageVector()
