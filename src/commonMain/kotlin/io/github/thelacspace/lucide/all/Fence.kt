package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fence") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(2.0f,5.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,20.6f,2.4f,21.0f,3.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(5.6f,21.0f,6.0f,20.6f,6.0f,20.0f)
                lineTo(6.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(10.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(10.0f,5.0f)
                lineTo(10.0f,20.0f)
                curveTo(10.0f,20.6f,10.4f,21.0f,11.0f,21.0f)
                lineTo(13.0f,21.0f)
                curveTo(13.6f,21.0f,14.0f,20.6f,14.0f,20.0f)
                lineTo(14.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,3.0f)
                lineTo(18.0f,5.0f)
                lineTo(18.0f,20.0f)
                curveTo(18.0f,20.6f,18.4f,21.0f,19.0f,21.0f)
                lineTo(21.0f,21.0f)
                curveTo(21.6f,21.0f,22.0f,20.6f,22.0f,20.0f)
                lineTo(22.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.FenceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fence: ImageVector
    @Composable get() = FenceDefinition.asImageVector()
