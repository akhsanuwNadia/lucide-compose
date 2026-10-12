package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefBass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,11.0f)
                lineTo(19.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,6.0f)
                lineTo(19.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(5.0f,4.0f,9.0f,4.0f,9.0f,4.0f)
                curveTo(15.0f,4.0f,15.0f,10.0f,15.0f,10.0f)
                curveTo(15.0f,17.0f,5.0f,21.0f,5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(4.996795f,8.716661f,5.3772902f,9.38026f,5.9974093f,9.73952f)
                curveTo(6.617528f,10.098779f,7.382472f,10.098779f,8.002591f,9.73952f)
                curveTo(8.622709f,9.38026f,9.003205f,8.716661f,9.0f,8.0f)
                curveTo(9.003205f,7.283338f,8.622709f,6.6197395f,8.002591f,6.2604804f)
                curveTo(7.382472f,5.901221f,6.617528f,5.901221f,5.9974093f,6.2604804f)
                curveTo(5.3772902f,6.6197395f,4.996795f,7.283338f,5.0f,8.0f)
            }
}

public val LucideIcons.All.ClefBassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefBass: ImageVector
    @Composable get() = ClefBassDefinition.asImageVector()
