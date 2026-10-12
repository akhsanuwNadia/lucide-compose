package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DecimalsArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,18.0)
                lineTo(20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(20.0,18.0)
                lineTo(17.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(3.009999990463257,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,3.0)
                lineTo(17.5,3.0)
                lineTo(20.0,3.0)
                lineTo(20.0,11.0)
                lineTo(17.5,11.0)
                lineTo(17.5,11.0)
                lineTo(15.0,11.0)
                lineTo(15.0,3.0)
                lineTo(17.5,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,3.0)
                lineTo(8.5,3.0)
                lineTo(11.0,3.0)
                lineTo(11.0,11.0)
                lineTo(8.5,11.0)
                lineTo(8.5,11.0)
                lineTo(6.0,11.0)
                lineTo(6.0,3.0)
                lineTo(8.5,3.0)
                close()
            }
}

public val LucideIcons.All.DecimalsArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DecimalsArrowRight: ImageVector
    @Composable get() = DecimalsArrowRightDefinition.asImageVector()
