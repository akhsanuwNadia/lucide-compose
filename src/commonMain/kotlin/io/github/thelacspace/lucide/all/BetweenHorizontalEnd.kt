package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenHorizontalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(15.0,3.0)
                lineTo(16.0,3.0)
                lineTo(16.0,10.0)
                lineTo(15.0,10.0)
                lineTo(4.0,10.0)
                lineTo(3.0,10.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,15.0)
                lineTo(19.0,12.0)
                lineTo(22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(15.0,14.0)
                lineTo(16.0,14.0)
                lineTo(16.0,21.0)
                lineTo(15.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
}

public val LucideIcons.All.BetweenHorizontalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenHorizontalEnd: ImageVector
    @Composable get() = BetweenHorizontalEndDefinition.asImageVector()
