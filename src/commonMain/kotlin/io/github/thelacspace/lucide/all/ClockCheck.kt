package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.95f,13.0f)
                curveTo(22.37507f,8.769229f,20.07822f,4.7323117f,16.224106f,2.936232f)
                curveTo(12.36999f,1.1401523f,7.8015466f,1.9777322f,4.8352766f,5.0242634f)
                curveTo(1.8690069f,8.070795f,1.1536671f,12.659967f,3.0519817f,16.46477f)
                curveTo(4.9502964f,20.26957f,9.047083f,22.457848f,13.265f,21.92f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(18.0f,21.0f)
                lineTo(22.0f,17.0f)
            }
}

public val LucideIcons.All.ClockCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockCheck: ImageVector
    @Composable get() = ClockCheckDefinition.asImageVector()
