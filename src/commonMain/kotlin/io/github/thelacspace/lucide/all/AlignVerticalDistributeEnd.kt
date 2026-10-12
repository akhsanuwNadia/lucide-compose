package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalDistributeEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(17.0,14.0)
                lineTo(19.0,14.0)
                lineTo(19.0,20.0)
                lineTo(17.0,20.0)
                lineTo(7.0,20.0)
                lineTo(5.0,20.0)
                lineTo(5.0,14.0)
                lineTo(7.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,4.0)
                lineTo(15.0,4.0)
                lineTo(17.0,4.0)
                lineTo(17.0,10.0)
                lineTo(15.0,10.0)
                lineTo(9.0,10.0)
                lineTo(7.0,10.0)
                lineTo(7.0,4.0)
                lineTo(9.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(22.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(22.0,10.0)
            }
}

public val LucideIcons.All.AlignVerticalDistributeEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalDistributeEnd: ImageVector
    @Composable get() = AlignVerticalDistributeEndDefinition.asImageVector()
