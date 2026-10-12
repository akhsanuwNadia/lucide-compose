package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,21.0f)
                lineTo(20.01f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.25f,8.2f)
                curveTo(19.707096f,4.4391937f,16.04116f,1.9866022f,11.976172f,1.9956058f)
                curveTo(7.9111834f,2.0046096f,4.256148f,4.4734163f,2.7299194f,8.24102f)
                curveTo(1.2036909f,12.008624f,2.1100163f,16.325205f,5.022678f,19.160803f)
                curveTo(7.9353395f,21.9964f,12.274665f,22.786682f,16.0f,21.16f)
            }
}

public val LucideIcons.All.ClockAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockAlert: ImageVector
    @Composable get() = ClockAlertDefinition.asImageVector()
