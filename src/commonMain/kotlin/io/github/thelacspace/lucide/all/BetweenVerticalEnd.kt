package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenVerticalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
                lineTo(10.0f,16.0f)
                lineTo(9.0f,16.0f)
                lineTo(4.0f,16.0f)
                lineTo(3.0f,16.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                lineTo(12.0f,19.0f)
                lineTo(15.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,16.0f)
                lineTo(20.0f,16.0f)
                lineTo(15.0f,16.0f)
                lineTo(14.0f,16.0f)
                lineTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.BetweenVerticalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenVerticalEnd: ImageVector
    @Composable get() = BetweenVerticalEndDefinition.asImageVector()
