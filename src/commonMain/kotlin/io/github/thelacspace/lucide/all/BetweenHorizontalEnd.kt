package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenHorizontalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(15.0f,3.0f)
                lineTo(16.0f,3.0f)
                lineTo(16.0f,10.0f)
                lineTo(15.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(3.0f,10.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,15.0f)
                lineTo(19.0f,12.0f)
                lineTo(22.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(15.0f,14.0f)
                lineTo(16.0f,14.0f)
                lineTo(16.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
}

public val LucideIcons.All.BetweenHorizontalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenHorizontalEnd: ImageVector
    @Composable get() = BetweenHorizontalEndDefinition.asImageVector()
