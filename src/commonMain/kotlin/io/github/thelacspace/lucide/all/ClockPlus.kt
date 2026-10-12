package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(15.644f,13.8220005f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.92f,13.267f)
                curveTo(22.461658f,9.024554f,20.245375f,4.9072766f,16.405863f,3.0231636f)
                curveTo(12.566351f,1.1390505f,7.9536686f,1.905241f,4.929455f,4.929455f)
                curveTo(1.905241f,7.9536686f,1.1390505f,12.566351f,3.0231636f,16.405863f)
                curveTo(4.9072766f,20.245375f,9.024554f,22.461658f,13.267f,21.92f)
            }
}

public val LucideIcons.All.ClockPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockPlus: ImageVector
    @Composable get() = ClockPlusDefinition.asImageVector()
