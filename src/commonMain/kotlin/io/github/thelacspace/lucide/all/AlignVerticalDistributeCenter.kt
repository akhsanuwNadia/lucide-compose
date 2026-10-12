package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalDistributeCenter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(19.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(17.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                lineTo(2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                lineTo(17.0f,14.0f)
                lineTo(19.0f,14.0f)
                lineTo(19.0f,20.0f)
                lineTo(17.0f,20.0f)
                lineTo(7.0f,20.0f)
                lineTo(5.0f,20.0f)
                lineTo(5.0f,14.0f)
                lineTo(7.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                lineTo(15.0f,4.0f)
                lineTo(17.0f,4.0f)
                lineTo(17.0f,10.0f)
                lineTo(15.0f,10.0f)
                lineTo(9.0f,10.0f)
                lineTo(7.0f,10.0f)
                lineTo(7.0f,4.0f)
                lineTo(9.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.AlignVerticalDistributeCenterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalDistributeCenter: ImageVector
    @Composable get() = AlignVerticalDistributeCenterDefinition.asImageVector()
