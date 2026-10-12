package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(14.277999877929688,14.75)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                curveTo(3.532970666885376,12.200939178466797,7.52810001373291,14.995885848999023,12.0,14.995885848999023)
                curveTo(16.471900939941406,14.995885848999023,20.467029571533203,12.200939178466797,22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(18.27400016784668,12.949999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,15.0)
                lineTo(5.72599983215332,12.949999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(9.722000122070312,14.75)
            }
}

public val LucideIcons.All.EyeClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeClosed: ImageVector
    @Composable get() = EyeClosedDefinition.asImageVector()
