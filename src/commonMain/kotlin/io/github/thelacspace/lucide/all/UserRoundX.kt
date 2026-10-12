package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.5f,16.5f)
                lineTo(21.5f,21.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(1.9995099f,18.236403f,3.425415f,15.668262f,5.771396f,14.207491f)
                curveTo(8.117377f,12.74672f,11.051161f,12.600216f,13.531f,13.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,16.5f)
                lineTo(16.5f,21.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(4.991987f,9.791655f,5.943226f,11.450651f,7.4935226f,12.3488f)
                curveTo(9.043819f,13.246948f,10.956181f,13.246948f,12.506477f,12.3488f)
                curveTo(14.056774f,11.450651f,15.008013f,9.791655f,15.0f,8.0f)
                curveTo(15.008013f,6.2083454f,14.056774f,4.549349f,12.506477f,3.6512005f)
                curveTo(10.956181f,2.7530522f,9.043819f,2.7530522f,7.4935226f,3.6512005f)
                curveTo(5.943226f,4.549349f,4.991987f,6.2083454f,5.0f,8.0f)
            }
}

public val LucideIcons.All.UserRoundXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundX: ImageVector
    @Composable get() = UserRoundXDefinition.asImageVector()
