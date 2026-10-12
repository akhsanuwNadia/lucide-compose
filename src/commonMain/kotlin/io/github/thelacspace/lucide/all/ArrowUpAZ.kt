package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpAZ") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,8.0f)
                lineTo(7.0f,4.0f)
                lineTo(11.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,4.0f)
                lineTo(7.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(15.0f,6.5f)
                curveTo(15.006155f,5.1236525f,16.123638f,4.0111556f,17.5f,4.0111556f)
                curveTo(18.876362f,4.0111556f,19.993845f,5.1236525f,20.0f,6.5f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(15.0f,20.0f)
                lineTo(20.0f,20.0f)
            }
}

public val LucideIcons.All.ArrowUpAZDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpAZ: ImageVector
    @Composable get() = ArrowUpAZDefinition.asImageVector()
