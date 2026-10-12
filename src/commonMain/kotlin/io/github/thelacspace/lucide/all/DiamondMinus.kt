package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DiamondMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.7f,10.3f)
                curveTo(2.2475033f,10.752033f,1.9932544f,11.3654f,1.9932544f,12.005f)
                curveTo(1.9932544f,12.6446f,2.2475033f,13.257967f,2.7f,13.71f)
                lineTo(10.29f,21.3f)
                curveTo(10.742033f,21.752497f,11.3554f,22.006744f,11.995f,22.006744f)
                curveTo(12.6346f,22.006744f,13.247967f,21.752497f,13.7f,21.3f)
                lineTo(21.29f,13.709999f)
                curveTo(21.742498f,13.257966f,21.996746f,12.644599f,21.996746f,12.004999f)
                curveTo(21.996746f,11.365399f,21.742498f,10.752032f,21.29f,10.299999f)
                lineTo(13.7f,2.71f)
                curveTo(13.247967f,2.2575033f,12.6346f,2.0032544f,11.995f,2.0032544f)
                curveTo(11.3554f,2.0032544f,10.742033f,2.2575033f,10.29f,2.71f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
}

public val LucideIcons.All.DiamondMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DiamondMinus: ImageVector
    @Composable get() = DiamondMinusDefinition.asImageVector()
