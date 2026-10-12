package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubeDiagonal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,7.0)
                lineTo(6.820000171661377,21.18000030517578)
                curveTo(5.713481426239014,22.2742977142334,3.9310195446014404,22.26983070373535,2.830000162124634,21.170000076293945)
                curveTo(1.726298451423645,20.06507110595703,1.726298451423645,18.27492904663086,2.830000162124634,17.170000076293945)
                lineTo(17.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(4.0,16.0)
            }
}

public val LucideIcons.All.TestTubeDiagonalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubeDiagonal: ImageVector
    @Composable get() = TestTubeDiagonalDefinition.asImageVector()
