package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.414f,13.414f)
                curveTo(12.91185f,13.933911f,12.168244f,14.142423f,11.468986f,13.959392f)
                curveTo(10.769728f,13.7763605f,10.223639f,13.230271f,10.040607f,12.5310135f)
                curveTo(9.857576f,11.831755f,10.066088f,11.088149f,10.5859995f,10.5859995f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.247f,7.761f)
                curveTo(17.451609f,8.967934f,18.085768f,10.630416f,17.991f,12.333f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075f,4.933f)
                curveTo(21.883793f,7.74489f,22.76079f,11.953224f,21.309f,15.653f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925f,19.067f)
                curveTo(1.0251781f,15.162689f,1.0251781f,8.83731f,4.925f,4.9329996f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.753f,16.239f)
                curveTo(5.4147043f,13.89669f,5.4147043f,10.103311f,7.753f,7.7610006f)
            }
}

public val LucideIcons.All.RadioOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioOff: ImageVector
    @Composable get() = RadioOffDefinition.asImageVector()
