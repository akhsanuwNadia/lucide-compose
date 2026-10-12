package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubeDiagonal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,7.0f)
                lineTo(6.82f,21.18f)
                curveTo(5.7134814f,22.274298f,3.9310195f,22.26983f,2.8300002f,21.17f)
                curveTo(1.7262985f,20.065071f,1.7262985f,18.27493f,2.8300002f,17.17f)
                lineTo(17.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(4.0f,16.0f)
            }
}

public val LucideIcons.All.TestTubeDiagonalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubeDiagonal: ImageVector
    @Composable get() = TestTubeDiagonalDefinition.asImageVector()
