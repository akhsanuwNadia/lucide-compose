package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalDistributeCenter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(19.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(17.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,17.0)
                lineTo(2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(2.0,7.0)
            }
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
}

public val LucideIcons.All.AlignVerticalDistributeCenterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalDistributeCenter: ImageVector
    @Composable get() = AlignVerticalDistributeCenterDefinition.asImageVector()
